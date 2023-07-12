package Projects_OOP.Seminar04.weather_api_master.src.main.java;

import Projects_OOP.Seminar04.weather_api_master.src.main.java.ui.ConsoleUI;
import Projects_OOP.Seminar04.weather_api_master.src.main.java.ui.DesktopUI;
import Projects_OOP.Seminar04.weather_api_master.src.main.java.ui.View;
import Projects_OOP.Seminar04.weather_api_master.src.main.java.weather_api.Connection;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.start();
    }
}
