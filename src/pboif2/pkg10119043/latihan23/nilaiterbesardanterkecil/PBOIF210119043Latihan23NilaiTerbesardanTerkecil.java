/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author FERMI
 */
public class PBOIF210119043Latihan23NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    
    public static void penentuNilai() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukan nama Petugas : ");
        String namaPetugas = scanner.nextLine();
        
        System.out.print("Masukan banyak mahasiswa : ");
        int jmlhMhs = scanner.nextInt();
        int[] nilai = inputNilai(jmlhMhs);
        
        System.out.println();
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        int min = nilai[0];
        int max = nilai[0];
        for (int i=0; i<nilai.length;i++) {
            System.out.println("Nilai mahasiswa ke-"+i+" : "+nilai[i]);
            if(max < nilai[i]){
                max = nilai[i];
            } else if (min > nilai[i]){
                min = nilai[i];
            }
        }
        
        System.out.println();
        System.out.println("Nilai terbesar : " + max);
        System.out.println("Nilai terkecil : " + min);
        
        System.out.println();
        System.out.println("Petugas : " + namaPetugas);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Developed by : Fermi Naufal Akbar");
        
    }
    
    public static int[] inputNilai(int jmlhMhs) {
        Scanner scanner = new Scanner(System.in);
        int[] nilaiMhs = new int[jmlhMhs];
        for(int i=0; i<jmlhMhs; i++) {
            System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+" : ");
            int nilai = scanner.nextInt();
            nilaiMhs[i] = nilai;
        }
        return nilaiMhs;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        penentuNilai();
    }
    
}
