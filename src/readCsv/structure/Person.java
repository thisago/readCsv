package readCsv.structure;

import java.util.List;

import readCsv.core.Model;
import readCsv.structure.primitive.Gender;

public class Person extends Model {
  private String name;
  private int age;
  private Gender gender;

  public Person(String name, int age, Gender gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person() {
    this("", -1, Gender.UNKNOWN);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public Gender getGender() {
    return this.gender;
  }

  public static Person getByName(List<Person> people, String name) {
    for (Person person : people)
      if (person.getName().equals(name))
        return person;
    return new Person();
  }
}
