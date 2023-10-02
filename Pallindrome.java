package Java;
import java.util.Scanner;
public class Pallindrome {
    public boolean isPalindrome(int x) {
        int rev,temp,digit;
        rev=0;
        temp=x;
        if(x<0)
            return false;
        else
        {
            while(temp!=0){
            digit=temp%10;
            rev=rev*10+digit;
            temp=temp/10;
            }
            if(rev==x)
            return true;
            else
            return false;
        }
    }
    public static void main(String[] args){
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the no. you want to check");
        x=sc.nextInt();
        Pallindrome pd=new Pallindrome();
        System.out.println("The pallindrome of "+x+" exists? :"+pd.isPalindrome(x));
   }    
    
}
