//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Lab #: 13A
//My dog can do tricks

package Lab13B;

import java.util.Scanner;

public class Lab13B {
    public static void main(String[] args) {

        double addEat;
        String renamed;

        Dog obj = new Dog();

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("You are about to create a dog.");
        System.out.print("How old is the dog: ");
            obj.age = keyboardInput.nextInt();

        System.out.print("How much does the dog weigh: ");
            obj.weight = keyboardInput.nextDouble();

        keyboardInput.nextLine();

        System.out.print("What is the dog's name: ");
            obj.name = keyboardInput.nextLine();

        System.out.print("What color is the dog: ");
            obj.furColor = keyboardInput.nextLine();

        System.out.print("What breed is the dog: ");
            obj.breed = keyboardInput.nextLine();

        System.out.println();

        System.out.println(obj.name + " is a " + obj.age + " year old " + obj.furColor + " "
                + obj.breed + " that weighs " + obj.weight + " lbs.");

        System.out.println();
        obj.bark();

        System.out.print(obj.name + " is hungry, how much should he eat: ");
            addEat = keyboardInput.nextDouble();

        keyboardInput.nextLine();

        System.out.print(obj.name + " isn't a very good name. What should they be renamed to: ");
            renamed = keyboardInput.nextLine();

        obj.eat(addEat);
        obj.rename(renamed);

        System.out.println();

        System.out.println(obj.name + " is a " + obj.age + " year old " + obj.furColor + " " + obj.breed
                + " that weighs " + obj.weight + " lbs.");
    }
}
