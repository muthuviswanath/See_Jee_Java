public class MoverLoad {
    // void display(int a){
    //     System.out.println("Integer Input");
    // }
    void display(Number s){
        System.out.println("Number Input");
    }
    void display(Float a){
        System.out.println("Float Input");
    }
    void display(Double a){
        System.out.println("Double Input");
    }
    public static void main(String[] args) {
        MoverLoad obj = new MoverLoad();
        obj.display(1000L);
    }
}
