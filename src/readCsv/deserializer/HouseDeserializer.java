package readCsv.deserializer;

import readCsv.core.Model;
import readCsv.core.Parser.Parser;
import readCsv.structure.House;

public class HouseDeserializer extends Parser {
  
  @Override
  protected Model build(String[] headers, String[] values) {
    return new House(
      values[0],
      values[1],
      values[2],
      values[3]
    );
  }
}
