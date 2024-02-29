package entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {

    //instead of constructor to set up you can use Autowired annotation.
   @Autowired
   private  Engine engine;

   public Vehicle(Engine engine) {
      this.engine = engine;
    }
        public void start(){
        engine.start();

    }
}
