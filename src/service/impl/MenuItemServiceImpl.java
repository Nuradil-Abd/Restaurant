package service.impl;

import models.MenuItem;
import service.MenuItemService;

import java.util.List;

public class MenuItemServiceImpl implements MenuItemService {
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
        return null;
    }

    @Override
    public MenuItem findByName(String name) {
        return null;
    }
}
