package services.storage;

public class BadFTPStorage {
//    private FTPStorage ftpStorage = null;

    public BadFTPStorage(String config) {
        // initialize storage
        // this.ftpStorage = new FTPLib(config);
    }

    public Object retrieve(String key) {
        // return ftp.get(key);
        return new Object();
    }

    public void store(String key, Object value) {
        // ftpStorage.put(key, value);
    }
}
