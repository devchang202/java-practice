package uni.practice5;

public class Time {
    final static int MAX_HOUR = 23;
    final static int MIN_HOUR = 0;
    final static int MAX_MINUTE = 59;
    final static int MIN_MINUTE = 0;
    final int hour;
    final int minute;

    Time() {
        this(MIN_HOUR, MIN_MINUTE);
    }

    Time(int hour, int minute) {
        if (false == isValidTime(hour, minute)) {
            this.hour = MIN_HOUR;
            this.minute = MIN_MINUTE;
        } else {
            this.hour = hour;
            this.minute = minute;
        }
    }

    static boolean isValidTime(int hour, int minute) {
        if (hour <= MAX_HOUR && hour >= MIN_HOUR &&
                minute <= MAX_MINUTE && minute >= MIN_MINUTE) {
            return true;
        }

        return false;
    }

    void setTime(int hour, int minute) {
        if (false == isValidTime(hour, minute)) {
            System.out.println("This is invalid time");
        }
    }

    public String toString() {
        String tmp  = this.hour + ":" + this.minute;
        return tmp;
    }

    public String getDurationFrom(Time endTime) {
        int hour = endTime.hour - this.hour;
        int minute = endTime.minute - this.minute;
        if (minute < 0) {
            hour--;
            minute = 60 + minute;
        }

        String result = hour + "시 " + minute + "분 ";
        return result;
    }
}
