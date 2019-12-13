package chainOfRespobsibility;
/*
 * Created by Koshkarov Vitaliy on 29.11.2019
 */

public class ApplicationReader extends ApplicationProcessor {
    private final String stageBefore = "Заявление рассматривается";
    private final String stageAfter  = "Заявление рассмотрено";

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
