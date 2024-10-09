package service.impl;

import dao.MenuItemDao;
import exceptions.NotFoundException;
import models.MenuItem;
import service.MenuItemService;

import java.util.List;

public class MenuItemServiceImpl implements MenuItemService {
    private final MenuItemDao menuItemDao;

    public MenuItemServiceImpl(MenuItemDao menuItemDao) {
        this.menuItemDao = menuItemDao;
    }

    @Override
    public String save(MenuItem menuItem) {
        return "";
    }

    @Override
    public String deleteById(Long id) {
        return "";
    }

    @Override
    public List<MenuItem> getAll() {
        return List.of();
    }

    @Override
    public String updateById(Long id, MenuItem menuItem) {
        return "";
    }

    @Override
    public MenuItem findById(Long id) {
        MenuItem menuItem = menuItemDao.findById(id);
        if (menuItem == null) {
            try {
                throw new NotFoundException("Menu item with id " + id + " not found");
            } catch (NotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        return menuItem;
    }

    @Override
    public MenuItem findByName(String name) {
        MenuItem menuItem = menuItemDao.findByName(name);
        if (menuItem == null) {
            try{
                throw new NotFoundException("Menu item with name " + name + " not found");
            } catch (NotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return menuItem;
    }
}
