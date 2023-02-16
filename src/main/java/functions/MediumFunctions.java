package functions;

import Interfaces.MediumInterface;

import java.util.*;

public class MediumFunctions extends BasicFunctions implements MediumInterface {
    public MediumFunctions(int[] myArr) {
        super(myArr);
    }

    @Override
    public void multipleSquare(int number){

        for (int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){

                String numberString = String.valueOf(i*j);
                if(numberString.length() == 2)
                System.out.print(numberString + "  ");
                else if((numberString.length() == 1))
                    System.out.print(numberString + "   ");

            }
            System.out.println();
        }
    }
    @Override
    public String findLargestPalindrome(String word){


        int max_length = 0;
        String largestPalindrome = "";

        for(int i = 0; i < word.length(); i++){
            for(int j = i+1; j < word.length(); j++){
                String current = word.substring(i,j);
                if(isPalindrome(current) && current.length() > max_length){
                    max_length = current.length();
                    largestPalindrome = current;
                }

            }
        }

        return largestPalindrome;
    }

    @Override
    public int sumAllEvenNumbers(int[] arr) {

        int sum = 0;

        for(int x: arr){
            if(x%2 == 0){
                sum+=x;
            }
        }
        return sum;
    }

    @Override
    public int[] targetNumbers(int[] arr, int target) {


        int solution1 = 0;
        int solution2 = 0;


            for (int i = 0; i < arr.length; i++){

                for(int j = i; j < arr.length; j++){
                    if(arr[i] + arr[j] == target && arr[i] != arr[j]){
                        solution1 = i;
                        solution2 = j;
                    }
                }

            }

            int[] solutionArr = {solution1, solution2};




        return solutionArr;
    }

    @Override
    public int[] mergeWithNoDuplicates(int[] arr1, int[] arr2) {

        List<Integer> solutionList = new ArrayList<>();

        for(int x: arr1){
            solutionList.add(x);
        }
        for(int x: arr2){
            solutionList.add(x);
        }

       Set<Integer> solutionSet = new HashSet<>(solutionList);
        solutionList.clear();
        solutionList.addAll(solutionSet);

        Collections.sort(solutionList);

        int[] solutionArr = new int[solutionList.size()];

        for(int i = 0; i < solutionList.size(); i++){
            solutionArr[i] = solutionList.get(i);
        }



        return solutionArr;
    }

    @Override
    public String polymorphismMethod() {
        return "I'm a Medium class";
    }


}
