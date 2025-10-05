package edu.rit.swen352.tdd.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.rit.swen352.tdd.easy.Temperature.TemperatureUnit;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link Temperature} component.
 */
class TemperatureTest {

    @Test
    @DisplayName("1a: Construct Temperature w value 55, unit Fahrenheit")
    public void TempConstructorTest(){
        Temperature temp = new Temperature(55, TemperatureUnit.FAHRENHEIT);
        assertNotNull(temp);        
    }

    @Test
    @DisplayName("1b: Construct Temperature with value 45 and default unit Celsius")
    public void ValueConstructorTest(){

        Temperature temp2 = new Temperature(45);
        assertNotNull(temp2);

    }

    @Test
    @DisplayName("1c: Construct Temperature with value that goes below Absolute zero Kelvin")
    public void absoluteZeroTest(){

        Exception exception = assertThrows(Exception.class,
        () -> new Temperature(-1, TemperatureUnit.KELVIN));
        assertEquals("Temperature cannot be below absolute zero", exception.getMessage());
        
    }
    @Test
    @DisplayName("1d: Construct Temperature with value that goes below Absolute zero Celsius")
    public void absoluteZeroCelsiusTest(){

        Exception exception = assertThrows(Exception.class,
        () -> new Temperature(-274, TemperatureUnit.CELSIUS));
        assertEquals("Temperature cannot be below absolute zero", exception.getMessage());
        
    }
    @Test
    @DisplayName("1e: Construct Temperature with value that goes below Absolute zero Fahrenheit")
    public void absoluteZeroFahrenheitTest(){

        Exception exception = assertThrows(Exception.class,
        () -> new Temperature(-460, TemperatureUnit.FAHRENHEIT));
        assertEquals("Temperature cannot be below absolute zero", exception.getMessage());
        
    }

    @Test
    @DisplayName("2a: Create a new temperature with the new converted unit")
    public void convertTest(){
        Temperature temp = new Temperature(32, TemperatureUnit.CELSIUS);
        TemperatureUnit temp_unit = TemperatureUnit.FAHRENHEIT;
        temp.convertTo(TemperatureUnit.FAHRENHEIT);
        assertEquals(temp_unit, temp.getTempUnit());
    }
}
