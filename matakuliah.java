public class matakuliah {
    String nama;

    public matakuliah(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mata Kuliah = " + this.nama;
    }
}
