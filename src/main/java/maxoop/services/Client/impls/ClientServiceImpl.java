package maxoop.services.Client.impls;

import maxoop.dao.Client.impls.DaoClientImpl;
import maxoop.model.Client.Client;
import maxoop.services.Client.interfaces.IClientService;

import java.util.List;

/**
 * Created by ilost on 13.04.2017.
 */
public class ClientServiceImpl implements IClientService {
    IClientService iClientService;

    public ClientServiceImpl(DaoClientImpl daoClient) {
    }

    public List<Client> getAll() {
        return iClientService.getAll();
    }

    public Client getClient(int id) {
        return iClientService.getClient(id);
    }

    public void createClient(Client client) {
        iClientService.createClient(client);
    }

    public void updateClient(Client client) {
        iClientService.updateClient(client);
    }

    public void deleteClient(int id) {
        iClientService.deleteClient(id);
    }

    public void showAll() {
        iClientService.showAll();
    }

}
