package beta;

public class Main {
    public static void main(String[] args) {
        Furniture f = new Chair();
        Chair t = (Chair) f;
        t.otherUsages();
    }
}
