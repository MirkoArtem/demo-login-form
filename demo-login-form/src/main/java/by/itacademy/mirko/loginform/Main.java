package by.itacademy.mirko.loginform;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Artem", "QWERTY");
        User user2 = new User();

        LoginForm loginForm = new LoginForm();

        boolean isValidUser = loginForm.checkUser(user1);
        System.out.println(isValidUser);

        isValidUser = loginForm.checkUser(user2);
        System.out.println(isValidUser);


        //      System.out.println(user1);
        //      System.out.println(user2);
    }
}
