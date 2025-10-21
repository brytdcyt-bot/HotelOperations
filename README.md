# HotelOperations Project

## Overview

**HotelOperations** is a Java-based mini hotel management system designed to simulate the core operations of a hotel, including:

* Managing **rooms** (check-in, check-out, and cleaning)
* Handling **reservations** with dynamic pricing for weekends
* Tracking **employee work hours** using a single `punchTimeCard()` system
* Centralized management through a **Hotel** class

This project provides a foundation for learning object-oriented design, class interaction, and basic hotel operations logic in Java.

---

## Features

### Rooms

* Track occupancy and cleanliness status.
* Methods:

  * `checkIn()` – marks room as occupied and dirty.
  * `checkOut()` – marks room as unoccupied but dirty.
  * `cleanRoom()` – marks room as clean.

### Reservations

* Link a reservation directly to a room.
* Compute dynamic price per night with weekend adjustment.
* Calculate total reservation cost.

### Employees

* Track work hours with a **single punch-in/punch-out method**: `punchTimeCard(double time)`.
* Supports multiple work sessions in a day.
* Stores total hours worked for payroll calculations.

### Hotel

* Manages a list of rooms and employees.
* Provides utility methods to list current room and employee status.

---

## Class Structure

| Class          | Description                                                                    |
| -------------- | ------------------------------------------------------------------------------ |
| `Room`         | Represents a hotel room with type, occupancy, and cleanliness.                 |
| `Reservations` | Represents a reservation linked to a room, with pricing and total calculation. |
| `Employee`     | Represents a hotel employee with punch-in/punch-out tracking.                  |
| `Hotel`        | Central class that manages rooms and employees.                                |
| `Main`         | Demonstrates example usage of the system.                                      |

---

## Usage

1. **Compile the project**:

```bash
javac com/pluralsight/HotelOperations.java
```

2. **Run the main program**:

```bash
java com.pluralsight.Main
```

3. **Expected Output**:

* Room check-in/out and cleaning operations.
* Reservation details and total price calculation.
* Employee punch-in/punch-out with total hours worked.
* Lists of hotel rooms and employees with current status.

---

## Example

```java
Room r1 = new Room(101, "king");
Employee e1 = new Employee("John Doe", "Housekeeping");
Reservations res1 = new Reservations(r1, 3, true);

r1.checkIn();
r1.checkOut();
r1.cleanRoom();

e1.punchTimeCard(9.0);
e1.punchTimeCard(17.0);

System.out.println("Reservation Total: $" + res1.getReservationTotal());
```

---

## Future Enhancements

* Add **different employee roles** (Front Desk, Housekeeping, Manager) with role-specific behaviors.
* Automatically assign **housekeepers** to clean rooms after check-out.
* Implement a **reservation calendar** for multiple guests and date validation.
* Add **overtime calculations** and payroll reports for employees.
* Introduce **dynamic room pricing** based on seasonal demand.

---

## License

This project is open source and free to use for educational purposes.
