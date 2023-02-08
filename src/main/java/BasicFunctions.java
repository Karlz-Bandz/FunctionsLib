public class BasicFunctions {

   protected int[] myArr;


   public int sumArrayMan(){
       int sum = 0;

       for(int number: myArr){
           sum += number;
       }
       return sum;
   }

   public String checkIsEvenOrOdd(int number){

       if(number%2 == 0){
           return "Even";
       }
       else
           return "Odd";
   }

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

    public BasicFunctions(int[] myArr) {
        this.myArr = myArr;
    }
}
