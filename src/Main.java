import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner for_string = new Scanner(System.in);
    static Scanner for_double = new Scanner(System.in);
    static Scanner read = null;
    public static void main(String[] args) {
        login();
    }

    public static void login() {
        String usr, pss, username = "", password = "";
        System.out.println("\nPlease login below");
        try {
            File usrnm = new File("C:\\Users\\user\\IdeaProjects\\PTS\\src\\login.txt");
            read = new Scanner(usrnm);
            username = read.nextLine();
            password = read.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            read.close();
        }

        System.out.print("Input Username : ");
        usr = for_string.nextLine();

        System.out.print("Input password : ");
        pss = for_string.nextLine();

        if (usr.equals(username) && pss.equals(password)) {
            System.out.println("login success");
            menu();
        } else {
            System.out.println("login failed please check your username and password");
            login();
        }
    }
    public static void menu() {
        System.out.println("\n============{ Menu }==============");
        System.out.println("1. Luas Bangun datar                ");
        System.out.println("2. Keliling bangun datar            ");
        System.out.println("3. Kalkulator Aritmatika            ");
        System.out.println("4. Change username and password     ");
        System.out.println("0. Exit                             ");
        System.out.println("------------------------------------");

        // input user
        System.out.print("Enter your choice : ");
        String pilih = for_string.nextLine();

        // switch
        switch (pilih) {
            case "1" -> lbd();
            case "2" -> kbd();
            case "3" -> kar();
            case "4" -> change_login();
            case "0" -> System.exit(0);
            default -> {
                System.out.println("Your input is wrong");
                menu();
            }
        }
    }
    public static void lbd() {
        System.out.println("\n========{ Luas bangun datar }========");
        System.out.println("1. persegi                           ");
        System.out.println("2. Persegi Panjang                   ");
        System.out.println("3. Lingkaran                         ");
        System.out.println("4. Segitiga                          ");
        System.out.println("-------------------------------------");

        // input user
        System.out.print("Enter your choice : ");
        String user_input = for_string.nextLine();

        // switch case
        switch (user_input) {
            case "1" -> {
                System.out.print("Input panjang sisi (cm) : ");
                double sisinya = for_double.nextDouble();
                double result = sisinya * sisinya;
                System.out.println("L = s x s");
                System.out.println("L = "+sisinya+" x "+sisinya);
                System.out.println("L = "+result);
                System.out.println("jadi luas persegi tersebut adalah "+result+ " cm");
                System.out.print("press enter to return to menu");
                String exit = for_string.nextLine();
                if (!exit.equals("*")) {
                    menu();
                }
            }
            case "2" -> {
                System.out.print("masukkan panjang (cm) : ");
                double sisinya = for_double.nextDouble();
                System.out.print("Masukkan Lebar (cm) : ");
                double lebarnya = for_double.nextDouble();
                double result = sisinya * lebarnya;
                System.out.println("L = P x L");
                System.out.println("L = "+sisinya+ " x " +lebarnya);
                System.out.println("L = "+result);
                System.out.println("jadi luas persegi panjang tersebut adalah "+result+ " cm");
                System.out.print("press enter to return to menu");
                String exit = for_string.nextLine();
                if (!exit.equals("*")) {
                    menu();
                }
            }
            case "3" -> {
                System.out.print("Masukkan panjang jari jari (cm) : ");
                double jari_jari = for_double.nextDouble();
                double phi_;
                String phi;
                if ((jari_jari % 7) == 0){
                    phi_ = 22.0/7.0;
                    phi = "22/7";
                } else {
                    phi_ = Math.PI;
                    phi = "3,14";
                }
                double result_lingkaran = phi_ * jari_jari * jari_jari;
                System.out.println("L = phi x r x r");
                System.out.println("L = "+phi+" x "+jari_jari+ " x " +jari_jari);
                System.out.println("L = "+result_lingkaran);
                System.out.println("jadi luas lingkaran tersebut adalah "+result_lingkaran+ " cm");
                System.out.print("press enter to return to menu");
                String exit = for_string.nextLine();
                if (!exit.equals("*")) {
                    menu();
                }
            }
            case "4" -> {
                System.out.print("Masukkan ukuran alas (cm) : ");
                double alas = for_double.nextDouble();
                System.out.print("Masukkan ukuran tinggi (cm) : ");
                double tinggi = for_double.nextDouble();
                double result_segitiga = 0.5 * alas * tinggi;
                System.out.println("L = 1/2 x a x t");
                System.out.println("L = 1/2 x "+alas+" x "+tinggi);
                System.out.println("L = "+result_segitiga);
                System.out.println("jadi luas dari segitita tersebut adalah : "+result_segitiga+ " cm");
                System.out.print("press enter to return to menu");
                String exit = for_string.nextLine();
                if (!exit.equals("*")) {
                    menu();
                }
            }
            default -> {
                System.out.println("Failed to process your request, please input again");
                lbd();
            }
        }

    }
    public static void kbd() {
        System.out.println("========{ Keliling bangun datar }========");
        System.out.println("1. persegi                               ");
        System.out.println("2. Persegi Panjang                       ");
        System.out.println("3. Lingkaran                             ");
        System.out.println("4. Segitiga                              ");
        System.out.println("-----------------------------------------");
        System.out.println();

        // input user
        System.out.println("Enter your choice : ");
        String user_input = for_string.nextLine();

        switch (user_input) {
            case "1" -> {
                System.out.print("Input ukuran sisi (cm) : ");
                double sisi = for_double.nextDouble();
                double result_persegi = 4 * sisi;
                System.out.println("K = 4 x s");
                System.out.println("K = 4 x "+sisi);
                System.out.println("K = "+result_persegi);
                System.out.println("jadi keliling persegi diatas adalah : "+result_persegi+ "(cm)");
                System.out.print("press enter to return to menu");
                String exit = for_string.nextLine();
                if (!exit.equals("*")) {
                    menu();
                }
            }
            case "2" -> {
                System.out.print("Masukkan ukuran panjang sisi (cm) : ");
                double panjang = for_double.nextDouble();
                System.out.print("Masukkan ukuran lebar (cm) : ");
                double lebar = for_double.nextDouble();
                double result_persegi_panjang = 2 * (panjang + lebar);
                double result_persegi_panjang_2 = panjang + lebar;
                System.out.println("K = 2 x (p+l)");
                System.out.println("K = 2 x ("+panjang+"+"+lebar+")" );
                System.out.println("K = 2 x ("+result_persegi_panjang_2+")");
                System.out.println("K = "+result_persegi_panjang);
                System.out.println();
                System.out.println("Jadi keliling dari persegi panjang tersebut adalah : "+result_persegi_panjang);
                System.out.print("press enter to return to menu");
                String exit = for_string.nextLine();
                if (!exit.equals("*")) {
                    menu();
                }
            }
            case "3" -> {
                System.out.println("Input ukuran diameter (cm) : ");
                double diameter = for_double.nextDouble();
                double phi_;
                String phi;
                if ((diameter % 7) == 0){
                    phi_ = 22.0/7.0;
                    phi = "22/7";
                } else {
                    phi_ = Math.PI;
                    phi = "3,14";
                }
                double result_lingkaran = phi_ * diameter;
                System.out.println("K = phi x d");
                System.out.println("K = "+phi+" x "+diameter);
                System.out.println("K = "+result_lingkaran);
                System.out.println("Jadi keliling lingkaran diatas adalah : "+result_lingkaran+ "(cm)");
                System.out.print("press enter to return to menu");
                String exit = for_string.nextLine();
                if (!exit.equals("*")) {
                    menu();
                }
            }
            case "4" -> {
                System.out.print("Input ukuran sisi 1 : ");
                double sisi_a = for_double.nextDouble();
                System.out.print("Input ukuran sisi 2 : ");
                double sisi_b = for_double.nextDouble();
                System.out.print("Input ukuran sisi 3 : ");
                double sisi_c = for_double.nextDouble();
                double result_segitiga = sisi_a + sisi_b + sisi_c;
                System.out.println("K = sisi a + sisi b + sisi c");
                System.out.println("K = "+sisi_a+" + "+sisi_b+" + "+sisi_c);
                System.out.println("K = "+result_segitiga);
                System.out.println("Jadi keliling segitiga diatas adalah : "+result_segitiga);
                System.out.print("press enter to return to menu");
                String exit = for_string.nextLine();
                if (!exit.equals("*")) {
                    menu();
                }
            }
            default -> {
                System.out.println("Failed to process your request, please input again");
                kbd();
            }
        }
    }
    public static void kar() {
        System.out.println("\n========{ Kalkulator aritmatika }========");
        System.out.println("1. Kalkulator bilangan                   ");
        System.out.println("2. Deret bilangan                        ");
        System.out.println("-----------------------------------------");

        System.out.print("Enter your choice : ");
        String choice = for_string.nextLine();

        switch (choice) {
            case "1" -> calculator();
            case "2" -> dgg();
        }
    }
    public static void calculator() {
        double number1, number2, result;
        String symbol;

        // input data
        System.out.print("Input angka1 : ");
        number1 = for_double.nextDouble();
        System.out.print("Input angka2 : ");
        number2 = for_double.nextDouble();
        System.out.print("(+) (-) (x) (/) (%): ");
        symbol = for_string.nextLine();

        // switch case
        switch (symbol) {
            case "+" -> {
                // penambahan
                result = number1 + number2;
                System.out.println(" Hasil penambahan " + result);
                System.out.println("press enter to return to menu");
                String exit = for_string.nextLine();
                if (!exit.equals("*")) {
                    menu();
                }
            }
            case "-" -> {
                // pengurangan
                result = number1 - number2;
                System.out.println(" Hasil pengurangan " + result);
                System.out.println("press enter to return to menu");
                String exit = for_string.nextLine();
                if (!exit.equals("*")) {
                    menu();
                }
            }
            case "x" -> {
                // perkalian
                result = number1 * number2;
                System.out.println(" Hasil perkalian " + result);
                System.out.println("press enter to return to menu");
                String exit = for_string.nextLine();
                if (!exit.equals("*")) {
                    menu();
                }
            }
            case "/" -> {
                // pembagian
                result = number1 / number2;
                System.out.println(" Hasil pembagian " + result);
                System.out.println("press enter to return to menu");
                String exit = for_string.nextLine();
                if (!exit.equals("*")) {
                    menu();
                }
            }
            case "%" -> {
                // Hasil habis bagi
                result = number1 % number2;
                System.out.println(" Hasil sisa bagi : " + result);
                System.out.println("press enter to return to menu");
                String exit = for_string.nextLine();
                if (!exit.equals("*")) {
                    menu();
                }
            }
            default -> {
                System.out.println("Failed to process your request, please input again");
                kar();
            }
        }
    }
    public static void dgg() {
        int awal, akhir;
        System.out.println("\n========{ Deret bilangan }========");
        System.out.println("1. Ganjil                       ");
        System.out.println("2. Genap                        ");
        System.out.println("--------------------------------");

        System.out.println("Input your choice : ");
        String choice = for_string.nextLine();

        switch (choice) {
            case "1" -> {
                System.out.print("Input angka awal : ");
                awal = for_double.nextInt();
                System.out.print("Input angka akhir :");
                akhir = for_double.nextInt();
                while (awal <= akhir) {
                    awal++;
                    if ((awal % 2) == 1) {
                        System.out.println("Perulangan ke - "+awal);
                    }
                }
                System.out.println("Perulangan telah selesai");
                System.out.println("press enter to return to menu");
                String exit = for_string.nextLine();
                if (!exit.equals("*")) {
                    menu();
                }
            }
            case "2" -> {
                System.out.print("Input angka awal : ");
                awal = for_double.nextInt();
                System.out.print("Input angka akhir :");
                akhir = for_double.nextInt();
                while (awal <= akhir) {
                    awal++;
                    if ((awal % 2) == 0) {
                        System.out.println("Perulangan ke - "+awal);
                    }
                }
                System.out.println("Perulangan telah selesai");
                System.out.print("press enter to return to menu");
                String exit = for_string.nextLine();
                if (!exit.equals("*")) {
                    menu();
                }
            }
            default -> {
                System.out.println("Failed to process your request, please input again");
                dgg();
            }
        }
    }
    public static void change_login(){
        System.out.println("\nPlease input your old username and password");
        String usr, pss, username = "", password = "", new_user, new_pass;
        try {
            File usrnm = new File("C:\\Users\\user\\IdeaProjects\\PTS\\src\\login.txt");
            read = new Scanner(usrnm);
            username = read.nextLine();
            password = read.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        } finally {
            read.close();
        }

        do {
            System.out.print("Input Username : ");
            usr = for_string.nextLine();

            System.out.print("Input password : ");
            pss = for_string.nextLine();

        } while (!usr.equals(username) && !pss.equals(password));

        System.out.println("let's change your username and password");
        System.out.print("Input new username : ");
        new_user = for_string.nextLine();
        System.out.print("Input new password : ");
        new_pass = for_string.nextLine();

        // Write to file
        try {
            FileWriter new_login = new FileWriter("C:\\Users\\user\\IdeaProjects\\PTS\\src\\login.txt");
            new_login.write(new_user+"\n");
            new_login.write(new_pass);
            new_login.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
        System.out.println("Your password was changed");
        System.out.print("Press enter to return to menu");
        String exit = for_string.nextLine();
        if (!exit.equals("*")) {
            menu();
        }
    }
}