package lesson2;

public class IfAndSwitch {

    public void canBeDivided(int input) {
        if (input % 3 == 0 && input % 5 == 0) {
            System.out.println("Could be divided by 3 and 5");
        }
    }

    public void checkEven(int input) {
        if (input % 2 == 0) {
            System.out.println("Even number");
        }
    }
}
