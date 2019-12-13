package adapter;
/*
 * Created by Koshkarov Vitaliy on 05.12.2019
 */

public class LibraryAdapter implements LibraryInterface {
    private final Library library;

    LibraryAdapter(Library library) {
        this.library = library;
    }

    @Override
    public void action() {
        System.out.println(this.library);
    }
}
