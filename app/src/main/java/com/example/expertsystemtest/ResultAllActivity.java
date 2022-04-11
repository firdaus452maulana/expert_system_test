package com.example.expertsystemtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.expertsystemtest.databinding.ActivityResultAllBinding;
import com.example.expertsystemtest.databinding.ActivityResultBinding;
import com.example.expertsystemtest.model.NilaiPakarCF;
import com.example.expertsystemtest.model.pakarK002;
import com.example.expertsystemtest.model.pakarK003;
import com.example.expertsystemtest.model.pakarK004;
import com.example.expertsystemtest.model.pakarK005;

import java.util.ArrayList;

public class ResultAllActivity extends AppCompatActivity {

    private float G001, G002, G003, G004, G005, G006, G007, G008, G009, G010, G011, G012, G013, G014, G015, G016, G017, G018, G019;
    private NilaiPakarCF nilaiPakarCF;
    private pakarK002 _pakarK002;
    private pakarK003 _pakarK003;
    private pakarK004 _pakarK004;
    private pakarK005 _pakarK005;
    private ActivityResultAllBinding binding;
    //    private float cf_G001, cf_G002, cf_G003, cf_G004, cf_G005, cf_G006, cf_G007, cf_G008, cf_G009, cf_G010, cf_G011, cf_G012, cf_G013, cf_G014, cf_G015, cf_G016, cf_G017, cf_G018, cf_G019;
    private float result, resultK002, resultK003, resultK004, resultK005;

    public static final String strG001 = "G001";
    public static final String strG002 = "G002";
    public static final String strG003 = "G003";
    public static final String strG004 = "G004";
    public static final String strG005 = "G005";
    public static final String strG006 = "G006";
    public static final String strG007 = "G007";
    public static final String strG008 = "G008";
    public static final String strG009 = "G009";
    public static final String strG010 = "G010";
    public static final String strG011 = "G011";
    public static final String strG012 = "G012";
    public static final String strG013 = "G013";
    public static final String strG014 = "G014";
    public static final String strG015 = "G015";
    public static final String strG016 = "G016";
    public static final String strG017 = "G017";
    public static final String strG018 = "G018";
    public static final String strG019 = "G019";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultAllBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        G001 = getIntent().getFloatExtra(strG001, 0);
        G002 = getIntent().getFloatExtra(strG002, 0);
        G003 = getIntent().getFloatExtra(strG003, 0);
        G004 = getIntent().getFloatExtra(strG004, 0);
        G005 = getIntent().getFloatExtra(strG005, 0);
        G006 = getIntent().getFloatExtra(strG006, 0);
        G007 = getIntent().getFloatExtra(strG007, 0);
        G008 = getIntent().getFloatExtra(strG008, 0);
        G009 = getIntent().getFloatExtra(strG009, 0);
        G010 = getIntent().getFloatExtra(strG010, 0);
        G011 = getIntent().getFloatExtra(strG011, 0);
        G012 = getIntent().getFloatExtra(strG012, 0);
        G013 = getIntent().getFloatExtra(strG013, 0);
        G014 = getIntent().getFloatExtra(strG014, 0);
        G015 = getIntent().getFloatExtra(strG015, 0);
        G016 = getIntent().getFloatExtra(strG016, 0);
        G017 = getIntent().getFloatExtra(strG017, 0);
        G018 = getIntent().getFloatExtra(strG018, 0);
        G019 = getIntent().getFloatExtra(strG019, 0);

        setCFpakar();
        calculateKatarak();
        calculateK002();
        calculateK003();
        calculateK004();
        calculateK005();
        bind();
    }

    private void bind() {
        binding.tvKlasifikasi.setText("Hasil : Penyakit Katarak dengan persentase " + String.valueOf(result) + "%");
        binding.tvKlasifikasiJenis.setText("Hasil : Penyakit Katarak dengan persentase " + hasilKlasifikasiJenis() + "%");
        binding.tvK002.setText("Persentase terkena Katarak Traumatik " + String.valueOf(resultK002) + "%");
        binding.tvK003.setText("Persentase terkena Katarak Subkapsularis Posterior " + String.valueOf(resultK003) + "%");
        binding.tvK004.setText("Persentase terkena Katarak Senilis " + String.valueOf(resultK004) + "%");
        binding.tvK005.setText("Persentase terkena Katarak Juvenile " + String.valueOf(resultK005) + "%");
    }

    private void setCFpakar() {
        nilaiPakarCF = new NilaiPakarCF();
        nilaiPakarCF.setGejPenurunanPenglihatan(0.6F);
        nilaiPakarCF.setGejMataSilau(0.8F);
        nilaiPakarCF.setGejGantiKacamata(0.6F);
        nilaiPakarCF.setGejLensamataBengkak(0.4F);
        nilaiPakarCF.setGejMalamhari(-0.6F);
        nilaiPakarCF.setGejNyeriMata(-0.8F);

        _pakarK002 = new pakarK002();
        _pakarK002.setG002(0.95F);
        _pakarK002.setG003(-0.1F);
        _pakarK002.setG007(1.0F);
        _pakarK002.setG008(1.0F);
        _pakarK002.setG009(0.8F);
        _pakarK002.setG011(1.0F);

        _pakarK003 = new pakarK003();
        _pakarK003.setG002(0.95F);
        _pakarK003.setG003(0.8F);
        _pakarK003.setG008(1.0F);
        _pakarK003.setG009(0.8F);
        _pakarK003.setG012(0.75F);
        _pakarK003.setG013(0.3F);
        _pakarK003.setG014(0.5F);
        _pakarK003.setG015(0.95F);
        _pakarK003.setG016(0.3F);

        _pakarK004 = new pakarK004();
        _pakarK004.setG004(0.4F);
        _pakarK004.setG007(1.0F);
        _pakarK004.setG008(0.9F);
        _pakarK004.setG010(0.7F);
        _pakarK004.setG017(0.8F);

        _pakarK005 = new pakarK005();
        _pakarK005.setG004(0.7F);
        _pakarK005.setG007(1.0F);
        _pakarK005.setG008(0.9F);
        _pakarK005.setG018(1.0F);
        _pakarK005.setG019(0.7F);
    }

    private void calculateKatarak() {
        int jumlah = 6;
        ArrayList<Float> CF = new ArrayList<>();
        float cf_G002 = nilaiPakarCF.getGejPenurunanPenglihatan() * G002;
        float cf_G003 = nilaiPakarCF.getGejMataSilau() * G003;
        float cf_G004 = nilaiPakarCF.getGejGantiKacamata() * G004;
        float cf_G006 = nilaiPakarCF.getGejLensamataBengkak() * G006;
        float cf_G001 = nilaiPakarCF.getGejMalamhari() * G001;
        float cf_G005 = nilaiPakarCF.getGejNyeriMata() * G005;
        CF.add(cf_G002);
        CF.add(cf_G003);
        CF.add(cf_G004);
        CF.add(cf_G006);
        CF.add(cf_G001);
        CF.add(cf_G005);
        float CF_gab = CF.get(0);
        for (int i = 1; i < jumlah; i++) {
            if (CF_gab > 0 && CF.get(i) > 0) {
                CF_gab = hitung_cfPositif(CF_gab, CF.get(i));
            } else if (CF_gab < 0 && CF.get(i) < 0) {
                CF_gab = hitung_cfNegatif(CF_gab, CF.get(i));
            } else {
                CF_gab = hitung_cfBeda(CF_gab, CF.get(i));
            }
        }
        result = CF_gab * 100;
    }

    private void calculateK002() {
        int jumlah = 6;
        ArrayList<Float> CF = new ArrayList<>();
        float cf_G002 = _pakarK002.getG002() * G002;
        float cf_G003 = _pakarK002.getG003() * G003;
        float cf_G007 = _pakarK002.getG007() * G007;
        float cf_G008 = _pakarK002.getG008() * G008;
        float cf_G009 = _pakarK002.getG009() * G009;
        float cf_G011 = _pakarK002.getG011() * G011;
        CF.add(cf_G002);
        CF.add(cf_G003);
        CF.add(cf_G007);
        CF.add(cf_G008);
        CF.add(cf_G009);
        CF.add(cf_G011);
        float CF_gab = CF.get(0);
        for (int i = 1; i < jumlah; i++) {
            if (CF_gab > 0 && CF.get(i) > 0) {
                CF_gab = hitung_cfPositif(CF_gab, CF.get(i));
            } else if (CF_gab < 0 && CF.get(i) < 0) {
                CF_gab = hitung_cfNegatif(CF_gab, CF.get(i));
            } else {
                CF_gab = hitung_cfBeda(CF_gab, CF.get(i));
            }
        }
        resultK002 = CF_gab * 100;
    }

    private void calculateK003() {
        int jumlah = 9;
        ArrayList<Float> CF = new ArrayList<>();
        float cf_G002 = _pakarK003.getG002() * G002;
        float cf_G003 = _pakarK003.getG003() * G003;
        float cf_G008 = _pakarK003.getG008() * G008;
        float cf_G009 = _pakarK003.getG009() * G009;
        float cf_G012 = _pakarK003.getG012() * G012;
        float cf_G013 = _pakarK003.getG013() * G013;
        float cf_G014 = _pakarK003.getG014() * G014;
        float cf_G015 = _pakarK003.getG015() * G015;
        float cf_G016 = _pakarK003.getG016() * G016;
        CF.add(cf_G002);
        CF.add(cf_G003);
        CF.add(cf_G008);
        CF.add(cf_G009);
        CF.add(cf_G012);
        CF.add(cf_G013);
        CF.add(cf_G014);
        CF.add(cf_G015);
        CF.add(cf_G016);
        float CF_gab = CF.get(0);
        for (int i = 1; i < jumlah; i++) {
            if (CF_gab > 0 && CF.get(i) > 0) {
                CF_gab = hitung_cfPositif(CF_gab, CF.get(i));
            } else if (CF_gab < 0 && CF.get(i) < 0) {
                CF_gab = hitung_cfNegatif(CF_gab, CF.get(i));
            } else {
                CF_gab = hitung_cfBeda(CF_gab, CF.get(i));
            }
        }
        resultK003 = CF_gab * 100;
    }

    private void calculateK004() {
        int jumlah = 5;
        ArrayList<Float> CF = new ArrayList<>();
        float cf_G004 = _pakarK004.getG004() * G004;
        float cf_G007 = _pakarK004.getG007() * G007;
        float cf_G008 = _pakarK004.getG008() * G008;
        float cf_G010 = _pakarK004.getG010() * G010;
        float cf_G017 = _pakarK004.getG017() * G017;
        CF.add(cf_G004);
        CF.add(cf_G007);
        CF.add(cf_G008);
        CF.add(cf_G010);
        CF.add(cf_G017);
        float CF_gab = CF.get(0);
        for (int i = 1; i < jumlah; i++) {
            if (CF_gab > 0 && CF.get(i) > 0) {
                CF_gab = hitung_cfPositif(CF_gab, CF.get(i));
            } else if (CF_gab < 0 && CF.get(i) < 0) {
                CF_gab = hitung_cfNegatif(CF_gab, CF.get(i));
            } else {
                CF_gab = hitung_cfBeda(CF_gab, CF.get(i));
            }
        }
        resultK004 = CF_gab * 100;
    }

    private void calculateK005() {
        int jumlah = 5;
        ArrayList<Float> CF = new ArrayList<>();
        float cf_G004 = _pakarK005.getG004() * G004;
        float cf_G007 = _pakarK005.getG007() * G007;
        float cf_G008 = _pakarK005.getG008() * G008;
        float cf_G018 = _pakarK005.getG018() * G018;
        float cf_G019 = _pakarK005.getG019() * G019;
        CF.add(cf_G004);
        CF.add(cf_G007);
        CF.add(cf_G008);
        CF.add(cf_G018);
        CF.add(cf_G019);
        float CF_gab = CF.get(0);
        for (int i = 1; i < jumlah; i++) {
            if (CF_gab > 0 && CF.get(i) > 0) {
                CF_gab = hitung_cfPositif(CF_gab, CF.get(i));
            } else if (CF_gab < 0 && CF.get(i) < 0) {
                CF_gab = hitung_cfNegatif(CF_gab, CF.get(i));
            } else {
                CF_gab = hitung_cfBeda(CF_gab, CF.get(i));
            }
        }
        resultK005 = CF_gab * 100;
    }

    private float hitung_cfPositif(float cfLama, float cfBaru) {
        float result;
        result = cfLama + (cfBaru * (1 - cfLama));
        return result;
    }

    private float hitung_cfNegatif(float cfLama, float cfBaru) {
        float result;
        result = cfLama + (cfBaru * (1 + cfLama));
        return result;
    }

    private float hitung_cfBeda(float cfLama, float cfBaru) {
        float result;
        result = cfLama + cfBaru / (1 - Math.min(cfLama, cfBaru));
        return result;
    }

    private String hasilKlasifikasiJenis() {
        String jenis;
        int jumlah = 4;
        float besar;
        float[] cfKatarak = {resultK002, resultK003, resultK004, resultK005};
        String[] katarak = {"Traumatik", "Subkapsularis Posterior", "Senilis", "Juvenile"};
        besar = 0;
        jenis = "";

        for (int i = 0; i < jumlah; i++) {
            if (besar < cfKatarak[i]) {
                besar = cfKatarak[i];
                jenis = katarak[i];
            }
        }
        return jenis + " " + String.valueOf(besar);
    }
}