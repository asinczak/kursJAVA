package pl.wyklad.czwarty;

public class Watch {

    int minutes;
    int hours;

    Watch (int hours) {
        this.hours = hours;
    }

    Watch (int hours, int minutes) {
        this(hours);
        this.minutes = minutes;
    }

    int windWatchHours (int hours){
        return hours;
    }

    int windWatchMinutes (int minutes) {
        return minutes;
    }


}
