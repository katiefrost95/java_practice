public class Main {

  public static void main(String[] args){

      /* byte stored a much smaller amount of space */
      byte myByteValue = 0;

      //allocated half the amount of an int and twice as much as a byte
      short myShortValue = 32767;

      // double width of an integer
      long myLongValue = 100L;


      int myIntValue = 5;
      float myFloatValue = 5f;
      double myDoubleValue = 5d;

      // convert a given number of pounds to kilograms
      int numberOfPounds = 60;
      float totalInKg = numberOfPounds / 2.2f;

//      System.out.println("Kilograms = " + totalInKg);

      char myChar = 'D';

      boolean myBoolean = true;

      String myString = "This is a string";
      System.out.println("myString = " + myString);

      boolean isCar = true;

      boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

  }
}
