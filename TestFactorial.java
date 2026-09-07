public class TestFactorial {
    public static void main(String[] args) {
        if(Factorial.factorial(5)!=120){
            throw new AssertionError("Factorial of 5 is 120");
        }
        if(Factorial.factorial(0)!=1){
            // return new AssertionError("Here the Factorial of 0 is 1");
            throw new AssertionError("Factorial of 0 is 1");
        }
        else{
            System.out.println("All test cases are passed");
        }
    }
}
