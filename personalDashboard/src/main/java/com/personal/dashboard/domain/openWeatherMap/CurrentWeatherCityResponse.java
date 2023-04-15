package com.personal.dashboard.domain.openWeatherMap;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document("currentWeatherByCity")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class CurrentWeatherCityResponse {

    @MongoId
    private String _id;
    private String base;
    private CloudsObject clouds;
    private String cod;
    private Coord coord;
    private String dt;
    private String id;
    private MainObject main;
    private String name;
    private SysCityObject sys;
    private Long timezone;
    private Long visibility;
    private List<WeatherObject> weather;
    private WindObject wind;
}
