package maxoop.services.Bills.impls;


import maxoop.model.Bill.Bill;
import maxoop.services.Bills.interfaces.IBIllsService;

import java.util.List;

/**
 * Created by ilost on 13.04.2017.
 */
public class BillsServiceImpl implements IBIllsService {
    IBIllsService iBillsService;

    public List<Bill> getAll() {
        return iBillsService.getAll();
    }

    public Bill getBill(int id) {
        return iBillsService.getBill(id);
    }

    public void createBill(Bill bill) {
        iBillsService.createBill(bill);
    }

    public void updateBill(Bill bill) {
        iBillsService.updateBill(bill);
    }

    public void deleteBill(int id) {
        iBillsService.deleteBill(id);
    }

    public void showAll() {
        iBillsService.showAll();
    }



    public int earningsForDay() {
        return 0;
    }

    public int salaryForTeacher() {
        return 0;
    }

    public int paymentFromGroupOfStudent() {
        return 0;
    }

    public int rentOfClassRoom() {
        return 0;
    }

    public int maximumSalary() {
        return 0;
    }
}
