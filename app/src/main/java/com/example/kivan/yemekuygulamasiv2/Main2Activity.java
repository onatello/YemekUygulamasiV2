package com.example.kivan.yemekuygulamasiv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;

public class Main2Activity extends AppCompatActivity {

    TextView eksikMazleme1;
    TextView eksikMazleme2;
    TextView eksikMazleme3;
    TextView eksikMazleme4;
    TextView eksikMazleme5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        eksikMazleme1=findViewById(R.id.eksikMalzeme1);
        eksikMazleme2=findViewById(R.id.eksikMalzeme2);
        eksikMazleme3=findViewById(R.id.eksikMalzeme3);
        eksikMazleme4=findViewById(R.id.eksikMalzeme4);
        eksikMazleme5=findViewById(R.id.eksikMalzeme5);

        String olmayanlarKuruFasulye=getIntent().getStringExtra("olmayanlarKuruFasulye");
        String olmayanlarMakarna=getIntent().getStringExtra("olmayanlarMakarna");
        String olmayanlarMucver=getIntent().getStringExtra("olmayanlarMucver");
        String olmayanlarEzogelin=getIntent().getStringExtra("olmayanlarEzogelin");
        String olmayanlarYahni=getIntent().getStringExtra("olmayanlarYahni");
        eksikMazleme5.setText(olmayanlarKuruFasulye);
        eksikMazleme2.setText(olmayanlarMakarna);
        eksikMazleme3.setText(olmayanlarMucver);
        eksikMazleme1.setText(olmayanlarEzogelin);
        eksikMazleme4.setText(olmayanlarYahni);




    }

    public  void mercimekOnClick(View View){

        Intent intent = new Intent(getApplicationContext(),Main22Activity.class);
        String mercimekTarifi = "MALZEMELER : \n" +
                "1 su bardağı kadar kırmızı mercimek\n" +
                "\n" +
                "1,5 yemek kaşığı kadar bulgur\n" +
                "\n" +
                "1,5 yemek kaşığı kadar pirinç\n" +
                "\n" +
                "1 adet soğan\n" +
                "\n" +
                "2 ya da 3 diş sarımsak\n" +
                "\n" +
                "4 ya da 5 yemek kaşığı kadar sıvı yağ\n" +
                "\n" +
                "1 yemek kaşığı kadar domates salçası\n" +
                "\n" +
                "8 su bardağı kadar su ya da tavuk suyu (1 su bardağı 200 ml.)\n" +
                "\n" +
                "Bir tutam tuz\n" +
                "\n" +
                "Bir tutam pul biber\n" +
                "\n" +
                "Bir tutam kekik\n" +
                "\n" +
                "Bir tutam nane\n" +
                "\n" +
                "Yarım limonun suyu\n" +
                "HAZIRLANIŞI :\n" +
                "İlk olarak 1,5 yemek kaşığı bulguru ve 1,5 yemek kaşığı pirinci yıkıyoruz. Sonra iyice süzüp tencerenin içine koyuyoruz. Tencereye 2 bardak su ekledikten sonra ocakta kaynamaya bırakıyoruz.\n" +
                "Çorba kaynamaya başladıktan sonra ocağın altını kısıp kısık ateşte bir süre daha yumuşana kadar haşlıyoruz. En son süzgeç ile bulgurları ve pirinçleri süzüyoruz. Bulgurları ve pirinçleri şimdi kullanmayacağız. O yüzden bir kabın içine koyup kenarda bekletebiliriz.\n" +
                "Ardından bir kesme tahtasının üstünde soğanı ve sarımsakları küçük küçük doğruyoruz. Geniş bir tencere alıp malzemeleri tencerenin içine koyuyoruz. \n" +
                "Tencereye 4 ya da 5 yemek kaşığı kadar sıvı yağı da ekledikten sonra soğanlar ve sarımsaklar yumuşayana kadar kavuruyoruz.\n" +
                "Soğanlar yeterli yumuşaklığa ulaştığı vakit artık \"yemeğin salçalısı\" kısmına geçebiliriz. 1 yemek kaşığı domates salçasını da tencerenin içine ekliyoruz ve bir güzel karıştırıyoruz. Hemen ardından 8 bardak suyu da tencereye döküp kaynamaya bırakıyoruz.\n" +
                "Sonradan ilave etmek zorunda kalmamak için çorbaya tuzunu, nanesini, kekiğini ve istediğimiz diğer baharatları ilave ediyoruz. Bu şekilde çorba kısa bir süre kaynadıktan sonra ocağın altını kısabiliriz. Artık çorbamız kısık ateşte kendi kendine pişecek. Kapağı da kapalı olsa iyi olur.\n" +
                "Eğer çorbanın içindeki malzemelerin iyice parçalanmasını istiyorsanız çorba piştikten sonra bir 20 dakika daha tel çırpıcıyla karıştırarak pişirebilirsiniz. Ama sakın blender kullanmayın. İçindeki malzemelerin tamamen kaybolmaması gerekiyor çünkü. Püre yapmayacağız sonuçta. Fakat tel çırpıcı sizi yeterince tatmin etmezse çorbayı tel süzgeçten kaşıkla ezerek de geçirebilirsiniz. Bu yöntem biraz daha uğraştırıcı ama kesin sonuç veriyor.\n" +
                "Çorba piştikten sonra ocaktan alıyoruz ve üstüne bir miktar limon sıkıyoruz. İstersek sevdiğimiz baharatlarla çorbamızı süsleyip içiyoruz. Ya da tabii sıcak sıcak misafirlerimize ikram ediyoruz. Misafiriniz olmasa da birilerine ikram edebilirsiniz çünkü bu miktarlarda malzemelerle yaptığınız ezogelin çorbası 8-9 kişiye rahat rahat yetecektir.";
        intent.putExtra("mercimekTarifi",mercimekTarifi);

        startActivity(intent);

    }

    public  void makarnaOnClick(View View){
        Intent intent = new Intent(getApplicationContext(),Main22Activity.class);
        String makarnaTarifi = "MALZEMELER:\n" +
                "5-6 orta boy domates\n" +
                "2 diş sarımsak\n" +
                "Yarım yemek kaşığı tereyağı\n" +
                "3 yemek kaşığı sıvı yağ\n" +
                "Tuz\n" +
                "Su\n" +
                "1 paket makarna\n" +
                "2 yemek kaşığı domates salçası (1 yemek kaşığı biber, 1 yemek kaşığı domates salçası şeklinde de yapabilirsiniz)" +
                "Hazırlanışı\n" +
                "İlk olarak domateslerin kabuklarını soyup küp küp doğrayın. İsterseniz 2-3 tane yeşil biber de ekleyebilirsiniz. Daha sonra domatesleri yağda kavurmaya başlayın. 1-2 dakika geçtikten sonra sarımsakları ekleyin. Üzerine salçayı da ekledikten sonra iyice kavurun ve 1 paket makarnayı üzerine dökün.\n" +
                "\n" +
                "Üzerini 2 parmak geçecek seviyede sıcak suyu ekleyin. Böylece makarna domatesin, sarımsağın ve salçanın güzel lezzetini iyice içine çekmiş olacak. ";
        intent.putExtra("makarnaTarifi",makarnaTarifi);

        startActivity(intent);
    }

    public  void fasulyeOnClick(View View){
        Intent intent = new Intent(getApplicationContext(),Main22Activity.class);
        String fasulyeTarifi = "MALZEMELER:\n" +
                "4 yemek kaşığı\n" +
                "sıvı yağ\n" +
                "2 yemek kaşığı\n" +
                "tereyağı\n" +
                "1 adet\n" +
                "orta boy kuru soğan\n" +
                "(yemeklik doğranmış)1 yemek kaşığı\n" +
                "domates salçası\n" +
                "500 gram\n" +
                "kuru fasulye\n" +
                "(1 gece önceden suda bekletilmilş)3 su bardağı\n" +
                "su\n" +
                "1 çay kaşığı\n" +
                "tuz\n" +
                "1 çay kaşığı\n" +
                "toz şeker\n" +
                "1/2 çay kaşığı\n" +
                "tatlı toz kırmızı biber \n" +
                "HAZIRLANIŞI : \n" +
                "4 yemek kaşığı sıvı yağ ve 2 yemek kaşığı tereyağını derin bir tencereye aktarın ve kızdırın.\n" +
                "\n" +
                "1 adet yemeklik doğranmış kuru soğanı da ekleyin ve pembeleşinceye kadar kavurun.\n" +
                "\n" +
                "Soğanlar kavrulduktan sonra 1 yemek kaşığı domates salçasını ekleyin ve kokusu çıkana kadar kavurun.\n" +
                "\n" +
                "Son olarak bir gece önceden suda beklettiğiniz kuru fasulyeleri de tencereye ekledikten sonra 1-2 dakika karıştırın ve 3 su bardağı su, 1 çay kaşığı kırmızı toz biber ve 1 çay kaşığı tuzu ekleyin, kapağını kapatıp fasulyeler yumuşayana kadar pişirin.\n" +
                "\n" +
                "Tane tane pişmiş pirinç pilavı ile servis edin, afiyet olsun!";
        intent.putExtra("fasulyeTarifi",fasulyeTarifi);

        startActivity(intent);
    }

    public  void yahniOnClick(View View){
        Intent intent = new Intent(getApplicationContext(),Main22Activity.class);
        String yahniTarifi = " MALZEMELER:\n" +
                "250 gram dana eti\n" +
                "3-4 adet domates\n" +
                "6-7 adet biber\n" +
                "2 adet soğan\n" +
                "2 büyük boy patates\n" +
                "1 yemek kaşığı salça\n" +
                "2 adet patlıcan\n" +
                "2 adet kabak\n" +
                "2 diş sarımsak\n" +
                "Zeytinyağı\n" +
                "Pul biber, tuz, karabiber\n" +
                "HAZIRLANIŞI : \n" +
                "Az bir yağ ile yemeklik doğranan soğanları pembeleşene kadar kavurun. Biberleri ince halde doğrayıp soğanlarla birlikte kavurun. Bu arada etlerinizi suda haşlayın, yaklaşık yarım saat kadar. Sarımsak ve yemeklik doğranan domatesleri ekleyin. Menemen kıvamına gelene kadar pişirin, yaklaşık 15-20 dakika. Bu sırada patatesleri soyup küp küp doğrayın ve aynı işlemi kabak ve patlıcanlar içinde uygulayın. Etlerin yanına ekleyip ikisini birden kavurun. Kavrulan yemeğimize 1 bardak suda çözdürdüğümüz salçayı ekleyin ve açılınca yemeğe dökün. 1 bardak daha su ekleyin. Sebzeler eriyince ve etleriniz iyice yumuşayınca baharatlarını ve tuzunu ekleyin, 5 dakika sonra kapatın. Afiyet olsun";
        intent.putExtra("yahniTarifi",yahniTarifi);

        startActivity(intent);
    }

    public  void mucverOnClick(View View){
        Intent intent = new Intent(getApplicationContext(),Main22Activity.class);
        String mucverTarifi = "1. Bol suda yıkadığınız kabakları rendenin iri kısmıyla rendeleyin.\n" +
                "2. Kabuğunu soyduğunuz havucu, aynı şekilde rendenin iri kısmıyla rendeleyin.\n" +
                "3. Mücveri sulandırmaması için; rendelenmiş kabakların suyunu sıkarak çıkartın.\n" +
                "4. Taze soğan ve  dereotunu incecik kıyın.\n" +
                "5. Geniş bir kapta rendelenen kabakları, havucu, 2 adet çırpılmış yumurtayı, 1 demet taze soğanı, 1 demet dereotunu, 1 tatlı kaşığı tuzu, karabiberi ve 3 kahve fincanı unu birleştirin.\n" +
                "6. Tüm malzemeler birbiriyle harmanlanıp, macun kıvamını alana kadar spatula yardımıyla karıştırın.\n" +
                "7. Her bir mücver 1 tepeleme yemek kaşığı olacak şekilde ayarlayın ve kızgın yağda altın sarısı rengini alana kadar kızartın.\n" +
                "8. Mücverlerin fazla yağını havlu kağıda süzdürdükten sonra servis tabağına alın ve çırpılmış yoğurt ile servis edin.";

        intent.putExtra("mucverTarifi",mucverTarifi);

        startActivity(intent);
    }

}
