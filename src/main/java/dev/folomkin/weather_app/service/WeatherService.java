package dev.folomkin.weather_app.service;


import dev.folomkin.weather_app.entity.Weather;
import dev.folomkin.weather_app.repository.WeatherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

    private final WeatherRepository weatherRepository;

    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public List<Weather> getWeatherByCity(String city) {
        return weatherRepository.findByCity(city);
    }

    public List<Weather> getWeatherData() {
        return weatherRepository.findAll();
    }

    public Weather saveWeather(Weather weather) {
        return weatherRepository.save(weather);
    }
}
