package chainOfRespobsibility;
/*
 * Created by Koshkarov Vitaliy on 29.11.2019
 */

public class ApplicationInput extends ApplicationProcessor {
    private final String stageBefore = "Заявление принимается";
    private final String stageAfter  = "Заявление принято";

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
