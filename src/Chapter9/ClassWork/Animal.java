package Chapter9.ClassWork;

public class Animal {
    private String name;
    private String age;
    private String type;

    public Animal(String name, String age, String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        type = type;
    }

    public String animalType(){
        return getType();
    }

    public String feed(){
        return "I am feeding to grow";
    }

    @Override
    public String toString(){
        return String.format("Name: %s Age: %s Animal Type: %s" ,getName(), getAge(), getType());
    }

}
