package observer;
/*
 * Created by Koshkarov Vitaliy on 29.11.2019
 */

class ConsumerA implements Listener {
    private final String name;

    ConsumerA(int num) {
        this.name = "ConsumerA № " + num;
    }

    public String getName() {
        return name;
    }

    @Override
    public void onUpdate(String data) {
        System.out.println(getName() + ": " + data);
    }
}
