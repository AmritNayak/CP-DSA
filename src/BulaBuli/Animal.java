package BulaBuli;

public class Animal {

    String color, type;
    int legs;
    boolean tail;

    public Animal(String c, String type, int legs, boolean tail) {
        this.color = c;
        this.type =  type;
        this.legs = legs;
        this.tail = tail;
    }

    public void saySomething() {
        System.out.println("animal said hello");
    }

    public int fun(int a) {
        return this.legs + a;
    }

}
