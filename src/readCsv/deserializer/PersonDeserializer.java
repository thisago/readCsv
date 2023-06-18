package readCsv.deserializer;

import readCsv.core.Model;
import readCsv.core.Parser.Parser;
import readCsv.structure.Person;
import readCsv.structure.primitive.Gender;

public class PersonDeserializer extends Parser {
  
  @Override
  protected Model build(String[] headers, String[] values) {
    return new Person(
      values[0],
      Integer.parseInt(values[1]),
      Gender.parseEnum(values[2])
    );
  }
}
