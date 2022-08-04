package Chapter9.ClassWork;

import static Chapter7.StudentGrade.StudentGrade.doubleLine;

public class MainClass {
    public static void main(String[] args) {
        Herbivore dog = new Herbivore("Chuwawa" , "6 Months" , "Land Animal");
        System.out.println("My name is " + dog.getName());
        System.out.println("I am " + dog.getAge() + " Old");
        System.out.println(dog.feed());
        System.out.println("I am a " + dog.animalType());
        System.out.println("And " + dog.move());

        doubleLine();

        Aves bird = new Aves("Eagle", "15 Years" , "Flying Animal");
        System.out.println("My name is " + bird.getName());
        System.out.println("I am " + bird.getAge() + " Old");
        System.out.println("I am a " + bird.animalType());
        System.out.println(bird.feed());
        System.out.println("And " + bird.move());

        doubleLine();

        Aquatic fish = new Aquatic("Shark" , "2 Years" , "WaterAnimal");
        System.out.println("My name is " + fish.getName());
        System.out.println("I am " + fish.getAge() + " Old");
        System.out.println(fish.feed());
        System.out.println("I am a " + fish.animalType());
        System.out.println("And " + fish.move());

        doubleLine();

        //
        System.out.println(fish);
        doubleLine();
        System.out.println(dog);
        doubleLine();
        System.out.println(bird);
    }

}
