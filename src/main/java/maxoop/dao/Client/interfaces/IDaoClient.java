package maxoop.dao.Client.interfaces;

import maxoop.model.Client.Client;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilost on 13.04.2017.
 */
public interface IDaoClient {
    public ArrayList<Client> readAll();
    List<Client> getAll();
    Client getClient(int id);
    void createClient (Client bill);
    void updateClient (Client bill);
    void deleteClient (int id);
    void showAll();
}
