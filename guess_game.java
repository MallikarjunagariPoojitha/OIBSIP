import java.util.Scanner;
class Guess_Game
{
    public static void main(String args[])
    {
        int R=1+(int)(100*Math.random());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the positive within range of 100");
        int N=sc.nextInt();
        int c=1;
        while(N!=R)
        {
              if(N<R){
               System.out.println(N+" is smaller");
              }
              else{
               System.out.println(N+" is greater");
              }
              System.out.println("enter another number");
              N=sc.nextInt();
              c++;
       }
           System.out.println("OOhOO!!, Your Number is Correct. You Win the Game!\n");
           System.out.println("Your Score is :"+c);
           System.out.println("The Number is :"+R);
    }
}
 