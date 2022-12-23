public abstract class JenisKursus implements Receipt{
    protected String name;
    protected int fee;

    public JenisKursus(String name, int fee) {
        this.name = name;
        this.fee = fee;
    }
    public abstract int getFee();
    public abstract void daftar();
    public abstract int harga(int biaya, int hari);

    public void cetakStruk(String nama, int id, String nama_kursus, String jenis_kelas, int biaya){

    }

}
