package services.auth;

public class AuthService {
    private Authenticator authenticator;

    public AuthService(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    public boolean login(String email) {
        return authenticator.authenticate(email);
    }

    public void logout() {
        authenticator.logout();
    }
}
