package Chapter9.ClassWork;

public class Aquatic extends Animal{
    public Aquatic(String name, String age, String type) {
        super(name, age, type);
    }
    public String move(){
        return "I am Swimming in the water as Aquatics";
    }
    @Override
    public String toString(){
        return String.format("Name: %s Age: %s Animal Type: %s" ,getName(), getAge(), getType());
    }

}
