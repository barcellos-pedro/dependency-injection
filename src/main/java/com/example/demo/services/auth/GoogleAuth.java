package services.auth;

public class GoogleAuth implements Authenticator {

    @Override
    public boolean authenticate(String email) {
        return email.contains("@google");
    }

    @Override
    public void logout() {
        System.out.println("logout");
    }
}