package Main;

public class User {

    private final String id;
    private int pw;
    private final String name;
    private String phone;
    private String address;

    public User(String id, int pw, String name, String phone, String address) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public int getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setPw(int pw) {
        this.pw = pw;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
