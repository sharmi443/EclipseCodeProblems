public class JavaSubArray {
    
	private static int temp = 0;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 5;        
        
        int[] a = {1,-2,4,-5,1};
           
        for(int i = 0 ; i < n ; i++)
        {            
            calcSum(i,a);           
            
        }
        System.out.println(temp);
    }
    public static void calcSum(int s, int[] arr)
    {
        int k = 0;
        int n = arr.length;
        while(k<(n-s))
        {
            int sum = 0;
            
            for (int x = k ; x <=k+s;x++)
            {
                sum = sum + arr[x];
                
            }
            
            if (sum < 0 )
            {
                temp++;
                
            }
            k++;
        }
        //return localCount;
    }
}