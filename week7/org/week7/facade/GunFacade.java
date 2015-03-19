package org.week7.facade;

public class GunFacade {

  private Mag mag;
  private Gun gun;
  private Silencer silencer;

	public GunFacade() {
    mag = new Mag();
    gun = new Gun();
    silencer = new Silencer();
  }

  public GunFacade(int magCaliber, int magCapacity, int numMags, int silencerCaliber){
    mag = new Mag();
    gun = new Gun();
    silencer = new Silencer();
  }

}