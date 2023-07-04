package Projects_OOP.Seminar02.taxi;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.callTaxi(new Friend());
        person.callTaxi(new Uber());
        person.callTaxi(new Yandex());
    }
}