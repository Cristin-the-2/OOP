package Projects_OOP.Seminar04.weather_api_master.src.main.java.presenter;

import Projects_OOP.Seminar04.weather_api_master.src.main.java.ui.View;
import Projects_OOP.Seminar04.weather_api_master.src.main.java.weather_api.Service;
import Projects_OOP.Seminar04.weather_api_master.src.main.java.weather_api.WeatherService;

public class Presenter {

    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new WeatherService();
    }

    public void getInfo(String city) {
        String answer = service.get(city);
        view.print(answer);
    }
}
