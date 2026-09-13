public class Order {

    private Integer orderNumber;
    private TicketList ticketList;
    private String customerName;

    public Order(Integer orderNumber, TicketList ticketList, String customerName) {
        this.orderNumber = orderNumber;
        this.ticketList = ticketList;
        this.customerName = customerName;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public TicketList getTicketList() {
        return ticketList;
    }

    public String getCustomerName() {
        return customerName;
    }
}
