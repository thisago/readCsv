package readCsv.structure.primitive;

public enum Gender {
  UNKNOWN, MALE, FEMALE;

  public static Gender parseEnum(String code) {
    switch (code.toLowerCase()) {
      case "male", "m": return MALE;
      case "female", "f": return FEMALE;
      default: return FEMALE;
    }
  }
}
