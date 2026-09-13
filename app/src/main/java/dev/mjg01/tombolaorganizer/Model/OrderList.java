package dev.mjg01.tombolaorganizer.Model;

import java.util.List;

public class OrderList {

    private List<Order> orders;

    public OrderList(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
