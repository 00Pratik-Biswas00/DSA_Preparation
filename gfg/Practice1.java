package gfg;

class Automobile {
    static {
        System.out.println("static 1");
    }
    {
        System.out.println("instance 1");
    }

    public void method() {
        System.out.println("method 1");
    }
}

class Car extends Automobile {
    static {
        System.out.println("static 2");
    }
    {
        System.out.println("instance 2");
    }

    public void method() {
        System.out.println("method 2");
    }
}

public class Practice1 {

    public static void main(String[] args) {
        Car c = new Car();
        c.method();
    }
}
