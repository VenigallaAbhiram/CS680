package edu.umb.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	private String[] carToStringArray(Car car) {
		String[] carInformation = {car.getMake(),car.getModel(),Integer.toString(car.getYear())};
		return carInformation;
	}
	
	@Test
	void verifyCarEqualityWithMakeModelYear() throws Exception{
		Car actual = new Car("Toyota","RAV4",25,2018,50000);
		String[] expected = {"Toyota","RAV4","2018"};
		assertArrayEquals(expected,carToStringArray(actual));
	}

}
