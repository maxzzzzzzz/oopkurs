package maxoop.controller;

import maxoop.dao.Client.impls.DaoClientImpl;
import maxoop.model.Client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ilost on 22.05.2017.
 */
@RestController
public class ClientController {
    @Autowired
    private DaoClientImpl daoClient;
    @RequestMapping("/api/client")
    public List<Client> clientList(){
        return daoClient.readAll();
    }
}
