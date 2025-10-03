package beta;

public class Table extends Furniture {
    
    @Override
    public void uses(){
        System.out.println("Used to write");
    }

    public void otherUsages(){
        System.out.println("Used to draw");
        System.out.println("Used as a platform");
    }
    
}
