import java.time.LocalTime;
import java.util.Scanner;

public class Day100Clone {

    public static void main(String[] args) {
        // Meminta nama pengguna
        String nama = InputHandler.getNama();

        // Mendapatkan pesan berdasarkan waktu
        String pesan = TimeGreeting.getGreeting();

        // Menampilkan output
        OutputHandler.displayMessage(pesan, nama);
    }
}

// Kelas untuk menangani input
class InputHandler {
    public static String getNama() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        return scanner.next();
    }
}

// Kelas untuk menentukan salam berdasarkan waktu
class TimeGreeting {
    public static String getGreeting() {
        LocalTime now = LocalTime.now();
        LocalTime terbit = LocalTime.of(6, 0);
        LocalTime pagi = LocalTime.of(11, 59);
        LocalTime siang = LocalTime.of(12, 0);
        LocalTime sore = LocalTime.of(16, 59);
        LocalTime malam = LocalTime.of(17, 0);
        LocalTime malamTengah = LocalTime.of(23, 59);

        if (now.isAfter(terbit) && now.isBefore(pagi)) {
            return "Selamat pagi";
        } else if (now.isAfter(pagi) && now.isBefore(siang)) {
            return "Selamat malam"; // Mengganti "Selamat siang" menjadi "Selamat malam"
        } else if (now.isAfter(siang) && now.isBefore(sore)) {
            return "Selamat malam"; // Mengganti "Selamat sore" menjadi "Selamat malam"
        } else if (now.isAfter(sore) && now.isBefore(malamTengah)) {
            return "Selamat malam"; // Tetap "Selamat malam"
        } else {
            return "Selamat malam"; // Tetap "Selamat malam"
        }
    }
}

// Kelas untuk menangani output
class OutputHandler {
    public static void displayMessage(String pesan, String nama) {
        String isi = pesan + ", " + nama;
        String selesai = "Program Anda Telah Selesai";
        String[] messages = {isi, selesai};

        int lebarKotak = 50; // Lebar kotak

        // Garis atas
        printBorder(lebarKotak);

        // Tampilkan pesan rata tengah
        for (String message : messages) {
            printCenteredMessage(message, lebarKotak);
        }

        // Garis bawah
        printBorder(lebarKotak);
    }

    private static void printBorder(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    private static void printCenteredMessage(String message, int width) {
        int padding = (width - 2 - message.length()) / 2;
        int paddingRight = width - 2 - message.length() - padding;

        System.out.print("|");
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.print(message);
        for (int i = 0; i < paddingRight; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}
