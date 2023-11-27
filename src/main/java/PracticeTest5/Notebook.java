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
            if (highestPriority.getPriority() < note.getPriority()) {
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

