package services.auth;

public interface Authenticator {

    boolean authenticate(String email);

    void logout();
}