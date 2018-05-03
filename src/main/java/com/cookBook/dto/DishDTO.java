package com.cookBook.dto;

import com.cookBook.entity.Dish;

public class DishDTO {
    private Integer id;
    private String name;

    public DishDTO dishToDTO(Dish dish) {
        this.id = dish.getId();
        this.name = dish.getName();
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
}
