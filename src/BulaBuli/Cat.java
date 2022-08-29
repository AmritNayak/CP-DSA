package BulaBuli;

public class Cat extends Animal {

    String voice = "meow";

    public Cat(String c, String type, int legs, boolean tail) {
        super(c, type, legs, tail);
    }

    public void say() {
        System.out.println(this.voice);
    }

    public void saySomething() {
        super.saySomething();
        System.out.println("cat said hello");
    }

}
