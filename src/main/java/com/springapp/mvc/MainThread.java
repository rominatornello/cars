package com.springapp.mvc;

import com.springapp.mvc.core.Car;

/**
 * Created by romina.tornello on 3/5/2015.
 */
public class MainThread {

    public static void createCar(int row){
        System.out.println("creando car");
        Car thread = new Car(row);
        thread.start();

    }


}
