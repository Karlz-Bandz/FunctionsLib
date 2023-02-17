package functions;

import Interfaces.BasicInterface;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class BasicFunctions implements BasicInterface {

   protected int[] myArr;

   @Override
   public int sumArrayMan(){
       int sum = 0;

       for(int number: myArr){
           sum += number;
       }
       return sum;
   }

    @Override
    public int findTheSeondLargest() {

        Arrays.sort(myArr);

        int solution = myArr[myArr.length - 2];

        return solution;
    }

    @Override
    public String checkIsEvenOrOdd(int number){

       if(number%2 == 0){
           return "Even";
       }
       else
           return "Odd";
   }
   @Override
   public boolean isPalindrome(@NotNull String word){
       StringBuilder buildNewWord = new StringBuilder();

       for(int i = word.length() - 1; i > -1; i--){
           buildNewWord.append(word.charAt(i));
       }

       String reversedWord = buildNewWord.toString();

       if(reversedWord.equals(word)){
           return true;
       }else
           return false;

   }

    @Override
    public String polymorphismMethod() {
        return "I'm a Basic class";
    }

    @Override
    public float squarePlace(float a) {
       return a*a;
    }

    @Override
    public int[] basicSort(int[] arr) {

      for(int j = 0; j<arr.length; j++){
          for (int i=0; i<arr.length-1; i++)
          {
              if (arr[i] > arr[i+1])
              {
                  int temp = arr[i];
                  arr[i] = arr[i+1];
                  arr[i+1] = temp;
              }
          }
      }
      return arr;
    }

    @Override
    public int[] changeStringForIntArray(String word) {
        String onlyNumbers = word.replaceAll("[^0-9]", "");

        int[] wordArray = new int[onlyNumbers.length()];

        for(int i = 0; i < onlyNumbers.length(); i++){
            wordArray[i] = Integer.parseInt(String.valueOf(onlyNumbers.charAt(i)));
        }

        return wordArray;
    }


    public BasicFunctions(int[] myArr) {
        this.myArr = myArr;
    }
}
