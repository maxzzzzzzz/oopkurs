package maxoop.model.Transportation;

/**
 * Created by ilost on 06.04.2017.
 */
public class Transport {
private int id;
private String typeofcar;
private String name;
private int countofmembers;

public Transport(){}

    @Override
    public String toString() {
        return "Transport{" +
                "id=" + id +
                ", typeofcar='" + typeofcar + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeofcar() {
        return typeofcar;
    }

    public void setTypeofcar(String typeofcar) {
        this.typeofcar = typeofcar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountofmembers() {
        return countofmembers;
    }

    public void setCountofmembers(int countofmembers) {
        this.countofmembers = countofmembers;
    }

    public Transport(int id, String typeofcar, String name, int countofmembers) {

        this.id = id;
        this.typeofcar = typeofcar;
        this.name = name;
        this.countofmembers = countofmembers;
    }
}
