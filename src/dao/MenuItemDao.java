package dao;

import models.MenuItem;

import java.util.List;

public interface MenuItemDao {
    void save(MenuItem menuItem);
    void deleteById(Long id);

    List<MenuItem> getAll();
    void updateById(Long id,MenuItem menuItem);

    MenuItem findById(Long id);
    MenuItem findByName(String name);
}
