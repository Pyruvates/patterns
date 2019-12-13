package chainOfRespobsibility;
/*
 * Created by Koshkarov Vitaliy on 29.11.2019
 */

public class Main {
    public static void main(String[] args) {
        ApplicationRecorder app = new ApplicationRecorder();

        ApplicationProcessor input  = new ApplicationInput();
        ApplicationProcessor reader = new ApplicationReader();
        ApplicationProcessor result = new ApplicationResult();

        input.setNext(reader);
        reader.setNext(result);

        input.startProcess(app);

        app.printHistory();
    }
}
