package readCsv.deserializer;

import java.util.ArrayList;
import java.util.List;

import readCsv.core.Model;
import readCsv.structure.House;
import readCsv.structure.Person;

public class Deserialize {
  public static List<Person> people(String path) {
    List<Person> people = new ArrayList<Person>();
    for (Model model : new PersonDeserializer().parseCsv(path))
      people.add((Person)model);
    return people;
  }

  public static List<House> house(String path) {
    List<House> houses = new ArrayList<House>();
    for (Model model : new HouseDeserializer().parseCsv(path))
      houses.add((House)model);
    return houses;
  }
}
