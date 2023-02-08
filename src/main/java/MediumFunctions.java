public class MediumFunctions extends BasicFunctions {
    public MediumFunctions(int[] myArr) {
        super(myArr);
    }


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


}
