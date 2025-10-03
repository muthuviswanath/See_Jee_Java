public class Bank {
    //Method Overlaoding:
    /*
     * In a class if there are more than one method with the same name but
     * they differ in their signature, it is known as method overloading.
     * 
     * The data type of the parameters must be different
     * The number of parameters must be different
     * The order of parameters must be different
     */
    void login(Card card, int pin){
       System.out.println("Welcome Muthu");
    }
    String login(String username, String password){
        System.out.println("Welcome Muthu");
        return "Login Successful";
    }
    int login(int mpin){
        System.out.println("Welcome Muthu");
        return mpin;
    }


}
