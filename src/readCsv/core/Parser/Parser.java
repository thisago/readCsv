package readCsv.core.Parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import readCsv.core.Model;

public abstract class Parser {

  String delimiter;

  public Parser(String delimiter) {
    this.delimiter = delimiter;
  }

  public Parser() {
    this(",");
  }

  public List<Model> parseCsv(String path) {
    List<Model> rows = new ArrayList<Model>();

    String row = "";
    String[] headers = {};

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      while ((row = br.readLine()) != null) {
        String[] fields = row.split(this.delimiter);
        if (headers.length == 0)
          headers = fields;
        else
          rows.add(build(headers, fields));
      }
    } catch (FileNotFoundException e) {
      System.out.println("Error: '" + e + "'; File doesn't exists.");
    } catch (IOException e) {
      System.out.println("Error: '" + e + "'; Error when reading file.");
    }
    return rows;
  }

  protected abstract Model build(String[] headers, String[] fields);
}
