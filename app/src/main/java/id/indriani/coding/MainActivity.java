package id.indriani.coding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_doaharian;
    private Button btn_sholat;
    private Button btn_produk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_doaharian = (Button)findViewById(R.id.btn_doa_harian);
        btn_sholat = (Button)findViewById(R.id.btn_solat);
        btn_produk = (Button)findViewById(R.id.btn_produk);



        btn_doaharian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Doa_harian.class);
                startActivity(intent);
            }
        });


        btn_sholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SholatApp.class);
                startActivity(intent);
            }
        });


        btn_produk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, produkok.class);
                startActivity(intent);
            }
        });
    }
}
