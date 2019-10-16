package TerbesarTerkecil;
import java.util.Scanner;
/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Menampilkan Nilai Terbesar dan Terkecil
 * @author Rama
 */
public class BesarKecil {

	Scanner masuk = new Scanner(System.in);
	int jmlMhs;
	int[] nilai = new int[99];
	double max;
	double min;

	/**
	 * 
	 * @param jmlMhs
	 */
	public void input(int jmlMhs) {
		 for (int i = 0; i <= (jmlMhs - 1); i++) {

            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + "= ");
            nilai[i] = masuk.nextInt();
	}
        }
	
	public void tampil(int jmlMhs) {
		int i;
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 0; i <= jmlMhs - 1; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " = " + nilai[i]);
	}
        }
	 
	public void tentuBesarKecil(int jmlMhs) {
		 int i = 0;
        max = nilai[i];
        min = nilai[i];
        for (i = 0; i <= (jmlMhs - 1); i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " = " + nilai[i]);
            
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
	}

}