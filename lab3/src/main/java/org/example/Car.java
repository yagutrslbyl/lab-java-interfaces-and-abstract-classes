package org.example;

public abstract class Car {
    String vinNumber;
    String make;
    String model;
    int milage;
   public String getInfo(){
       return vinNumber+" "+make+" "+model+" "+ milage;
   }

}
