package org.practice.javaplayground.features.onedoteight;

public interface FunctionalInterface{
    public void printFunctionalInterface();
    default void show()
    {
      System.out.println("Default Method Executed");
    }
}
