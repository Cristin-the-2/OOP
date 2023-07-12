package Projects_OOP.Seminar04.weather_api_master.src.main.java.ui;

import Projects_OOP.Seminar04.weather_api_master.src.main.java.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View{

    private Presenter presenter;
    private Scanner scanner;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
    }

    @Override
    public void start() {
        while (true){
            String city = scan();
            presenter.getInfo(city);
        }
    }

    private String scan() {
        System.out.println("Введите город");
        return scanner.nextLine();
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
