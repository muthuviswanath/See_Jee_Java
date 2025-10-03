public class StringMethods_2 {
    public static void main(String[] args) {
        String s1 = "anthology";
        String s2 = "anthology";

        String s3 = new String("anthology");
        String s4 = new String("anthology");

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));

        System.out.println(s1.substring(4));
        System.out.println(s1.substring(2,6));

        System.out.println(s1.contains("log"));

        String s7 = String.join("|","Employee_Id: 123","Name: Modi","Salary:10000");
        System.out.println(s7);

        System.out.println(s7.isEmpty());
        String s9 = "";
        String s10 = null;
        String s11 = " ";

        String s13 = "Employee_Id: 123".concat(" Name: Modi").concat("Salary:10000");
        System.out.println(s13);

        String new_str = "Tuesday";
        String repl_str = new_str.replace('u', 'a');
        String another = new_str.replace("ues", "rus");
        System.out.println(repl_str);
        System.out.println(another);

        String messy = "   Hello World   ";
        System.out.println(messy.trim());

        String test = "test";
        String test2 = "TEST";
    System.out.println(test.equalsIgnoreCase(test2));
    }
}
