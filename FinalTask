import java.util.Scanner;

public class FinalTask {
    public static void main(String[] args) {
        // BISMILLAH
        Scanner input = new Scanner(System.in);

        // Intro
        System.out.println("HALO HALO INI ADALAH PROGRAM NENTUIN ZODIAK");
        System.out.print("Enter untuk lanjut yaa");
        input.nextLine();

        // Array untuk menyimpan jodoh setiap zodiak
        String[] jodohArray = {
                "Sagitarius, Aries, Gemini, Libra",  // Aquarius
                "Taurus, Cancer, Capricorn, Scorpio", // Pisces
                "Libra, Leo, Sagitarius", // Aries
                "Taurus, Virgo, Capricorn", // Taurus
                "Aries, Leo, Libra", // Gemini
                "Pisces, Scorpio, Taurus", // Cancer
                "Aries, Sagitarius, Gemini", // Leo
                "Taurus, Capricorn, Cancer", // Virgo
                "Gemini, Aquarius, Libra", // Libra
                "Cancer, Virgo, Capricorn", // Scorpio
                "Leo, Aries, Libra", // Sagitarius
                "Pisces, Scorpio, Taurus" // Capricorn
        };

        // Array untuk menyimpan sifat cowo
        String[] SifatCowoArr = {
                "Cowo Aquarius ini mandiri, berpikiran terbuka, dan berkomitmen untuk orang yang mereka cintai.",  // Aquarius
                "Cowo Pisces itu emosional, sensitif, artistik, dan memelihara.", // Pisces
                "Cowo Aries adalah sosok yang berani, penuh energi, dan suka tantangan.", // Aries
                "Cowo Taurus adalah pria yang setia dan dapat diandalkan.", // Taurus
                "Cowo Gemini mudah beradaptasi, penuh rasa ingin tahu, dan komunikatif.", // Gemini
                "Cowo Cancer sangat perhatian, penuh kasih sayang, dan sensitif.", // Cancer
                "Cowo Leo percaya diri, ambisius, dan suka memimpin.", // Leo
                "Cowo Virgo sangat detail, terorganisir, dan cerdas.", // Virgo
                "Cowo Libra adalah pribadi yang ramah, adil, dan penuh pesona.", // Libra
                "Cowo Scorpio penuh semangat, misterius, dan memiliki intuisi yang tajam.", // Scorpio
                "Cowo Sagitarius berjiwa bebas, optimis, dan suka petualangan.", // Sagitarius
                "Cowo Capricorn disiplin, ambisius, dan suka bekerja keras." // Capricorn
        };

        // Array untuk menyimpan sifat cewe
        String[] SifatCeweArr = {
                "Cewe Aquarius sangat independen dan penuh wawasan.",  // Aquarius
                "Cewe Pisces sangat feminin, kreatif, dan penyayang.", // Pisces
                "Cewe Aries memiliki sifat yang penuh semangat, tegas, dan suka berpetualang.", // Aries
                "Cewe Taurus adalah sosok yang penuh kesabaran, kuat, dan setia.", // Taurus
                "Cewe Gemini sangat cerdas, lincah, dan suka bersosialisasi.", // Gemini
                "Cewe Cancer sangat peduli, emosional, dan sensitif.", // Cancer
                "Cewe Leo sangat percaya diri, hangat, dan suka menolong.", // Leo
                "Cewe Virgo adalah wanita yang perfeksionis, cerdas, dan praktis.", // Virgo
                "Cewe Libra memiliki daya tarik, penuh pesona, dan selalu adil.", // Libra
                "Cewe Scorpio sangat misterius, intens, dan penuh gairah.", // Scorpio
                "Cewe Sagitarius sangat berani, penuh petualangan, dan suka kebebasan.", // Sagitarius
                "Cewe Capricorn sangat terorganisir, ambisius, dan memiliki kontrol diri yang kuat." // Capricorn
        };

        // Looping supaya user tidak perlu run ulang
        boolean ulang = true;
        while (ulang) {

            // Input nama biar kenal kata teman" saya pak 
            System.out.print("Nama anda siapa? -> ");
            String nama = input.next();

            System.out.print("Masukkan tanggal lahir (1-31): ");
            int tanggal = input.nextInt();

            System.out.print("Masukkan bulan lahir (1-12): ");
            int bulan = input.nextInt();

            System.out.print("Masukkan jenis kelamin anda (cowo/cewe): ");
            String gender = input.next();

            // Manggil methodnya dengan array
            NentuinZodiak(nama, tanggal, bulan, gender, jodohArray, SifatCowoArr, SifatCeweArr);

            // Menanyakan apakah ingin mengecek lagi
            System.out.print("Apakah ingin mengecek zodiak lagi? (gas/sampun): ");
            String replay = input.next();
            if (!replay.equals("gas")) {
                ulang = false;
            }
        

        input.close();
    }}

    // Method untuk Nentuin Zodiak + Sifatnya + Jodohnya dengan array
    public static void NentuinZodiak(String nama, int tanggal, int bulan, String gender, String[] jodohArray, String[] SifatCowoArr, String[] SifatCeweArr) {
        String zodiak = "";
        int zodiakIndex = -1;

        // if-else & nested if untuk nentuin zodiak user
        if ((bulan == 1 && tanggal >= 20) || (bulan == 2 && tanggal <= 18)) {
            zodiak = "Aquarius";
            zodiakIndex = 0;
        }
        else if ((bulan == 2 && tanggal >= 19) || (bulan == 3 && tanggal <= 20)) {
            zodiak = "Pisces";
            zodiakIndex = 1;
        }
        else if ((bulan == 3 && tanggal >= 21) || (bulan == 4 && tanggal <= 19)) {
            zodiak = "Aries";
            zodiakIndex = 2;
        }
        else if ((bulan == 4 && tanggal >= 20) || (bulan == 5 && tanggal <= 20)) {
            zodiak = "Taurus";
            zodiakIndex = 3;
        }
        else if ((bulan == 5 && tanggal >= 21) || (bulan == 6 && tanggal <= 20)) {
            zodiak = "Gemini";
            zodiakIndex = 4;
        }
        else if ((bulan == 6 && tanggal >= 21) || (bulan == 7 && tanggal <= 22)) {
            zodiak = "Cancer";
            zodiakIndex = 5;
        }
        else if ((bulan == 7 && tanggal >= 23) || (bulan == 8 && tanggal <= 22)) {
            zodiak = "Leo";
            zodiakIndex = 6;
        }
        else if ((bulan == 8 && tanggal >= 23) || (bulan == 9 && tanggal <= 22)) {
            zodiak = "Virgo";
            zodiakIndex = 7;
        }
        else if ((bulan == 9 && tanggal >= 23) || (bulan == 10 && tanggal <= 22)) {
            zodiak = "Libra";
            zodiakIndex = 8;
        }
        else if ((bulan == 10 && tanggal >= 23) || (bulan == 11 && tanggal <= 21)) {
            zodiak = "Scorpio";
            zodiakIndex = 9;
        }
        else if ((bulan == 11 && tanggal >= 22) || (bulan == 12 && tanggal <= 21)) {
            zodiak = "Sagitarius";
            zodiakIndex = 10;
        }
        else if ((bulan == 12 && tanggal >= 22) || (bulan == 1 && tanggal <= 19)) {
            zodiak = "Capricorn";
            zodiakIndex = 11;
        } else {
            System.out.println("Tidak Valid");
        }

        // Output Zodiak, Jodoh, dan Sifat berdasarkan gender
        if (zodiakIndex != -1) {
            System.out.println("=======================================================================================");
            if (gender.equals("cowo")) {
                System.out.println("Haloow " + nama + " ganteng") ;
            } else if (gender.equals("cewe")) {
                System.out.println("Haloow " + nama + " cantik");  
            } else {
               System.out.println("ga jelas kamu"); 
            }
            System.out.println("Zodiak kamu adalah: " + zodiak);
            System.out.println("");
            System.out.println("Kamu cocoknya sama: " + jodohArray[zodiakIndex]);
            System.out.println("");
            if (gender.equals("cowo")) {
                System.out.println("Sifat zodiakmu tuh: " + SifatCowoArr[zodiakIndex]);
            } else if (gender.equalsIgnoreCase("cewe")) {
                System.out.println("Sifat zodiakmu tuh: " + SifatCeweArr[zodiakIndex]);
            } else {
                System.out.println("Tidak Valid");
            }
            System.out.println("=======================================================================================");
        } else {
            System.out.println("Zodiak tidak ditemukan, cek input tanggal dan bulan lagi ya!");
        }
    }
}
