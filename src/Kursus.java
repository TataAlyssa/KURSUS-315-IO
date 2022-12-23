import java.util.Scanner;
public class Kursus {   //menyimpan data siswa
    private String nama;
    private int id;
    private String namaKursus;
    private String jenisKelas;
    private String tanggalMasuk;
    private int durasi;

    //construktor
    public Kursus(String nama, int id, String namaKursus, String jenisKelas, String tanggalMasuk, int durasi) {
        this.nama = nama;
        this.id = id;
        this.namaKursus = namaKursus;
        this.jenisKelas = jenisKelas;
        this.tanggalMasuk = tanggalMasuk;
        this.durasi = durasi;
    }

    public String getNama() {
        return nama;
    }

    public int getId() {
        return id;
    }

    public String getNamaKursus() {
        return namaKursus;
    }

    public String getJenisKelas() {
        return jenisKelas;
    }

    public String getTanggalMasuk() {
        return tanggalMasuk;
    }

    public int getDurasi() {
        return durasi;
    }
}
