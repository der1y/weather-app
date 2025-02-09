package com.techelevator.model;

import java.time.LocalDate;

public class WeatherDto {

    private int weatherId;
    private int userId;
    private int zipcode;
    private LocalDate date;
    private double temperature;
    private double feelsLike;
    private int humidity;
    private String description;
    private String icon;
    private String name;

    public WeatherDto(int weatherId, int userId, int zipcode, LocalDate date, double temperature,
                      double feelsLike, int humidity, String description,
                      String icon, String name) {
        this.weatherId = weatherId;
        this.userId = userId;
        this.zipcode = zipcode;
        this.date = date;
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.humidity = humidity;
        this.description = description;
        this.icon = icon;
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    // add for Spring!
    public WeatherDto() {
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WeatherDto{" +
                "weatherId=" + weatherId +
                ", userId=" + userId +
                ", zipcode=" + zipcode +
                ", date=" + date +
                ", temperature=" + temperature +
                ", feelsLike=" + feelsLike +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
