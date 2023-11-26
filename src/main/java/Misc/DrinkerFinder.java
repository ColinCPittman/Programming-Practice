package Misc;

import java.io.File;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DrinkerFinder{
    public static void main(String[] args) throws Exception,InputMismatchException{
        System.out.println(System.getProperty("user.dir"));
    stage2();
    }
    public static void stage2(){
        File input = new File("names.txt");
        File outputs = new File("outputs.txt");
        File errors = new File("errors.txt");
        Scanner sc = null;
        PrintWriter pwO = null;
        PrintWriter pwE = null;

        try{
            sc = new Scanner(input);
            pwO = new PrintWriter(outputs);
            pwE = new PrintWriter(errors);
        }
        catch(Exception e){
            System.out.println("An error has occurred trying to open the files.");
            System.out.println(e.getMessage());
            if(sc != null) sc.close();
            if(pwO != null) pwO.close();
            if(pwE != null) pwE.close();
            return;
        }

        while(sc.hasNextLine()){
            String line = "";
            try{
                line = sc.nextLine();
                String[] temp = line.split(",");
                String firstName = temp[0];
                String surname = temp[1];
                int age = Integer.parseInt(temp[2]);

                pwO.println(firstName + "," + surname + "," + age);
            }
            catch(InputMismatchException e) {
                pwE.println(line);
                continue;
            }
            catch(Exception e){
                System.out.println("An unknown error has occurred.");
                System.out.println(e.getClass());
                System.out.println(e.getMessage());
                if(sc != null) sc.close();
                if(pwO != null) pwO.close();
                return;
            }
        }

        if(sc != null) sc.close();
        if(pwO != null) pwO.close();
    }

}
