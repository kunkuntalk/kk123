package com.mck.bean;
public class Student{
   private Integer Id;
   private String name;

   public Student() {
   }

   public Student(Integer Id, String name) {
      this.Id = Id;
      this.name = name;
   }

   @Override
   public String toString() {
      return "Student{" +
              "iD=" + Id +
              ", name='" + name + '\'' +
              '}';
   }

   public Integer getId() {
      return Id;
   }

   public void setId(Integer Id) {
      this.Id = Id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
