package by.itacademy.mirko.loginform;

public class Terminal {
    public boolean checkCard(Card card) {
        String cardName = "Artem";
        String cardAccount = "itisrealyme";

        if (cardName == card.getName() && cardAccount == card.getAccount()) {
            return true;
        } else {
            return false;
        }
    }
}
