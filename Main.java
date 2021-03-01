import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println(" Welcome to the DMV. Let's help you get your permit. What is your name?");
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    System.out.println("Hello " + name + ". How old are you?");
    int age = scan.nextInt();

    if (age < 18) {
      System.out.println("Let's check if you qualify for your permit.");
      qualifies();
    }
  }

  public static void qualifies()
   {
     System.out.println(" Have you passed the Traffic Law Test?");
     boolean trafficTest = scan.nextBoolean();
     System.out.println("Have you passed the Road Rules test?");
     boolean roadTest = scan.nextBoolean();
     System.out.println("Have you passed the vision and hearing test?");
     boolean vhTest = scan.nextBoolean();

     if(trafficTest && roadTest && vhTest)
     {
       System.out.println{"looks like you're ready for the next step!"};
       //proofOfId();
     }else{
       System.out.println("Uh oh! Looks like you haven't passed all 3 test. Make sure to go back and complete.");
     }
   }

}public static void