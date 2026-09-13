package dev.folomkin.weather_app.repository;

import dev.folomkin.weather_app.entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Long> {
    List<Weather> findByCity(String city);
}
