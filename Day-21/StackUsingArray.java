import java.util.Scanner;

public class StackUsingArray {
    
    int top;
	int arr[] = new int[1000];
    StackUsingArray(){
        top = -1;
    }
    void push(int x){
        arr[++top]=x;
    }
    int pop(){
        if(top == -1){
            return -1;
        }
        return arr[top--];
    }
    public static void main(String[] args) {
         // Create a new stack
         StackUsingArray stack = new StackUsingArray();
         Scanner sc = new Scanner(System.in);
           
        System.out.println("Enter the number of elements to push:");
        int n = sc.nextInt();
        
        // Push elements onto the stack with user input
        System.out.println("Enter the elements to push onto the stack:");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            stack.push(element);
        }
        
        // Pop elements from the stack and print them
        System.out.println("Popping elements from the stack:");
        for (int i = 0; i < n; i++) {
            System.out.println(stack.pop());
        }

    }
}

