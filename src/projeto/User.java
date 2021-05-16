package projeto;

public class User extends Human{
    private String login;
    private int totWatched;

    public User(String name, String sex, int age, String login) {
        super(name, sex, age);
        this.login = login;
        this.totWatched = 0;
    }

    public void WatchedOneMore(){

    }

    @Override
    protected void getXP() {

    }

    @Override
    public String toString() {
        return "User{\n" + super.toString() +
                "\nlogin='" + login + '\'' +
                ", totWatched=" + totWatched +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotWatched() {
        return totWatched;
    }

    public void setTotWatched(int totWatched) {
        this.totWatched = totWatched;
    }
}
