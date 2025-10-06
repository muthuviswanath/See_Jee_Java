package interfaces;

public class ImplClass extends AbsClass{
    /*
     * The access specifier and the method's signature cannot be altered
     * It is possible to have a higher visibility for the access specifier
     */

     public void show(){
        System.out.println("Sub class impl");
     }
    public static void main(String[] args) {
        ImplClass a = new ImplClass();
        a.show();
    }
}
