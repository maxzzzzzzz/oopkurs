package maxoop.model.Bill;

import maxoop.model.Client.Client;
import maxoop.model.Order.Order;
import maxoop.model.Transportation.Transport;

/**
 * Created by ilost on 06.04.2017.
 */
public class Bill {
    int id;
    Client client;
    Order order;
    Transport transport;

    public Bill(){}

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", client=" + client +
                ", order=" + order +
                ", transport=" + transport +
                '}';
    }

    public Bill(int id, Client client, Order order, Transport transport) {
        this.id = id;
        this.client = client;
        this.order = order;
        this.transport = transport;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
}
