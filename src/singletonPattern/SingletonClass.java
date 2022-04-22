package singletonPattern;

import java.util.HashMap;
import java.util.Objects;

public class SingletonClass{

  //This is a very heavy object.
  private static SingletonClass heavyObject = null;

  //Constructor is made private so that a foreign class is not able to construct and object of this class.
  private SingletonClass(){
  }

  // This is the way to form instance of a singleton class.
  // But the issue here is that this will not work in a multithreaded environment because
  // if multiple threads try to create the instance of this class at the same time then there
  // can be multiple instance of this class in our system.
  // In order to solve that problem we will have to acquire a lock and then make the instance
  // so that when one thread is trying to create the object other threads cannot interfere in the system.
  public static SingletonClass getInstance(){
    if(Objects.isNull(heavyObject)){
      heavyObject = new SingletonClass();
    }
    return heavyObject;
  }
}
