public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Time(int hr, int min, int sec) {
        hour = hr;
        minute = min;
        second = sec;
    }

    public void setTime(int hr, int min, int sec) {
        hour = hr;
        minute = min;
        second = sec;
    }

    public void printTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }

    public void tick() {
        // tick method defined
        if (second < 60)
            second++;
        else {
            if (minute < 60) {
                second = 0;
                minute++;
            } else {
                if (hour < 24) {
                    second = 0;
                    minute = 0;
                    hour++;
                } else {
                    second = 0;
                    minute = 0;
                    hour = 0;
                }
            }
        }

    }
}
