package PracticeTest6;

import java.util.ArrayList;

public class DataProcessorDriver {
    public static void main(String[] args) {
        DataProcessor dp = new DataProcessor();
        ArrayList<String> notBusiness = new ArrayList<>();
        notBusiness.add("important business due");
        notBusiness.add("memes and stuff");
        notBusiness.add("Grocery list");
        notBusiness.add("Business meeting");
        System.out.println(notBusiness);
        dp.processData(notBusiness);
        System.out.println(dp.getResult().toString());
    }
}
