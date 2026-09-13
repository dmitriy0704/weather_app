package dev.folomkin.weather_app.controller;

import dev.folomkin.weather_app.entity.Weather;
import dev.folomkin.weather_app.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }


    @GetMapping("/{city}")
    public List<Weather> getWeather(@PathVariable String city) {
        return weatherService.getWeatherByCity(city);
    }

    @GetMapping("")
    public List<Weather> getWeatherData() {
        return weatherService.getWeatherData();
    }
}
