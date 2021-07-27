package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> createCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Volvo", "Silver", 1985));
        carList.add(new Car("BMW", "Black", 1990));
        carList.add(new Car("Audi", "Red", 1995));
        carList.add(new Car("Skoda", "Blue", 2000));
        carList.add(new Car("Honda", "White", 2005));
        return carList;
    }

    @Override
    public List<Car> createCarsByCount(Integer count) {
        List<Car> carCount = createCars();
        if (count == null || count >= 5) {
            return carCount;
        } else {
            return carCount.subList(0, count);
        }
    }
}
