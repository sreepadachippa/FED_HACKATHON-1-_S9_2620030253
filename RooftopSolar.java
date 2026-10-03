import java.util.Scanner;

public class RooftopSolar {

    
    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2a: Data Types
        int panelId = 101;
        double energyGenerated = 12.5;
        int numberOfPanels = 20;
        char systemStatus = 'G';

        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);

       
        System.out.print("Enter energy generated: ");
        double energy = sc.nextDouble();

        if (energy >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

       
        System.out.print("Enter morning energy: ");
        double morningEnergy = sc.nextDouble();

        System.out.print("Enter evening energy: ");
        double eveningEnergy = sc.nextDouble();

        double total = calculateTotalEnergy(morningEnergy, eveningEnergy);

        System.out.println("Total Energy Generated: " + total + " kWh");

        sc.close();
    }
}