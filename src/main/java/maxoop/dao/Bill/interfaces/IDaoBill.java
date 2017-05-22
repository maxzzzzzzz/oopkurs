package maxoop.dao.Bill.interfaces;

import maxoop.model.Bill.Bill;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilost on 13.04.2017.
 */
public interface IDaoBill {
    ArrayList<Bill> readAll();
    List<Bill> getAll();
    Bill getBill(int id);
    void createBill (Bill bill);
    void updateBill (Bill bill);
    void deleteBill (int id);
    void showAll();
}
