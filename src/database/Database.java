package database;

import models.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public List<Restaurant> restaurants;

    public Database(List<Restaurant> restaurants) {
        this.restaurants = new ArrayList<>();
    }
}
