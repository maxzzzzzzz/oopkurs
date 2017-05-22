package maxoop.controller;

import maxoop.dao.Transportation.impls.DaoTransportationImpl;
import maxoop.model.Transportation.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ilost on 22.05.2017.
 */
@RestController

public class TransportationController {
    @Autowired
    private DaoTransportationImpl daoTransportation;
    @RequestMapping("/api/trans")
    public List<Transport> transportList(){
        return daoTransportation.readAll();
    }
}
