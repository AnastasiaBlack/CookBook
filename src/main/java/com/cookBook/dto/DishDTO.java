package com.cookBook.dto;

import com.cookBook.entity.Dish;

public class DishDTO {
    private Integer id;
    private String name;
    private String ingredients;
    private String description;

    public DishDTO dishToDTO(Dish dish) {
        this.id = dish.getId();
        this.name = dish.getName();
        this.ingredients = dish.getIngredients();
        this.description = dish.getDescription();
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
