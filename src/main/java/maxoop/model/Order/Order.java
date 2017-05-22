package maxoop.model.Order;

/**
 * Created by ilost on 06.04.2017.
 */
public class Order {
    private int id;
    private String departure;
    private String arrival;
    private int distance;
    public Order(){}

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", distance=" + distance +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Order(int id, String departure, String arrival, int distance) {

        this.id = id;
        this.departure = departure;
        this.arrival = arrival;
        this.distance = distance;
    }
}
