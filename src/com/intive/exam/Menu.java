package com.intive.exam;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Menu {


    protected static HashMap<String, String> menuItems = new HashMap<>();

    public Map<String, String> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(HashMap<String, String> menuItems) {
        this.menuItems = menuItems;
    }

    public void addDishToMenu(String dish, double price){
        menuItems.put((menuItems.size()+1)+". "+dish, String.valueOf(price));
        System.out.println(dish + " was added into menu on position: " + menuItems.size());
    }

    public String getDishPrice(String dish){
        List<String> filtered = menuItems.entrySet().stream().filter(entry-> entry.getKey().contains(dish)).map(entry-> entry.getValue()).collect(Collectors.toList());
        return filtered.get(0);
    }



}
