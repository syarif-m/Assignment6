import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia("Ahmad Syarif", true, "1234567890", true);
        System.out.println(manusia.toString());
        System.out.println();
        Manusia manusia2 = new Manusia("Siti Aisyah", false, "0987654321", true);
        System.out.println(manusia2.toString());
        System.out.println();
        Manusia manusia3 = new Manusia("Budi Santoso", true, "1122334455", false);
        System.out.println(manusia3.toString());
        System.out.println();
        System.out.println();

        mahasiswaFILKOM mahasiswa1 = new mahasiswaFILKOM("Ahmed", true, "12345871", true, "2500017123", 2.9);
        System.out.println(mahasiswa1.toString());
        System.out.println();
        mahasiswaFILKOM mahasiswa2 = new mahasiswaFILKOM("Siti", false, "233213231", false, "2500017124", 3.4);
        System.out.println(mahasiswa2.toString());
        System.out.println();
        mahasiswaFILKOM mahasiswa3 = new mahasiswaFILKOM("Budi", true, "321321321", true, "2500017125", 3.6);
        System.out.println(mahasiswa3.toString());
        System.out.println();
        System.out.println();

        Pekerja p1 = new Pekerja("Budi", true, "123456", true, 5000, LocalDate.of(2024, 1, 15), 2);
        System.out.println(p1.toString());
        System.out.println();
        Pekerja p2 = new Pekerja("Siti", false, "654321", false, 5500, LocalDate.of(2017, 1, 10), 0);
        System.out.println(p2.toString());
        System.out.println();
        Pekerja p3 = new Pekerja("Ahmad", true, "789012", true, 5750, LocalDate.of(2006, 1, 5), 10);
        System.out.println(p3.toString());
        System.out.println();
        System.out.println();

        Manager m1 = new Manager("Budi", true, "123456", true, 7500, "IT");
        System.out.println(m1.toString());
    }
}
