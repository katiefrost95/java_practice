public class Car {

//private means class outside car class can't access these variables, change to public for them to be accessed.
  private int doors;
  private int wheels;
  private String model;
  private String engine;
  private String colour;

  // create method publicly accessible, gonna update above private model class with what's in parameter below.
  public void setModel(String model){
    //validating String class
    String validModel = model.toLowerCase();
    if (validModel.equals("carrera") || validModel.equals("fiesta")){
    //update this variable model(above) with what's in parameter so can call method in main class
    this.model = model;
    } else{
    this.model = "unknown";
    }
  }

  public String getModel() {
    return this.model;
  }

}
