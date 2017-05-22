package maxoop.model.Bills;

import maxoop.model.Bill.Bill;
import maxoop.model.Client.Client;
import maxoop.model.Order.Order;
import maxoop.model.Transportation.Transport;

/**
 * Created by ilost on 06.04.2017.
 */
public class Bills extends Bill {
    public Bills() {
    }

    public Bills(int id, Client client, Order order, Transport transport) {
        super(id, client, order, transport);
    }
    public void createBills(){}
    public void readBills(){}
    public void updateBills(){}
    public void deleteBills(){}
    public void getAll(){}
    public int earningperday(){return 0;}
    public int salaryforemployes(){return 0;}
    public int thecostofallgasolineall(){return 0;}
    public int thecostofspareprts(){return 0;}
    public int netearnings(){return 0;}
}
