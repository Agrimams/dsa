import java.util.Scanner;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
    }    
}

public class DoublyLinkedlist {
   public Node head;
   public Node tail;

   public  void addNode(int data) {
       Node newNode = new Node(data);
   if(head == null){
       head = newNode;
       

   }
   else{
       tail.next = newNode;
       newNode .prev = tail;
      
       
   }
   tail = newNode;
   
   }
   public void display(){
       if(head == null){
           System.out.println("empty");
           return;
       }
       Node temp = head;
       while(temp!=null){
           System.out.println(temp.data);
           temp = temp.next;
       }

   }

   
   public void delete(int data){
       Node temp = head;
       if(head.data == data){
           head = temp.next;
           head.prev = null;
           return;
       }
       while(temp!=null){

         if(temp.data == data){
             temp.prev.next = temp.next;
             temp.next.prev = temp.prev;
             if(temp == tail){
                 tail = temp.prev;
                 tail.next = null;
             }
             return;
         }
         temp = temp.next;

       }
   }
   public void insert(int searchData, int data){
       Node newNode = new Node(data);
       Node temp = head;
       if(head.data == searchData){
           newNode.next = head;
           head.prev = newNode;
           head = newNode;
           return;
           
       }
       while(temp!=null){
           if(searchData == temp.data){
               newNode.next = temp;
               temp.prev.next = newNode;
               temp.prev = newNode;
               return;

           }
           temp = temp.next;
       }
   }
   public void removeDuplicate(){
       Node i = head;
      
       while(i!=null){
        Node j = i.next;
           while(j!=null){
               if(i.data == j.data){
                   if(j==tail){
                       tail.prev.next = null;
                       tail = tail.prev;
                       break;
                   }
                j.prev.next = j.next;
                j.next.prev = j.prev;

               }
               j = j.next;
           }
           i = i.next;


       }
   }
   public static void main(String[] args) {
       DoublyLinkedList obj = new DoublyLinkedList();
      Scanner sc=new Scanner(System.in);
      int y;
      do
      {
      System.out.println("enter 1.addnode 2.delete 3.insert 4.display 5.remove duplicate");
      int n=sc.nextInt();
      switch(n)
      {
      case 1:System.out.println("enter the data");
             int c=sc.nextInt();
             obj.addNode(c);
             break;
      case 2:System.out.println("enter the data to be deleted");
             int j=sc.nextInt();
             obj.delete(j);
             break;
      case 3:System.out.println("enter the search data and data ");
             int i=sc.nextInt();
             int k=sc.nextInt();
             obj.insert(i,k);
             break;
      case 4:obj.display();
             break;
      case 5:obj.removeDuplicate();
             break;
      default:System.out.println("invalid entry");
             break;
      }
      System.out.println("enter 1 to continue");
      y=sc.nextInt();
      }while(y==1);
   }

    
}
