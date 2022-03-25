package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    CarDaoImpl carDao = new CarDaoImpl();

    @Override
    public List<Car> getCar(int count) {
        return carDao.getCar(count);
    }
}
