package services.storage;

public class BadStorageService {
    private S3Storage s3 = null;

    private AzureStorage azure = null;

    public BadStorageService(String type) {
        if (type.equals("s3")) {
            String s3Config = "...";
            s3 = new S3Storage(s3Config);
        }

        else {
            String azureConfig = "...";
            azure = new AzureStorage(azureConfig);
        }
    }

    public Object retrieve(String key) {
        if (s3 != null) {
            return s3.get(key);
        }

        return azure.get(key);
    }

    public void store(String key, Object value) {
        if (s3 != null) {
            s3.put(key, value);
        } else {
            azure.put(key, value);
        }
    }
}
