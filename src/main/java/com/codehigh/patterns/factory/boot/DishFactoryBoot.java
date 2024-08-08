package com.codehigh.patterns.factory.boot;

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
public class DishFactoryBoot {
    @Autowired
    private List<IDish> dishList;
    private static Map<String,IDish> typeToDishMap;

    @PostConstruct
    void init(){
        typeToDishMap = new HashMap<>();
        dishList.forEach(iDish -> typeToDishMap.put(iDish.name(),iDish));
    }

    public static IDish get(String name){
        return typeToDishMap.get(name);
    }
}
