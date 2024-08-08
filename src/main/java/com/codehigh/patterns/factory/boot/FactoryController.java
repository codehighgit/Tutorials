package com.codehigh.patterns.factory.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author : Nishant Varshney
 */

@RestController
public class FactoryController {

    @GetMapping("/dish")
    public String getDish(@RequestParam(value = "dish") String dish){
       return DishFactoryBoot.get(dish).prepare();
    }
}
