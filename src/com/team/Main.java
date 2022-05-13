package com.team;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String menu1, menu2, menu3, menu4, menu5, menu6, menu7, menu8, menu9;
        String nama, member;
        int pesanMenu1 = 0, pesanMenu2 = 0, pesanMenu3 = 0, pesanMenu4 = 0, pesanMenu5 = 0, pesanMenu6 = 0, pesanMenu7 = 0, pesanMenu8 = 0, pesanMenu9 = 0;
        int jmlOrang;
        double tMenu1, tMenu2, tMenu3, tMenu4, tMenu5, tMenu6, tMenu7, tMenu8, tMenu9;
        double hargaSub, pajak, hargaDisc, totalPembayaran;
        Scanner input = new Scanner(System.in);

        // inisialisasi menu
        menu1 = "kopiHitam";
        menu2 = "kopiSusu";
        menu3 = "kopiTarik";
        menu4 = "tehSusu";
        menu5 = "tehTarik";
        menu6 = "tehMelati";
        menu7 = "jusMangga";
        menu8 = "jusJambu";
        menu9 = "jusSemangka";

        System.out.println("");
        System.out.println("\t\t\t\t\t==========================================");
        System.out.println("\t\t\t\t\t||\t\t\t\tDream Cafe\t\t\t\t||");
        System.out.println("\t\t\t\t\t||    'Melayani dengan sepenuh hati'    ||");
        System.out.println("\t\t\t\t\t==========================================");

        System.out.println("\n\tDaftar Menu: ");
        System.out.println("\t=================================================================================");
        System.out.println("\t1. " + daftarMenu(menu1) + "\t\t\t\t\t\t\t\t\t@\tRp  " + String.format("%.2f", daftarHarga(menu1)));
        System.out.println("\t2. " + daftarMenu(menu2) + "\t\t\t\t\t\t\t\t\t@\tRp  " + String.format("%.2f", daftarHarga(menu2)));
        System.out.println("\t3. " + daftarMenu(menu3) + "\t\t\t\t\t\t\t\t\t@\tRp  " + String.format("%.2f", daftarHarga(menu3)));
        System.out.println("\t4. " + daftarMenu(menu4) + "\t\t\t\t\t\t\t\t\t\t@\tRp  " + String.format("%.2f", daftarHarga(menu4)));
        System.out.println("\t5. " + daftarMenu(menu5) + "\t\t\t\t\t\t\t\t\t@\tRp  " + String.format("%.2f", daftarHarga(menu5)));
        System.out.println("\t6. " + daftarMenu(menu6) + "\t\t\t\t\t\t\t\t\t@\tRp  " + String.format("%.2f", daftarHarga(menu6)));
        System.out.println("\t7. " + daftarMenu(menu7) + "\t\t\t\t\t\t\t\t\t@\tRp  " + String.format("%.2f", daftarHarga(menu7)));
        System.out.println("\t8. " + daftarMenu(menu8) + "\t\t\t\t\t\t\t\t\t@\tRp  " + String.format("%.2f", daftarHarga(menu8)));
        System.out.println("\t9. " + daftarMenu(menu9) + "\t\t\t\t\t\t\t\t\t@\tRp  " + String.format("%.2f", daftarHarga(menu9)));
        System.out.println("\t=================================================================================");

        System.out.print("\n\tPesanan untuk berapa orang       : ");
        jmlOrang = input.nextInt();
        System.out.print("\tPesanan atas nama                : ");
        nama = input.next();
        System.out.print("\tApakah menjadi member (ya/tidak) : ");
        member = input.next();

        System.out.println("\n\tPesanan atas nama " + nama.toUpperCase() + " : \n");

        System.out.print("\t1. " + daftarMenu(menu1) + "\t: ");
        pesanMenu1 = input.nextInt();
        System.out.print("\t2. " + daftarMenu(menu2) + "\t: ");
        pesanMenu2 = input.nextInt();
        System.out.print("\t3. " + daftarMenu(menu3) + "\t: ");
        pesanMenu3 = input.nextInt();
        System.out.print("\t4. " + daftarMenu(menu4) + "\t\t: ");
        pesanMenu4 = input.nextInt();
        System.out.print("\t5. " + daftarMenu(menu5) + "\t: ");
        pesanMenu5 = input.nextInt();
        System.out.print("\t6. " + daftarMenu(menu6) + "\t: ");
        pesanMenu6 = input.nextInt();
        System.out.print("\t7. " + daftarMenu(menu7) + "\t: ");
        pesanMenu7 = input.nextInt();
        System.out.print("\t8. " + daftarMenu(menu8) + "\t: ");
        pesanMenu8 = input.nextInt();
        System.out.print("\t9. " + daftarMenu(menu9) + "\t: ");
        pesanMenu9 = input.nextInt();

        // perhitungan harga per makanan
        tMenu1 = pesanMenu1 * daftarHarga(menu1);
        tMenu2 = pesanMenu2 * daftarHarga(menu2);
        tMenu3 = pesanMenu3 * daftarHarga(menu3);
        tMenu4 = pesanMenu4 * daftarHarga(menu4);
        tMenu5 = pesanMenu5 * daftarHarga(menu5);
        tMenu6 = pesanMenu6 * daftarHarga(menu6);
        tMenu7 = pesanMenu7 * daftarHarga(menu7);
        tMenu8 = pesanMenu8 * daftarHarga(menu8);
        tMenu9 = pesanMenu9 * daftarHarga(menu9);

        // perhitungan total harga seluruh item menu
        hargaSub = tMenu1 + tMenu2 + tMenu3 + tMenu4 + tMenu5 + tMenu6 + tMenu7 + tMenu8 + tMenu9;

        // perhitungan harga pajak
        pajak = hargaSub * 0.1;

        // perhitungan harga diskon untuk member
        switch (member){
            case "ya":
                hargaDisc = hargaSub * 0.05;
                break;
            case "tidak":
                hargaDisc = hargaSub * 0;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + member);
        }

        // perhitungan total pembayaran
        totalPembayaran = hargaSub + pajak - hargaDisc;

        System.out.println("\n\t=================================================================================");
        System.out.println("\t=================================================================================");
        System.out.println("\n\tNota Pembelian: ");
        System.out.println("");
        System.out.println("\t\t\t\t\t==========================================");
        System.out.println("\t\t\t\t\t||\t\t\t\tDream Cafe\t\t\t\t||");
        System.out.println("\t\t\t\t\t||    'Melayani dengan sepenuh hati'    ||");
        System.out.println("\t\t\t\t\t==========================================\n");

        System.out.println("\tKasir   : TEAM6");
        System.out.println("\tPesanan : " + jmlOrang + " orang");
        System.out.println("\tMember  : " + member.toUpperCase());
        System.out.println("\n\tMinuman \t\t\t\t\t\t\t\t\t   Qty\t\t\tHarga");
        System.out.println("\t=================================================================================");
        System.out.println("\t1. " + daftarMenu(menu1) + "\t\t\t\t\t\t\t\t\t" + pesanMenu1 + "\t\tRp  " + String.format("%.2f", tMenu1));
        System.out.println("\t2. " + daftarMenu(menu2) + "\t\t\t\t\t\t\t\t\t" + pesanMenu2 + "\t\tRp  " + String.format("%.2f", tMenu2));
        System.out.println("\t3. " + daftarMenu(menu3) + "\t\t\t\t\t\t\t\t\t" + pesanMenu3 + "\t\tRp  " + String.format("%.2f", tMenu3));
        System.out.println("\t4. " + daftarMenu(menu4) + "\t\t\t\t\t\t\t\t\t\t" + pesanMenu4 + "\t\tRp  " + String.format("%.2f", tMenu4));
        System.out.println("\t5. " + daftarMenu(menu5) + "\t\t\t\t\t\t\t\t\t" + pesanMenu5 + "\t\tRp  " + String.format("%.2f", tMenu5));
        System.out.println("\t6. " + daftarMenu(menu6) + "\t\t\t\t\t\t\t\t\t" + pesanMenu6 + "\t\tRp  " + String.format("%.2f", tMenu6));
        System.out.println("\t7. " + daftarMenu(menu7) + "\t\t\t\t\t\t\t\t\t" + pesanMenu7 + "\t\tRp  " + String.format("%.2f", tMenu7));
        System.out.println("\t8. " + daftarMenu(menu8) + "\t\t\t\t\t\t\t\t\t" + pesanMenu8 + "\t\tRp  " + String.format("%.2f", tMenu8));
        System.out.println("\t9. " + daftarMenu(menu9) + "\t\t\t\t\t\t\t\t\t" + pesanMenu9 + "\t\tRp  " + String.format("%.2f", tMenu9));
        System.out.println("\t=================================================================================");
        System.out.println("\tSubtotal Pembelian\t\t\t\t\t\t\t\t\t\t" + "Rp  " + String.format("%.2f", hargaSub));
        System.out.println("\tPajak [10%]\t\t\t\t\t\t\t\t\t\t\t\t" + "Rp  " + String.format("%.2f", pajak));
        System.out.println("\tDisc. 5% [Khusus Member]\t\t\t\t\t\t\t\t" + "Rp  " + String.format("%.2f", hargaDisc));
        System.out.println("\t=================================================================================");
        System.out.println("\tTotal Pembayaran\t\t\t\t\t\t\t\t\t\t" + "Rp  " + String.format("%.2f", totalPembayaran));

        System.out.println("\n\n\t\t\t\t\t\tTerima kasih telah memilih kami");
        System.out.println("\t\t\t\t\t\t\tSilakan datang kembali...\n");
    }

    // deklarasi nama menu
    public static String daftarMenu(String menu) {
        if (Objects.equals(menu, "kopiHitam")) {
            menu = "Kopi Hitam";
        } else if (Objects.equals(menu, "kopiSusu")) {
            menu = "Kopi Susu";
        } else if (Objects.equals(menu, "kopiTarik")) {
            menu = "Kopi Tarik";
        } else if (Objects.equals(menu, "tehSusu")) {
            menu = "Teh Susu";
        } else if (Objects.equals(menu, "tehTarik")) {
            menu = "Teh Tarik";
        } else if (Objects.equals(menu, "tehMelati")) {
            menu = "Teh Melati";
        } else if (Objects.equals(menu, "jusMangga")) {
            menu = "Jus Mangga";
        } else if (Objects.equals(menu, "jusJambu")) {
            menu = "Jus Jambu";
        } else if (Objects.equals(menu, "jusSemangka")) {
            menu = "Jus Semangka";
        } else {
            System.out.print("Menu tidak tersedia");
        }
        return menu;
    }

    // deklarasi harga per menu
    public static float daftarHarga(String menu) {
        float harga = 0;
        if (Objects.equals(menu, "kopiHitam")) {
            harga = 10000;
        } else if (Objects.equals(menu, "kopiSusu")) {
            harga = 12000;
        } else if (Objects.equals(menu, "kopiTarik")) {
            harga = 14000;
        } else if (Objects.equals(menu, "tehSusu")) {
            harga = 10000;
        } else if (Objects.equals(menu, "tehTarik")) {
            harga = 12000;
        } else if (Objects.equals(menu, "tehMelati")) {
            harga = 14000;
        } else if (Objects.equals(menu, "jusMangga")) {
            harga = 15000;
        } else if (Objects.equals(menu, "jusJambu")) {
            harga = 15000;
        } else if (Objects.equals(menu, "jusSemangka")) {
            harga = 15000;
        } else {
            System.out.print("Menu tidak tersedia");
        }
        return harga;
    }
}
