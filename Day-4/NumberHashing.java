//here we are finding for fixed size of array
import java.util.*;
public class NumberHashing{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Size of the array:");
     int n = sc.nextInt();
     //taking input from user
     int arr[] = new int[n];
     System.out.print("write the nos. for the array:");
     for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
     }

     //precompute
     int hash[] = new int[13];
     for(int i=0;i<n;i++){
        hash[arr[i]]+=1;
     }

     //taking query(i.e number) from user
     int q;
     System.out.println("Select the total no.of query to be find:");
     q = sc.nextInt();
     while(q--!=0){
        int number;
        number = sc.nextInt();

        //fetching
        System.out.println("The no.of of times query appeared is: "+number+"->"+hash[number]);
     }
    }
}