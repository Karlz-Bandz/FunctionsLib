import Interfaces.BasicInterface;

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
   public boolean isPalindrome(String word){
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
    public void polymorphismMethod() {
        System.out.println("I'm a Basic class");
    }

    @Override
    public float squarePlace(float a) {
       return a*a;
    }

    @Override
    public int[] basicSort(int[] arr, int n) {

        if (n == 1)
        {
            return arr;
        }else{
            for (int i=0; i<n-1; i++)
        {
            if (arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        basicSort(arr, n-1);
        }
        return arr;
    }


    public BasicFunctions(int[] myArr) {
        this.myArr = myArr;
    }
}
