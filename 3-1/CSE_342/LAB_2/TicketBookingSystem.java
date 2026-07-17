
import java.util.Objects;

class MetroTicket {

    private static final double FARE_ONE_WAY_REGULAR = 100.0;
    private static final double FARE_ONE_WAY_PREMIUM = 150.0;
    private static final double FARE_ROUND_TRIP_REGULAR = 180.0;
    private static final double FARE_ROUND_TRIP_PREMIUM = 270.0;

    private static final String CLASS_REGULAR = "Regular";
    private static final String CLASS_PREMIUM = "Premium";
    private static final String VALID_DISCOUNT_CODE = "DIS10";
    private static final double DISCOUNT_RATE = 0.10;

    private final String passengerName;
    private final String source;
    private final String destination;
    private final boolean isRoundTrip;
    private final String seatClass;
    private final String discountCode;

    public MetroTicket(String passengerName, String source, String destination) {
        this(passengerName, source, destination, false, CLASS_REGULAR, "");
    }

    public MetroTicket(String passengerName, String source, String destination, boolean isRoundTrip) {
        this(passengerName, source, destination, isRoundTrip, CLASS_REGULAR, "");
    }

    public MetroTicket(String passengerName, String source, String destination, boolean isRoundTrip, String seatClass) {
        this(passengerName, source, destination, isRoundTrip, seatClass, "");
    }

    public MetroTicket(String passengerName, String source, String destination, boolean isRoundTrip, String seatClass, String discountCode) {
        this.passengerName = Objects.requireNonNull(passengerName, "Passenger name cannot be null.").trim();
        this.source = Objects.requireNonNull(source, "Departure station cannot be null.").trim();
        this.destination = Objects.requireNonNull(destination, "Arrival station cannot be null.").trim();
        this.isRoundTrip = isRoundTrip;
        this.discountCode = discountCode != null ? discountCode.trim() : "";

        if (seatClass != null && (seatClass.equalsIgnoreCase(CLASS_REGULAR) || seatClass.equalsIgnoreCase(CLASS_PREMIUM))) {
            this.seatClass = seatClass.equalsIgnoreCase(CLASS_REGULAR) ? CLASS_REGULAR : CLASS_PREMIUM;
        } else {
            this.seatClass = CLASS_REGULAR;
        }
    }

    public double calculateFare() {
        double totalFare;

        if (isRoundTrip) {
            totalFare = seatClass.equals(CLASS_PREMIUM) ? FARE_ROUND_TRIP_PREMIUM : FARE_ROUND_TRIP_REGULAR;
        } else {
            totalFare = seatClass.equals(CLASS_PREMIUM) ? FARE_ONE_WAY_PREMIUM : FARE_ONE_WAY_REGULAR;
        }

        if (discountCode.equalsIgnoreCase(VALID_DISCOUNT_CODE)) {
            totalFare -= (totalFare * DISCOUNT_RATE);
        }

        return totalFare;
    }

    public void displayTicketDetails() {
        System.out.printf("Passenger: %s | Route: %s -> %s | Type: %s | Class: %s | Discount: %s | Total: %.2f BDT%n",
                passengerName, source, destination, isRoundTrip ? "Round Trip" : "One Way",
                seatClass, discountCode.equalsIgnoreCase(VALID_DISCOUNT_CODE) ? "DIS10" : "None", calculateFare());
    }
}

public class TicketBookingSystem {

    public static void main(String[] args) {
        MetroTicket t1 = new MetroTicket("Arnob", "Mirpur 10", "Motijheel");
        MetroTicket t2 = new MetroTicket("Tamin", "Uttara North", "Agargaon", true);
        MetroTicket t3 = new MetroTicket("Kaniz", "Farmgate", "Kamalapur", false, "VIP");
        MetroTicket t4 = new MetroTicket("Shaikot", "Mirpur 11", "Motijheel", true, "Premium", "DIS10");

        t1.displayTicketDetails();
        t2.displayTicketDetails();
        t3.displayTicketDetails();
        t4.displayTicketDetails();
    }
}
