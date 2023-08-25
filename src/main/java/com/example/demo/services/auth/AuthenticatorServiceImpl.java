package services.auth;

public class AuthenticatorServiceImpl implements Authenticator {

    @Override
    public boolean authenticate(String email) {
        return email.contains("@itau-unibanco.com.br");
    }

    @Override
    public void logout() {
        System.out.println("logout");
    }
}
