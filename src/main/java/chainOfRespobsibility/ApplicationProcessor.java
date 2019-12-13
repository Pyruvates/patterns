package chainOfRespobsibility;
/*
 * Created by Koshkarov Vitaliy on 29.11.2019
 */

abstract class ApplicationProcessor {
    private ApplicationProcessor next;

    void setNext(ApplicationProcessor next) {
        this.next = next;
    }

    void startProcess(ApplicationRecorder application) {
        before();
        processInternal(application);
        after();

        if (getNext() != null) {
            getNext().startProcess(application);
        }
    }

    protected abstract void processInternal(ApplicationRecorder application);

    abstract String getStageBefore();

    abstract String getStageAfter();

    private ApplicationProcessor getNext() {
        return next;
    }

    private void before() {
        System.out.println("Before: " + getStageBefore());
    }

    private void after() {
        System.out.println("After: " + getStageAfter());
    }
}
