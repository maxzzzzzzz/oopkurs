package maxoop.dao.Transportation.impls;

import maxoop.dao.Transportation.interfaces.IDaoTransportation;
import maxoop.model.Transportation.Transport;
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
public class DaoTransportationImpl implements IDaoTransportation {
    public List<Transport> transports = new ArrayList<Transport>();

    public DaoTransportationImpl() {
        try {
            Connection co = DriverManager.getConnection("jdbc:sqlite:laba3oop.db");
            Statement statement = co.createStatement();
            String query = "SELECT * FROM Transportation";
            ResultSet rs = statement.executeQuery(query);
            while(rs.next())
            {
                int id = rs.getInt("id");
                String typeofcar = rs.getString("typeofcar");
                String name = rs.getString("name");
                int countofmembers = rs.getInt("countofmembers");
                Transport transport = new Transport(id,typeofcar,name,countofmembers);
                this.transports.add(transport);
            }
            co.close();
            statement.close();
        } catch (Exception e) {
            //  System.out.println(e.getMessage());
        }
    }


    public DaoTransportationImpl(List<Transport> transports) {
        this.transports = transports;
    }

    public List<Transport> getAll() {
        return transports;
    }

    @Override
    public List<Transport> readAll() {
        return (ArrayList<Transport>) this.transports;

    }
    public Transport getTransport(int id) {
        Transport result = null;
        for (Transport transport:transports)
        {
            if((transport.getId())==id)
            {
                result = new Transport();
            }

        }
        return result;
    }

    public void createTransport(Transport transport)
    {
        transports.add(transport);
    }

    public void updateTransport(Transport transport)
    {
        Transport updateTransport = null;
        for (Transport transport1:transports)
        {
            if(transport1.getId()==transport.getId())
            {
                updateTransport = transport1;
                break;
            }
        }
        updateTransport = transport;
    }

    public void deleteTransport(int id)
    {
        int i =0;
        boolean is=false;
        for (Transport transport:transports)
        {
            if (transport.getId()==id)
            {
                is = true;
                break;
            }
            i++;
        }
        if (is) transports.remove(i);

    }

    public void showAll()
    {
        for (Transport transport:transports)
        {
            System.out.println(transport.toString());
        }
    }
}
