package goevents.online.messengertabs.models;

/**
 * Created by Mark Cua on 11/4/2016.
 */

public class Apc {

    private String ID,idNumber, name, email, type;

    public Apc() {
    }

    public String getIdNumber() {

        return idNumber;
    }

    public void setIdNumber(String idNumber) {

        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
