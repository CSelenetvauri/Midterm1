package midterm1.t3;

import java.util.ArrayList;
import java.util.List;

public class ATRS {
    private List<Ticket> reservations = new ArrayList<>();

    public void bookTicket(Ticket ticket) {
        reservations.add(ticket);
    }

    public boolean cancelTicket(Ticket ticket) {
        boolean removed = false;

        for (int i = 0; i < reservations.size(); i++) {
            Ticket t = reservations.get(i);
            if (t.getFlightNumber().equals(ticket.getFlightNumber()) &&
                    t.getPassengerName().equals(ticket.getPassengerName())) {
                reservations.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }

    public void printReservations() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
        } else {
            for (Ticket t : reservations) {
                System.out.println(t.getPassengerName() + " - " + t.getFlightNumber());
            }
        }
    }

    /**
     * NEW FEATURE: Count the number of tickets booked for a specific flight
     * This method helps in tracking how many reservations have been made for a given flight.
     */
    public int countReservationsForFlight(String flightNumber) {
        int count = 0;
        for (Ticket t : reservations) {
            if (t.getFlightNumber().equals(flightNumber)) {
                count++;
            }
        }
        return count;
    }

}