package nfort.com.oop.lesson8;

public class TimeInterval {

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
        return seconds + minutes * 60 + hours * 60 * 60;
    }

    public TimeInterval sum(TimeInterval timeInterval) {
        return new TimeInterval(this.totalSeconds() + timeInterval.totalSeconds());
    }

    public void printTimeInterval() {
        System.out.println("seconds " + seconds + ", minutes " + minutes + ", hours " + hours);
    }
}
