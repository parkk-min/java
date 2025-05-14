package user;

public class UserInfo {
    private String id;
    private String pw;
    private String name;
    private String address;
    private String phone;
    private String buyList;
    private String grade;
    private int point;

    public UserInfo(String id, String pw, String name, String address, String phone, String buyList, String grade, int point) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.buyList = buyList;
        this.grade = grade;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBuyList() {
        return buyList;
    }

    public void setBuyList(String buyList) {
        this.buyList = buyList;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
