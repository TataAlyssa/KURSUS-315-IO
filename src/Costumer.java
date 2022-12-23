import java.util.Scanner;

public class Costumer{
    String jenis;
    private String namaCost;
    private int idCost;
    private String tglDaft;
    private int biaya;

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public String getTglDaft() {
        return tglDaft;
    }

    public String getNamaCost() {
        return namaCost;
    }

    public int getIdCost() {
        return idCost;
    }

    Scanner in = new Scanner(System.in);

    void input_cost(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan tanggal Daftar : ");
        tglDaft = in.next();
        System.out.println("Masukkan Nama Anda \t: ");
        namaCost = input.next();
        System.out.println("Masukkan Id Anda   \t: ");
        idCost = input.nextInt();
        System.out.println("-----------------------------------------\n");
    }

    // Method yang menangani proses pemilihan tipe kelas (online atau offline)
    public void jenisKelas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("\t--- Pilih Jenis Kelas ---");
        System.out.println("1. Online");
        System.out.println("2. Offline");
        System.out.print("Masukkan pilihan Anda: ");
        int tipeKelas = scanner.nextInt();
        // Validasi tipe kelas yang dimasukkan
        if (tipeKelas == 1){
            jenis = "Online";
            Online on = new Online();
            on.display();
            setBiaya(getBiaya()+on.getHargaTambahan());
            System.out.println("\n----------------------------------------");
        }
        else {
            jenis = "Offline";
            Offline off = new Offline();
            off.display();
            setBiaya(getBiaya()+ off.getHargaTambahan());
            System.out.println("----------------------------------------");
        }
    }
}
