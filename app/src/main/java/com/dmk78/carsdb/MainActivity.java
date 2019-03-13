package com.dmk78.carsdb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DatabaseHandler;
import Model.Car;
import Utils.Util;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);

        Log.d("carsCount",String.valueOf(databaseHandler.getCarsCount()));


        /*databaseHandler.addCar(new Car("Toyota", "30 000 $"));
        databaseHandler.addCar(new Car("Mercedes", "50 000 $"));
        databaseHandler.addCar(new Car("Opel", "25 000 $"));
        databaseHandler.addCar(new Car("Lada", "15 000 $"));
        databaseHandler.addCar(new Car("KIA", "31 000 $"));
        databaseHandler.addCar(new Car("Renault", "20 000 $"));
        databaseHandler.addCar(new Car("Hyundai", "25 000 $"));
        databaseHandler.addCar(new Car("Ford", "40 000 $"));
*/


        /*Car deletingCar = databaseHandler.getCar(1);
        databaseHandler.deleteCar(deletingCar);

        List<Car> carList = databaseHandler.getAllCars();
        for (Car car : carList) {
            Log.d("Carinfo:", "ID " + car.getId() + ", NAME " + car.getName() + " , PRICE " + car.getPrice());
        }*/



       /*Car car = databaseHandler.getCar(1);
        Log.d("Carinfo:", "ID " + car.getId() + ", NAME " + car.getName() + " , PRICE " + car.getPrice());

        car.setName("Tesla");
        car.setPrice("50 000 $");
        databaseHandler.updateCar(car);

        Log.d("Carinfo:", "ID " + car.getId() + ", NAME " + car.getName() + " , PRICE " + car.getPrice());*/


    }
}
