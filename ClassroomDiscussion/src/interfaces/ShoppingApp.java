package interfaces;

import java.util.Scanner;

public class ShoppingApp implements CCAvenue, Stripe {

    static Products[] ProductList;
    static Products[] cart;
    
    @Override
    public void makePayment(double amount) {
        if (amount <= BankAccount.bankBalance) {
            BankAccount.bankBalance -= amount;
            System.out.println("Payment of " + amount + " successful. Remaining balance: " + BankAccount.bankBalance);
        } else {
            System.out.println("Insufficient balance in bank account.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        do {
            System.out.println("1. Create Products");
            System.out.println("2. Add Products to Cart");
            System.out.println("3. Make Payment");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.println("Enter you choice: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number of products to add: ");
                    int prod_count = scan.nextInt();
                    ProductList = new Products[prod_count];
                    for (int i = 0; i < ProductList.length; i++) {
                        System.out.println("Enter Product Id:");
                        int prodId = scan.nextInt();
                        System.out.println("Enter Product Name:");
                        String prodName = scan.next();
                        System.out.println("Enter Product Price:");
                        double prodPrice = scan.nextDouble();
                        ProductList[i] = new Products(prodId, prodName, prodPrice);
                    }
                    System.out.println(prod_count + " products added successfully");
                    break;
                case 2:
                    System.out.println("List of available Products");
                    System.out.println(String.format("%8s\t%20s\t%10s", "ProductId", "ProductName", "ProductPrice"));
                    for (Products product : ProductList) {
                        System.out.println(String.format("%8s\t%20s\t%10s", product.prodId, product.prodName, product.prodPrice));
                    }
                    System.out.println("Enter the Product Id to add to cart:");
                    int cartId = scan.nextInt();
                    boolean found = false;
                    for (Products product : ProductList) {
                        if (product.prodId == cartId) {
                            found = true;
                            System.out.println("Enter the quantity:");
                            int qty = scan.nextInt();
                            cart = new Products[qty];
                            for (int j = 0; j < qty; j++) {
                                cart[j] = product;
                            }
                            System.out.println(qty + " items added to cart");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Product not found");
                    }
                    break;
                case 3:
                    if (cart != null) {
                        System.out.println("Items in Cart:");
                        System.out.println("ProductId\tProductName\tProductPrice");
                        for (Products product : cart) {
                            System.out.println(String.format("%4s\t%4s\t%4s", product.prodId, product.prodName, product.prodPrice));
                            total += product.prodPrice;
                        }
                        System.out.println("Total Amount: " + total);
                        System.out.println("Choose Payment Method:");
                        System.out.println("1. CCAvenue");
                        System.out.println("2. Stripe");
                        int paymentChoice = scan.nextInt();
                        ShoppingApp app = new ShoppingApp();
                        switch (paymentChoice) {
                            case 1:
                                app.makePayment(total);
                                break;
                            case 2:
                                app.makePayment(total);
                                break;
                            default:
                                System.out.println("Invalid payment method.");
                                break;
                        }

                    } else {
                        System.out.println("Cart is empty. Please add products to cart first.");
                    }
                    break;
                case 4:
                    System.out.println("Current Bank Balance: " + BankAccount.bankBalance);
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (true);
    }
}
