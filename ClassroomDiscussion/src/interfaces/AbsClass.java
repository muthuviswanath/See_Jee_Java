package interfaces;

/*
 * An abstract class is a class that may or may not have an abstract method.
 * An abstract class can contain only concrete methods.
 * It can have final methods, final variables, constructors, static members
 * It is not possible to instatiate (create object) the Abstract class
 * 
 */
public abstract class AbsClass {
    AbsClass() {

    }

    static int age = 10;
    String name;

    void display(){
        System.out.println(this.name);
        System.out.println(age);
    }

    final void test(){
        System.out.println("Hello");
    }

    public abstract void show();
}