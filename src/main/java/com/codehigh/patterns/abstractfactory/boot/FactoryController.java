package com.codehigh.patterns.abstractfactory.boot;

import com.codehigh.patterns.abstractfactory.boot.childfactory.DishFactoryBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author : Nishant Varshney
 */

@RestController
public class FactoryController {

    @Autowired
    private HungerFactory hungerFactory;

    @GetMapping("/dish")
    public String getDish(@RequestParam(value = "mood") String mood,
                          @RequestParam(value = "dish") String dish){
        return hungerFactory.get(mood,dish).prepare();
    }
}
