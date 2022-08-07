package Chapter9.ClassWork;

public class Goat extends Herbivore{
    public Goat(String name, String age, String type) {
        super(name, age, type);
    }

    public String goatMethod(){
        return "I am a goat and I can walk and Run";
    }

    @Override
    public String toString(){
        return String.format("Name: %s Age: %s Animal Type: %s" ,getName(), getAge(), getType());
    }

    @Override
    public String feed(){
        super.feed();
        return "I am eating grass to grow";
    }
}
