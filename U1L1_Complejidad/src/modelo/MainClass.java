package modelo;

import java.util.ArrayList;

public class MainClass {
	
	private ArrayList<Valor> numbers;
	
	public MainClass(){
		numbers=new ArrayList<Valor>();
	}
	
	public ArrayList<Valor> getValues(){
		return numbers;
	}
	
	public void setValues(ArrayList<Valor> v){
		numbers=v;
	}
	
	public int[] RandomValues(int min, int max, int count){
		int[] secuence= new int[max];
		int contador=0;
		while(contador<=count){
			secuence[contador]=(int) (Math.random()*max);
			contador++;
		}
		return secuence;
	}
	
	public void countingSort(char arr[])
    {
        int n = arr.length;
        char output[] = new char[n];
 
        int count[] = new int[256];
        for (int i=0; i<256; ++i)
            count[i] = 0;
 
        for (int i=0; i<n; ++i)
            ++count[arr[i]];
 
        for (int i=1; i<=255; ++i)
            count[i] += count[i-1];

        for (int i = 0; i<n; ++i)
        {
            output[count[arr[i]]-1] = arr[i];
            --count[arr[i]];
        }
 
        for (int i = 0; i<n; ++i)
            arr[i] = output[i];
    }

	public static void merge(int A[],int izq, int m, int der){
		int i, j, k;
		int [] B = new int[A.length]; 
		for (i=izq; i<=der; i++) 
		B[i]=A[i];

		i=izq; j=m+1; k=izq;
		while (i<=m && j<=der)

		if (B[i]<=B[j])
		A[k++]=B[i++];
		else
		A[k++]=B[j++];
		while (i<=m) 
		A[k++]=B[i++];
	}

		public static void mergesort(int A[],int izq, int der){
		if (izq<der){
		int m=(izq+der)/2;
		mergesort(A,izq, m);
		mergesort(A,m+1, der);
		merge(A,izq, m, der);
		}
		}
		
		 public void heapSort(int arr[])
		    {
		        int n = arr.length;
		 
		        // Build heap (rearrange array)
		        for (int i = n / 2 - 1; i >= 0; i--)
		            heapify(arr, n, i);
		 
		        // One by one extract an element from heap
		        for (int i=n-1; i>=0; i--)
		        {
		            // Move current root to end
		            int temp = arr[0];
		            arr[0] = arr[i];
		            arr[i] = temp;
		 
		            // call max heapify on the reduced heap
		            heapify(arr, i, 0);
		        }
		    }
		 
		    // To heapify a subtree rooted with node i which is
		    // an index in arr[]. n is size of heap
		    void heapify(int arr[], int n, int i)
		    {
		        int largest = i;  // Initialize largest as root
		        int l = 2*i + 1;  // left = 2*i + 1
		        int r = 2*i + 2;  // right = 2*i + 2
		 
		        // If left child is larger than root
		        if (l < n && arr[l] > arr[largest])
		            largest = l;
		 
		        // If right child is larger than largest so far
		        if (r < n && arr[r] > arr[largest])
		            largest = r;
		 
		        // If largest is not root
		        if (largest != i)
		        {
		            int swap = arr[i];
		            arr[i] = arr[largest];
		            arr[largest] = swap;
		 
		            // Recursively heapify the affected sub-tree
		            heapify(arr, n, largest);
		        }
		    }
}
