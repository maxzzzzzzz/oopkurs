package maxoop.services.Transportation.interfaces;

import maxoop.model.Transportation.Transport;

import java.util.List;

/**
 * Created by ilost on 13.04.2017.
 */
public interface ITransportationService {
    List<Transport> getAll();
    Transport getTransport(int id);
    void createTransport (Transport transport);
    void updateTransport (Transport transport);
    void deleteTransport (int id);
    void showAll();
}
