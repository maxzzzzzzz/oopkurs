package maxoop.services.Transportation.impls;

import maxoop.dao.Order.impls.DaoOrderImpl;
import maxoop.dao.Transportation.impls.DaoTransportationImpl;
import maxoop.model.Order.Order;
import maxoop.model.Transportation.Transport;
import maxoop.services.Order.interfaces.IOrderService;
import maxoop.services.Transportation.interfaces.ITransportationService;

import java.util.List;

/**
 * Created by ilost on 13.04.2017.
 */
public class TransportationServiceImpl implements ITransportationService {
    ITransportationService iTransportationService;

    public TransportationServiceImpl(DaoTransportationImpl daoTransportation) {
    }

    public List<Transport> getAll() {
        return iTransportationService.getAll();
    }

    public Transport getTransport(int id) {
        return iTransportationService.getTransport(id);
    }

    public void createTransport(Transport transport) {
        iTransportationService.createTransport(transport);
    }

    public void updateTransport(Transport transport) {
        iTransportationService.updateTransport(transport);
    }

    public void deleteTransport(int id) {
        iTransportationService.deleteTransport(id);
    }

    public void showAll() {
        iTransportationService.showAll();
    }
}
