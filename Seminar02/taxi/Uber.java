package Projects_OOP.Seminar02.taxi;

public class Uber extends Taxi {
    @Override
    public void drive(String address) {
        System.out.println("Такси UBER привествует вас!");
    }
}