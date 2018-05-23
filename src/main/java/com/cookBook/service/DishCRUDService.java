package com.cookBook.service;

import com.cookBook.dto.DishDTO;
import com.cookBook.entity.Dish;
import com.cookBook.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DishCRUDService {
    private DishRepository dishRepository;

    @Autowired
    public DishCRUDService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    public DishDTO saveDish(DishDTO dishDto) {
        Dish dish = new Dish(dishDto);
        dishRepository.save(dish);
        dishDto.setId(dish.getId());
        return dishDto;
    }

    public List<DishDTO> getAll() {
        List<Dish> dishes = dishRepository.findAll();
        List<DishDTO> dishDTOs = new ArrayList<>();
        dishes.stream().forEach(dish -> dishDTOs.add(new DishDTO().dishToDTO(dish)));
        return dishDTOs.stream().sorted(Comparator.comparingLong(DishDTO::getId).reversed()).collect(Collectors.toList());
    }

    public DishDTO findById(Long id) {
        Dish dish = dishRepository.getOne(id);
        return new DishDTO().dishToDTO(dish);
    }
}