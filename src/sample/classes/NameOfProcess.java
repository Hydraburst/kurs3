package sample.classes;

import java.util.ArrayList;
import java.util.Random;

public class NameOfProcess {
    private ArrayList<String> processNames = new ArrayList<>();
    private Random random = new Random();

    public NameOfProcess(){

        processNames.add("Оpening");
        processNames.add("Start");
        processNames.add("Off");
        processNames.add("Closing");
    }

    public String getRandomProcessName(){
        int index = random.nextInt(processNames.size()-1);
        return this.processNames.get(index);
    }
}
