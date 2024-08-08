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
    public class DishFactoryBoot implements IHungerMood {
        @Autowired
        private List<IDish> dishList;
        private Map<String, IDish> dishMap;

        @PostConstruct
        void init(){
            dishMap = new HashMap<>();
            dishList.stream()
                    .filter(dish -> "dish".equalsIgnoreCase(dish.category()))
                    .forEach(dish -> dishMap.put(dish.name(), dish));
        }

        @Override
        public IDish get(String type){
            return dishMap.get(type);
        }

        @Override
        public String onMood() {
            return "eat";
        }
    }
