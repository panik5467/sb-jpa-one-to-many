package com.bezkoder.spring.hibernate.onetomany.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutorial_generator")
  private long id;

  @Column(name = "title")
  private String title;

  @Column(name = "version")
  private String version;


  public Tutorial() {

  }

  public Tutorial(String title, String version) {
    this.title = title;
    this.version = version;
   }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public String toString() {
    return "Tutorial [id=" + id + ", title=" + title + ", version=" + version + "]";
  }

}
