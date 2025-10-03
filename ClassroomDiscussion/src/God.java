public class God {
    public static void main(String[] args) {
        String fact = "God created Humans";
     String [] myth = fact.split(" ");
     for(int i=myth.length-1;i>=0;i--){
        System.out.print(myth[i]+" ");
     }
     System.out.println();
     String name = new String("Laptop");
     String product_name = "Laptop";
     String temp_string = name.intern();
     System.out.println(name==product_name);
     System.out.println(temp_string==product_name);
     System.out.println(name.indexOf('t'));
    }
}
