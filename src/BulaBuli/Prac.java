package BulaBuli;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
//        FAST_IO.FastReader sc = new FAST_IO.FastReader();
        Scanner sc = new Scanner(System.in);
        // Classname varName = new Classname();
//        BulaBuli.Animal a = new BulaBuli.Animal("black", "wild", 4, true);
//        System.out.println(a.legs);
//        a.saySomething();
//        int res = a.fun(5);
//        System.out.println(res);

        Cat c = new Cat("white", "tame", 4, true);
//        System.out.println(c.color);
//        c.say();
//        c.saySomething();
//        System.out.println(c.fun(6));

        // parentclass var = new childclass
        Animal a1 = new Cat("brown", "wild", 4, true);
//        a1.say();
//        a1.saySomething();

        // childclass -> parentclass
        Cat c1 = (Cat) new Animal("brown", "wild", 4, true);
        c1.say();
    }

    // <access modifier> <return type> <name> ( < args > ) {  }
    static int sum(int a, int b) {
        int result = a + b;
//        ress = 10 + 20;


        return result;
    }
}

class newThread implements Runnable {
    Thread t;
    newThread() {
        t = new Thread(this, "New Thread");
        t.start();
    }

    public void run() {
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t);
    }
}

class multithreaded {
    public static void main(String[] args) {
        new newThread();
    }
}
