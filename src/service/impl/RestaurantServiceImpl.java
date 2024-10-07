package service.impl;

import dao.RestaurantDao;
import dao.impl.RestaurantDaoImpl;
import models.Restaurant;
import service.RestaurantService;

import java.util.List;
import java.util.Set;

public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantDao restaurantDao;

    public RestaurantServiceImpl(RestaurantDao restaurantDao) {
        this.restaurantDao = restaurantDao;
    }

    @Override
    public String save(Restaurant restaurant) {
        return "";
    }

    @Override
    public String deleteByIds(Set<Long> ids) {
        return "";
    }

    @Override
    public String save(List<Restaurant> restaurants) {
        return "";
    }

    @Override
    public String deleteById(Long id) {
        return "";
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
