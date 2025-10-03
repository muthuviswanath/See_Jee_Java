package alpha;

public class TestA {
    public int age;
    protected String name;
    float salary;
    private boolean isActive;


    public static void main(String[] args) {
        TestA obj = new TestA();
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.salary);
        System.out.println(obj.isActive);
    }
}
