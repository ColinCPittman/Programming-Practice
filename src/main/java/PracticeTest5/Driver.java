package PracticeTest5;

public class Driver {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook.addNote(1,"Doorknob");
        notebook.addNote(2,"Hinge");
        notebook.save("Door Parts2");
        notebook.addNote(1,"Deadbolt");
        Note nextNote = notebook.next_todo();
        System.out.println(nextNote);
        System.out.println("done");
    }

}
