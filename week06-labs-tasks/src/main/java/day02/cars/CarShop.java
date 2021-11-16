package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {

    private String name;
    private int maxPrice;
    private List<Car> cars = new ArrayList<>();

    public CarShop(String name, int maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() <= maxPrice) {
            cars.add(car);
            return true;
        }
        return false;
    }

    public int sumCarPrice() {
        int sum = 0;
        for (Car actual: cars) {
            sum += actual.getPrice();
        }
        return sum;
    }

    public int numberOfCarsCheaperThan(int price) {
        int number = 0;
        for (Car actual: cars) {
            if (actual.getPrice() < price) {
                number++;
            }
        }
        return number;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> result = new ArrayList<>();
        for (Car actual: cars) {
            if(actual.getBrand().equalsIgnoreCase(brand)) {
                result.add(actual);
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return cars;
    }

}
