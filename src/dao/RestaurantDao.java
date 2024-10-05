package dao;

import models.Restaurant;

import java.util.List;
import java.util.Set;

public interface RestaurantDao {
    void save(Restaurant restaurant);
    void deleteByIds(Set<Long> ids);

    void save (List<Restaurant> restaurants);
    void deleteById(Long id);

    List<Restaurant> getAll();
    String updateById (Long id, Restaurant restaurant);

    Restaurant findById(Long id);
    List<Restaurant> getRestaurantsByType(String type);

}
