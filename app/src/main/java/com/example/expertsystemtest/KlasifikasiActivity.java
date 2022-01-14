package com.example.expertsystemtest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.expertsystemtest.databinding.ActivityKlasifikasiBinding;
import com.example.expertsystemtest.databinding.ActivityResultBinding;

public class KlasifikasiActivity extends AppCompatActivity {


    private ActivityKlasifikasiBinding binding;
    private float G001, G002, G003, G004, G005, G006, G007, G008, G009, G010, G011, G012, G013, G014, G015, G016, G017, G018, G019;

    public static String strG001 = "G001";
    public static String strG002 = "G002";
    public static String strG003 = "G003";
    public static String strG004 = "G004";
    public static String strG005 = "G005";
    public static String strG006 = "G006";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityKlasifikasiBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        G001 = getIntent().getFloatExtra(strG001, 0);
        G002 = getIntent().getFloatExtra(strG002, 0);
        G003 = getIntent().getFloatExtra(strG003, 0);
        G004 = getIntent().getFloatExtra(strG004, 0);
        G005 = getIntent().getFloatExtra(strG005, 0);
        G006 = getIntent().getFloatExtra(strG006, 0);

        conversionPertanyaan1();
        conversionPertanyaan2();
        conversionPertanyaan3();
        conversionPertanyaan4();
        conversionPertanyaan5();
        conversionPertanyaan6();
        conversionPertanyaan7();
        conversionPertanyaan8();
        conversionPertanyaan9();
        conversionPertanyaan10();
        conversionPertanyaan11();
        conversionPertanyaan12();
        conversionPertanyaan13();

        binding.btnSimpan.setOnClickListener(v -> {
            if (binding.rgG007.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 1", Toast.LENGTH_LONG).show();
                return;
            }
            if (binding.rgG008.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 2", Toast.LENGTH_LONG).show();
                return;
            }
            if (binding.rgG009.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 3", Toast.LENGTH_LONG).show();
                return;
            }
            if (binding.rgG010.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 4", Toast.LENGTH_LONG).show();
                return;
            }
            if (binding.rgG011.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 5", Toast.LENGTH_LONG).show();
                return;
            }
            if (binding.rgG012.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 6", Toast.LENGTH_LONG).show();
                return;
            }
            if (binding.rgG013.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 7", Toast.LENGTH_LONG).show();
                return;
            }
            if (binding.rgG014.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 8", Toast.LENGTH_LONG).show();
                return;
            }
            if (binding.rgG015.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 9", Toast.LENGTH_LONG).show();
                return;
            }
            if (binding.rgG016.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 10", Toast.LENGTH_LONG).show();
                return;
            }
            if (binding.rgG017.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 11", Toast.LENGTH_LONG).show();
                return;
            }
            if (binding.rgG018.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 12", Toast.LENGTH_LONG).show();
                return;
            }
            if (binding.rgG019.getCheckedRadioButtonId() == -1) {
                Toast.makeText(getApplicationContext(), "Mohon Jawab pada Pertanyaan 13", Toast.LENGTH_LONG).show();
                return;
            }

            Intent intent = new Intent(this, ResultAllActivity.class);
            intent.putExtra(ResultAllActivity.strG001, G001);
            intent.putExtra(ResultAllActivity.strG002, G002);
            intent.putExtra(ResultAllActivity.strG003, G003);
            intent.putExtra(ResultAllActivity.strG004, G004);
            intent.putExtra(ResultAllActivity.strG005, G005);
            intent.putExtra(ResultAllActivity.strG006, G006);
            intent.putExtra(ResultAllActivity.strG007, G007);
            intent.putExtra(ResultAllActivity.strG008, G008);
            intent.putExtra(ResultAllActivity.strG009, G009);
            intent.putExtra(ResultAllActivity.strG010, G010);
            intent.putExtra(ResultAllActivity.strG011, G011);
            intent.putExtra(ResultAllActivity.strG012, G012);
            intent.putExtra(ResultAllActivity.strG013, G013);
            intent.putExtra(ResultAllActivity.strG014, G014);
            intent.putExtra(ResultAllActivity.strG015, G015);
            intent.putExtra(ResultAllActivity.strG016, G016);
            intent.putExtra(ResultAllActivity.strG017, G017);
            intent.putExtra(ResultAllActivity.strG018, G018);
            intent.putExtra(ResultAllActivity.strG019, G019);
            startActivity(intent);
        });
    }

    private void conversionPertanyaan1() {
        binding.rgG007.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_G007_tidak:
                        G007 = 0.0F;
                        break;
                    case R.id.rb_G007_hampir:
                        G007 = 0.75F;
                        break;
                    case R.id.rb_G007_kemungkinan:
                        G007 = 0.5F;
                        break;
                    case R.id.rb_G007_mungkin:
                        G007 = 0.25F;
                        break;
                    case R.id.rb_G007_pasti:
                        G007 = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }

    private void conversionPertanyaan2() {
        binding.rgG008.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_G008_tidak:
                        G008 = 0.0F;
                        break;
                    case R.id.rb_G008_hampir:
                        G008 = 0.75F;
                        break;
                    case R.id.rb_G008_kemungkinan:
                        G008 = 0.5F;
                        break;
                    case R.id.rb_G008_mungkin:
                        G008 = 0.25F;
                        break;
                    case R.id.rb_G008_pasti:
                        G008 = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }

    private void conversionPertanyaan3() {
        binding.rgG009.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_G009_tidak:
                        G009 = 0.0F;
                        break;
                    case R.id.rb_G009_hampir:
                        G009 = 0.75F;
                        break;
                    case R.id.rb_G009_kemungkinan:
                        G009 = 0.5F;
                        break;
                    case R.id.rb_G009_mungkin:
                        G009 = 0.25F;
                        break;
                    case R.id.rb_G009_pasti:
                        G009 = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }

    private void conversionPertanyaan4() {
        binding.rgG010.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_G010_tidak:
                        G010 = 0.0F;
                        break;
                    case R.id.rb_G010_hampir:
                        G010 = 0.75F;
                        break;
                    case R.id.rb_G010_kemungkinan:
                        G010 = 0.5F;
                        break;
                    case R.id.rb_G010_mungkin:
                        G010 = 0.25F;
                        break;
                    case R.id.rb_G010_pasti:
                        G010 = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }

    private void conversionPertanyaan5() {
        binding.rgG011.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_G011_tidak:
                        G011 = 0.0F;
                        break;
                    case R.id.rb_G011_hampir:
                        G011 = 0.75F;
                        break;
                    case R.id.rb_G011_kemungkinan:
                        G011 = 0.5F;
                        break;
                    case R.id.rb_G011_mungkin:
                        G011 = 0.25F;
                        break;
                    case R.id.rb_G011_pasti:
                        G011 = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }

    private void conversionPertanyaan6() {
        binding.rgG012.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_G012_tidak:
                        G012 = 0.0F;
                        break;
                    case R.id.rb_G012_hampir:
                        G012 = 0.75F;
                        break;
                    case R.id.rb_G012_kemungkinan:
                        G012 = 0.5F;
                        break;
                    case R.id.rb_G012_mungkin:
                        G012 = 0.25F;
                        break;
                    case R.id.rb_G012_pasti:
                        G012 = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }

    private void conversionPertanyaan7() {
        binding.rgG013.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_G013_tidak:
                        G013 = 0.0F;
                        break;
                    case R.id.rb_G013_hampir:
                        G013 = 0.75F;
                        break;
                    case R.id.rb_G013_kemungkinan:
                        G013 = 0.5F;
                        break;
                    case R.id.rb_G013_mungkin:
                        G013 = 0.25F;
                        break;
                    case R.id.rb_G013_pasti:
                        G013 = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }

    private void conversionPertanyaan8() {
        binding.rgG013.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_G013_tidak:
                        G013 = 0.0F;
                        break;
                    case R.id.rb_G013_hampir:
                        G013 = 0.75F;
                        break;
                    case R.id.rb_G013_kemungkinan:
                        G013 = 0.5F;
                        break;
                    case R.id.rb_G013_mungkin:
                        G013 = 0.25F;
                        break;
                    case R.id.rb_G013_pasti:
                        G013 = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }

    private void conversionPertanyaan9() {
        binding.rgG015.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_G015_tidak:
                        G015 = 0.0F;
                        break;
                    case R.id.rb_G015_hampir:
                        G015 = 0.75F;
                        break;
                    case R.id.rb_G015_kemungkinan:
                        G015 = 0.5F;
                        break;
                    case R.id.rb_G015_mungkin:
                        G015 = 0.25F;
                        break;
                    case R.id.rb_G015_pasti:
                        G015 = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }

    private void conversionPertanyaan10() {
        binding.rgG016.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_G016_tidak:
                        G016 = 0.0F;
                        break;
                    case R.id.rb_G016_hampir:
                        G016 = 0.75F;
                        break;
                    case R.id.rb_G016_kemungkinan:
                        G016 = 0.5F;
                        break;
                    case R.id.rb_G016_mungkin:
                        G016 = 0.25F;
                        break;
                    case R.id.rb_G016_pasti:
                        G016 = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }

    private void conversionPertanyaan11() {
        binding.rgG017.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_G017_tidak:
                        G017 = 0.0F;
                        break;
                    case R.id.rb_G017_hampir:
                        G017 = 0.75F;
                        break;
                    case R.id.rb_G017_kemungkinan:
                        G017 = 0.5F;
                        break;
                    case R.id.rb_G017_mungkin:
                        G017 = 0.25F;
                        break;
                    case R.id.rb_G017_pasti:
                        G017 = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }

    private void conversionPertanyaan12() {
        binding.rgG018.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_G018_tidak:
                        G018 = 0.0F;
                        break;
                    case R.id.rb_G018_hampir:
                        G018 = 0.75F;
                        break;
                    case R.id.rb_G018_kemungkinan:
                        G018 = 0.5F;
                        break;
                    case R.id.rb_G018_mungkin:
                        G018 = 0.25F;
                        break;
                    case R.id.rb_G018_pasti:
                        G018 = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }

    private void conversionPertanyaan13() {
        binding.rgG019.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_G019_tidak:
                        G019 = 0.0F;
                        break;
                    case R.id.rb_G019_hampir:
                        G019 = 0.75F;
                        break;
                    case R.id.rb_G019_kemungkinan:
                        G019 = 0.5F;
                        break;
                    case R.id.rb_G019_mungkin:
                        G019 = 0.25F;
                        break;
                    case R.id.rb_G019_pasti:
                        G019 = 1.0F;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + checkedId);
                }
            }
        });
    }
}