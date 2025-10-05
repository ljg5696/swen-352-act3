package edu.rit.swen352.tdd.easy;

/**
 * An temperature measurement.
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor:
 *     <ul>
 *       <li>with both a value as {@code double} and a unit</li>
 *       <li>with just a value; unit is defaulted to {@link TemperatureUnit#CELSIUS}</li>
 *       <li>NOTE: no temperature may be below absolute zero</li>
 *     </ul>
 *   </li>
 *   <li>convertTo(unit): create a new Temperature in the new unit</li>
 * </ul>
 */
public class Temperature {

  private double value;
  private TemperatureUnit unit;
  private final double ABSOLUTE_ZERO_KELVIN = 0;
  

  public enum TemperatureUnit {
    CELSIUS, FAHRENHEIT, KELVIN;
  }

  public Temperature(double value, TemperatureUnit unit){
    
    this.unit = unit;
    
   if(value < ABSOLUTE_ZERO_KELVIN && unit == TemperatureUnit.KELVIN){
      throw new IllegalArgumentException("Temperature cannot be below absolute zero");
    }
    else{
      this.value = value;
    }

    }

  
  public Temperature(double value){

    this.value = value;
    this.unit =  TemperatureUnit.CELSIUS;
  }
}
