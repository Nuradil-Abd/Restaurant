package dao.impl;

import dao.RestaurantDao;
import database.Database;
import models.Restaurant;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RestaurantDaoImpl implements RestaurantDao {
    private final Database database;

    protected RestaurantDaoImpl(Database database) {
        this.database = database;
    }

    @Override
    public void save(Restaurant restaurant) {
        if (restaurant != null) {
            database.restaurants.add(restaurant);
        }else {
            throw new IllegalArgumentException("Ресторан нөл боло албайт");
        }
    }

    @Override
    public void deleteByIds(Set<Long> ids) {
        if (ids != null && !ids.isEmpty()) {
         Iterator<Restaurant> iterator = database.restaurants.iterator();
         while (iterator.hasNext()) {
             Restaurant restaurant = iterator.next();
             if (ids.contains(restaurant.getId())){
                 iterator.remove();
             }
         }
        }else {
            throw new IllegalArgumentException("ИД'лердин тизмеси нөл же бош боло албайт");
        }
    }

    @Override
    public void save(List<Restaurant> restaurants) {
        if (restaurants != null && !restaurants.isEmpty()) {
            for (Restaurant restaurant : restaurants) {
                if (restaurant != null) {
                    database.restaurants.add(restaurant);
                }else {
                    throw new IllegalArgumentException("Тизмедеги ресторан нөл боло албайт");
                }
            }
        }else {
            throw new IllegalArgumentException("Ресторандардын тизмеси нөл же бош боло албайт");
        }
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Restaurant> getAll() {
        return List.of();
    }

    @Override
    public String updateById(Long id, Restaurant restaurant) {
        return "";
    }

    @Override
    public Restaurant findById(Long id) {
        return null;
    }

    @Override
    public List<Restaurant> getRestaurantsByType(String type) {
        return List.of();
    }
}
