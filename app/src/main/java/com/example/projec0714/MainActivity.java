package com.example.projec0714;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    CheckBox chkagree;
    RadioGroup RG1;
    RadioButton RdDog, RdCat, RdRab;
    Button btnOK;
    ImageView imgPET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진보기");

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        chkagree = findViewById(R.id.chkagree);
        RG1 = findViewById(R.id.RG1);
        RdDog = findViewById(R.id.RdDog);
        RdCat = findViewById(R.id.RdCat);
        RdRab = findViewById(R.id.RdRab);
        btnOK = findViewById(R.id.btnOK);
        imgPET = findViewById(R.id.imgPET);

        chkagree.setOnClickListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chkagree.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    RG1.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    imgPET.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    RG1.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    imgPET.setVisibility(View.INVISIBLE);

                }
            }
            btnOK.onCheckedChanged(new view.OnClickListener){
                @Override
                        public void onClick(view v){
                            switch (RG1.getCheckedRadioButtonId()){
                                case R.id.RdDog:
                                    imgPET.setImageResource(R.drawable.dog);
                                    break;
                                case R.id.RdCat:
                                    imgPET.setImageResource(R.drawable.cat);
                                    break;
                                case R.id.RdRab:
                                    imgPET.setImageResource(R.drawable.rabbit);
                                    break;
                                default:
                                    Toast.makeText(MainActivity.this,"동물먼저 선ㅌ책핫요",Toast.LENGTH_SHORT).show();
                }

            }
        }};
        }


    }
}