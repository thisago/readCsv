package readCsv.structure;

import readCsv.core.Model;

public class House extends Model {
  private String address;
  private String color;
  private String size;
  private String ownerName;

  public House(String address, String color, String size, String ownerName) {
    this.address  = address;
    this.color  = color;
    this.size  = size;
    this.ownerName = ownerName;
  }

  public House() {
    this("", "", "", "");
  }

  public void setAddress(String address) {
    this.address = address;
  }
  public String getAddress() {
    return this.address;
  }
  
  public void setColor(String color) {
    this.color = color;
  }
  public String getColor() {
    return this.color;
  }
  
  public void setSize(String size) {
    this.size = size;
  }
  public String getSize() {
    return this.size;
  }
  
  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }
  public String getOwnerName() {
    return this.ownerName;
  }

}
