package net.codejava.spring.model;

/**
 * Created by kwozniak on 26.11.15.
 */
public enum UserType {

    ADMIN("Admin"), CLIENT("Client"), MANAGER("Manager");

    private String userType;

    UserType(String userType) {
        this.userType = userType;
    }

    public String getUserType() {
        return userType;
    }
}
