package Projects_OOP.Seminar02.taxi;

public class Friend implements Drivable {
    @Override
    public void drive(String address) {
        System.out.println("Поехали, дружище!");
    }
}