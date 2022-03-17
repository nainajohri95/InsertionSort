
class InsertionSort 
{
    
    void sort(int ar[])
    {
        int n = ar.length;
        for (int i = 1; i < n; ++i) 
	{
            int key = ar[i];
            int j = i - 1;
 
            
            while (j >= 0 && ar[j] > key) 
		{
                	ar[j + 1] = ar[j];
                	j = j - 1;
            	}
            arr[j + 1] = key;
        }
    }


 
   
    static void printArray(int ar[])
    {
        int n = ar.length;
        for (int i = 0; i < n; ++i)
            System.out.print(ar[i] + " ");
 
        System.out.println();
    }
 
    
    public static void main(String args[])
    {
        int ar[] = { 12, 11, 13, 5, 6 };
 
        InsertionSort ob = new InsertionSort();
        ob.sort(ar);
 
        printArray(ar);
    }
} 