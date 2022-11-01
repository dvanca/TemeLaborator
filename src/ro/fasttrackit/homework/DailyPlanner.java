package ro.fasttrackit.homework;

import java.util.*;

public class DailyPlanner {
    private List<DaySchedule> scheduleList = new ArrayList<>();

    public void addActivity(DayOfTheWeek dayOfTheWeek, String activity) {
        validateActivity(activity);
        DaySchedule found = getDaySchedule(dayOfTheWeek);
        if (found==null) {
            scheduleList.add(new DaySchedule(dayOfTheWeek, new ArrayList<>(Collections.singletonList(activity))));
        }else{
            found.getActivities().add(activity);
        }
    }



    public void removeActivity(DayOfTheWeek dayOfTheWeek, String activityToBeRemoved){
        validateActivity(activityToBeRemoved);
        DaySchedule daySchedule = getDaySchedule(dayOfTheWeek);
        if(daySchedule == null){
            throw new NoActivityException();
        }else{
            boolean wasRemoved = removeActivityFromDay(activityToBeRemoved, daySchedule);
            if(!wasRemoved) throw new NoActivityException();
        }
    }

    private boolean removeActivityFromDay(String activityToBeRemoved, DaySchedule daySchedule) {
        boolean found = false;
        for(String dayActivity : daySchedule.getActivities()){
        if(dayActivity.equals(activityToBeRemoved)){
            found=true;
            daySchedule.getActivities().remove(dayActivity);
         }
        }
        return found;
    }

    public Map<DayOfTheWeek, List<String>> endPlanning() throws NoActivitesForDayException {
        Map<DayOfTheWeek, List<String>> result = new HashMap<>();
        DayOfTheWeek[] days = DayOfTheWeek.values();
        for (DayOfTheWeek dayOfTheWeek : days) {
            DaySchedule daySchedule = getDaySchedule(dayOfTheWeek);
            if (daySchedule == null || daySchedule.getActivities().size() == 0) {
                throw new NoActivitesForDayException();
            }

            result.put(dayOfTheWeek, daySchedule.getActivities());
        }
        return result;
    }

    private DaySchedule getDaySchedule(DayOfTheWeek dayOfTheWeek) {
        for (DaySchedule daySchedule : scheduleList) {
            if (daySchedule.getDay() == dayOfTheWeek) {
                return daySchedule;
            }
        }
        return null;
    }

    private void validateActivity(String activity) {
        if (activity == null) {
            throw new NoActivityException();
        }
    }
}
