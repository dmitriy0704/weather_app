package dev.folomkin.weather_app.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Entity
@Table(name = "weather")
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @JsonProperty("city")
    private String city;

    @JsonProperty("temperature")
    private String temperature;

    @JsonProperty("description")
    private String description;

    @CreationTimestamp
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime timestamp;

    public Weather() {
    }

    public Weather(String city, String temperature, String description, LocalDateTime timestamp) {
        this.city = city;
        this.temperature = temperature;
        this.description = description;
        this.timestamp = timestamp;
    }
}
