# CSV parser (DAO pattern)

This is a CSV parsing implementation in Java following the DAO pattern, improved version of [masaruohashijr/custos](https://github.com/masaruohashijr/custos).

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

### CSV parser collects the CSV headers to allow advanced parsing

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
