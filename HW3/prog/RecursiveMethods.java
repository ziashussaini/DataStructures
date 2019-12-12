// The RecursiveMethods class that implements several recursive solutions
// Zia Hussaini

public class RecursiveMethods 
{
    // This method calls the largestRec method and returns the largest.
    public int largest(int[] arr)
    {
        // Do not make any changes to this method!
        return largestRec(arr, 0);
    }
    
    // This method takes an integer array as well as an integer (the starting index) and returns the largest number in the array.
    public int largestRec(int[] arr, int pos)
  {
       if (pos != arr.length - 1) {
            return Math.max(arr[pos], largestRec(arr, pos + 1));
       }
       return arr[arr.length - 1]; 
         
	}
    
    // This method calls the sumRec method and returns the sum of the array.
    public int sum(int[] arr)
    {
        // Do not make any changes to this method!
        return sumRec(arr, 0);
    }    

    // This method takes an integer array as well as an integer (the starting index) and returns the sum of the values in the array.
    public int sumRec(int[] arr, int pos)
    {
        int sum = arr[pos];
        if(pos >= arr.length-1)
         return sum;
        else
        {
         sum = sum + sumRec(arr, pos+1);
        }
        
		
        return sum; // replace this statement with your own return
    }  

    // This method reads a string and returns the string in the reversed order.
    public String reverseStringRec(String s)
    {
        String temp = "";
        
        if(s.length() <= 1)
         temp = s;
        else
        {
         temp = reverseStringRec(s.substring(1)) + "" + s.charAt(0);
        } 
		
        return temp; // replace this statement with your own return
    }
    
}