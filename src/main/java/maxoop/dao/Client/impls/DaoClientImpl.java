package maxoop.dao.Client.impls;

import maxoop.dao.Client.interfaces.IDaoClient;
import maxoop.model.Client.Client;
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
public class DaoClientImpl implements IDaoClient {
    public List<Client> clients = new ArrayList<Client>();

    public DaoClientImpl() {
        try {
            Connection co = DriverManager.getConnection("jdbc:sqlite:laba3oop.db");
            Statement statement = co.createStatement();
            String query = "SELECT * FROM Client";
            ResultSet rs = statement.executeQuery(query);
            while(rs.next())
            {
                int id = rs.getInt("id");
                String name= rs.getString("name");
                String surname = rs.getString("surname");
                int lvlofclient = rs.getInt("lvlofclient");
                Client client = new Client(id,name
                        ,surname,lvlofclient);
                this.clients.add(client);
            }
            co.close();
            statement.close();
        } catch (Exception e) {
            //  System.out.println(e.getMessage());
        }
    }

    public DaoClientImpl(List<Client> clients) {
        this.clients = clients;
    }

    public List<Client> getAll() {
        return clients;
    }

    @Override
    public ArrayList<Client> readAll() {
        return (ArrayList<Client>) this.clients;

    }

    public Client getClient(int id) {
        Client result = null;
        for (Client client:clients)
        {
            if((client.getId())==id)
            {
                result = new Client();
            }

        }
        return result;
    }

    public void createClient(Client client)
    {
        final boolean add = clients.add(client);
    }

    public void updateClient(Client client)
    {
        Client updateClient = null;
        for (Client client1:clients)
        {
            if(client1.getId()==client.getId())
            {
                updateClient = client1;
                break;
            }
        }
        updateClient = client;
    }

    public void deleteClient(int id)
    {
        int i =0;
        boolean is=false;
        for (Client client:clients)
        {
            if (client.getId()==id)
            {
                is = true;
                break;
            }
            i++;
        }
        if (is) clients.remove(i);

    }

    public void showAll()
    {
        for (Client client:clients)
        {
            System.out.println(client.toString());
        }
    }


}
