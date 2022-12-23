import java.util.Scanner;
public class Main {
        Main(){
            System.out.println("\t\t\t ~~Selamat Datang~~");
        }
        //prosedur
        static void iya(String helium){
            System.out.println(helium);
        }
        static void name(){
            System.out.println("||   APLIKASI PENDAFTARAN KURSUS WebOperation  ||");
        }
        static void line(){
            System.out.println("=================================================");
        }


        public static void main(String[] args){
            Petugas ptg = new Petugas();
            Scanner in = new Scanner(System.in);
            Main tata= new Main();
            iya("\t\t\tdiprogram tata alyssa");
            iya("\t\t\t\t 2100018315");

            //Pemanggilan Prosedur
            line();
            name();
            line();

            int a = 0;
            while (a!= 3){
                System.out.println("\n+----------------------+");
                System.out.println("\tMasuk Sebagai : ");
                System.out.println("+----------------------+");
                System.out.println("1. Petugas");
                System.out.println("2. Siswa");
                System.out.println("3. Keluar");
                a = in.nextInt();
                if (a == 1){
                    boolean isSuccess = false;
                    while (!isSuccess){
                        System.out.println("|| Login Terlebih Dahulu ||\n");
                        System.out.println("Masukkan Username : ");
                        String user = in.next();
                        System.out.println("Masukkan Password : ");
                        String pass = in.next();
                        System.out.println("+--------------------------+");
                        isSuccess = ptg.login(user,pass);
                        if (isSuccess) {
                            System.out.println("Login berhasil!");
                            int cv = 0;
                            while (cv != 3){
                                System.out.println("\n+------------------------+");
                                System.out.println("\tTampilan Menu : ");
                                System.out.println("+------------------------+");
                                System.out.println("1. Tampilkan Data Seluruh Siswa");
                                System.out.println("2. Hapus Data");
                                System.out.println("3. Kembali");
                                cv = in.nextInt();
                                if (cv == 1){
                                    ptg.lihat();
                                }
                                else if (cv == 2){
                                    System.out.println("Hapus data ke - ");
                                    int x = in.nextInt();
                                    ptg.hapus(x-1);
                                    System.out.println("Data ke-"+x+" berhasil dihapus");
                                }
                                else {
                                    System.out.println("Berhasil Kembali");
                                }
                            }
                        } else {
                            System.out.println("Gagal Masuk! Masukkan kembali Username dan Password");
                        }
                    }
                } else if (a == 2) {
                    int pilih=0;
                    Costumer plg = new Costumer();
                    System.out.println("+-----------------------------+");
                    System.out.println("\tAnda masuk sebagai Siswa");
                    System.out.println("+-----------------------------+");
                    plg.input_cost();
                    while (pilih!=3){
                        System.out.println("+-----------------------------+");
                        System.out.println("\tDaftar Kursus : ");
                        System.out.println("+-----------------------------+");
                        System.out.println("1. Java");
                        System.out.println("2. Python");
                        System.out.println("3. Keluar");
                        pilih = in.nextInt();
                        if (pilih == 1){
                            Java java = new Java();
                            //memanggil daftar() pada java
                            java.daftar();
                            //setBiaya customer
                            plg.setBiaya(plg.getBiaya()+java.bayar);
                            //memilih jenis kelas
                            plg.jenisKelas();

                            System.out.println("Total Biaya : "+plg.getBiaya());
                            System.out.println("Struk Anda Telah Di Cetak!");
                            //Cetak struk bukti pendaftaran
                            java.cetakStruk(plg.getNamaCost(),plg.getIdCost(),plg.getTglDaft(),java.hari, java.name, plg.jenis, plg.getBiaya());
                            ptg.tambahData(plg.getNamaCost(), plg.getIdCost(), java.name, plg.getTglDaft(), plg.jenis,java.hari);
                            System.out.println("----------------------------------------");
                        }
                        else if (pilih == 2){
                            Python py = new Python();
                            //memanggil daftar() pada python
                            py.daftar();
                            //setBiaya customer
                            plg.setBiaya(plg.getBiaya()+ py.bayar);
                            //memilih jenis kelas
                            plg.jenisKelas();

                            System.out.println("Total Biaya : "+plg.getBiaya());
                            System.out.println("Struk telah dicetak!");
                            //Cetak struk bukti pendaftaran
                            py.cetakStruk(plg.getNamaCost(),plg.getIdCost(),plg.getTglDaft(),py.hari, py.name, plg.jenis, plg.getBiaya());
                            ptg.tambahData(plg.getNamaCost(), plg.getIdCost(), py.name, plg.getTglDaft(), plg.jenis,py.hari);
                            System.out.println("----------------------------------------");
                        }
                        else {
                            System.out.println("Anda Berhasil Keluar");
                        }
                    }
                }else{
                    System.out.println("Berhasil Keluar");
                }
            }
        }

}