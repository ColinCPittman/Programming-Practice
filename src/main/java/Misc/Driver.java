import java.util.Scanner;
import java.util.ArrayList;

class StringSet{
    private ArrayList<String> set;

    public StringSet(){
        set = new ArrayList<>();
    }

    public StringSet(String[] input) throws Driver.SetContainsNullOrEmpty, Driver.SetContainsDuplicates {
        for(String s : input){
        addElement(s);
        }
    }

    public ArrayList<String> getElements(){
        return set;
    }

    public void setElements(String[] input) throws Driver.SetContainsNullOrEmpty, Driver.SetContainsDuplicates {
        for(String s : input){
        addElement(s);
        }
    }

    public void addElement(String s) throws Driver.SetContainsNullOrEmpty, Driver.SetContainsDuplicates {
        if(s == null) {
            throw new Driver.SetContainsNullOrEmpty("Invalid. Element cannot be null.");
        }
        if(s.isEmpty()){
            throw new Driver.SetContainsNullOrEmpty("Invalid. Element cannot be empty.");
        }
        if(set.contains(s)) throw new Driver.SetContainsDuplicates("Invalid. Element already exists in set.");
        else set.add(s);
    }

    public void removeElement(String s){
        for(int i = 0; i < set.size(); i++){
            if(set.get(i).equals(s)) {
                set.remove(i);
            return;
            }
        }
    }
}

public class Driver {


    public static void main(String[] args) throws SetContainsNullOrEmpty, SetContainsDuplicates {
        Scanner sc = new Scanner(System.in);
        StringSet set = new StringSet();
        int option = 0;

        do{
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Print set");
            System.out.println("4. Exit");
            option = sc.nextInt();
            sc.nextLine();


            switch(option){
                case 1:
                    System.out.print("Enter element to add: ");
                    try {
                        set.addElement(sc.nextLine());
                    }catch (SetContainsNullOrEmpty e) {
                        System.out.println(e.getMessage());
                        break;
                    } catch (SetContainsDuplicates e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                    System.out.println("Element added.");
                    break;

                case 2:
                    System.out.print("Enter element to remove: ");
                    set.removeElement(sc.nextLine());
                    System.out.println("Element removed.");
                    break;
                case 3:
                    ArrayList<String> temp = set.getElements();
                    System.out.println("Elements in set: ");
                    for(String s : temp){
                        System.out.print(s + " ");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Shutting down...");
                    return;
            }
        }while(option != 4);



    }
    static class SetContainsNullOrEmpty extends Exception {
        public SetContainsNullOrEmpty() {
        }

        public SetContainsNullOrEmpty(String message) {
            super(message);
        }
    }
    static class SetContainsDuplicates extends Exception {
        public SetContainsDuplicates() {
        }

        public SetContainsDuplicates(String message) {
            super(message);
        }
    }
}
