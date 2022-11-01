package ro.fasttrackit.homework;

import java.util.List;

public class DaySchedule {
    private DayOfTheWeek day;
    private List<String> activities;


    public DaySchedule(DayOfTheWeek day, List<String> activities) {
        this.day = day;
        this.activities = activities;
    }

    public DayOfTheWeek getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }
}
