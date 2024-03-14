public class Tugas implements Comparable<Tugas> {
    String mataKuliah;
    String namaTugas;
    String deadline;

    public Tugas(String mataKuliah, String namaTugas, String deadline) {
        this.mataKuliah = mataKuliah;
        this.namaTugas = namaTugas;
        this.deadline = deadline;
    }

    @Override
    public int compareTo(Tugas other) {
        // Implementasi untuk pengurutan berdasarkan deadline
        return this.deadline.compareTo(other.deadline);
    }

    @Override
    public String toString() {
        return "Mata Kuliah = " + this.mataKuliah + ", Tugas = " + this.namaTugas + ", Deadline = " + this.deadline;
    }
}
