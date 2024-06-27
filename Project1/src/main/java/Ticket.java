
public class Ticket {
private int ticketId;
private int price;
private static int availableTicket;


public int getTicketId() {
	return ticketId;
}
public int getPrice() {
	return price;
}
public static int getAvailableTicket() {
	return availableTicket;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public void setPrice(int price) {
	this.price = price;
}
public static void setAvailableTicket(int availableTicket) {
	if(availableTicket<=0) {
		System.out.println("Invalid Value");
		System.exit(0);
	}else {
		Ticket.availableTicket=availableTicket;
	}
}

public int calculateTicketCost(int nooftickets) {
	if (availableTicket<=0) {
	return -1;
}else {
	availableTicket=availableTicket-nooftickets;
	return nooftickets*price;
}



}}
