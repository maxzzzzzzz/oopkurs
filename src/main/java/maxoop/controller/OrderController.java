package maxoop.controller;

import maxoop.dao.Order.impls.DaoOrderImpl;
import maxoop.model.Order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ilost on 22.05.2017.
 */
@RestController

public class OrderController {
    @Autowired
    private DaoOrderImpl daoOrder;
    @RequestMapping("/api/order")
    public List<Order> orderList(){
        return daoOrder.readAll();
    }
}
