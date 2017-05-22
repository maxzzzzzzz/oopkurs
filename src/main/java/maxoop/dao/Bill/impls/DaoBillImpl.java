package maxoop.dao.Bill.impls;

import maxoop.dao.Bill.interfaces.IDaoBill;
import maxoop.dao.Client.impls.DaoClientImpl;
import maxoop.dao.Order.impls.DaoOrderImpl;
import maxoop.dao.Transportation.impls.DaoTransportationImpl;
import maxoop.model.Bill.Bill;
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
public class DaoBillImpl implements IDaoBill {
    public List<Bill> bills = new ArrayList<Bill>();

    public DaoBillImpl() {
        try {
            Connection co = DriverManager.getConnection("jdbc:sqlite:laba3oop.db");
            Statement statement = co.createStatement();
            String query = "SELECT * FROM Bill";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                int client_id = rs.getInt("client_id");
                int order_id = rs.getInt("order_id");
                int transportation_id = rs.getInt("transportation_id");
                DaoClientImpl daoClient = new DaoClientImpl();
                DaoOrderImpl daoOrder = new DaoOrderImpl();
                DaoTransportationImpl daoTransportation = new DaoTransportationImpl();
                Bill bill = new Bill(id, daoClient.readAll().get(client_id-1),
                        daoOrder.readAll().get(order_id-1),
                        daoTransportation.readAll().get(transportation_id-1));
                this.bills.add(bill);
            }

            co.close();
            statement.close();
        } catch (Exception e) {
            //  System.out.println(e.getMessage());
        }
    }

    public DaoBillImpl(List<Bill> bills) {
        this.bills = bills;
    }
    @Override
    public ArrayList<Bill> readAll() {
        return (ArrayList<Bill>) this.bills;
    }

    public List<Bill> getAll() {
        return bills;
    }

    public Bill getBill(int id) {
        Bill result = null;
        for (Bill bill:bills)
        {
            if((bill.getId())==id)
            {
                result = new Bill();
            }

        }
        return result;
    }

    public void createBill(Bill bill)
    {
        bills.add(bill);
    }

    public void updateBill(Bill bill)
    {
        Bill updateBill = null;
        for (Bill bill1:bills)
        {
            if(bill1.getId()==bill.getId())
            {
                updateBill = bill1;
                break;
            }
        }
        updateBill = bill;
    }

    public void deleteBill(int id)
    {
        int i =0;
        boolean is=false;
        for (Bill bill:bills)
        {
            if (bill.getId()==id)
            {
                is = true;
                break;
            }
            i++;
        }
        if (is) bills.remove(i);

    }

    public void showAll()
    {
        for (Bill bill:bills)
        {
            System.out.println(bill.toString());
        }

    }
}
