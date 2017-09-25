package br.com.viniciusprojetos.jogodavelha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Helper helper;
    List<Button> btns = new ArrayList<Button>();
    int nivel =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new Helper(MainActivity.this);
        btns = helper.getTabuleiro();

        click();

        Button btRefr = (Button)findViewById(R.id.btRefresh);
        btRefr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helper.limpaTabuleiro();
//                Intent refresh = new Intent(MainActivity.this, MainActivity.class);
//                startActivity(refresh);
                //this.finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_nivel, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //não permitir troca de nível no meio do jogo
        if(helper.verificaTabuleiroVazio()){
            switch (item.getItemId()) {
                case R.id.menu_nivel1:
                    nivel = 1;
                    return true;
                case R.id.menu_nivel2:
                    nivel = 2;
                    return true;
                case R.id.menu_nivel3:
                    nivel = 3;
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
      helper.controlaNivel(view, nivel);
    }

    public void click() {
        for (int i = 0; i < btns.size(); i++)
            btns.get(i).setOnClickListener(this);
    }

}
