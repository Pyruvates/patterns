package adapter;
/*
 * Created by Koshkarov Vitaliy on 05.12.2019
 */

public class Main {
    public static void main(String[] args) {
        new Main().usePattern();
        new Main().alternative();
    }

    private void usePattern() {
        Library library = new Library();
        MyClass myClass = new MyClass();
        myClass.myClassMethod(new LibraryAdapter(library));
    }

    private void alternative() {
        Library library = new Library();
        MyClass myClass = new MyClass();
        myClass.myClassMethod(() -> System.out.println(library));
    }
}
