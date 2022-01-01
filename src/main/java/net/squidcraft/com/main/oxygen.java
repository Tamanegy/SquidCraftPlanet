package net.squidcraft.com.main;

public class oxygen {
  public int oxygen = 100;
  
  public int getOxygen() {
    if (this.oxygen <= -1) {
      this.oxygen = -1;
    } else if (this.oxygen >= 100) {
      this.oxygen = 100;
    } 
    return this.oxygen;
  }
  
  public void remove(int amount) {
    this.oxygen--;
  }
  
  public void add(int amount) {
    this.oxygen += 6;
  }
  
  public void reset(int amount) {
    this.oxygen += 100;
  }
}
