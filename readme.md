# CSV parser (DAO pattern)

This is a CSV parsing implementation in Java using the DAO pattern, improved version of [masaruohashijr/custos](https://github.com/masaruohashijr/custos).

## Example

**houses.csv**
```csv
address,color,size,owner
Center street,yellow,100m2,John
Farming Ville,green,350m2,Linda
Robert Street,white,150m2,John
```
**people.csv**
```csv
name,age,gender
John,71,male
Linda,22,female
Tom,12,male
```

**stdout**
```
Houses (From houses.csv):
  House: 1
    Address: Center street
    Color: yellow
    Size: 100m2
    Owner Name: John
    Owner (From people.csv):
      Name: John
      Age: 71
      Gender: MALE
  House: 2
    Address: Farming Ville
    Color: green
    Size: 350m2
    Owner Name: Linda
    Owner (From people.csv):
      Name: Linda
      Age: 22
      Gender: FEMALE
  House: 3
    Address: Robert Street
    Color: white
    Size: 150m2
    Owner Name: John
    Owner (From people.csv):
      Name: John
      Age: 71
      Gender: MALE
```

## Features

### Improved features

#### CSV parser allows you change the data delimiter at `Parser` object construction

Example
```java
// DataDeserializer.java
public class DataDeserializer extends Parser {
  protected Model build(String[] headers, String[] values) { /* ... */ }
}
```

```java
// Main.java
List<Model> all = new DataDeserializer(/*delimiter:*/ ";").parseCsv("data.csv");
```

#### CSV parser collects the CSV headers to allow advanced parsing

You need to identify the columns based on their name dynamically? So you'll need
to access the CSV headers. This implementation of parser allows it!

**Example:**
```java
// DataDeserializer.java
public class DataDeserializer extends Parser {
  protected Model build(String[] headers, String[] values) {
    // Do what you want with headers here!
    for (int i = 0; i < headers.length; i++)
      System.out.println(headers[i] + ": " + values[i]);
  }
}
```

## License

MIT
