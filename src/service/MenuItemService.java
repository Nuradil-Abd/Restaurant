package service;

import models.MenuItem;

import java.util.List;

public interface MenuItemService {
    // todo стринг написал чтоб в сервисе можно было возвращать текст (successfully saved or deleted)
    //  если будут вопросы напишите вместе, подумаем как решить
    // если что есть вариант возвращать через Exceptions

    String save(MenuItem menuItem);
    String deleteById(Long id);

    List<MenuItem> getAll();
    String updateById(Long id,MenuItem menuItem);

    MenuItem findById(Long id);
    MenuItem findByName(String name);
}
