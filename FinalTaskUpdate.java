import java.util.Scanner;

public class FinalTaskUpdate {
    // Konstanta untuk menyimpan data sifat dan jodoh
    private static final String[][] SIFAT = {
            { "Cowo Aquarius ini mandiri, berpikiran terbuka, dan berkomitmen untuk orang yang mereka cintai.",
                    "Cewe Aquarius sangat independen dan penuh wawasan." },
            { "Cowo Pisces itu emosional, sensitif, artistik, dan memelihara.",
                    "Cewe Pisces sangat feminin, kreatif, dan penyayang." },
            { "Cowo Aries adalah sosok yang berani, penuh energi, dan suka tantangan.",
                    "Cewe Aries memiliki sifat yang penuh semangat, tegas, dan suka berpetualang." },
            { "Cowo Taurus adalah pria yang setia dan dapat diandalkan.",
                    "Cewe Taurus adalah sosok yang penuh kesabaran, kuat, dan setia." },
            { "Cowo Gemini mudah beradaptasi, penuh rasa ingin tahu, dan komunikatif.",
                    "Cewe Gemini sangat cerdas, lincah, dan suka bersosialisasi." },
            { "Cowo Cancer sangat perhatian, penuh kasih sayang, dan sensitif.",
                    "Cewe Cancer sangat peduli, emosional, dan sensitif." },
            { "Cowo Leo percaya diri, ambisius, dan suka memimpin.",
                    "Cewe Leo sangat percaya diri, hangat, dan suka menolong." },
            { "Cowo Virgo sangat detail, terorganisir, dan cerdas.",
                    "Cewe Virgo adalah wanita yang perfeksionis, cerdas, dan praktis." },
            { "Cowo Libra adalah pribadi yang ramah, adil, dan penuh pesona.",
                    "Cewe Libra memiliki daya tarik, penuh pesona, dan selalu adil." },
            { "Cowo Scorpio penuh semangat, misterius, dan memiliki intuisi yang tajam.",
                    "Cewe Scorpio sangat misterius, intens, dan penuh gairah." },
            { "Cowo Sagitarius berjiwa bebas, optimis, dan suka petualangan.",
                    "Cewe Sagitarius sangat berani, penuh petualangan, dan suka kebebasan." },
            { "Cowo Capricorn disiplin, ambisius, dan suka bekerja keras.",
                    "Cewe Capricorn sangat terorganisir, ambisius, dan memiliki kontrol diri yang kuat." }
    };

    private static final String[] JODOH = {
            "Sagitarius, Aries, Gemini, Libra", // Aquarius
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("HALO HALO INI ADALAH PROGRAM NENTUIN ZODIAK");
        System.out.print("Enter untuk lanjut yaa");
        input.nextLine();
        
        boolean ulang = true;
        while (ulang) {
            // Input nama dan validasi
            System.out.print("Nama anda siapa? -> ");
            String nama = input.nextLine().trim();

            // Input tanggal dan bulan lahir
            System.out.print("Masukkan tanggal lahir (1-31): ");
            int tanggal = input.nextInt();
            if (tanggal < 1 || tanggal > 31) {
                System.out.println("Tanggal tidak valid! Coba lagi.");
                continue;
            }

            System.out.print("Masukkan bulan lahir (1-12): ");
            int bulan = input.nextInt();
            if (bulan < 1 || bulan > 12) {
                System.out.println("Bulan tidak valid! Coba lagi.");
                continue;
            }

            // Input gender
            System.out.print("Masukkan jenis kelamin anda (cowo/cewe): ");
            String gender = input.next().toLowerCase();
            input.nextLine(); // Consume newline

            // Proses menentukan zodiak
            NentuinZodiak(nama, tanggal, bulan, gender);

            // Menanyakan apakah ingin mengulang
            System.out.print("Apakah ingin mengecek zodiak lagi? (gas/sampun): ");
            String replay = input.next();
            input.nextLine(); // Consume newline
            ulang = replay.equalsIgnoreCase("gas");
        }

        System.out.println("Terima kasih sudah menggunakan program ini!");
        input.close();
    }

    private static void NentuinZodiak(String nama, int tanggal, int bulan, String gender) {
        String[] zodiakData = {
                "Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer",
                "Leo", "Virgo", "Libra", "Scorpio", "Sagitarius", "Capricorn"
        };
        int[][] dateRange = {
                { 20, 18 }, { 19, 20 }, { 21, 19 }, { 20, 20 }, { 21, 20 },
                { 21, 22 }, { 23, 22 }, { 23, 22 }, { 23, 22 }, { 23, 21 },
                { 22, 21 }, { 22, 19 }
        };

        String zodiak = "Tidak Valid";
        int zodiakIndex = -1;

        for (int i = 0; i < 12; i++) {
            if ((bulan == i + 1 && tanggal >= dateRange[i][0]) || 
                (bulan == (i == 11 ? 1 : i + 2) && tanggal <= dateRange[i][1])) {
                zodiak = zodiakData[i];
                zodiakIndex = i;
                break;
            }
        }

        if (zodiakIndex != -1) {
            System.out.println("=========================================");
            System.out.println("Halo " + nama + (gender.equals("cowo") ? " ganteng" : " cantik"));
            System.out.println("Zodiak kamu: " + zodiak);
            System.out.println("Jodohmu: " + JODOH[zodiakIndex]);
            System.out.println("Sifatmu: " + (gender.equals("cowo") ? SIFAT[zodiakIndex][0] : SIFAT[zodiakIndex][1]));
            System.out.println("=========================================");
        } else {
            System.out.println("Zodiak tidak ditemukan. Periksa inputanmu!");
        }
    }
}
