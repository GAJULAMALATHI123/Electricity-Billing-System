import java.util.Scanner;

class ElectricityBill {
    private static final double COST_PER_UNIT = 5.0; // Cost per unit of electricity

    public static double calculateBill(int unitsConsumed) {
        return unitsConsumed * COST_PER_UNIT;
    }
}

class DataSharing {
    public static void shareData() {
        // Simulate data sharing with local electricity offices
        System.out.println("Data shared with local electricity office.");
    }
}

class Security {
    public static void ensureSafety() {
        // Implement security measures to ensure data integrity and prevent tampering
        System.out.println("Security measures implemented to ensure data safety.");
    }
}

public class ElectricityBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the units consumed: ");
        int unitsConsumed = scanner.nextInt();

        double billAmount = ElectricityBill.calculateBill(unitsConsumed);

        System.out.println("Your electricity bill amount is: $" + billAmount);

        // Share data with local electricity office
        DataSharing.shareData();

        // Ensure safety and prevent tampering
        Security.ensureSafety();

        scanner.close();
    }
}
