package PracticeTest3;

public class AdvancedFileStorage implements IAdvancedStorage {

    @Override
    public void save(String fileName) {
        System.out.println("Saving file " + fileName);
    }

    @Override
    public void load(String fileName) {
        System.out.println("Loading file " + fileName);
    }

    @Override
    public void delete(String fileName) {
        System.out.println("Deleted file " + fileName);
    }

    @Override
    public void rename(String oldName, String newName) {
        if(!fileAlreadyExists(newName)) {
            System.out.println("File name updated to " + newName);
        }
        else System.out.println("File name not updated, file of that name already exists.");
    }
    public boolean fileAlreadyExists(String fileName) {
        //Pretend we are checking somewhere for this and returning false if it already exists in the file system
        return true;
    }
}
