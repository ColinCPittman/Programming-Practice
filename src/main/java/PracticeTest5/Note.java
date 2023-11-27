package PracticeTest5;

public class Note {
    private String theNote;
    private int priority;

    public String getTheNote() {
        return theNote;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return priority +", " + theNote;
    }

    public Note(String theNote, int priority) {
        this.theNote = theNote;
        this.priority = priority;
    }
}
