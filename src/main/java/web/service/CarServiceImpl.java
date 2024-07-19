package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Лада", "Веста", 2000));
        cars.add(new Car("УАЗ", "Патриот", 1999));
        cars.add(new Car("ГАЗ", "Газель", 2010));
        cars.add(new Car("ПАЗ", "Автобуз", 2018));
        cars.add(new Car("ЗАЗ", "внедорожник", 1995));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count > 0 ? count : cars.size())
                .collect(Collectors.toList());
    }
}
