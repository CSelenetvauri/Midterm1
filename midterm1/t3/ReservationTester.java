package midterm1.t3;

public class ReservationTester {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        t1.setFlightNumber("AI202");
        t1.setPassengerName("Alice Smith");

        Ticket t2 = new Ticket();
        t2.setFlightNumber("AI203");
        t2.setPassengerName("Bob Johnson");

        Ticket t3 = new Ticket();
        t3.setFlightNumber("AI202");
        t3.setPassengerName("Alice Smith");

        ATRS atrs = new ATRS();
        atrs.bookTicket(t1);
        atrs.bookTicket(t2);
        atrs.cancelTicket(t3);

        atrs.printReservations();

        // Testing the NEW FEATURE
        System.out.println("Tickets booked for flight AI202: " + atrs.countReservationsForFlight("AI202"));
    }
}
