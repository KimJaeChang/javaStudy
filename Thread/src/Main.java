public class Main {
    public static void main(String[] args) {
        ThreadTest atm = new ThreadTest();
        Thread mother = new Thread(atm, "mother");
        Thread son = new Thread(atm, "son");
        mother.start();
        son.start();
    }
}