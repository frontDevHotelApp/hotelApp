package net.codejava.spring.model;

/**
 * Created by kwozniak on 26.11.15.
 */
public class Room {

    private String numbers;
    private String hotelName;
    private String description;

    public Room(String numbers, String hotelName, String description) {
        this.numbers = numbers;
        this.hotelName = hotelName;
        this.description = description;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
