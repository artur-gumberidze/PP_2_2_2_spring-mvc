package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarDaoImpl implements CarDao{


    static ArrayList<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(180,"Mercedes",2.7));
        cars.add(new Car(200,"Mercedes",3.2));
        cars.add(new Car(240,"Mercedes",3.5));
        cars.add(new Car(280,"Mercedes",5.0));
        cars.add(new Car(300,"Mercedes",5.5));

    }


    @Override
    public List<Car> getCar(int count) {
        ArrayList<Car> car = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            car.add(cars.get(i));
        }
        if(count == 0){
            return cars;
        }
        else {
            return car;
        }
    }
}
