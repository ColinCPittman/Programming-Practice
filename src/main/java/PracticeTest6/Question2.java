package PracticeTest6;

import java.io.*;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        System.out.print("You better type in a file name with .txt and hit enter right now: ");
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        File newFile = new File(filename);
        System.out.println("Okay your file has been recorded. It better have been a text file or else all hell will break loose.");
        try {
            if (!newFile.exists()) {
                newFile.createNewFile();
                System.out.println("Okay well the file wasn't found so we made a new one for you, this must be very embarrassing for you.");
            }
            Scanner fileSC = new Scanner(newFile);
            String contents = "";
            if (fileSC.hasNext()) System.out.println("Okay here is the contents of your stinking file: ");
            while (fileSC.hasNextLine()) {
                contents += fileSC.nextLine() + "\n";
            }
            System.out.println(contents);
            FileWriter fileWriter = new FileWriter(newFile);
            System.out.print("I'm warning you not to not type what you want added to the top of this file and hit enter: ");
            fileWriter.write(sc.nextLine() + "\n" + contents);
            System.out.println("Now here is the new contents of your file, I hope you're real proud of yourself, buddy: ");
            fileSC.close();
            fileWriter.close();
            Scanner newFileSC = new Scanner(newFile);
            contents = "";
            while (newFileSC.hasNextLine()) {
                contents += newFileSC.nextLine() + "\n";
            }
            System.out.println(contents);
            newFileSC.close();

        } catch (FileNotFoundException e) {
            System.out.println("All hell is actively breaking loose.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
