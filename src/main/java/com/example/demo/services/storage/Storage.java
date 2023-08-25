package services.storage;

public interface Storage {
    
    Object get(String key);

    void put(String key, Object value);
}