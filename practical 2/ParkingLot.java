public class ParkingLot {

    private int twoWheelers;
    private int fourWheelers;

    private final int twoCap;
    private final int fourCap;

    private static long revenue = 0;

    // Constructor
    public ParkingLot(int twoCap, int fourCap) {
        this.twoCap = twoCap;
        this.fourCap = fourCap;
        this.twoWheelers = 0;
        this.fourWheelers = 0;
    }

    // Park vehicle
    public void park(String type) {

        if (type.equals("two")) {

            if (twoWheelers < twoCap) {
                twoWheelers++;
                revenue += 20;
                System.out.println("Two-wheeler parked.");
            } else {
                System.out.println("Full");
            }

        } else if (type.equals("four")) {

            if (fourWheelers < fourCap) {
                fourWheelers++;
                revenue += 40;
                System.out.println("Four-wheeler parked.");
            } else {
                System.out.println("Full");
            }

        } else {
            System.out.println("Invalid vehicle type.");
        }
    }

    // Leave vehicle
    public void leave(String type) {

        if (type.equals("two")) {

            if (twoWheelers > 0) {
                twoWheelers--;
                System.out.println("Two-wheeler left.");
            }

        } else if (type.equals("four")) {

            if (fourWheelers > 0) {
                fourWheelers--;
                System.out.println("Four-wheeler left.");
            }

        } else {
            System.out.println("Invalid vehicle type.");
        }
    }

    // Main method
    public static void main(String[] args) {

        ParkingLot parking = new ParkingLot(2, 2);

        // Parking events
        parking.park("two");
        parking.park("two");
        parking.park("two");       // Full

        parking.park("four");
        parking.park("four");
        parking.park("four");      // Full

        // Leaving events
        parking.leave("two");
        parking.leave("four");

        // Final occupancy
        System.out.println("\nFinal Occupancy:");
        System.out.println("Two-wheelers: " + parking.twoWheelers);
        System.out.println("Four-wheelers: " + parking.fourWheelers);

        // Revenue
        System.out.println("Revenue: ₹" + revenue);
    }
}
