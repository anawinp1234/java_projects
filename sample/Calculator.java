public class Calculator{
    // Constructor
    public Calculator(){
    }
    // public method called add() that returns int
    // add() method with 2 parameters. Parameters go inside parenthesis
    public int add(int a, int b){
        return a + b;
    }
    // more methods
      public int subtract(int a, int b){
          return a - b;
      }
      public int multiply(int a, int b){
        return a * b;
      }
      public int divide(int a, int b){
        return a / b;
      }
      public int modulo(int a, int b){
        return a % b;
      }
      // main method used to run the function
      public static void main(String[] args) {
        //  created a new object called myCalculator
        //  format: Class objectName = new Class();
        Calculator myCalculator = new Calculator();
        // "addition" is the name of the variable
        // "myCalculator" is the object
        // .add() calls the method
        // refer to the above methods (int a, int b)
        // need the same format (5, 7)
        int addition = myCalculator.add(5,7);
        System.out.println(addition);
        // another example of how to call the method, but use different format
        System.out.println(myCalculator.subtract(45, 11));
      }
}