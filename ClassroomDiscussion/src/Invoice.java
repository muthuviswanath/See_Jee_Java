import java.util.Scanner;

public class Invoice {

    int productId;
    int quantity;
    double totalPrice;
    static int invoiceCounter = 1;
    int invoiceId;
    double gst;
    double grand_total;
    public Invoice(int productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
        this.invoiceId = invoiceCounter++;
    }
    public static void main(String[] args) {
        Product[] products = new Product[10];
        Invoice[] invoices = new Invoice[10];
        Scanner scan = new Scanner(System.in);
        int productCount = 0;
        do{
        System.out.println("1. Create Product");
        System.out.println("2. View Products");
        System.out.println("3. Create Invoice");
        System.out.println("4. View Invoices");
        System.out.println("5. Exit");
        int choice = scan.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter Product Id: ");
                int productId = scan.nextInt();
                System.out.println("Enter Product Name: ");
                String productName = scan.next();
                System.out.println("Enter Product Rate: ");
                double productRate = scan.nextDouble();
                System.out.println("Enter Available Quantity: ");
                int availableQuantity = scan.nextInt();
                Product p = new Product(productId, productName, productRate, availableQuantity);
                System.out.println("Product Created Successfully!");
                products[productCount++] = p;
                break;
            case 2:
                
                System.out.println("Product ID: " + "\t" + "Product Name: " + "\t" + "Product Rate: " + "\t" + "Available Quantity:");
                System.out.println("--------------------------------------------------------------");
                for (int i = 0; i < productCount; i++) {
                    
                    System.out.println(String.format("%-10d", products[i].productId) + "\t" + String.format("%-15s", products[i].productName) + "\t" + String.format("%-13.2f", products[i].productRate) + "\t" + String.format("%-18d", products[i].availableQuantity));   
                }
                break;
            case 3:
                // Create Invoice
                System.out.println("Enter Product Id: ");
                int pId = scan.nextInt();
                System.out.println("Enter Quantity: ");
                int quantity = scan.nextInt();
                Invoice invoice = new Invoice(pId, quantity);
                invoices[productCount++] = invoice;
                invoice.totalPrice = quantity * products[pId - 1].productRate;
                invoice.gst = invoice.totalPrice * 0.18;
                invoice.grand_total = invoice.totalPrice + invoice.gst;
                System.out.println("Invoice Created Successfully!");
                break;
            case 4:
                // View Invoices
                System.out.println("--------------------------------------------------------------------------------------------------------------");
                System.out.println("Date: 30-Sept-2025                                                                          GSTIN: 12AAP345344");
                System.out.println("                                        Capgemini India Pvt Ltd");
                System.out.println("--------------------------------------------------------------------------------------------------------------");
                System.out.println("S.No        Item Description                        Qty         Rate                        Price");
                System.out.println("--------------------------------------------------------------------------------------------------------------");
                for (int i = 0; i < productCount; i++) {
                    if (invoices[i] != null) {
                        System.out.println(String.format("%-10d", invoices[i].invoiceId) + "\t" + String.format("%-15s", products[invoices[i].productId - 1].productName) + "\t" + String.format("%-13d", invoices[i].quantity) + "\t" + String.format("%-18.2f", invoices[i].totalPrice));
                    }

                }
                System.out.println("--------------------------------------------------------------------------------------------------------------");
                System.out.println(String.format("%-10s", "Total") + "\t" + String.format("%-15s", "") + "\t" + String.format("%-13s", "") + "\t" + String.format("%-18.2f", invoices[productCount - 1].totalPrice));
                System.out.println(String.format("%-10s", "GST @18%") + "\t" + String.format("%-15s", "") + "\t" + String.format("%-13s", "") + "\t" + String.format("%-18.2f", invoices[productCount - 1].gst));
                System.out.println("--------------------------------------------------------------------------------------------------------------");   
                System.out.println(String.format("%-10s", "Grand Total") + "\t" + String.format("%-15s", "") + "\t" + String.format("%-13s", "") + "\t" + String.format("%-18.2f", invoices[productCount - 1].grand_total));
                System.out.println("--------------------------------------------------------------------------------------------------------------");
                break;
            case 5:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid Choice!");
        }
    }while(true);
    }
}
