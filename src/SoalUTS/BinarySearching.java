package SoalUTS;

public class BinarySearching {
    public static void main (String[] args){
        System.out.println("Siti Aminah Dauda (20090102)" + "\n");
        int A [] = {3, 10, 4, 2, 8, 13};
        int cari ;
        int IndeksAwal = 0; // 0
        int IndeksAkhir = A.length-1;
        int ketemu = 0;
        int point = 0;
           
        System.out.println("Isi dari Data Adalah : ");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        
        while ((IndeksAwal <= IndeksAkhir && (ketemu == 0))){
            point = (IndeksAwal + IndeksAkhir) / 2;
            System.out.println("Indeks point : " + point);
            if(point == A[point]){ 
                ketemu = 1;
                System.out.println("Data " +
                point + " Telah ditemukan pada index ke " + point);
            }
            else if(point < A[point]){
                System.out.println("Cari di kiri");
                IndeksAkhir = point - 1;
            }
            else{
                IndeksAwal = point + 1;
                System.out.println("Cari di kanan" );
            }
        }  
        if(ketemu == 1)
            System.out.println("kesimpulan: data ditemukan ");
        else
            System.out.println("kesimpulan: data tidak ditemukan "); 
    }
}