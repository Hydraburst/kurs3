package sample.classes;

import java.util.ArrayList;
import java.util.Random;

public class NameOfProcess {
    private ArrayList<String> processNames = new ArrayList<>();
    private Random random = new Random();

    public NameOfProcess(){

        processNames.add("p1");
        processNames.add("p2");
        processNames.add("p3");
        processNames.add("p4");
    }

    public String getRandomProcessName(){
        int index = random.nextInt(processNames.size()-1);
        return this.processNames.get(index);
    }
}
