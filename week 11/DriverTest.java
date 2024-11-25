public class DriverTest {
    public static void main(String[] args) {
        SonyDriver sd = new SonyDriver();

        sd.speak();
        sd.announcement("Sony is announcing something...!");

        LGDriver lg = new LGDriver();

        lg.speak();
        lg.announcement("LG is announcing something...!");
    }
}
