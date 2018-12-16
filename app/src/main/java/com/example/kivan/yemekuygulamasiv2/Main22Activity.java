package com.example.kivan.yemekuygulamasiv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main22Activity extends AppCompatActivity {

    TextView textView1 ;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        textView1=findViewById(R.id.textView1);
        textView1.setMovementMethod(new ScrollingMovementMethod());
        imageView=findViewById(R.id.imageView);


        String mercimekTarifi=getIntent().getStringExtra("mercimekTarifi");
        String mucverTarifi = getIntent().getStringExtra("mucverTarifi");
        String fasulyeTarifi= getIntent().getStringExtra("fasulyeTarifi");
        String makarnaTarifi = getIntent().getStringExtra("makarnaTarifi");
        String yahniTarifi = getIntent().getStringExtra("yahniTarifi");



        if(mucverTarifi != null){
            textView1.setText(mucverTarifi);
            imageView.setImageResource(R.drawable.mucver);}
        if(mercimekTarifi != null){
            textView1.setText(mercimekTarifi);
            imageView.setImageResource(R.drawable.ezogelin);}
        if(fasulyeTarifi != null){
            textView1.setText(fasulyeTarifi);
            imageView.setImageResource(R.drawable.kurufasulye);}
        if(yahniTarifi != null){
            textView1.setText(yahniTarifi);
            imageView.setImageResource(R.drawable.yahni);}
        if(makarnaTarifi != null){
            textView1.setText(makarnaTarifi);
            imageView.setImageResource(R.drawable.makarna);}




    }
}
