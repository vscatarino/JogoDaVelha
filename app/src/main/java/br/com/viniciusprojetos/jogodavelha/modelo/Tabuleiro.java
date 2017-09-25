package br.com.viniciusprojetos.jogodavelha.modelo;

import android.graphics.Color;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import br.com.viniciusprojetos.jogodavelha.MainActivity;
import br.com.viniciusprojetos.jogodavelha.R;

/**
 * Created by vinicius on 18/09/17.
 */

public class Tabuleiro {
    List<Button> btns = new ArrayList<>();
    MainActivity activity;
    String str1, str2, str3;
    List<Button> vencedor = new ArrayList<>();

    public Tabuleiro(MainActivity activity) {
        this.activity = activity;
        this.btns.add((Button) this.activity.findViewById(R.id.button0));
        this.btns.add((Button) this.activity.findViewById(R.id.button1));
        this.btns.add((Button) this.activity.findViewById(R.id.button2));
        this.btns.add((Button) this.activity.findViewById(R.id.button3));
        this.btns.add((Button) this.activity.findViewById(R.id.button4));
        this.btns.add((Button) this.activity.findViewById(R.id.button5));
        this.btns.add((Button) this.activity.findViewById(R.id.button6));
        this.btns.add((Button) this.activity.findViewById(R.id.button7));
        this.btns.add((Button) this.activity.findViewById(R.id.button8));
    }

    /*Acredito que isso será desnecessário... Verificar a necessidade deste método*/
    public List<Button> getTabuleiro() {
        return this.btns;
    }

     public boolean verificaCasaVazia(Button bt) {
        String aux = bt.getText().toString();
        return aux.isEmpty();
    }

    public boolean verificaJogoTerminado() {
        return (temHorizontalCompleta() || temVerticalCompleta() || temDiagonalPrincCompleta() || temDiagonalSecCompleta());
    }

    public boolean temHorizontalCompleta() {
        int j;
        for (j = 0; j < btns.size(); j = j + 3) {
            str1 = TxtDoBotao(btns.get(j));
            str2 = TxtDoBotao(btns.get(j + 1));
            str3 = TxtDoBotao(btns.get(j + 2));
            if (str1.equals(str2) && str1.equals(str3) && (!str1.isEmpty() || !str2.isEmpty() || !str3.isEmpty())){
                addVencedor(j, j+1, j+2 );
                return true;
            }
        }
        return false;
    }

    public boolean temVerticalCompleta() {
        int j, i = 0;
        for (j = 0; j < btns.size(); j = j + 3) {
            str1 = TxtDoBotao(btns.get(i));
            str2 = TxtDoBotao(btns.get(i + 3));
            str3 = TxtDoBotao(btns.get(i + 6));
            i++;
            if (str1.equals(str2) && str1.equals(str3) && (!str1.isEmpty() || !str2.isEmpty() || !str3.isEmpty())) {
                addVencedor(i-1, i+2, i+5);
                return true;
            }
        }
        return false;
    }

    public boolean temDiagonalPrincCompleta() {
        int j, i = 0;
        for (j = 0; j < btns.size(); j = j + 3) {
            str1 = TxtDoBotao(btns.get(i));
            str2 = TxtDoBotao(btns.get(i + 4));
            str3 = TxtDoBotao(btns.get(i + 8));
            if (str1.equals(str2) && str1.equals(str3) && (!str1.isEmpty() || !str2.isEmpty() || !str3.isEmpty())) {
                addVencedor(i, i+4, i+8 );//
                return true;
            }
        }
        return false;
    }

    public boolean temDiagonalSecCompleta() {
        int j, i = 0;
        for (j = 0; j < btns.size(); j = j + 3) {
            str1 = TxtDoBotao(btns.get(i + 2));
            str2 = TxtDoBotao(btns.get(i + 4));
            str3 = TxtDoBotao(btns.get(i + 6));
            if (str1.equals(str2) && str1.equals(str3) && (!str1.isEmpty() || !str2.isEmpty() || !str3.isEmpty())) {
                addVencedor(i+2, i+4, i+6);
                return true;
            }
        }
        return false;
    }

    public String TxtDoBotao(Button bt) {
        String str = bt.getText().toString();
        return str;
    }

    public void marcaTabuleiro(boolean jogador, Button bt) {
        if (jogador) {
            bt.setText("X");
            bt.setTextColor(Color.parseColor("#FFFFFF"));
        } else {
            if (!verificaJogoTerminado() && bt.getText().toString().isEmpty()) {
                bt.setText("O");
                bt.setTextColor(Color.parseColor("#DCDCDC"));
            }
            exibeVencedor();
        }

    }

    public void desmarcaTabuleiro(){
        for(Button bt : btns){
            bt.setText("");
        }
    }

    public List<Button> getVencedor(){
        return vencedor;
    }

    public void addVencedor(int i1, int i2, int i3){
        vencedor.add(btns.get(i1));
        vencedor.add(btns.get(i2));
        vencedor.add(btns.get(i3));
    }

    public void exibeVencedor(){
        List<Button> btVencedor = getVencedor();
        for(Button bt : btVencedor){
            bt.setTextColor(Color.parseColor("#FFD700"));
        }
        btVencedor.clear();
    }

}