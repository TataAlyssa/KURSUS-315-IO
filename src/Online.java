public class Online extends Kelas{
    private int hargaTambahan = 0;

    public int getHargaTambahan() {
        return hargaTambahan;
    }

    @Override
    public void display() {
        System.out.println("Anda memilih Kelas Online, tanpa biaya tambahan");
    }

}