package chainOfRespobsibility;
/*
 * Created by Koshkarov Vitaliy on 29.11.2019
 */

public class ApplicationResult extends ApplicationProcessor {
    private final String stageBefore = "Решение принимается";
    private final String stageAfter  = "Решение принято";

    @Override
    protected void processInternal(ApplicationRecorder application) {
        application.addHistoryRecord(stageBefore);
        application.addHistoryRecord(stageAfter);
    }

    @Override
    String getStageBefore() {
        return stageBefore;
    }

    @Override
    String getStageAfter() {
        return stageAfter;
    }
}
