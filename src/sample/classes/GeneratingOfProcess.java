package sample.classes;

import sample.Controller;

public class GeneratingOfProcess {
    private int id=0;

    public void generate(Processes processes) {
        NameOfProcess nameOfProcess = new NameOfProcess();
        processes.getList().add(new Process(nameOfProcess.getRandomProcessName(), ++id));
        Controller.Refresh();
    }
}
