package Main03;

public class SmartPhoneMain02 {
    public static void main(String[] args) {

        SmartPhoneImpl02 phone = new SmartPhoneImpl02();

        phone.turnOn();

        Phone p = phone;
        p.call();

        Application a = phone;
        a.appRun();
    }
}
