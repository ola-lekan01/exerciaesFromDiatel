package Chapter9.ClassWork;

public class Fish extends Aquatic{
    public Fish(String name, String age, String type) {
        super(name, age, type);
    }
    public String fishMethod(){
        return "I am a fish and I can Swim";
    }

    @Override
    public String toString(){
        return String.format("Name: %s Age: %s Animal Type: %s" ,getName(), getAge(), getType());
    }
}
