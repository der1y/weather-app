package org.example.services;

import org.example.Models.LatLon;
import org.example.Models.Weather;
import org.example.Models.WeatherObject;
import org.springframework.web.client.RestTemplate;

public class WeatherService {

    private RestTemplate template = new RestTemplate();
    private final String API_URL = "https://api.openweathermap.org";

    private final String API_KEY = "cdf5b0bcb38f2b870d1bc6128853dd49";

    public LatLon getLatLon(String zipcode) {
        String url = API_URL + "/geo/1.0/zip?zip=" + zipcode +
                "&appid=" +API_KEY;
        LatLon response = template.getForObject(url, LatLon.class);
        return response;
    }

    public WeatherObject getWeather(LatLon latLon) {
        String url = "https://api.openweathermap.org" +
                "/data/2.5/weather?lat=39.794" +
                "&lon=" + latLon.getLon() +
                "&appid=" + API_KEY + "&units=imperial";
        WeatherObject response =
                template.getForObject(url, WeatherObject.class);
        return response;
    }
}
