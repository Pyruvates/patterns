package chainOfRespobsibility;
/*
 * Created by Koshkarov Vitaliy on 29.11.2019
 */

import java.util.List;
import java.util.ArrayList;

class ApplicationRecorder {
    private List<String> history = new ArrayList<>();

    void addHistoryRecord(String record) {
        history.add(record);
    }

    void printHistory() {
        System.out.println();
        System.out.println(history);
    }
}
