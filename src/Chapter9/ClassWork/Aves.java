package Chapter9.ClassWork;

public class Aves extends Animal{

    public Aves(String name, String age, String type) {
        super(name, age, type);
    }

    public String move(){
        return "I am Flying in the air as Aves";
    }

    @Override
    public String toString(){
        return String.format("Name: %s Age: %s Animal Type: %s" ,getName(), getAge(), getType());
    }
}
