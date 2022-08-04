package Chapter9.ClassWork;

public class Herbivore extends Animal{
    public Herbivore(String name, String age, String type) {
        super(name, age, type);
    }
    public String move(){
        return "I am Moving on the Land as Herbivores";
    }

    @Override
    public String toString(){
        return String.format("Name: %s Age: %s Animal Type: %s" ,getName(), getAge(), getType());
    }
}
