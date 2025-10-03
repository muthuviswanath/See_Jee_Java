public class StringFormatting {
    public static void main(String[] args) {
        String str1 = String.format("%d", 141);
        System.out.println(str1);
        String str2= String.format("|%10d|",141);
        System.out.println(str2);
        String str3= String.format("|%-10d|",141);
        System.out.println(str3);
        String str4= String.format("|% d|",141);
        System.out.println(str4);

        String str5= String.format("|%d|",100);
        System.out.println(str5);
        String str6= String.format("|%012d|",41);
        System.out.println(str6);

        System.out.println(String.format("%3.3f",12345.66347));       
    }
}

