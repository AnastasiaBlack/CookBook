package com.cookBook.entity;

import com.cookBook.dto.DishDTO;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity
@Table(name = "Dish")
public class Dish {
    @Id
    @Column(name = "DishID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    private String name;

    public Dish(DishDTO dishDTO){
        this.id = dishDTO.getId();
        this.name = dishDTO.getName();
    }

    public Dish () {

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
