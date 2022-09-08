package org.infinispan.tutorial.services;

public interface WeatherLoader<T> {
   String[] LOCATIONS = {"Рустай , Экоцентр", "Рустай , Колодец", "Рустай , Рустайчик", "Семенов , Гидрометцентр", "Черноречье , Эклерк", "Черноречье , Метеостанция"};

   T getForLocation(String location);

   /**
    * Loads and displays all
    */
   default void loadAll() {
      System.out.println("---- Loading information ----");
      long start = System.currentTimeMillis();
      for (String location : WeatherLoader.LOCATIONS) {
         T weather = this.getForLocation(location);
         System.out.printf("%s - %s\n", location, weather);
      }
      System.out.printf("---- Loaded in %dms ----\n", System.currentTimeMillis() - start);
   }
}
