package maxoop.services.Bills.interfaces;

import maxoop.model.Bill.Bill;

import java.util.List;

/**
 * Created by ilost on 13.04.2017.
 */
public interface IBIllsService {
    List<Bill> getAll();
    Bill getBill(int id);
    void createBill(Bill bill);
    void updateBill(Bill bill);
    void deleteBill(int id);
    void showAll();
    public int earningsForDay();
    public int salaryForTeacher();
    public int paymentFromGroupOfStudent();
    public int rentOfClassRoom();
    public int maximumSalary();
}
