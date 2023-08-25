package services.storage;

public class S3Storage implements Storage {
//    private AWSBucket bucket;

    public S3Storage(String config) {
        // initialize SDK
    }

    public Object get(String key) {
        // return bucket.get(key);
        return new Object();
    }

    public void put(String key, Object value) {
        // bucket.put(key, value);
    }
}