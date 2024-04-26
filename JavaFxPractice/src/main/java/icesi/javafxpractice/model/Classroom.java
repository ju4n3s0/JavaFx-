package icesi.javafxpractice.model;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private static Classroom instance;
    private List<User> users;
    public static Classroom getInstance() {
        if (instance == null) {
            instance  = new Classroom();
        }
        return instance;
    }
    private Classroom() {
        users = new ArrayList<>();
    }
    public void addUser(String password, String code, String name) {
        boolean exist = users.stream().anyMatch(user -> user.getCode().equals(code));
        if(!exist){
            users.add(new User(name,code,password));
        }else{
            System.out.println("Username already exists");
        }
    }
}
