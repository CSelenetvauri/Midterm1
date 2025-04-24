## Description

Create Airline Ticket Reservation System (ATRS) in Java. ATRS is widely used software. It can be any complexity. Our example is a basic one, which has the following features:

1. storage for tickets
2. ability to book a ticket
3. ability to cancel a ticket
4. ability to print all booked tickets

## ATRS structure

We will need the following classes for the software:

1. `Ticket` – the ticket itself.
2. `ATRS` – airline ticket reservation system.
3. `ReservationTester` – the tester class. This class will be used to test our reservation system.

```
Class Ticket               | Class ATRS
--------------------------|---------------------------
String flightNumber       | List<Ticket> reservations
String passengerName      |
                           | void   bookTicket(Ticket)
                           | boolean cancelTicket(Ticket)
                           | void   printReservations()
```

## Class Ticket

The class `Ticket` should have several fields, including `flightNumber` and `passengerName`. This class can be implemented in the following way:

```java
package airline;

public class Ticket {
    private String flightNumber, passengerName;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
}
```

## Class ATRS

The reservation system should have an inner structure for storing tickets. The system should have methods for booking and canceling tickets. It should also be able to print all current reservations.

```java
package airline;

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
}
```

## ATRS Tester class

Let’s test our reservation system. First, create some tickets. Then create ATRS and add those tickets to the system using the ATRS instance. Then try to cancel some of them.

```java
package airline;

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
    }
}



```

## New Feature

This feature enables users to check how many tickets have been booked for a specific flight. The feature is implemented in the ATRS class and provides the ability to count the number of reservations made for any given flight.

```java
public int countReservationsByFlight(String flightNumber) {
    int count = 0;
    for (Ticket t : reservations) {
        if (t.getFlightNumber().equals(flightNumber)) {
            count++;
        }
    }
    return count;
}

```
```java
public class ReservationTester {
    public static void main(String[] args) {
        // Test the new feature: count reservations by flight
        System.out.println("Tickets booked for flight AI202: " + atrs.countReservationsForFlight("AI202"));
    }
}


```

## Future Improvements

The example above is very basic for the ATRS. It can be improved by adding more features:

1. Track seat availability per flight.
2. Implement a `Flight` class and manage bookings against it.
3. Add support for passengers with unique IDs and contact information.
4. Methods to:
    - a) `boolean reserveSeat(Flight flight, Passenger passenger)`
    - b) `boolean releaseSeat(Flight flight, Passenger passenger)`
    - c) `void printPassengerTickets(Passenger passenger)`
    - d) `void printFlightInformation(Flight flight)`

