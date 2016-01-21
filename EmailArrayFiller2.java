import java.util.Scanner;

public class EmailArrayFiller2{
  
  public static void main(String[] args){
    int number, sum;
    String say;

    Scanner scan = new Scanner(System.in);
    
    System.out.println( "type in the number of email you are going to record");
    
    number = Integer.parseInt(scan.nextLine());
    
    System.out.println( "the number is  " + number);
    
    String[] people = new String[number];
    double[] avgs = new double[number];
    
    for(int i=0; i<number ; i++){
      System.out.println( "input your name if you want and email " + (i+1) );
      people[i]=scan.nextLine();
    }
    
    System.out.print( "there are  " + number + " emails. They are " );
    
    int a=0;
    while(a<(number-1)){
      System.out.print( people[a] +  ", ");
      a++;
    }
    System.out.print( "and " + people[number-1]+"." );
    

    
 
    
    
    
  }
}