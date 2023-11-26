package PracticeTest2;

public class FileStorage implements IStorage{
    public void save(String fileName) {
        System.out.println("Saving to " + fileName);
    }
    public void load(String fileName) {
        System.out.println("Loading from " + fileName);
    }
}
