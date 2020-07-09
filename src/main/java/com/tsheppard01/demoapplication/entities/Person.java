package com.tsheppard01.demoapplication.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

  @Id
  @GeneratedValue
  private long id;

  private String forename;

  private String surname;

  private String dob;

  public Person(){
    super();
  }

  public Person(String forename, String surname, String dob) {
    this.forename = forename;
    this.surname = surname;
    this.dob = dob;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getForename() {
    return forename;
  }

  public void setForename(String forename) {
    this.forename = forename;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }
}
