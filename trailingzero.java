import java.util.*;
class trailingzero{
    public static void calculatezero(int n){
        int c=0;
        for (int k=1;Math.pow(5,k)<=n;k++){
c+=(n/Math.pow(5,k));
        }
        System.out.println(n+"! has "+c+" zero in end");
    }
    public static void main (String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("Enter number ");
int n=sc.nextInt();
calculatezero(n);
    }
}