package org.infinispan.tutorial.data;

import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

/**
 * Annotated with Protostream
 */
public class LocationWeather {

   @ProtoField(number = 1, defaultValue = "0.0")
   float temperature;

   @ProtoField(number = 2)
   String condition;

   @ProtoField(number = 3)
   String city;

   @ProtoField(number = 4)
   String place;

   public LocationWeather() {

   }

   @ProtoFactory
   public LocationWeather(float temperature, String condition, String city, String place) {
      this.temperature = temperature;
      this.condition = condition;
      this.city = city;
      this.place = place;
   }

   @Override
   public String toString() {
      return "LocationWeather{" +
              "temperature=" + temperature +
              ", condition='" + condition + '\'' +
              ", city='" + city + '\'' +
              ", place='" + place + '\'' +
              '}';
   }

   public void setCondition(String condition) {
      this.condition = condition;
   }

   public float getTemperature() {
      return temperature;
   }

   public String getCondition() {
      return condition;
   }

   public String getCity() {
      return city;
   }

   public String getPlace() {
      return place;
   }
}
