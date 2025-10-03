import java.util.ArrayList;

public class StringMethods {
    public static void main(String[] args) {
        String  name = "Anthology";
        System.out.println(name.charAt(4));
        int arr[] = {1,2,3};
        // System.out.println(arr[10]);
        // System.out.println(name.charAt(100));
        //Given a character m, find its frequency in the given string
        String str = "madam";
        char m = 'm';
        int count = 0;
        for(int i =0; i<str.length();i++){
            if(str.charAt(i) == m){
                count++;
            }
        }
        System.out.println(count);

        //Length of the string
        System.out.println(str.length());
        // Format the given string as follows:
        //           3.141

        float pi = 3.141f;
        String formatted_string = String.format("%12.1f", pi);
        System.out.println(formatted_string);
    }
}
