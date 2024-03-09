class BubbleSort { 
    void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n - 1; i++) 
            for (int j = 0; j < n - i - 1; j++) 
                if (arr[j] > arr[j + 1]) { 
                    // swap 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
    } 
 
    public static void main(String args[]) 
    { 
        BubbleSort ob = new BubbleSort(); 
        // array to store numbers
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 }; 
        ob.bubbleSort(arr);
        // to store smallest number
        int small_number = arr[0];
        // to store 2nd smallest number
        int second_small_number = arr[1];
        // printing the smallest and 2nd smallest numbers
        System.out.println("Smallest number in the array "+"->"+small_number);
        System.out.println("Second smallest number in the array "+"->"+second_small_number);
    } 
}