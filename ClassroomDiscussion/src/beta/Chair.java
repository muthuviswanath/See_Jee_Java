package beta;

public class Chair extends Furniture{
    @Override
    public void uses(){
        System.out.println("Used to sit");
    }

        public void otherUsages(){
        System.out.println("Used as a platform");
    }
}
