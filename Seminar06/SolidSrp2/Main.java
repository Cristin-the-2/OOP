package Projects_OOP.Seminar06.SolidSrp2;

import Projects_OOP.Seminar06.SolidSrp2.srp.models.Order;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        order.saveToJson();
    }
}
