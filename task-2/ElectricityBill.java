class Units {

    double calculateBill(int units) {

        double bill;

        if (units <= 100)
            bill = units * 2;
        else if (units <= 200)
            bill = 200 + (units - 100) * 3;
        else
            bill = 200 + 300 + (units - 200) * 5;

        return bill;
    }

    double addFixedCharge(double amount) {
        return amount + 50;
    }

    void displayBill(double energy, double finalBill) {
        System.out.println("Energy Charge: " + energy);
        System.out.println("Fixed Charge: 50.0");
        System.out.println("Final Bill: " + finalBill);
    }
}

public class ElectricityBill {

    public static void main(String[] args) {

        Units u = new Units();

        double energy = u.calculateBill(250);
        double finalBill = u.addFixedCharge(energy);

        u.displayBill(energy, finalBill);
    }
}