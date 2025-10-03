public class Charger {
   static int k = 10;
    Charger(int a){
        // this calling statement takes exactly direct arguments
        // this cabbot be passed as an argument for this()
        // this(this);
        System.out.println("int-arg Constructor");
    }
    
    Charger(){
        Charger(k);
        System.out.println("Charger-arg Constructor");
    }

    public static void main(String[] args) {
        Charger c1 = new Charger();
        
    }
}
