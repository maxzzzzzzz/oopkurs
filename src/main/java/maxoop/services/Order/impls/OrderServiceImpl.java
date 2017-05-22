package maxoop.services.Order.impls;

import maxoop.dao.Client.impls.DaoClientImpl;
import maxoop.dao.Order.impls.DaoOrderImpl;
import maxoop.model.Client.Client;
import maxoop.model.Order.Order;
import maxoop.services.Client.interfaces.IClientService;
import maxoop.services.Order.interfaces.IOrderService;

import java.util.List;

/**
 * Created by ilost on 13.04.2017.
 */
public class OrderServiceImpl implements IOrderService {
    IOrderService iOrderService;

    public OrderServiceImpl(DaoOrderImpl daoOrder) {
    }

    public List<Order> getAll() {
        return iOrderService.getAll();
    }

    public Order getOrder(int id) {
        return iOrderService.getOrder(id);
    }

    public void createOrder(Order order) {
        iOrderService.createOrder(order);
    }

    public void updateOrder(Order order) {
        iOrderService.updateOrder(order);
    }

    public void deleteOrder(int id) {
        iOrderService.deleteOrder(id);
    }

    public void showAll() {
        iOrderService.showAll();
    }
}
