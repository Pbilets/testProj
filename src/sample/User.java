package sample;

public class User {

    private String fiersName;
    private String lastName;
    private String login;
    private String password;
    private String male;

    public User(String fiersName, String lastName, String login, String password, String male) {
        this.fiersName = fiersName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.male = male;
    }

    public String getFiersName() {
        return fiersName;
    }

    public void setFiersName(String fiersName) {
        this.fiersName = fiersName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }
}
