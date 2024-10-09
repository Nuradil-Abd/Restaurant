package dao.impl;

import dao.MenuItemDao;
import database.Database;
import models.MenuItem;
import models.Restaurant;
import utils.GenerateId;

import java.util.List;

public class MenuItemDaoImpl implements MenuItemDao {
    private final Database database;

    public MenuItemDaoImpl(Database database) {
        this.database = database;
    }

    @Override
    public void save(MenuItem menuItem) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<MenuItem> getAll() {
        return List.of();
    }

    @Override
    public void updateById(Long id, MenuItem menuItem) {

    }

    @Override
    public MenuItem findById(Long id) {
        return database.restaurants.stream()
                .flatMap(restaurant -> restaurant.getMenuItems().stream())
                .filter(menuItem -> menuItem.getId().equals(id))
                .findFirst()
                .orElse(null);
    }


    @Override
    public MenuItem findByName(String name) {


        return database.restaurants.stream()
                .flatMap(restaurant -> restaurant.getMenuItems().stream())
                .filter(menuItem -> menuItem.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

}
