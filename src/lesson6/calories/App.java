package lesson6.calories;

import java.util.ArrayList;
import java.util.List;

public class App {
    private List<Day> trackedDays = new ArrayList<>();

    private Day addDay(Day day) {
        trackedDays.add(day);
        return day;
    }

    private void removeDay(Day day) {
        trackedDays.remove(day);
    }

    private double getAvaragePerDay() {
        double total = 0;
        for (Day day: trackedDays) {
            total = total + day.getTotalCalories();
        }
        return total;
    }
}
