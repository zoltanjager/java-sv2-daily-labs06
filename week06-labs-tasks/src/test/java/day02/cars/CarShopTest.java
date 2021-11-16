package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CarShopTest {

    CarShop carShop;

    @BeforeEach
    void initCarShop () {
        carShop = new CarShop("Best Car", 10_000_000);
    }

    @Test
    void testCreateCarShop() {

        assertEquals("Best Car", carShop.getName());
        assertEquals(10_000_000,carShop.getMaxPrice());
        assertEquals(0,carShop.getCarsForSell().size());
    }

    @Test
    void testAddCar() {

        Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        assertTrue(carShop.addCar(car1));
        assertEquals(1,carShop.getCarsForSell().size());

        Car car2 = new Car("Toyota", 1.2, Color.BLACK, 22_300_000);
        assertFalse(carShop.addCar(car2));
        assertEquals(1,carShop.getCarsForSell().size());
    }

    @Test
    void testSumCarPrice() {

        Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        Car car2 = new Car("Suzuki", 1.4, Color.RED, 1_500_000);

        carShop.addCar(car1);
        carShop.addCar(car2);

        assertEquals(3_800_000,carShop.sumCarPrice());
    }

    @Test
    void testNumberOfCarsCheaperThan() {

        Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 4_300_000);
        carShop.addCar(car1);
        carShop.addCar(car2);

        assertEquals(2, carShop.numberOfCarsCheaperThan(5_000_000));
        assertEquals(1, carShop.numberOfCarsCheaperThan(3_000_000));
    }

    @Test
    void testCarsWithBrand() {

        Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 4_300_000);
        Car car3 = new Car("Toyota", 1.4, Color.GREY, 2_700_000);
        carShop.addCar(car1);
        carShop.addCar(car2);
        carShop.addCar(car3);

        assertEquals(2, carShop.carsWithBrand("Toyota").size());
        assertEquals(0, carShop.carsWithBrand("BMW").size());
    }

    @Test
    void testGetCarsForSell() {

        Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 4_300_000);
        carShop.addCar(car1);
        carShop.addCar(car2);

        assertEquals(2, carShop.getCarsForSell().size());
    }






















}
