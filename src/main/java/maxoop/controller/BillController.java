package maxoop.controller;

import maxoop.dao.Bill.impls.DaoBillImpl;
import maxoop.model.Bill.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ilost on 22.05.2017.
 */
@RestController
public class BillController {
    @Autowired
    private DaoBillImpl daoBill;
    @RequestMapping("/api/bill")
    public List<Bill> billList(){
        return daoBill.readAll();
    }

}
