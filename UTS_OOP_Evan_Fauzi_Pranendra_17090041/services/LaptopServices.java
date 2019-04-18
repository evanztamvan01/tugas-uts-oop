package services;

import java.util.*;
import entity.*;

public class LaptopServices {
    private static List<StokLaptop> data = new LinkedList<StokLaptop>();

    public void addData(StokLaptop slt) {
        data.add(slt);
        System.out.println("=====================\n" +
                           "data telah tersimpan\n" +
                           "=====================");
    }

    public void updateData(StokLaptop slt) {
        int index = data.indexOf(slt);
        if(index >= 0) {
            data.set(index, slt);
            System.out.println("=====================\n" +
                               "data telah berubah\n" +
                               "=====================");
        }
    }

    public void deleteData(String id) {
        int idx = data.indexOf(new StokLaptop(id, "", "", ""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("=====================\n" +
                               "data telah terhapus\n" +
                               "=====================");
        }
    }

    public void showAllData() {
        int i=1;
        System.out.println("\nData di List :" +
                           "\n=====================");
        for(StokLaptop slt : data) {
            System.out.println("data ke-" + i++);
            System.out.println("  ID   : " + slt.getId());
            System.out.println("  NAMA : " + slt.getNama());
            System.out.println("  MERK : " + slt.getMerk());
            System.out.println("  TIPE : " + slt.getTipe());
            System.out.println("=====================");
        }
    }
}