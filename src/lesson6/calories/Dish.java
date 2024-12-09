package lesson6.calories;

public class Dish {
    private int name;
    private int caloriesAmount;

    public Dish(int dishName, int caloriesAmount) {
        this.name = dishName;
        this.caloriesAmount = caloriesAmount;
    }

    public int getName() {
        return name;
    }

    public int getCaloriesAmount() {
        return caloriesAmount;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setCaloriesAmount(int caloriesAmount) {
        this.caloriesAmount = caloriesAmount;
    }
}
