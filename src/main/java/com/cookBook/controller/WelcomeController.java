package com.cookBook.controller;

import com.cookBook.dto.DishDTO;

import com.cookBook.service.DishCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class WelcomeController {
    @Autowired
    DishCRUDService dishCRUDService;

    @RequestMapping("/welcome")
    public DishDTO welcome() {
        DishDTO dishDto = new DishDTO();
        dishDto.setName("Lasagna");
//        return dishCRUDService.saveDish(dishDto);
        return dishDto;
    }
}
