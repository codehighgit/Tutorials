package com.codehigh.patterns.abstractfactory.boot.childfactory;

import com.codehigh.patterns.abstractfactory.boot.IDish;
import com.codehigh.patterns.abstractfactory.boot.IHungerMood;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author : Nishant Varshney
 */

@Component
public class DrinkFactoryBoot implements IHungerMood {
    @Autowired
    private List<IDish> dishList;
    private Map<String, IDish> typeToDishMap;

    @PostConstruct
    void init(){
        typeToDishMap = new HashMap<>();
        dishList.stream()
                .filter(dish -> "drink".equalsIgnoreCase(dish.category()))
                .forEach(dish -> typeToDishMap.put(dish.name(), dish));
    }

    @Override
    public IDish get(String name){
        return typeToDishMap.get(name);
    }

    @Override
    public String onMood() {
        return "drink";
    }
}
