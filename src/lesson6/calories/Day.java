package lesson6.calories;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Day {
    private List<Dish> dishes = new ArrayList<>();
    private LocalDate date;
    private double total;

    public Day() {
    }

    public Day(List<Dish> dishes, double total) {
        this.dishes = dishes;
        this.total = total;
        this.date = LocalDate.now();
    }

    public Day(LocalDate date, List<Dish> dishes) {
        this.date = date;
        this.dishes = dishes;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public double getTotalCalories() {
        return dishes.stream().mapToInt(Dish::getCaloriesAmount).sum();
    }
}
