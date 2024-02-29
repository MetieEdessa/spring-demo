package org.example;
import entity.V8Engine;
import entity.Engine;
import entity.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Engine engine = new V8Engine();

        Vehicle truck = new Vehicle(engine);


    Vehicle car = new Vehicle(applicationContext.getBean(V8Engine.class));
    car.start();

    //this takes the default engine from the beans
    Vehicle car2 = applicationContext.getBean(Vehicle.class);
    car2.start();

        }

    }
