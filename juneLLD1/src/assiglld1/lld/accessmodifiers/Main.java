package lld.accessmodifiers;

public class Main {
    public static void main(String[] args) {
        Rectangle p = new Rectangle(0, 0, 0, 0);
        Rectangle r = p;
        System.out.println("Main.main");
    }
}
