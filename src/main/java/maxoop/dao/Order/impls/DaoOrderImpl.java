package maxoop.dao.Order.impls;

import maxoop.dao.Order.interfaces.IDaoOrder;
import maxoop.model.Order.Order;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilost on 13.04.2017.
 */
@Service
public class DaoOrderImpl implements IDaoOrder {
    public List<Order> orders = new ArrayList<Order>();

    public DaoOrderImpl() {
        try {
            Connection co = DriverManager.getConnection("jdbc:sqlite:laba3oop.db");
            Statement statement = co.createStatement();
            String query = "SELECT * FROM Order";
            ResultSet rs = statement.executeQuery(query);
            while(rs.next())
            {
                int id = rs.getInt("id");
                String departure= rs.getString("departure");
                String arrival = rs.getString("arrival");
                int distance = rs.getInt("distance");
                Order order = new Order(id,departure
                        ,arrival,distance);
                this.orders.add(order);
            }
            co.close();
            statement.close();
        } catch (Exception e) {
            //  System.out.println(e.getMessage());
        }
    }

    public DaoOrderImpl(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getAll() {
        return orders;
    }

    @Override
    public ArrayList<Order> readAll() {
        return (ArrayList<Order>) this.orders;

    }

    public Order getOrder(int id) {
        Order result = null;
        for (Order order:orders)
        {
            if((order.getId())==id)
            {
                result = new Order();
            }

        }
        return result;
    }

    public void createOrder(Order order)
    {
        final boolean add = orders.add(order);
    }

    public void updateOrder(Order order)
    {
        Order updateOrder = null;
        for (Order order1:orders)
        {
            if(order1.getId()==order.getId())
            {
                updateOrder = order1;
                break;
            }
        }
        updateOrder = order;
    }

    public void deleteOrder(int id)
    {
        int i =0;
        boolean is=false;
        for (Order order:orders)
        {
            if (order.getId()==id)
            {
                is = true;
                break;
            }
            i++;
        }
        if (is) orders.remove(i);

    }

    public void showAll()
    {
        for (Order order:orders)
        {
            System.out.println(order.toString());
        }
    }


}

