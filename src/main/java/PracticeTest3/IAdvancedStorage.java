package PracticeTest3;

import PracticeTest2.IStorage;

public interface IAdvancedStorage extends IStorage {
    void delete(String fileName);
    void rename(String oldName, String newName);
}
