package maxoop.model.Client;

/**
 * Created by ilost on 06.04.2017.
 */
public class Client {
    private int id;
    private String name;
    private String surname;
    private int lvlofclient;

    public Client() {
    }

    public Client(int id, String name, String surname, int lvlofclient) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.lvlofclient = lvlofclient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lvlofclient=" + lvlofclient +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getLvlofclient() {
        return lvlofclient;
    }

    public void setLvlofclient(int lvlofclient) {
        this.lvlofclient = lvlofclient;
    }

}
