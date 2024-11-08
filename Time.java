public class Time {

    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(new String (String.valueOf(hours)) + ":");
        sb.append(new String (String.valueOf(minutes)) + ":");
        sb.append(new String (String.valueOf(seconds)));

        if (sb.isEmpty()) {
            return "";
        }

        sb.append("\n");

        return sb.toString();
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
