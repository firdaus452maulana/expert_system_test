package com.example.expertsystemtest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.expertsystemtest.databinding.ActivityResultBinding;
import com.example.expertsystemtest.model.NilaiPakarCF;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    private ActivityResultBinding binding;
    private float gejPenurunanPenglihatan, gejMataSilau, gejGantiKacamata, gejLensamataBengkak, gejMalamhari, gejNyeriMata;
    private NilaiPakarCF nilaiPakarCF;
    private float cf_gejPenurunanPenglihatan, cf_gejMataSilau, cf_gejGantiKacamata, cf_gejLensamataBengkak, cf_gejMalamhari, cf_gejNyeriMata;
    private float result;

    public static final String gejala1 = "Penurunan Penglihatan";
    public static final String gejala2 = "Mata Silau";
    public static final String gejala3 = "Ganti Kacamata";
    public static final String gejala4 = "Lensa Mata Bengkak";
    public static final String gejala5 = "Malam Haris";
    public static final String gejala6 = "Nyeri Mata";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        gejPenurunanPenglihatan = getIntent().getFloatExtra(gejala1, 0);
        gejMataSilau = getIntent().getFloatExtra(gejala2, 0);
        gejGantiKacamata = getIntent().getFloatExtra(gejala3, 0);
        gejLensamataBengkak = getIntent().getFloatExtra(gejala4, 0);
        gejMalamhari = getIntent().getFloatExtra(gejala5, 0);
        gejNyeriMata = getIntent().getFloatExtra(gejala6, 0);

        setCFpakar();
        bind();
        calculateKatarak();

        binding.tvKlasifikasi.setText("Hasil : Penyakit Katarak dengan persentase " + String.valueOf(result) + "%");
    }

    private void setCFpakar() {
        nilaiPakarCF = new NilaiPakarCF();
        nilaiPakarCF.setGejPenurunanPenglihatan(0.6F);
        nilaiPakarCF.setGejMataSilau(0.8F);
        nilaiPakarCF.setGejGantiKacamata(0.6F);
        nilaiPakarCF.setGejLensamataBengkak(0.4F);
        nilaiPakarCF.setGejMalamhari( -0.6F);
        nilaiPakarCF.setGejNyeriMata( -0.8F);
    }

    private void bind() {
        binding.tvGejala1Pakar.setText("Nilai CF Pakar : " + String.valueOf(nilaiPakarCF.getGejPenurunanPenglihatan()));
        binding.tvGejala1User.setText("Nilai CF User   : " + String.valueOf(gejPenurunanPenglihatan));
        binding.tvGejala2Pakar.setText("Nilai CF Pakar : " + String.valueOf(nilaiPakarCF.getGejMataSilau()));
        binding.tvGejala2User.setText("Nilai CF User   : " + String.valueOf(gejMataSilau));
        binding.tvGejala3Pakar.setText("Nilai CF Pakar : " + String.valueOf(nilaiPakarCF.getGejGantiKacamata()));
        binding.tvGejala3User.setText("Nilai CF User   : " + String.valueOf(gejGantiKacamata));
        binding.tvGejala4Pakar.setText("Nilai CF Pakar : " + String.valueOf(nilaiPakarCF.getGejLensamataBengkak()));
        binding.tvGejala4User.setText("Nilai CF User   : " + String.valueOf(gejLensamataBengkak));
        binding.tvGejala5Pakar.setText("Nilai CF Pakar : " + String.valueOf(nilaiPakarCF.getGejMalamhari()));
        binding.tvGejala5User.setText("Nilai CF User   : " + String.valueOf(gejMalamhari));
        binding.tvGejala6Pakar.setText("Nilai CF Pakar : " + String.valueOf(nilaiPakarCF.getGejNyeriMata()));
        binding.tvGejala6User.setText("Nilai CF User   : " + String.valueOf(gejNyeriMata));
    }

    private void calculateKatarak(){
        int jumlah = 6;
        ArrayList<Float> CF = new ArrayList<>();
        cf_gejPenurunanPenglihatan = nilaiPakarCF.getGejPenurunanPenglihatan() * gejPenurunanPenglihatan;
        cf_gejMataSilau = nilaiPakarCF.getGejMataSilau() * gejMataSilau;
        cf_gejGantiKacamata = nilaiPakarCF.getGejGantiKacamata() * gejGantiKacamata;
        cf_gejLensamataBengkak = nilaiPakarCF.getGejLensamataBengkak() * gejLensamataBengkak;
        cf_gejMalamhari = nilaiPakarCF.getGejMalamhari() * gejMalamhari;
        cf_gejNyeriMata = nilaiPakarCF.getGejNyeriMata() * gejNyeriMata;
        CF.add(cf_gejPenurunanPenglihatan);
        CF.add(cf_gejMataSilau);
        CF.add(cf_gejGantiKacamata);
        CF.add(cf_gejLensamataBengkak);
        CF.add(cf_gejMalamhari);
        CF.add(cf_gejNyeriMata);
        float  CF_gab = CF.get(0);
        for (int i = 1; i < jumlah; i++){
            if (CF_gab > 0 && CF.get(i)>0){
                CF_gab = hitung_cfPositif(CF_gab, CF.get(i));
            }
            else if (CF_gab < 0 && CF.get(i)<0){
                CF_gab = hitung_cfNegatif(CF_gab, CF.get(i));
            }
            else{
                CF_gab = hitung_cfBeda(CF_gab, CF.get(i));
            }
        }
        result = CF_gab * 100;
    }

    private float hitung_cfPositif(float cfLama, float cfBaru){
        float result;
        result = cfLama + (cfBaru * (1 - cfLama));
        return result;
    }

    private float hitung_cfNegatif(float cfLama, float cfBaru){
        float result;
        result = cfLama + (cfBaru * (1 + cfLama));
        return result;
    }

    private float hitung_cfBeda(float cfLama, float cfBaru){
        float result;
        result = cfLama + cfBaru/(1- Math.min(cfLama, cfBaru));
        return result;
    }
}