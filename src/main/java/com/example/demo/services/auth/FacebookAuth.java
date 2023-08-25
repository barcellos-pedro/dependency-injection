package services.auth;

public class FacebookAuth implements Authenticator {

    @Override
    public boolean authenticate(String email) {
        return email.contains("@facebook");
    }

    @Override
    public void logout() {
        System.out.println("logout");
    }
}