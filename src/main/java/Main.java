public class Main {

    public static void main(String[] args) {

        //Values
        int[] myArray = {10,23,2,1,4};
        int number = 6;
        String word = "jesttshalkokkokll";
        String word2 = "helo word!";
        int target = 14;


        //Assign an instance
        HardFunctions functionsInstance = new HardFunctions(myArray);


        //Calling methods
        int sumSolution = functionsInstance.sumArrayMan();

        String numberIsEvenOrOdd = functionsInstance.checkIsEvenOrOdd(number);

        boolean isPalindrome = functionsInstance.isPalindrome(word);

        String theBiggestPalindrome = functionsInstance.findLargestPalindrome(word);

        int theSecondBiggest = functionsInstance.findTheSeondLargest();

        int[] returnedArr = functionsInstance.targetNumbers(myArray, target);

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
        //Target Numbers method.
        System.out.println("Target Numbers method. Return indexes of first and the second number\n  " +
                "of array whose sum\n" +
                "is the same like the provided target: " + target);
        System.out.print("Array: ");
        for (int x: myArray){
            System.out.print(x + ", ");
        }
        System.out.println();
        System.out.println("[" + returnedArr[0] + ", " + returnedArr[1] + "]");
        System.out.println();

        //Polymorphism
        System.out.println("Here is an example of the polymorphism");
        BasicFunctions basicFunctions = new BasicFunctions(myArray);
        BasicFunctions mediumFunctions = new MediumFunctions(myArray);
        BasicFunctions hardFunctions = new HardFunctions(myArray);

        System.out.println();
        System.out.print("1: ");

        basicFunctions.polymorphismMethod();

        System.out.println();
        System.out.print("2: ");

        mediumFunctions.polymorphismMethod();

        System.out.println();
        System.out.print("3: ");

        hardFunctions.polymorphismMethod();

        System.out.println();

        float number2 = 20;

        System.out.println("Pole kwadratu o boku " + number2 + " wynosi: " + basicFunctions.squarePlace(number2));
















    }
}
