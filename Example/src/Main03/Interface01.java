package Main03;

import java.util.Scanner;

public class Interface01 {
    public static void main(String[] args) {
        System.out.println("동물선택: 닭(1), 새(2)");
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        switch (select) {
            case 1:
                Interface01.animalFly(new Chicken());
                Interface01.animalWalk(new Chicken());
                break;
            case 2:
                Interface01.animalFly(new Bird());
                Interface01.animalWalk(new Bird());
                break;
        }
    }

    public static void animalFly(Fly animal) {
        animal.fly();
    }

    public static void animalWalk(Walk animal) {
        animal.walk();
    }
}
