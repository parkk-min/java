package classpackage;

public class Object02 {
    public static void main(String[] args) {
        System.out.println("*****학생 주소록*****");
        Student stObj1 = new Student();
        // insertRecord 메서드를 호출하여 stObj1의 정보를 설정
        stObj1.insertRecord(20250415, "박철수"); //이와 같이 메서드를 호출해서 쓰는 것이 안전하다.
        stObj1.printInfo();

        Student stObj2 = new Student(20250416, "박민순");
        stObj2.printInfo();
    }
}
