package com.saikrishna.l;

public class ElectricCar implements Car {
  @Override
  public void turnOnEngine() {
    throw new AssertionError("Don't have Engine");
  }

  @Override
  public void accelerate() {
    // i am speeddddd
  }
}
