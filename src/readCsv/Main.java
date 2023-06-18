package readCsv;

import java.util.List;

import readCsv.deserializer.Deserialize;
import readCsv.structure.House;
import readCsv.structure.Person;

public class Main {

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Provide the CSV filenames respectively: <people.csv> <houses.csv>");
      return;
    }
    List<Person> people = Deserialize.people(args[0]);
    List<House> houses = Deserialize.house(args[1]);

    // System.out.println("People:");
    // for (Person person : people) {
    //   System.out.println("  Name: " + person.getName());
    //   System.out.println("  Age: " + person.getAge());
    //   System.out.println("  Gender: " + person.getGender());
    // }

    System.out.println("Houses (From houses.csv):");
    for (int i = 0; i < houses.size(); i++) {
      House house = houses.get(i);
      System.out.println("  House: " + (i + 1));
      System.out.println("    Address: " + house.getAddress());
      System.out.println("    Color: " + house.getColor());
      System.out.println("    Size: " + house.getSize());
      System.out.println("    Owner Name: " + house.getOwnerName());

      System.out.println("    Owner (From people.csv):");
      Person person = Person.getByName(people, house.getOwnerName());
      System.out.println("      Name: " + person.getName());
      System.out.println("      Age: " + person.getAge());
      System.out.println("      Gender: " + person.getGender());
    }
    System.out.println("\n");
  }
}
