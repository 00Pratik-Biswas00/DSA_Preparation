package gfg;

// encapsulation
// class University {
//     private int id;
//     private String name;

//     public int getId() {
//         return id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

// }

// polymorphism

// class University {
//     public int method(int a) {
//         return a;
//     }

//     public int method(int a, int b) {
//         return a + b;
//     }

//     public int method(int a, int b, int c) {
//         return a + b + c;
//     }
// }

// class College extends University {
//     @Override
//     public int method(int a, int b, int c) {
//         // System.out.println(super.method(a, b, c));
//         return a - b - c;
//     }
// }

// abstraction

abstract class University {
    public abstract void method1();
}

interface College {
    void method2();
}

class AbstractImplementation extends University {
    public void method1() {
        System.out.println("Hello University");
    }
}

class InterfaceImplementation implements College {
    public void method2() {
        System.out.println("Hello College");
    }
}

public class Practice1 {

    public static void main(String[] args) {
        // University u = new University();
        // u.setId(90);
        // u.setName("Pratik");

        // System.out.println(u.getId() + " - " + u.getName());
        // University u = new College();
        // System.out.println(u.method(10));

        // System.out.println(u.method(20, 10));
        // System.out.println(u.method(30, 20, 5));

        AbstractImplementation ab = new AbstractImplementation();
        ab.method1();
        InterfaceImplementation ii = new InterfaceImplementation();
        ii.method2();

    }
}
