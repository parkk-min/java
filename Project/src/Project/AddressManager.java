package Project;

import java.util.Scanner;

// 사용자 정보를 관리하는 AddressManager 클래스
public class AddressManager {
    // 최대 3명의 사용자 객체를 저장하는 배열
    private final User[] userList = new User[3];

    // 현재 활성화된 사용자를 가리키는 변수
    User currentUser;

    // 생성자: 3명의 사용자 정보를 미리 초기화
    public AddressManager() {
        // 첫 번째 사용자 정보 (ID, 비밀번호, 이름, 전화번호, 주소)
        this.userList[0] = new User("aaa", "111", "박민규", "01011111111", "경기도");
        // 두 번째 사용자 정보
        this.userList[1] = new User("bbb", "222", "김철수", "01022222222", "서울");
        // 세 번째 사용자 정보
        this.userList[2] = new User("ccc", "333", "김영희", "01033333333", "부산");
    }

    // 프로그램의 메인 실행 루프를 관리하는 메서드
    public void run() {
        // 프로그램이 종료될 때까지 무한 루프
        while (true) {
            // 프로그램 종료 플래그
            boolean endFlag = false;
            // 초기 메뉴(로그인/종료)를 표시
            MenuManager.initMenu();
            // 사용자가 선택한 메뉴 번호를 가져옴
            int select = MenuManager.selectInitMenu();
            // 선택된 메뉴에 따라 동작 수행
            switch (select) {
                case MenuManager.LOGIN: // 로그인 선택
                    // 로그인 성공 시 주소록 관리 프로세스로 이동
                    if (this.login()) {
                        this.addressProcess();
                    }
                    break;
                case MenuManager.EXIT: // 종료 선택
                    // 종료 플래그를 true로 설정
                    endFlag = true;
                    break;
            }
            // 종료 플래그가 true면 루프 종료
            if (endFlag) {
                break;
            }
        }
    }

    // 사용자 로그인을 처리하는 메서드
    public boolean login() {
        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner input = new Scanner(System.in);
        // ID 입력 요청
        System.out.println("ID : ");
        String id = input.nextLine();
        // 비밀번호 입력 요청
        System.out.println("PW : ");
        String pw = input.nextLine();

        // 사용자 목록을 순회하며 ID와 비밀번호 확인
        for (User u : this.userList) {
            // 입력한 ID가 사용자 목록에 있는지 확인
            if (u.getId().equals(id)) {
                // 비밀번호가 일치하는지 확인
                if (u.getPw().equals(pw)) {
                    // 로그인 성공 메시지 출력
                    System.out.println("로그인 성공");
                    // 현재 사용자 설정
                    this.currentUser = u;
                    // 로그인 성공 반환
                    return true;
                }
            }
        }
        // ID 또는 비밀번호가 틀린 경우
        System.out.println("계정 정보가 틀렸습니다.");
        // 로그인 실패 반환
        return false;
    }

    // 로그인 후 주소록 관리 기능을 처리하는 메서드
    public void addressProcess() {
        // 주소록 관리 메뉴가 종료될 때까지 무한 루프
        while (true) {
            // 주소록 관리 종료 플래그
            boolean endFlag = false;
            // 주소록 관리 메뉴 표시
            MenuManager.addressMenu();
            // 사용자가 선택한 메뉴 번호를 가져옴
            int select = MenuManager.selectAddressMenu();
            // 선택된 메뉴에 따라 동작 수행
            switch (select) {
                case MenuManager.ADDRESS_SEARCH: // 주소록 검색
                    // 특정 사용자 검색 실행
                    this.addressSearch();
                    break;
                case MenuManager.ADDRESS_SEARCH_ALL: // 전체 주소록 검색
                    // 모든 사용자 정보 출력
                    this.addressSearchAll();
                    break;
                case MenuManager.USER_INFO_UPDATE: // 내 정보 변경
                    // 현재 사용자 정보 수정
                    this.userInfoUpdate();
                    break;
                case MenuManager.LOGOUT: // 로그아웃
                    // 종료 플래그 설정
                    endFlag = true;
                    // 현재 사용자 초기화
                    this.currentUser = null;
                    break;
            }
            // 종료 플래그가 true면 루프 종료
            if (endFlag) {
                break;
            }
        }
    }

    // 특정 사용자의 주소와 전화번호를 검색하는 메서드
    public void addressSearch() {
        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner input = new Scanner(System.in);
        // 검색할 사용자 이름 입력 요청
        System.out.println("검색할 사용자의 이름");
        String name = input.nextLine();

        // 사용자 목록을 순회하며 이름이 일치하는 사용자 정보 출력
        for (User u : this.userList) {
            if (u.getName().equals(name)) {
                // 사용자의 주소 출력
                System.out.println(u.getName() + "님의 주소: " + u.getAddress());
                // 사용자의 전화번호 출력
                System.out.println(u.getName() + "님의 전화번호: " + u.getPhone());
            }
        }
    }

    // 모든 사용자의 주소와 전화번호를 출력하는 메서드
    public void addressSearchAll() {
        // 사용자 목록을 순회하며 모든 사용자 정보 출력
        for (int i = 0; i < this.userList.length; i++) {
            // 각 사용자의 주소 출력
            System.out.println(this.userList[i].getName() + "님의 주소: " + this.userList[i].getAddress());
            // 각 사용자의 전화번호 출력
            System.out.println(this.userList[i].getName() + "님의 전화번호: " + this.userList[i].getPhone());
        }
    }

    // 현재 사용자의 정보를 수정하는 메서드
    public void userInfoUpdate() {
        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner input = new Scanner(System.in);
        // 비밀번호 입력 요청
        System.out.println("PW : ");
        String pw = input.nextLine();

        // 입력한 비밀번호가 현재 사용자의 비밀번호와 일치하는지 확인
        if (!this.currentUser.getPw().equals(pw)) {
            // 비밀번호 불일치 시 메시지 출력 후 종료
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }

        // 새 주소 입력 요청
        System.out.println("Address : ");
        String address = input.nextLine();
        // 새 전화번호 입력 요청
        System.out.println("Phone : ");
        String phone = input.nextLine();

        // 현재 사용자의 주소 업데이트
        this.currentUser.setAddress(address);
        // 현재 사용자의 전화번호 업데이트
        this.currentUser.setPhone(phone);
        // 정보 변경 완료 메시지 출력
        System.out.println(this.currentUser.getName() + "님의 정보가 변경되었습니다.");
    }
}