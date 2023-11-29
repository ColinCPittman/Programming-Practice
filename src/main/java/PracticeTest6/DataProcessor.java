package PracticeTest6;

import java.util.ArrayList;
import java.util.Spliterator;

public class DataProcessor implements IProcessData {
    ArrayList<String> array;

    public DataProcessor() {

    }

    @Override
    public void processData(ArrayList<String> arrayList) {
        for (int i = arrayList.size() -1; i >=0; i--) {
            if(!arrayList.get(i).toLowerCase().contains("memes")) {
                if(arrayList.get(i).toLowerCase().contains("business")) {

                    arrayList.set(i,arrayList.get(i).replace("business", "memes"));
                    arrayList.set(i,arrayList.get(i).replace("Business", "Memes"));
                } else {
                    arrayList.remove(arrayList.get(i));
                }
            }
        }
        array = arrayList;
    }

    @Override
    public ArrayList<String> getResult() {
        return array;
    }
}
