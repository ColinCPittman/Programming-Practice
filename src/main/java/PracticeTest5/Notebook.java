package PracticeTest5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Notebook implements INotable {
    private ArrayList<Note> notes = new ArrayList<>();

    public void addNote(int priority, String note) {
        notes.add(new Note(note, priority));
    }

    @Override
    public Note next_todo() {
        Note highestPriority = null;
        for (Note note : notes) {
            if (note != null && highestPriority == null) {
                highestPriority = note;
            }
            //the practice test is pretty explicit about what it wants to be implemented, getters for Note's priority were not mentioned, this next line is pretty hilarious
            //looking, but it's just looking for the greatest value of the int priority on the Notes, which is printed out in the toString, I felt like working under the constraints for practice.
            if (Integer.parseInt(highestPriority.toString().substring(0, note.toString().indexOf(','))) < Integer.parseInt(note.toString().substring(0, note.toString().indexOf(',')))) {
                highestPriority = note;
            }
        }
        return highestPriority;

    }

    @Override
    public boolean save(String filename) {
        File newFile = new File(filename + ".txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(newFile);
            for (Note line : notes) {
                fileWriter.write(String.valueOf(line) + "\n");
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}

