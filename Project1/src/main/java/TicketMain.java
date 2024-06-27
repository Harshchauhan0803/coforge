import java.util.*;
public class TicketMain {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	System.out.println("Enter no. of bookings : ");
int a=sc.nextInt();
System.out.println("Enter no. available tickets : ");
int b=sc.nextInt();
Ticket ticket=new Ticket();
Ticket.setAvailableTicket(b);

do {

System.out.println("Enter ticketid : ");
int c=sc.nextInt();
System.out.println("Enter price : ");
int d=sc.nextInt();
System.out.println("Enter no. of tickets : ");
int e=sc.nextInt();
a--;


ticket.setPrice(d);
ticket.setTicketId(c);




System.out.println("Available Tickets are: "+Ticket.getAvailableTicket());
int calculateTicketCost=ticket.calculateTicketCost(e);

System.out.println("Total amount: "+calculateTicketCost);
System.out.println("Available Tickets after booking  are: "+Ticket.getAvailableTicket());
}while(a>=1);

}
}
