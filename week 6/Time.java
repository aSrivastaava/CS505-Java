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
        setTime(hr, min, sec);
    }

    public void setTime(int hr, int min, int sec) {
        if (hr >= 0 && hr < 24)
            hour = hr;
        if (min >= 0 && min < 60)
            minute = min;
        if (sec >= 0 && sec < 60)
            second = sec;
    }

    public void printTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }

    public void tick() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
    }
}
