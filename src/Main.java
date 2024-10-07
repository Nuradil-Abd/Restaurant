import dao.MenuItemDao;
import dao.impl.MenuItemDaoImpl;
import dao.impl.RestaurantDaoImpl;
import database.Database;
import service.MenuItemService;
import service.RestaurantService;
import service.impl.MenuItemServiceImpl;
import service.impl.RestaurantServiceImpl;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        MenuItemService menuItemService = new MenuItemServiceImpl(new MenuItemDaoImpl(database));
        RestaurantService restaurantService = new RestaurantServiceImpl(new RestaurantDaoImpl(database));




    }
}