package com.saikrishna.d;

public class Windows98Computer {
  private final Keyboard keyboard;
  private final Monitor monitor;

  public Windows98Computer() {
    keyboard = new Keyboard();
    monitor = new Monitor();
  }

  public Windows98Computer(Keyboard keyboard, Monitor monitor) {
    this.keyboard = keyboard;
    this.monitor = monitor;
  }
}
