public class TimeCheck {
    public static void main(String[] args) {
        Time t1 = new Time(10, 0, 0);
        System.out.println("Initial Time:");
        t1.printTime();

        // Increment by 60 seconds
        for (int i = 0; i < 60; i++) {
            t1.tick();
        }
        System.out.println("After 60 seconds:");
        t1.printTime();

        // Second instance
        Time t2 = new Time(19, 26, 0);
        System.out.println("Initial Time:");
        t2.printTime();

        // Increment by 3600 seconds
        for (int i = 0; i < 3600; i++) {
            t2.tick();
        }
        System.out.println("After 60 minutes:");
        t2.printTime();

        // Third instance
        Time t3 = new Time(23, 26, 0);
        System.out.println("Initial Time:");
        t3.printTime();

        // Increment by 86400 seconds
        for (int i = 0; i < 86400; i++) {
            t3.tick();
        }
        System.out.println("After 24 hours:");
        t3.printTime();
    }
}