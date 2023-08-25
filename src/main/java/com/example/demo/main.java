import services.auth.AuthService;
import services.auth.GoogleAuth;
import services.storage.AzureStorage;
import services.storage.BadStorageService;
import services.storage.StorageService;

public class main {
    public static void main(String[] args) {

        BadStorageService badStorageService = new BadStorageService("s3");
        badStorageService.store("key-a", "value-a");
        badStorageService.retrieve("key-a");

















        AzureStorage azureStorage = new AzureStorage("config...");

        StorageService storageService = new StorageService(azureStorage);

        storageService.store("posts/2023", "hello");
        storageService.retrieve("posts/2023");





















        GoogleAuth googleAuth = new GoogleAuth();

        AuthService authService = new AuthService(googleAuth);

        authService.login("ana@gmail.com");
        authService.logout();
    }
}
