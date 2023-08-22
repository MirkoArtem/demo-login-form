package by.itacademy.mirko.loginform;

public class MainAccount {
    public static void main(String[] args) {
        Card card1 = new Card("Artem", "42551901");
        Card card2 = new Card("Artem", "itisrealyme");

        Terminal terminal1 = new Terminal();

        boolean checkCard = terminal1.checkCard(card1);
        System.out.println(checkCard);

        checkCard = terminal1.checkCard(card2);
        System.out.println(checkCard);
    }
}