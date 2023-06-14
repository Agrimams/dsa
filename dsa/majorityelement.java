public class majorityelemnt{
    public int majorele(int arr()){
        int s = arr.length;
        int count = 0;
        for(int i =0;i<s;i++){
            for(int j=0;j<s;j++){
                if(arr[i]==arr[j]){
                    count = count+1;
                }
            }
            if(count>s/2){
                return arr[i];
            }
            count = 0;
        }
        return -1;
    }
    public static void main(String[] argvs)  {
        majorityelemnt obj = new majorityelemnt();
        int arr[] = {5, 1, 1, 1, 1, 1, 4, 9, 1, 0, 1, 2};  
          
        int s = arr.length;  
        System.out.println("For the input array.");  
        for(int i = 0; i < s; i++)  
        {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        int ans = obj.majorele(arr);  
        if(ans != -1)  
        {  
           System.out.println("The majority element is: " + ans);   
        }  
        else  
        {  
            System.out.println("The majority element is not found.");   
        }  
          
          
        System.out.println("\n");  
    } 
    


    }
