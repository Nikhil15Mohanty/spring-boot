package com.example.Component.demoComponent.Controller;

import com.example.Component.demoComponent.Autowired.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {

    private VegPizza v;
  /*  @Autowired
    PizzaController(VegPizza v){
        this.v = v;
    }*/
    @Autowired
   public void setPizza(VegPizza v){
        this.v = v;
    }

    public String display(){
        return v.type();
    }
}
