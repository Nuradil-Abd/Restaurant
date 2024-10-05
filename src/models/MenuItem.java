package models;

import utils.GenerateId;

public class MenuItem {
    private Long id;
    private String name;
    private String image;
    private double price;
    private String description;
    private boolean isVegetarian;

    public MenuItem() {
    }

    public MenuItem(String name, String image, double price, String description, boolean isVegetarian) {
        this.id = GenerateId.genMenuItemId();
        this.name = name;
        this.image = image;
        this.price = price;
        this.description = description;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "MenuItem(" +
                "name: '" + name + '\'' +
                ", image: '" + image + '\'' +
                ", price: " + price +
                ", description: '" + description + '\'' +
                ", isVegetarian: " + isVegetarian +
                ')';
    }
}
