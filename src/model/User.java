package model;

public abstract class User {
    String userId;
    String name;
    String userName;
    String password;

    public User(String userId, String name, String userName, String password) {
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.password = password;
    }
}


