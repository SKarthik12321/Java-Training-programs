package OOPS;

//Class - blueprint of an object
//Object = instance of the class


class Pen {     //class
    String color;
    String type;
    void write(){
        System.out.println("Writing");
    }
}

public class classObject {
    public static void main(String[] args){
        Pen p1 = new Pen();   //create objects
        p1.color = "blue";
        p1.type = "gel";

        System.out.println(p1.color);
        System.out.println(p1.type);

        p1.write();
    }

}
