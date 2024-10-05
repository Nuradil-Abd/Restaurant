package utils;

public class GenerateId {
    private static Long genRestaurantId = 0L;
    private static Long genMenuItemId = 0L;

    public static Long genMenuItemId(){
        genMenuItemId++;
        return genMenuItemId;
    };
    public static Long genRestaurantId(){
        genRestaurantId++;
        return genRestaurantId;
    }
}
