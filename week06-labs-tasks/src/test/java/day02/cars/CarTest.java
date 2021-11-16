package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    void testCreateCar() {
        Car car = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);

        assertEquals("Toyota", car.getBrand());
        assertEquals(1.2, car.getSizeOfEngine());
        assertEquals(Color.BLACK, car.getColor());
        assertEquals(2_300_000, car.getPrice());
    }

    @Test
    void testDecreasePrice() {
        Car car = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);

        car.decreasePrice(10);

        assertEquals(2_070_000,car.getPrice());
    }

}
