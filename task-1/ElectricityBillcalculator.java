class ElectricityBill {

    void calculateBill(int units) {

        int billAmount = 0;
        int firstSlab = 0;
        int secondSlab = 0;
        int thirdSlab = 0;

        if (units <= 100) {

            firstSlab = units * 2;
        }
        else if (units <= 200) {

            firstSlab = 100 * 2;
            secondSlab = (units - 100) * 3;
        }
        else {

            firstSlab = 100 * 2;
            secondSlab = 100 * 3;
            thirdSlab = (units - 200) * 5;
        }

        billAmount = firstSlab + secondSlab + thirdSlab;

        System.out.println("Units Consumed: " + units);
        System.out.println("First Slab Amount: " + firstSlab);
        System.out.println("Second Slab Amount: " + secondSlab);
        System.out.println("Third Slab Amount: " + thirdSlab);
        System.out.println("Total Electricity Bill: Rs." + billAmount);
    }
}

public class ElectricityBillcalculator{
    public static void main(String[] args) {

        ElectricityBill eb = new ElectricityBill();

        eb.calculateBill(250);
    }
}

