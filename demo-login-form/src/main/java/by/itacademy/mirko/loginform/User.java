package by.itacademy.mirko.loginform;

public class User {
    public static int id = 0;
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public User(){

    }
    public User(String name, String password) {
        this.name = name;
        this.password = password;
        id++;
    }

    @Override
    public String toString(){
        return "User(" + "id" + id + ", name = '" + name + '\'' + ", password = '" + password + '\'' + ")";
    }
}
