package org.week7;

public final class Singleton {

  //assigning the instance once
  private static Singleton INSTANCE;
  private Singleton() {
    System.out.println("Creating Instance");
  }

  //returns the instance
  private static Singleton getInstance() {
    if (INSTANCE == null){
      synchronized (Singleton.class) {
        if (INSTANCE == null) {
//          System.out.println("CREATING INSTANCE…");
          INSTANCE = SingletonHolder.singleton;
        }
      }
    }
    System.out.println("returning instance.");
    return INSTANCE;
  }

  //inner class creates the instances and holds it
  private static final class SingletonHolder {
    static final Singleton singleton = new Singleton();
  }

  public static void main(String[] args) {
    Singleton singleton;
    for (int i = 0; i < 1000; i++) {
      singleton = Singleton.getInstance();
    }
  }
}

