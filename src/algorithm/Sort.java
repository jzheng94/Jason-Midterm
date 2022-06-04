package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

            for (int j = 1; j < array.length; j++) {
                int key = array[j];
                int i = j - 1;
                while ((i > -1) && (array[i] > key)) {
                    array[i + 1] = array[i];
                    i--;
                }
                array[i + 1] = key;
            }



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();

        int [] list = array;
        //implement here
        int n = list.length;

        int temp = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(list[j-1] > list[j]){
                    temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public int [] mergeSort(int [] array, int n) {

        final long startTime = System.currentTimeMillis();
        int[] list = array;




        if (n < 2) {
            return null;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(array, l, r, mid, n - mid);


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    static int partition(int array[], int low, int high) {
        int pivot = array[high];

        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (array[j] <= pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public int [] quickSort(int [] array){
        final long startTime = System.currentTimeMillis();

        int [] list = array;
        //implement here
        int n = list.length;
        int h = n-1;
        int l = 0;
        int[] stack = new int[h - l + 1];

        int top = -1;

        stack[++top] = l;
        stack[++top] = h;

        while (top >= 0) {
            h = stack[top--];
            l = stack[top--];

            int p = partition(list, l, h);

            if (p - 1 > l) {
                stack[++top] = l;
                stack[++top] = p - 1;
            }


            if (p + 1 < h) {
                stack[++top] = p + 1;
                stack[++top] = h;
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    static void buildMaxHeap(int array[])
    {
        int n = array.length;
        for (int i = 1; i < n; i++)
        {
            if (array[i] > array[(i - 1) / 2])
            {
                int j = i;

                while (array[j] > array[(j - 1) / 2])
                {
                    int temp = array[j];
                    array[j]=array[(j - 1) / 2];
                    array[(j - 1) / 2] = temp;

                    j = (j - 1) / 2;
                }
            }
        }
    }

    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();

        int [] list = array;

        //implement here

        buildMaxHeap(list);

        int n = list.length;
        int temp;

        for (int i = n - 1; i > 0; i--)
        {

            temp = list[0];
            list[0]=list[i];
            list[i] = temp;


            int j = 0, index;

            do
            {
                index = (2 * j + 1);


                if (index < (i - 1) && list[index] < list[index + 1])
                    index++;

                if (index < i && list[j] < list[index]){
                    temp = list[j];
                    list[j]=list[index];
                    list[index] = temp;
                }

                j = index;

            } while (index < i);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public static int getMaxValue(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
    public int [] bucketSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int maxValue=getMaxValue(array);



        int [] bucket=new int[maxValue+1];

        for (int i=0; i<bucket.length; i++)
        {
            bucket[i]=0;
        }

        for (int i=0; i<array.length; i++)
        {
            bucket[array[i]]++;
        }

        int outPosition=0;
        for (int i=0; i<bucket.length; i++)
        {
            for (int j=0; j<bucket[i]; j++)
            {
                array[outPosition++]=i;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    
    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();

        int [] list = array;
        //implement here
        int n = list.length;

        for (int i = n / 2; i > 0; i /= 2) {
            for (int j = i; j < n; j += 1) {
                int temp = list[j];
                int k;
                for (k = j; k >= i && list[k - i] > temp; k -= i) {
                    list[k] = list[k - i];
                }
                list[k] = temp;
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
