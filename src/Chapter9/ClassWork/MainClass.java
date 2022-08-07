package Chapter9.ClassWork;

import static Chapter7.AssessmentProject.StudentGrade.StudentGrade.doubleLine;

public class MainClass {
    public static void main(String[] args) {
        Animal lion = new Goat("Goat" , "6 years", "Domestic");
        System.out.println(lion.feed());

        Goat goat = new Goat("Chuwawa" , "6 Months" , "Land Animal");
        System.out.println("My name is " + goat.getName());
        System.out.println("I am " + goat.getAge() + " Old");
        System.out.println(goat.feed());
        System.out.println("I am a " + goat.animalType());
        System.out.println("And " + goat.move());

        doubleLine();

        Chicken chicken = new Chicken("Eagle", "15 Years" , "Flying Animal");
        System.out.println("My name is " + chicken.getName());
        System.out.println("I am " + chicken.getAge() + " Old");
        System.out.println("I am a " + chicken.animalType());
        System.out.println(chicken.feed());
        System.out.println("And " + chicken.move());

        doubleLine();

        Fish fish = new Fish("Shark" , "2 Years" , "WaterAnimal");
        System.out.println("My name is " + fish.getName());
        System.out.println("I am " + fish.getAge() + " Old");
        System.out.println(fish.feed());
        System.out.println("I am a " + fish.animalType());
        System.out.println("And " + fish.move());

        doubleLine();

        //
        System.out.println(chicken);
        doubleLine();
        System.out.println(fish);
        doubleLine();
        System.out.println(goat);


    }

}
