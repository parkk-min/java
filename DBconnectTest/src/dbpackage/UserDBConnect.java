package dbpackage;

// 데이터베이스 작업을 위해 필요한 Java SQL 클래스 가져오기
import java.sql.*;

// 데이터베이스 연결과 usertbl 테이블 작업을 위한 클래스
public class UserDBConnect {
    // 데이터베이스 연결 정보 (MySQL 사용)
    private String driver = "com.mysql.cj.jdbc.Driver";  // JDBC 드라이버 클래스
    private String url = "jdbc:mysql://127.0.0.1:3306/cookdb?serverTimeZone=UTC";  // DB 주소
    private String user = "root";  // DB 사용자 이름
    private String password = "1234";  // DB 비밀번호
    private Connection conn = null;  // DB 연결 객체
    private Statement stmt = null;  // SQL 실행 객체

    // 기본 생성자
    public UserDBConnect() {

    }

    // 데이터베이스 연결 초기화 메서드
    public void initDBConnect() {
        try {
            Class.forName(this.driver);  // JDBC 드라이버 로딩
            this.conn = DriverManager.getConnection(this.url, this.user, this.password);  // DB 연결
            this.stmt = this.conn.createStatement();  // Statement 생성 (SQL 실행용)
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  // 드라이버 클래스를 못 찾았을 때
        } catch (SQLException e) {
            e.printStackTrace();  // SQL 에러 발생 시
        }
    }

    // usertbl 테이블의 전체 레코드 수를 구하는 메서드
    public int countRecord() {
        String sql = "select count(*) as cnt from usertbl";  // 레코드 수 세는 SQL
        int rcount = 0;  // 결과 저장할 변수
        try {
            ResultSet rs = this.stmt.executeQuery(sql);  // SQL 실행하고 결과 받기
            // ResultSet은 select 결과 저장하는 객체
            while (rs.next()) {  // 결과가 있다면
                rcount = rs.getInt("cnt");  // count(*) 값 가져오기
            }
            rs.close();  // ResultSet 닫기
        } catch (SQLException e) {
            e.printStackTrace();  // SQL 실행 중 에러
        }
        return rcount;  // 최종 개수 반환
    }

    // usertbl의 모든 유저 정보를 배열로 반환하는 메서드
    public User[] allFetchUsertbl() {
        int count = this.countRecord();  // 전체 유저 수
        User[] userList = new User[count];  // 배열 생성
        String sql = "select * from usertbl";  // 전체 조회 SQL
        try {
            ResultSet rs = this.stmt.executeQuery(sql);  // 실행 결과 저장
            int userCount = 0;  // 인덱스용 변수
            while (rs.next()) {  // 다음 행이 있으면
                // 각 컬럼 데이터 가져오기
                String userid = rs.getString("userid");
                String username = rs.getString("username");
                int birthyear = rs.getInt("birthyear");
                String addr = rs.getString("addr");
                String mobile1 = rs.getString("mobile1");
                String mobile2 = rs.getString("mobile2");
                int height = rs.getInt("height");
                Date mdate = rs.getDate("mdate");
                // 유저 객체 생성 후 배열에 저장
                User user = new User(userid, username, birthyear, addr, mobile1, mobile2, height, mdate);
                userList[userCount++] = user;
            }
            rs.close();  // 결과셋 닫기
        } catch (SQLException e) {
            e.printStackTrace();  // 에러 출력
        }
        return userList;  // 전체 유저 목록 반환
    }

    // 이름으로 특정 사용자 검색해서 반환
    public User selectUser(String user_name) {
        String sql = "select * from usertbl where username = '" + user_name + "'";  // 조건 조회 SQL
        User user = null;  // 결과 저장 객체
        try {
            ResultSet rs = stmt.executeQuery(sql);  // SQL 실행
            while (rs.next()) {  // 결과가 있다면
                // 유저 정보 추출
                String userid = rs.getString("userid");
                String username = rs.getString("username");
                int birthyear = rs.getInt("birthyear");
                String addr = rs.getString("addr");
                String mobile1 = rs.getString("mobile1");
                String mobile2 = rs.getString("mobile2");
                int height = rs.getInt("height");
                Date mdate = rs.getDate("mdate");
                // User 객체 생성
                user = new User(userid, username, birthyear, addr, mobile1, mobile2, height, mdate);
            }
            rs.close();  // 닫기
        } catch (SQLException e) {
            e.printStackTrace();  // 에러 처리
        }
        return user;  // 결과 반환 (null일 수도 있음)
    }

    // 새로운 유저를 DB에 추가하는 메서드
    public void inputUser(User user) {
        String sql = "insert into usertbl values(?,?,?,?,?,?,?,?)";  // 삽입용 SQL
        try {
            PreparedStatement pstmt = this.conn.prepareStatement(sql);  // PreparedStatement 사용
            // 물음표에 값 바인딩
            pstmt.setString(1, user.getUserId());
            pstmt.setString(2, user.getUserName());
            pstmt.setInt(3, user.getBirthYear());
            pstmt.setString(4, user.getAddr());
            pstmt.setString(5, user.getMobile1());
            pstmt.setString(6, user.getMobile2());
            pstmt.setInt(7, user.getHeight());
            pstmt.setDate(8, user.getMdate());
            pstmt.executeUpdate();  // DB에 삽입 실행
        } catch (SQLException e) {
            e.printStackTrace();  // SQL 에러
        }
    }

    // 유저 이름으로 삭제하는 메서드
    public boolean deleteUser(String username) {
        String sql = "delete from usertbl where username = '" + username + "'";  // 삭제 SQL
        try {
            int delete_count = this.stmt.executeUpdate(sql);  // 삭제 실행
            if (delete_count > 0) {  // 삭제된 행이 있다면
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();  // 에러 발생
        }
        return false;  // 삭제 실패
    }

    // DB 연결 해제 메서드
    public void releaseDB() {
        try {
            this.stmt.close();  // Statement 닫기
            this.conn.close();  // Connection 닫기
        } catch (SQLException e) {
            e.printStackTrace();  // 닫는 중 에러 발생
        }
    }
}
