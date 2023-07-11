
package Servicio;

public class arrysServicio {
    
    // Function to add x in arr
   public static int[] addX(int n, int arr[], int x)
   {
       int i;
   
       // create a new array of size 20
       int newarr[] = new int[n + 1];
   
       // insert the elements from
       // the old array into the new array
       // insert all elements till n
       // then insert x at n+1
       for (i = 0; i < n; i++)
           newarr[i] = arr[i];
   
       newarr[n] = x;
   
       return newarr;
   }
   
}
