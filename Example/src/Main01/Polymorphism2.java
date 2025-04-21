package Main01;

import java.util.Scanner;

public class Polymorphism2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("동물을 선택하세요(돼지(1), 개(2))");
            int select = input.nextInt();
            if (select == 1) {
                Polymorphism2.printAnimalSound(new Pig());
                Polymorphism2.printAnimalEat(new Pig());
            } else if (select == 2) {
                Polymorphism2.printAnimalSound(new Dog());
                Polymorphism2.printAnimalEat(new Dog());
            }
        }
    }

    public static void printAnimalSound(Animal animal) {
        animal.animalSound();
    }

    public static void printAnimalEat(Animal animal) {
        animal.eat();
    }
}
