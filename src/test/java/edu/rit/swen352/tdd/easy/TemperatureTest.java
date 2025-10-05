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
        assertInstanceOf(Temperature.class, new Temperature(55, TemperatureUnit.FAHRENHEIT).getClass());
        
    }
}
