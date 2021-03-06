package SoalUTS;

public class SelectionSort {
     public static void selectionSort(int[] A){
        int smallIndex;
        int pass, j, n = A.length;
        int temp;
        
        for (pass = 0; pass < n - 1; pass++){
            smallIndex = pass;
            for (j = pass +1; j < n; j++){
                if (A[j]< A[smallIndex]){
                    smallIndex = j;
                }
            }
            
            temp = A[pass];
            A[pass] = A[smallIndex];
            A[smallIndex] = temp;
        }
    }
    
    public static void tampil(int data[]){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int A[] = {3, 10, 4, 2, 8, 13};
        SelectionSort.tampil(A);
        SelectionSort.selectionSort(A);
        SelectionSort.tampil(A);
        System.out.println("Siti Aminah Dauda (20090102)" + "\n");
    }
}