package com.codehigh.patterns.abstractfactory.boot;

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
public class HungerFactory {

    @Autowired
    private List<IHungerMood> moodList;
    private Map<String, IHungerMood> moodMap;

    @PostConstruct
    void init(){
        moodMap = new HashMap<>();
        moodList.forEach(iHungerMood -> {
            moodMap.put(iHungerMood.onMood(), iHungerMood);
        });
    }

    public IDish get(String mood,String type){
        IHungerMood hungerMood = moodMap.get(mood);
        if(hungerMood == null ){
            throw new RuntimeException("No mood definition available");
        }
        IDish iDish = hungerMood.get(type);
        if(iDish == null){
            throw new RuntimeException(type+" not available for "+mood);
        }
        return iDish;
    }
}
