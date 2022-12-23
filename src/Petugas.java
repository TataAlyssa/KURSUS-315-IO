import java.util.ArrayList;
import java.util.List;

public class Petugas {

    // array list untuk data siswa yang masuk
    List<Kursus> dataKursus = new ArrayList<>();

    //fungsi login
    public boolean login(String user, String password) {
        // Cek apakah username dan password sesuai dengan yang ada di database
        if (user.equals("admin") && password.equals("pass")) {
            return true;
        } else {
            return false;
        }
    }
    public void lihat(){
        tampilkanData(dataKursus);
    }
    public static void tampilkanData(List<Kursus> dataKursus){
        System.out.println("Daftar Keseluruhan Siswa : ");
        for (int i=0; i< dataKursus.size(); i++){
            Kursus kursus = dataKursus.get(i);
            System.out.println("Data Siswa ke-"+(i+1));
            System.out.println("Nama            : "+kursus.getNama());
            System.out.println("ID              : "+kursus.getId());
            System.out.println("Nama Kursus     : "+kursus.getNamaKursus());
            System.out.println("Tanggal Masuk   : "+kursus.getTanggalMasuk());
            System.out.println("Jenis Kelas     : "+kursus.getJenisKelas());
            System.out.println("Durasi          : "+kursus.getDurasi());
        }
    }
    public void tambahData(String nama, int id, String namaKursus, String tanggalMasuk, String jenisKelas, int durasi){
        dataKursus.add(new Kursus(nama,id,namaKursus,jenisKelas,tanggalMasuk,durasi));
    }
    public void hapus(int a){
        dataKursus.remove(a);
    }


}
