package Chapter9.ClassWork;

public class Chicken extends Aves{
    public Chicken(String name, String age, String type) {
        super(name, age, type);
    }
    public String chickenMethod(){
        return "I am a chicken and I can fly in the air";
    }

    @Override
    public String toString(){
        return String.format("Name: %s Age: %s Animal Type: %s" ,getName(), getAge(), getType());
    }
}
