import java.io.*;
import java.util.*;
 class OStack{
        private int max;
        private int top;
        private char arr[];
        
     public OStack(int n){
          max = n;
          top = -1;
          arr = new char[max];
       }
     public void push(char a){
          top++;
          arr[top]=a;
         }
     public char pop(){
           return arr[top--];
           }
     public boolean isEmpty(){
            if(top==-1){
               return true;
            }else{
               return false;
               }
         }
       public boolean isFull(){
               if(top == max-1){
                       return true;
                    }else{
                        return false;
                     }
                 }
          }
      class StackPalindrome{
             public static void main (String args[]){
                           String sequence;
                           String reverse="";
                           int n;
                           System.out.println("Enter the String:");
                           Scanner scn = new Scanner(System.in);
                           sequence = scn.nextLine();
                           n = sequence.length();
                           
                           OStack stk = new OStack(n);
                           
                           for(int i=0;i<=n;i++){
                              if(!stk.isFull()){
                                     stk.push(sequence.charAt(i));
                                     }
                                  }
                           while(!stk.isEmpty()){
                                      reverse = reverse+stk.pop();
                                      }
                           if(sequence.equals(reverse)){
                                System.out.println("It is palindrome");
                                }else  
                                   System.out.println("It is not Plaindrome.");
                                   }
                               }
                           
                                
                                
                           
                                  
