public class Company{
    String companyName;
    Address addr;

    Company(String companyName, Address addr){
        this.companyName = companyName;
        this.addr = addr;
    }

    void printCompanyDetails(){
        System.out.println("Company Name: " + companyName);
        System.out.println("City: " + addr.city);
        System.out.println("State: " + addr.state);
    }
}