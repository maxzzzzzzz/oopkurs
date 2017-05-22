package maxoop.services.Order.interfaces;

import maxoop.model.Order.Order;

import java.util.List;

/**
 * Created by ilost on 13.04.2017.
 */
public interface IOrderService {
    List<Order> getAll();
    Order getOrder(int id);
    void createOrder (Order order);
    void updateOrder (Order order);
    void deleteOrder (int id);
    void showAll();
}

