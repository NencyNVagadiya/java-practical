public class CinemaShow {

    private String title;
    private int seatsAvailable;
    private final int capacity;
    private static int totalBooked = 0;

    // Constructor
    public CinemaShow(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
        this.seatsAvailable = capacity;
    }

    // Constructor with default capacity
    public CinemaShow(String title) {
        this(title, 100);
    }

    // Book seats
    public boolean book(int n) {
        if (n <= seatsAvailable) {
            seatsAvailable = seatsAvailable - n;
            totalBooked = totalBooked + n;
            return true;
        } else {
            return false;
        }
    }

    // Cancel seats
    public void cancel(int n) {
        seatsAvailable = seatsAvailable + n;

        if (seatsAvailable > capacity) {
            seatsAvailable = capacity;
        }
    }

    // Get available seats
    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    // Get total booked
    public static int getTotalBooked() {
        return totalBooked;
    }

    // Main method
    public static void main(String[] args) {

        CinemaShow show = new CinemaShow("Avengers", 50);

        System.out.println("Book 20: " + show.book(20));
        System.out.println("Seats: " + show.getSeatsAvailable());

        System.out.println("Book 25: " + show.book(25));
        System.out.println("Seats: " + show.getSeatsAvailable());

        System.out.println("Book 10: " + show.book(10));
        System.out.println("Seats: " + show.getSeatsAvailable());

        show.cancel(10);
        System.out.println("Cancel 10");
        System.out.println("Seats: " + show.getSeatsAvailable());

        System.out.println("Book 5: " + show.book(5));
        System.out.println("Seats: " + show.getSeatsAvailable());

        System.out.println("Total booked: " + CinemaShow.getTotalBooked());
    }
}
