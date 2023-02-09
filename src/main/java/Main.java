public class Main {

    public static void main(String[] args) {

        //Values
        int[] myArray = {10,23,2,1,4};
        int number = 6;
        String word = "jesttshalkokkokll";
        String word2 = "helo word!";


        //Assign an instance
        HardFunctions functionsInstance = new HardFunctions(myArray);


        //Calling methods
        int sumSolution = functionsInstance.sumArrayMan();

        String numberIsEvenOrOdd = functionsInstance.checkIsEvenOrOdd(number);

        boolean isPalindrome = functionsInstance.isPalindrome(word);

        String theBiggestPalindrome = functionsInstance.findLargestPalindrome(word);

        int theSecondBiggest = functionsInstance.findTheSeondLargest();

        int sumOfArrayEven = functionsInstance.sumAllEvenNumbers(myArray);

        Character charSolution = functionsInstance.firstNonRepetedCharacter(word2);


        //Outputs
        //Sum Methods
        System.out.println("Sum myArray method:");
        System.out.println(sumSolution);
        System.out.println();
        //Even or Odd Method
        System.out.println("Even or Odd method of number " + number);
        System.out.println(numberIsEvenOrOdd);
        System.out.println();
        //Is Palindrome method
        System.out.println("IsPalindrome method of word " + word);
        System.out.println(isPalindrome);
        System.out.println();
        //MultipleSquare
        System.out.println("MultipleSquare method of number " + number);
        functionsInstance.multipleSquare(number);
        System.out.println();
        //Find The bigest palindrome method
        System.out.println("Find The bigest palindrome method of word" + word);
        System.out.println(theBiggestPalindrome);
        System.out.println();
        //Find the second biggest number of array
        System.out.println("Find the second biggest number of array 10,23,1,2,4");
        System.out.println(theSecondBiggest);
        System.out.println();
        //Sum all even numbers from array
        System.out.println("Sum all even numbers from array 10,23,1,2,4");
        System.out.println(sumOfArrayEven);
        System.out.println();
        //Find first non repeted charcter method
        System.out.println("Find first non repeted charcter method from word " + word2);
        System.out.println(charSolution);
        System.out.println();















    }
}
