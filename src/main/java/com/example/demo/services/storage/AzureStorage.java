package services.storage;

public class AzureStorage implements Storage {
//    private BlobStorage blobStorage = null;

    public AzureStorage(String config) {
        // initialize SDK
    }

    public Object get(String key) {
        // return blobStorage.get(key);
        return new Object();
    }

    public void put(String key, Object value) {
        // blobStorage.put(key, value);
    }
}