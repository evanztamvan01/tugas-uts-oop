import services.*;
import entity.*;
import java.util.*;

public class Aplikasi {

    private static LaptopServices service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new LaptopServices();
        scanner = new Scanner(System.in);

        int opsi = 5;
        do {
            showMenu();
            try {
                scanner = new Scanner(System.in);
                opsi = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.err.println("Inputan salah, coba untuk memilih sesuai menu");
                opsi = 0;
            } catch(NoSuchElementException e) {
                System.err.println("Scanner ketutup");
                opsi = 0;
            }
            prosesOpsi(opsi);
        } while(opsi != 5);
    }

    private static void prosesOpsi(int pilihan) {
        switch(pilihan) {
            case 1:
                showFormTambahData();
                break;
            case 2:
                showFormEditData();
                break;
            case 3:
                showDeleteData();
                break;
            case 4:
                service.showAllData();
                break;
            case 5:
                System.out.println("================================\n" +
                                   "Terima kasih telah berkunjung :)\n" +
                                   "================================");
        }
    }

    private static void showDeleteData() {
        scanner = new Scanner(System.in);
        System.out.println("\n--== Form Hapus Data ==--");
        System.out.print("ID : ");
        String id = scanner.nextLine();
        service.deleteData(id);
    }

    private static void showFormEditData() {
        scanner = new Scanner(System.in);
        String id, nama, merk, tipe;

        System.out.println("\n--== Form Ubah Data ==--");
        System.out.print("ID   : ");
        id = scanner.nextLine();
        System.out.print("NAMA : ");
        nama = scanner.nextLine();
        System.out.print("MERK : ");
        merk = scanner.nextLine();
        System.out.print("TIPE : ");
        tipe = scanner.nextLine();
        service.updateData(new StokLaptop(id, nama, merk, tipe));
    }

    private static void showFormTambahData() {
        scanner = new Scanner(System.in);
        String id, nama, merk, tipe;

        System.out.println("\n--== Form Entry Data ==--");
        System.out.print("ID   : ");
        id = scanner.nextLine();
        System.out.print("NAMA : ");
        nama = scanner.nextLine();
        System.out.print("MERK : ");
        merk = scanner.nextLine();
        System.out.print("TIPE : ");
        tipe = scanner.nextLine();
        service.addData(new StokLaptop(id, nama, merk, tipe));
    }

    private static void showMenu() {
        System.out.println("--== Aplikasi Stok Laptop di Gudang ==--");
        System.out.println("1. Tambah Data Laptop");
        System.out.println("2. Ubah Data Laptop");
        System.out.println("3. Hapus Data Laptop");
        System.out.println("4. Tampilkan Data Laptop");
        System.out.println("5. KELUAR");
        System.out.println("----------------------------------------");
        System.out.print  ("pilihan > ");
    }
}