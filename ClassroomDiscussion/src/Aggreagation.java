public class Aggreagation {
    public static void main(String[] args) {
        Address address = new Address("Bengaluru", "Karnataka");
        Company CapGemini = new Company("CapGemini", address);
        CapGemini.printCompanyDetails();
        System.out.println(address.city);
        System.out.println(address.state);
        CapGemini = null;
         System.out.println(address.city);
        System.out.println(address.state);
    }
}
