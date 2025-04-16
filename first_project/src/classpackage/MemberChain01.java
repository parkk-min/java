package classpackage;

public class MemberChain01 {
    public static void main(String[] args) {

        MemberChain obj = new MemberChain();
        obj.printInfo();

        System.out.println("*".repeat(30));

        MemberChain obj1 = new MemberChain("박민규", 25, "미국");
        obj1.printInfo();
    }
}
