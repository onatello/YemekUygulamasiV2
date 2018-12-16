package com.example.kivan.yemekuygulamasiv2;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Notification;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MainActivity extends AppCompatActivity {



    CheckBox domates;
    CheckBox sogan;
    CheckBox biber;
    CheckBox kuruFasulye;
    CheckBox makarna;
    CheckBox siviyag;
    CheckBox patates;
    CheckBox patlican;
    CheckBox kabak;
    CheckBox tereyagi;
    CheckBox salca;
    CheckBox zeytinYagi;
    CheckBox mercimek;
    CheckBox bulgur;
    CheckBox pirinc;
    CheckBox sarimsak;
    CheckBox limon;
    CheckBox yumurta;
    CheckBox tazeSogan;
    CheckBox dereotu;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference myRef;
    private StorageReference mStorageRef;




    int a = -1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bulgur=findViewById(R.id.bulgur);
        pirinc=findViewById(R.id.pirinc);
        sarimsak=findViewById(R.id.sarimsak);
        limon=findViewById(R.id.limon);
        yumurta=findViewById(R.id.yumurta);
        tazeSogan=findViewById(R.id.tazaSogan);
        dereotu=findViewById(R.id.dereotu);
        mercimek=findViewById(R.id.mercimek);
        makarna = findViewById(R.id.makarna);
        domates = findViewById(R.id.domates);
        kuruFasulye=findViewById(R.id.kuruFasulye);
        biber = findViewById(R.id.biber);
        sogan=findViewById(R.id.sogan);
        siviyag=findViewById(R.id.siviYag);
        patates=findViewById(R.id.patates);
        patlican=findViewById(R.id.patlican);
        kabak=findViewById(R.id.kabak);
        tereyagi=findViewById(R.id.tereyagi);
        salca=findViewById(R.id.salca);
        zeytinYagi=findViewById(R.id.zeytinYagi);



        Toast.makeText(MainActivity.this,"Elinizde Bulunan Malzemeleri Seçiniz ",Toast.LENGTH_LONG).show();








    }





    public void yemekci(View view){

        ArrayList<String> kuruFasulyeMalzemeleri = new ArrayList<>();
        kuruFasulyeMalzemeleri.add("kuru fasulye");
        kuruFasulyeMalzemeleri.add("soğan");
        kuruFasulyeMalzemeleri.add("domates");
        kuruFasulyeMalzemeleri.add("tereyağı");
        kuruFasulyeMalzemeleri.add("sıvı yağ");

        ArrayList<String> sebzeliYahniMalzemeleri = new ArrayList<>();
        sebzeliYahniMalzemeleri.add("soğan");
        sebzeliYahniMalzemeleri.add("domates");
        sebzeliYahniMalzemeleri.add("biber");
        sebzeliYahniMalzemeleri.add("salça");
        sebzeliYahniMalzemeleri.add("patates");
        sebzeliYahniMalzemeleri.add("patlıcan");
        sebzeliYahniMalzemeleri.add("kabak");
        sebzeliYahniMalzemeleri.add("zeytin yağı");

        ArrayList <String> makarnaMalzemeleri = new ArrayList<>();
        makarnaMalzemeleri.add("domates");
        makarnaMalzemeleri.add("makarna");
        makarnaMalzemeleri.add("sıvı yağ");
        makarnaMalzemeleri.add("sarımsak");
        makarnaMalzemeleri.add("tereyağı");

        ArrayList <String> ezogelinCorbasi = new ArrayList<>();
        ezogelinCorbasi.add("soğan");
        ezogelinCorbasi.add("salça");
        ezogelinCorbasi.add("mercimek");
        ezogelinCorbasi.add("bulgur");
        ezogelinCorbasi.add("pirinç");
        ezogelinCorbasi.add("sıvı yağ");
        ezogelinCorbasi.add("limon");
        ezogelinCorbasi.add("sarımsak");

        ArrayList <String> mucver = new ArrayList<>();

        mucver.add("kabak");
        mucver.add("yumurta");
        mucver.add("taze soğan");
        mucver.add("dereotu");






        ArrayList<String> eldekiMalzemeler = new ArrayList<>();
        if(domates.isChecked()){
            eldekiMalzemeler.add("domates");
        }
        if(tereyagi.isChecked()){
            eldekiMalzemeler.add("tereyağı");
        }
        if(siviyag.isChecked()){
            eldekiMalzemeler.add("sıvı yağ");
        }
        if(makarna.isChecked()){
            eldekiMalzemeler.add("makarna");
        }
        if(sogan.isChecked()){
            eldekiMalzemeler.add("soğan");
        }
        if(salca.isChecked()){
            eldekiMalzemeler.add("salça");
        }
        if(kuruFasulye.isChecked()){
            eldekiMalzemeler.add("kuru fasulye");
        }
        if(biber.isChecked()){
            eldekiMalzemeler.add("biber");
        }
        if(patates.isChecked()){
            eldekiMalzemeler.add("patates");
        }
        if(patlican.isChecked()){
            eldekiMalzemeler.add("patlıcan");
        }
        if(kabak.isChecked()){
            eldekiMalzemeler.add("kabak");
        }
        if(zeytinYagi.isChecked()){
            eldekiMalzemeler.add("zeytin yağı");
        }
        if(mercimek.isChecked()){
            eldekiMalzemeler.add("mercimek");
        }
        if(bulgur.isChecked()){
            eldekiMalzemeler.add("bulgur");
        }
        if(pirinc.isChecked()){
            eldekiMalzemeler.add("pirinç");
        }
        if(sarimsak.isChecked()){
            eldekiMalzemeler.add("sarımsak");
        }
        if(limon.isChecked()){
            eldekiMalzemeler.add("limon");
        }
        if(yumurta.isChecked()){
            eldekiMalzemeler.add("yumurta");
        }
        if(tazeSogan.isChecked()){
            eldekiMalzemeler.add("taze soğan");
        }
        if(dereotu.isChecked()){
            eldekiMalzemeler.add("dereotu");
        }

        String olmayanlarKuruFasulye = "Eksik Malzemeler :  ";
        ArrayList<String> notCommonElement1 = new ArrayList<>(kuruFasulyeMalzemeleri);
        ArrayList<String> list1 = new ArrayList<>(eldekiMalzemeler);
        notCommonElement1.removeAll(list1);
        for(String elements : notCommonElement1) {
            olmayanlarKuruFasulye = olmayanlarKuruFasulye+"    " + elements;

        }



        String olmayanlarMakarna = "Eksik Malzemeler :  ";
        ArrayList<String> notCommonElement2 = new ArrayList<>(makarnaMalzemeleri);
        ArrayList<String> list2 = new ArrayList<>(eldekiMalzemeler);
        notCommonElement2.removeAll(list2);
        for(String elements : notCommonElement2) {
            olmayanlarMakarna = olmayanlarMakarna+"    " + elements;

        }

        String olmayanlarMucver = " Eksik Malzemeler : ";
        ArrayList<String> notCommonElement3 = new ArrayList<>(mucver);
        ArrayList<String> list3 = new ArrayList<>(eldekiMalzemeler);
        notCommonElement3.removeAll(list3);
        for(String elements : notCommonElement3) {
            olmayanlarMucver = olmayanlarMucver+"     " + elements;

        }

        String olmayanlarEzogelin = "Eksik Malzemeler :  ";
        ArrayList<String> notCommonElement4 = new ArrayList<>(ezogelinCorbasi);
        ArrayList<String> list4 = new ArrayList<>(eldekiMalzemeler);
        notCommonElement4.removeAll(list4);
        for(String elements : notCommonElement4) {
            olmayanlarEzogelin = olmayanlarEzogelin+"    " + elements;

        }

        String olmayanlarYahni = "Eksik Malzemeler :  ";
        ArrayList<String> notCommonElement5 = new ArrayList<>(sebzeliYahniMalzemeleri);
        ArrayList<String> list5 = new ArrayList<>(eldekiMalzemeler);
        notCommonElement5.removeAll(list5);
        for(String elements : notCommonElement5) {
            olmayanlarYahni = olmayanlarYahni+"    " + elements;

        }


        if(eldekiMalzemeler.size()>0){
            Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
            intent.putExtra("olmayanlarKuruFasulye",olmayanlarKuruFasulye);
            intent.putExtra("olmayanlarMakarna",olmayanlarMakarna);
            intent.putExtra("olmayanlarMucver",olmayanlarMucver);
            intent.putExtra("olmayanlarEzogelin",olmayanlarEzogelin);
            intent.putExtra("olmayanlarYahni",olmayanlarYahni);

            startActivity(intent);

        }
        if(eldekiMalzemeler.size() == 0){
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Uyarı !!");
            builder.setMessage("Malzeme seçmeden devam etmek istediğinize emin misiniz ? ");
            builder.setCancelable(false);

            final String finalOlmayanlarKuruFasulye = olmayanlarKuruFasulye;
            final String finalOlmayanlarMakarna = olmayanlarMakarna;
            final String finalOlmayanlarMucver = olmayanlarMucver;
            final String finalOlmayanlarEzogelin = olmayanlarEzogelin;
            final String finalOlmayanlarYahni = olmayanlarYahni;
            builder.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                    intent.putExtra("olmayanlarKuruFasulye", finalOlmayanlarKuruFasulye);
                    intent.putExtra("olmayanlarMakarna", finalOlmayanlarMakarna);
                    intent.putExtra("olmayanlarMucver", finalOlmayanlarMucver);
                    intent.putExtra("olmayanlarEzogelin", finalOlmayanlarEzogelin);
                    intent.putExtra("olmayanlarYahni", finalOlmayanlarYahni);

                    startActivity(intent);



                    Toast.makeText(MainActivity.this,"Açılıyor",Toast.LENGTH_LONG).show();
                }
            });

            builder.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this,"Lütfen Malzeme Seçiniz !!! ",Toast.LENGTH_LONG).show();

                }
            });

            AlertDialog dialog = builder.create();
            dialog.show();

        }



    }








}
