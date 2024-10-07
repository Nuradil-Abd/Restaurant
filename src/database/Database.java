package database;

import models.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public List<Restaurant> restaurants;

    public Database() {
        this.restaurants = new ArrayList<>();
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
