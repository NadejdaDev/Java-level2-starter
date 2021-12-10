package nfort.com.oop.lesson8;

public class TimeInterval {

    private static final int SECONDS_IN_MINUTES = 60;
    private static final int MINUTES_IN_HOURS = 60;

    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int totalSeconds) {
        hours = totalSeconds / 3600;
        minutes = (totalSeconds % 3600) / 60;
        seconds = (totalSeconds % 3600) % 60;
    }

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int totalSeconds() {
        return seconds + minutes * SECONDS_IN_MINUTES + hours * MINUTES_IN_HOURS * SECONDS_IN_MINUTES;
    }

    public TimeInterval sum(TimeInterval timeInterval) {
        return new TimeInterval(this.totalSeconds() + timeInterval.totalSeconds());
    }

    public void printTimeInterval() {
        System.out.println("seconds " + seconds + ", minutes " + minutes + ", hours " + hours);
    }
}
