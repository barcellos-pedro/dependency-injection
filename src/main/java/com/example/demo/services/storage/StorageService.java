package services.storage;

public class StorageService {

    private Storage storage;

    public StorageService(Storage storage) {
        this.storage = storage;
    }

    public Object retrieve(String key) {
        return storage.get(key);
    }

    public void store(String key, Object value) {
        // return storage.put(key, value);
    }
}
