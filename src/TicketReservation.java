
/*
 * here we are creating the application of the bus reservation
 * 
 */
import java.util.Scanner;

public class TicketReservation extends Thread {

	// here we are using Run method

	public void run() {
		// here we are declaring variables
		int noOfTickets;
		String[] names;
		// here we are taking the input from the user
		Scanner sc = new Scanner(System.in);
		// here we are using synchronized block
		synchronized (this) {
			// here we are asking for the number of tickets
			System.out.print("Enter the No of tickets you want to book : ");
			noOfTickets = sc.nextInt();
			// here we are initialize the name array
			// that will store the names of the passenger
			names = new String[noOfTickets];
			// here we are running the loop for passenger name
			for (int i = 0; i < noOfTickets; i++) {
				System.out.print("Name of " + (i + 1) + " passenger : ");
				names[i] = sc.next();
			}
			// here we are printing the report
			System.out.println(Thread.currentThread().getName() + " has booked " + noOfTickets + " Ticket(s):");
			for (int i = 0; i < noOfTickets; i++) {
				System.out.println((i + 1) + " Passenger : " + names[i]);
			}
		}
	}

	// here we are creating the main method
	public static void main(String[] args) {
		System.out.println("\n******Welcome to the Online Bus reservation System*******\n\n");
		// here we are created the thread
		TicketReservation thread = new TicketReservation();
		// here we assign the name of the thread
		thread.setName("Thread 1");
		// here we call the the thread
		thread.start();
	}
}
