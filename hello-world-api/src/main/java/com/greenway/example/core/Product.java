package com.greenway.example.core;

//import io.dropwizard.jackson.JsonSnakeCase;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

//@JsonSnakeCase
@AllArgsConstructor
public class Product {

    @Getter int premierItemNumber;
    @Getter String name;
    @Getter String unitOfMeasure;
    @Getter String description;
    @Getter int quantity;



    public Map<String,Object> getProductMap(){
        Map<String,Object> map = new HashMap<>();
        map.put("premier_item_number",premierItemNumber);
        map.put("name",name);
        map.put("unit_of_measure",unitOfMeasure);
        map.put("description",description);
        map.put("quantity",quantity);

        return map;
    }
}
