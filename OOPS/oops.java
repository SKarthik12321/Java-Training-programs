package OOPS;

class Pens {
    String color;
    String type;

    public void write() {
        System.out.println("Write something");
    }
    public void printColor(){
        System.out.println(this.color);    //this
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class oops {
    public static void main(String[] args) {
        Pens pen1 = new Pens();
        pen1.color = "blue";
        pen1.type = "gel";

        Pens pen2 = new Pens();
        pen2.color = "black";
        pen2.type = "Ballpoint";

        pen1.printColor();
        pen2.printColor();

        Student s1 = new Student();
        s1.name = "Karthik";
        s1.age = 21;

        s1.printInfo();

    }
}