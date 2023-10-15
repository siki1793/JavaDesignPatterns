package com.saikrishna.l;

public class Engine {
  private Boolean _isRunning;
  private int _speed;
  public void on(){
    _isRunning = true;
  }
  public void off() {
    _isRunning = false;
  }

  public void powerOn(int speedNext){
    _speed = speedNext;
  }


}
