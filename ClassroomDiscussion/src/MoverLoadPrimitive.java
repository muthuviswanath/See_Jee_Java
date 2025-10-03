public class MoverLoadPrimitive {
    // void display(int a){
    //     System.out.println("Integer Input");
    // }
    
    void display(float a){
        System.out.println("Float Input");
    }
    void display(double a){
        System.out.println("Double Input");
    }
    public static void main(String[] args) {
        MoverLoad obj = new MoverLoad();
        obj.display(1000L);
    }
}