package AddressProject.AddressProject.src;

public class User {
    private String name;
    private String id;
    private String pw;
    private String phone;
    private String address;

    public User(String pname, String pid, String ppw, String pphone, String paddress) {
        this.name=pname;
        this.id=pid;
        this.pw=ppw;
        this.phone=pphone;
        this.address=paddress;
    }


    public String getPw() {
        return pw;
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

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
