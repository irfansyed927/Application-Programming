


public class SampleQuestions {
 
 public static void main(String[] args) {
  question1();
  question2();
 }
 
 
 public static void question1() {
  System.out.println( "------------Question 1------------" );
  int[] array = {1,2,3,2,1};
  int v = 1; 

  for( int val : array ){
   if( v > val )
    v += val;
   else
    v -= val;

   System.out.printf("%s", val );
  } 

  System.out.println("");
  System.out.printf("%d", v );
  System.out.println( "\n----------------------------------" );
 }
 
 public static void question2() {
  System.out.println( "------------Question 2------------" );
  char[] letters = {'A', 'B', '2', 'L', 'U', 'H', 'K', 'm', 'G', 'c', 'Z'}; 
  int[]  numbers = {3, 4, 9, 6};
  String printMe = "";

  for( int index : numbers ){
      printMe += letters[index];
  }

  System.out.println( printMe + "!" );
  System.out.println( "----------------------------------" );
 }

}
