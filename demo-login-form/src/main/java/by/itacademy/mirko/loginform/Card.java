package by.itacademy.mirko.loginform;

public class Card {
    public static int id = 0;
    private String name;
    private String account;

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }
    public Card(){

    }
    public Card(String name, String account) {
        this.name = name;
        this.account = account;
        id++;
    }

}
