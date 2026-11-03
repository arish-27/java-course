class Product {

    double calculateTotal(double p1, double p2, double p3) {
        return p1 + p2 + p3;
    }

    double calculateDiscount(double total, String type) {

        if (type.equalsIgnoreCase("Gold"))
            return total * 0.20;
        else if (type.equalsIgnoreCase("Silver"))
            return total * 0.10;
        else if (type.equalsIgnoreCase("Regular"))
            return total * 0.05;
        else
            return 0;
    }

    double calculateFinalAmount(double total, double discount) {
        return total - discount;
    }

    void displayBill(double total, double discount, double finalAmount) {
        System.out.println("Total Amount: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }
}

public class ShoppingCart {

    public static void main(String[] args) {

        Product p = new Product();

        double total = p.calculateTotal(2000, 1500, 500);
        double discount = p.calculateDiscount(total, "Gold");
        double finalAmount = p.calculateFinalAmount(total, discount);

        p.displayBill(total, discount, finalAmount);
    }
}