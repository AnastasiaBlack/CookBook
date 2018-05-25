package com.cookBook.controller;

import com.cookBook.dto.DishDTO;

import com.cookBook.service.DishCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class WelcomeController {
    private DishCRUDService dishCRUDService;

    @Autowired
    public WelcomeController(DishCRUDService dishCRUDService) {
        this.dishCRUDService = dishCRUDService;
    }

    @RequestMapping("/welcome")
    public DishDTO welcome() {
        DishDTO dishDto = new DishDTO();
        dishDto.setName("Lasagna");
        return dishDto;
    }

    @RequestMapping("/dishes")
    public List<DishDTO> getAllDishes() {
        return dishCRUDService.getAll();
    }

    @RequestMapping(value = "/dish", method = RequestMethod.POST)
    public List<DishDTO> saveDish(@RequestBody DishDTO dishDTO) {
        dishCRUDService.saveDish(dishDTO);
        return dishCRUDService.getAll();
    }

    @RequestMapping(value = "/dish/{id}", method = RequestMethod.GET)
    public DishDTO getDishById(@PathVariable Long id) {
        return dishCRUDService.findById(id);
    }
}
