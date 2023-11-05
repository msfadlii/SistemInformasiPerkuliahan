package Utility;

import java.util.Random;


public class generateNpm {
    static int nomor=7500;
    public static String buatNpm(int kodeJurusan){
        while(true){
            nomor++;
            break;
        }
        int nomorMhs = new Random().nextInt()+1;
        String tahun= "2023";
        String kode="";
        switch(kodeJurusan){
            case 6:
                kode = "06";
                break;
            case 13:
                kode = "13";
                break;
        }
        String npm = kode+"."+tahun+"."+"1."+"0"+String.format("%03d",nomor);
        return npm;
    }
}
