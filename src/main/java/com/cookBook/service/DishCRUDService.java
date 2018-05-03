package com.cookBook.service;

import com.cookBook.dto.DishDTO;
import com.cookBook.entity.Dish;
import com.cookBook.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DishCRUDService {
    @Autowired
    DishRepository dishRepository;

    public DishDTO saveDish(DishDTO dishDto) {
        Dish dish = new Dish(dishDto);
        dishRepository.save(dish);
        dishDto.setId(dish.getId());
        return dishDto;
    }

    public List<DishDTO> getAll() {
        List<Dish> dishes= dishRepository.findAll();
        List<DishDTO> dishDTOs = new ArrayList<>();
        dishes.stream().forEach(dish -> dishDTOs.add(new DishDTO().dishToDTO(dish)));
        return dishDTOs;
    }
}
