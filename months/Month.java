package org.example.months;

public enum Month {
    JANUARY("January", 1, "Winter"),
    FEBRUARY("February", 2, "Winter"),
    MARCH("March", 7, "Spring"),
    APRIL("April", 10, "Spring"),
    MAY("May", 18, "Spring"),
    JUNE("June", 22, "Summer"),
    JULY("July", 25, "Summer"),
    AUGUST("August", 30, "Summer"),
    SEPTEMBER("September", 23, "Autumn"),
    OCTOBER("October", 10, "Autumn"),
    NOVEMBER("November", 7, "Autumn"),
    DECEMBER("December", 1, "Winter");

    private String month;
    private int temperature;
    private String season;

    public int getTemperature() {
        return temperature;
    }

    public String getSeason() {
        return season;
    }

    Month(String month, int temperature, String season) {
        this.month = month;
        this.temperature = temperature;
        this.season = season;
    }
}
