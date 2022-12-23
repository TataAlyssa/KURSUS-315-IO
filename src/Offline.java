public class Offline extends Kelas{
    private int hargaTambahan = 50000;

    public int getHargaTambahan() {
        return hargaTambahan;
    }

    @Override
    public void display() {
        System.out.println("Anda memilih Kelas Offline, Biaya Tambahan : " + hargaTambahan);
    }

}
