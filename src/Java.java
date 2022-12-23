import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Java extends JenisKursus{

    Scanner in = new Scanner(System.in);
    public Java(){
        super("Java",45000);
    }
    public int bayar ;
    @Override
    public int getFee() {
        return fee;
    }
    public int hari;
    public void daftar(){
        System.out.println("\n------------------------------------------");
        System.out.println(" Kursus " + name);
        System.out.println(" Harga / hari : "+getFee());
        System.out.println(" Daftar? (1/0) ");
        int a = in.nextInt();
        if (a == 1){
            System.out.println("\nMasukkan jumlah hari : ");
            hari = in.nextInt();
            System.out.println("Anda telah memilih kursus Java!");
            //mentotalkan jumlah yang harus dibayar
            bayar = harga(getFee(),hari);
            System.out.println("Total Harga : "+bayar);
        }
        else {
            System.out.println("Kembali");
        }
    }
    public int harga(int biaya, int hari){
        return biaya*hari;
    }
    public void cetakStruk(String nama, int id, String tgl,int durasi, String nama_kursus, String jenis_kelas, int biaya){
        try {
            // membuat object BufferedWriter dengan menggunakan object FileWriter
            BufferedWriter tulis = new BufferedWriter(new FileWriter("src\\struk.txt"));
            // menulis string ke file
            tulis.write("=================================\n");
            tulis.write("\t\tSTRUK PENDAFTARAN \n");
            tulis.write("=================================\n");
            tulis.write("Tanggal Masuk : "+tgl+"\n");
            tulis.write("Nama          : " + nama + "\n");
            tulis.write("ID            : " + id + "\n");
            tulis.write("Nama Kursus   : " + nama_kursus+"\n");
            tulis.write("Jenis Kelas   : " + jenis_kelas+"\n");
            tulis.write("Durasi        : "+durasi+"\n");
            tulis.write("Total Biaya   : " + biaya+"\n");
            tulis.write("=================================\n\n");
            // menutup file
            tulis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
