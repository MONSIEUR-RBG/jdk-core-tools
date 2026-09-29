public class Grettings {
    static void main() {

        String name= IO.readln("What is your name buddy?:");
        int feature = Runtime.version().feature();

        IO.println("Hello world, I'm " + name + " this is Java " + feature + "!");
    }
}
