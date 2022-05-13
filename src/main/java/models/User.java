package models;

import java.util.Date;

public class User {

    private int id = -1;
    private String userName = "";
    private String fName = "";
    private String lName = "";
    private Date registrationDate = null;

    public User(int id, String userName, String fName, String lName, Date registrationDate) {
        this.id = id;
        this.userName = userName;
        this.fName = fName;
        this.lName = lName;
        this.registrationDate = registrationDate;
    }

    public User(String userName, String fName, String lName, Date registrationDate) {

        this.userName = userName;
        this.fName = fName;
        this.lName = lName;
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }
}
