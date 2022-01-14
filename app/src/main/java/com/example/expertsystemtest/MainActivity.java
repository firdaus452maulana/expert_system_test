package com.example.expertsystemtest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.expertsystemtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private float gejPenurunanPenglihatan, gejMataSilau, gejGantiKacamata, gejLensamataBengkak, gejMalamhari, gejNyeriMata;

//    @Override
//    protected void onNewIntent(Intent intent) {
//        super.onNewIntent(intent);
//        binding.rgGejPenurunanPenglihatan.clearCheck();
//        binding.rgGejMataSilau.clearCheck();
//        binding.rgGejGantiKacamata.clearCheck();
//        binding.rgGejLensamataBengkak.clearCheck();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        conversionPertanyaan1();
        conversionPertanyaan2();
        conversionPertanyaan3();
        conversionPertanyaan4();
        conversionPertanyaan5();
        conversionPertanyaan6();

        binding.btnSimpan.setOnClickListener(v -> {
            if (binding.rgGejPenurunanPenglihatan.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 1", Toast.LENGTH_LONG).show();
                return;
            }
            if (binding.rgGejMataSilau.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 2", Toast.LENGTH_LONG).show();
                return;
            }
            if (binding.rgGejGantiKacamata.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 3", Toast.LENGTH_LONG).show();
                return;
            }
            if (binding.rgGejLensamataBengkak.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 4", Toast.LENGTH_LONG).show();
                return;
            }
            if (binding.rgGejMalamHari.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 5", Toast.LENGTH_LONG).show();
                return;
            }
            if (binding.rgGejNyeriMata.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 6", Toast.LENGTH_LONG).show();
                return;
            }

            Intent intent = new Intent(this, KlasifikasiActivity.class);
            intent.putExtra(KlasifikasiActivity.strG002, gejPenurunanPenglihatan);
            intent.putExtra(KlasifikasiActivity.strG003, gejMataSilau);
            intent.putExtra(KlasifikasiActivity.strG004, gejGantiKacamata);
            intent.putExtra(KlasifikasiActivity.strG006, gejLensamataBengkak);
            intent.putExtra(KlasifikasiActivity.strG001, gejMalamhari);
            intent.putExtra(KlasifikasiActivity.strG005, gejNyeriMata);
            startActivity(intent);
        });
    }

    private void conversionPertanyaan1() {
        binding.rgGejPenurunanPenglihatan.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_gej_penurunan_penglihatan_tidak:
                        gejPenurunanPenglihatan = 0.0F;
                        break;
                    case R.id.rb_gej_penurunan_penglihatan_hampir:
                        gejPenurunanPenglihatan = 0.75F;
                        break;
                    case R.id.rb_gej_penurunan_penglihatan_kemungkinan:
                        gejPenurunanPenglihatan = 0.5F;
                        break;
                    case R.id.rb_gej_penurunan_penglihatan_mungkin:
                        gejPenurunanPenglihatan = 0.25F;
                        break;
                    case R.id.rb_gej_penurunan_penglihatan_pasti:
                        gejPenurunanPenglihatan = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }

    private void conversionPertanyaan2() {
        binding.rgGejMataSilau.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_gej_mata_silau_tidak:
                        gejMataSilau = 0.0F;
                        break;
                    case R.id.rb_gej_mata_silau_hampir:
                        gejMataSilau = 0.75F;
                        break;
                    case R.id.rb_gej_mata_silau_kemungkinan:
                        gejMataSilau = 0.5F;
                        break;
                    case R.id.rb_gej_mata_silau_mungkin:
                        gejMataSilau = 0.25F;
                        break;
                    case R.id.rb_gej_mata_silau_pasti:
                        gejMataSilau = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }

    private void conversionPertanyaan3() {
        binding.rgGejGantiKacamata.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_gej_ganti_kacamata_tidak:
                        gejGantiKacamata = 0.0F;
                        break;
                    case R.id.rb_gej_ganti_kacamata_hampir:
                        gejGantiKacamata = 0.75F;
                        break;
                    case R.id.rb_gej_ganti_kacamata_kemungkinan:
                        gejGantiKacamata = 0.5F;
                        break;
                    case R.id.rb_gej_ganti_kacamata_mungkin:
                        gejGantiKacamata = 0.25F;
                        break;
                    case R.id.rb_gej_ganti_kacamata_pasti:
                        gejGantiKacamata = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }

    private void conversionPertanyaan4() {
        binding.rgGejLensamataBengkak.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_gej_lensamata_bengkak_tidak:
                        gejLensamataBengkak = 0.0F;
                        break;
                    case R.id.rb_gej_lensamata_bengkak_hampir:
                        gejLensamataBengkak = 0.75F;
                        break;
                    case R.id.rb_gej_lensamata_bengkak_kemungkinan:
                        gejLensamataBengkak = 0.5F;
                        break;
                    case R.id.rb_gej_lensamata_bengkak_mungkin:
                        gejLensamataBengkak = 0.25F;
                        break;
                    case R.id.rb_gej_lensamata_bengkak_pasti:
                        gejLensamataBengkak = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }

    private void conversionPertanyaan5() {
        binding.rgGejMalamHari.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_gej_malam_hari_tidak:
                        gejMalamhari = 0.0F;
                        break;
                    case R.id.rb_gej_malam_hari_hampir:
                        gejMalamhari = 0.75F;
                        break;
                    case R.id.rb_gej_malam_hari_kemungkinan:
                        gejMalamhari = 0.5F;
                        break;
                    case R.id.rb_gej_malam_hari_mungkin:
                        gejMalamhari = 0.25F;
                        break;
                    case R.id.rb_gej_malam_hari_pasti:
                        gejMalamhari = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }

    private void conversionPertanyaan6() {
        binding.rgGejNyeriMata.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_gej_nyeri_mata_tidak:
                        gejNyeriMata = 0.0F;
                        break;
                    case R.id.rb_gej_nyeri_mata_hampir:
                        gejNyeriMata = 0.75F;
                        break;
                    case R.id.rb_gej_nyeri_mata_kemungkinan:
                        gejNyeriMata = 0.5F;
                        break;
                    case R.id.rb_gej_nyeri_mata_mungkin:
                        gejNyeriMata = 0.25F;
                        break;
                    case R.id.rb_gej_nyeri_mata_pasti:
                        gejNyeriMata = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }
}