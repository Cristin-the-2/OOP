package Projects_OOP.Seminar04.weather_api_master.src.main.java.weather_api;

import com.google.gson.Gson;
import Projects_OOP.Seminar04.weather_api_master.src.main.java.weather_api.weather.Weather;

public class Formatter {
    public Weather parse(String json){
        Gson gson = new Gson();
        Weather weather = gson.fromJson(json, Weather.class);
        return weather;
    }
}
