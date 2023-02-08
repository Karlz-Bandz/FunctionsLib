public class Main {

    public static void main(String[] args) {

        //Values
        int[] myArray = {10,23,2,1,4};
        int number = 10;
        String word = "kaaakkaaak";


        //Assign an instance
        MediumFunctions functionsInstance = new MediumFunctions(myArray);


        //Calling methods
        int sumSolution = functionsInstance.sumArrayMan();
        String numberIsEvenOrOdd = functionsInstance.checkIsEvenOrOdd(number);
        boolean isPalindrome = functionsInstance.isPalindrome(word);


        //Outputs
        //Sum Methods
        System.out.println("Sum myArray method:");
        System.out.println(sumSolution);
        //Even or Odd Method
        System.out.println("Even or Odd method of number " + number);
        System.out.println(numberIsEvenOrOdd);
        //Is Palindrome method
        System.out.println("IsPalindrome method of word " + word);
        System.out.println(isPalindrome);
        //MultipleSquare
        System.out.println("MultipleSquare method of number " + number);
        functionsInstance.multipleSquare(number);








    }
}
