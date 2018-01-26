public class ControlFlow {

  // Program always looks in public static void main first
  public static void main(String[] args) {
    // init, termination, increment
    for (int i=0; i<5; i++ ) {
      // System.out.println("loop " + i + " Hello");
    }
    // calling below method to loop through interest rate for diff numbers
    for (int i = 2; i<9; i++ ) {
      // System.out.println(String.format("%.2f",calculateInterest(10000.0, i)));
    }

    for (int i = 8; i>1; i--) {
      // System.out.println(calculateInterest(10000.0, i));
    }

    primeNumber();
    // whileLoops();
    // doWhileLoops();

    // get back even numbers and record total number found

    int evenNumbersFound = 0;
    int n = 5;
    int finishNumber = 20;
    while(n <= finishNumber) {
      if (!isEvenNumber(n)) {
        n++;
        continue;
      }
      evenNumbersFound++;
      System.out.println("Even number is " + n);
      n++;
    }
    System.out.println("Total even numbers found is " + evenNumbersFound);

  }

  // cant return when using void
  public static double calculateInterest(double amount, double interestRate) {
    return(amount *(interestRate/100));
  }

  //challenge to determine if a number is prime using the isPrime method. If it is a prime, print it out and increment it. If that count is 3 exit the loop so only 3 prime numbers show.
  public static void primeNumber() {
    int count = 0;
    for (int i=10; i < 50; i++ ) {
      if (isPrime(i) == true) {
        count++;
        System.out.println(i + " is a prime number");
      } else if (count == 3) {
        break;
      }
    }
  }

  public static boolean isPrime(int n) {

    if(n == 1) {
      return false;
    }
    for(int i=2; i <= n/2; i++) {
      if(n % i == 0) {
        return false;
      }
    }
    return true;
  }
  // WHILE LOOOOOOOOOOOOPS
  public static void whileLoops() {
    int count = 1;
    while(count != 6) {
      System.out.println("Count value is " + count);
      count++;
    }
  }

  // DOOOOOO WHILLE LOOOOOOOOOOOOPS
  public static void doWhileLoops() {
    int count = 1;
    do {
      System.out.println("wadddup count value was " + count);
      count++;
    } while(count != 6);
  }

  public static boolean isEvenNumber(int n) {
    if (n % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }


}
