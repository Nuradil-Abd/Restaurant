package service;

import models.Restaurant;

import java.util.List;
import java.util.Set;

public interface RestaurantService {
    // todo стринг написал чтоб в сервисе можно было возвращать текст (successfully saved or deleted)
    //  если будут вопросы напишите вместе, подумаем как решить
    // если что есть вариант возвращать через Exceptions

    String save(Restaurant restaurant);
    String deleteByIds(Set<Long> ids);

    String save (List<Restaurant> restaurants);
    String deleteById(Long id);

    List<Restaurant> getAll();
    String updateById (Long id, Restaurant restaurant);

    Restaurant findById(Long id);
    List<Restaurant> getRestaurantsByType(String type);
}
