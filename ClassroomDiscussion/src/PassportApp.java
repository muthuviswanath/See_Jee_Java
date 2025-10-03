public class PassportApp {
    private int age;
    private String nationality;
    private String name;
    private char gender;

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age, String username) {
        if(username.equals("Admin")){
        if (age >= 0) { // Basic validation
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
        }
        else{
            System.out.println("You are not authorized to set age");
        }
    }
}
