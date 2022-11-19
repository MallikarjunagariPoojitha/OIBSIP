import java.util.Scanner;  
import java.time.LocalDate; 
class ATM 
{    
    public static void main(String args[] )  
    {   
        int balance = 100000, withdraw, deposit;   
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Type 1 for Withdraw");  
            System.out.println("Type 2 for Deposit");  
            System.out.println("Type 3 for Check Balance");  
            System.out.println("Type 4 for Transactional Details");
            System.out.println("Type 5 for EXIT"); 
            System.out.print("Choose the operation you want to perform:");  
              
            int choice = sc.nextInt();  
            switch(choice)  
            {  
         case 1:  
        System.out.print("Enter money to be withdrawn:");  
        withdraw = sc.nextInt(); 
        if(balance >= withdraw)  
        {  
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {    
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
        case 2:           
        System.out.print("Enter money to be deposited:");  
        deposit = sc.nextInt();    
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
        case 3:  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break; 
        
        case 4:
        System.out.println("Your Transactional Details are:");
        LocalDate date=LocalDate.now();
        System.out.println("Date : "+date);
        System.out.println("Time :"+java.time.LocalTime.now());
        long R=(long)(Math.random()*Math.pow(10,10));
        System.out.println("Your Transaction Id is :"+R);
        System.out.println("Available Balance in Your Account is:"+balance);
        System.out.println("*********Thanks for Using our ATM Services**********");
   
        case 5: 
               System.exit(0); 
        default:
               System.out.println("Invalid Choice\n"); 
            }  
        }  
    }  
}  