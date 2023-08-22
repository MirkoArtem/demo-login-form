package by.itacademy.mirko.loginform;

public class LoginForm {
    public boolean checkUser(User user) {
        String foreName = "Artem";
        if (foreName == user.getName()) {
            return true;
        } else {
            return false;
        }
    }
}
