package com.example.Component.demoComponent.Controller;

import org.springframework.stereotype.Component;

@Component
public class PizzaController {
    public String display(){
        return "Pizza is delicious";
    }
}
