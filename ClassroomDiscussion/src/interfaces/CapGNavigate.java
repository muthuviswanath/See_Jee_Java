package interfaces;

public class CapGNavigate implements BhuvanMapInterface, GoogleMapInterface {
    @Override
    public void findLocation(String destn){
        System.out.println("23 Degree North 45 degree South");
    }

    public static void main(String[] args) {
        GoogleMapInterface b = new CapGNavigate();
        b.findLocation("Srilanka");
    }
}
