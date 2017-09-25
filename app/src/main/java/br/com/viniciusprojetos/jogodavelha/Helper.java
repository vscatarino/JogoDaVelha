package br.com.viniciusprojetos.jogodavelha;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

import br.com.viniciusprojetos.jogodavelha.inteligencia.MotorInferencia;
import br.com.viniciusprojetos.jogodavelha.modelo.Tabuleiro;


/**
 * Created by vcata on 23/09/2016.
 */
public class Helper {
    MainActivity activity;
    Tabuleiro tabuleiro;
    int nivel;

    public Helper(MainActivity activity) {
        this.activity = activity;
        tabuleiro = new Tabuleiro(this.activity);

    }

    public List<Button> getTabuleiro() {
        return tabuleiro.getTabuleiro();
    }

    public void controlaNivel(View view, int nivel) {
        this.nivel = nivel;
        switch (nivel) {
            case 1:
                nivel1(view);
                break;
            case 2:
                nivel2(view);
                break;
            case 3:
                nivel3(view);
                break;
            default:
                Toast.makeText(activity, "Escolha o nível de dificuldade!", Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void jogadaFacil(int n, boolean jogador, MotorInferencia mi){
        Button bt = getTabuleiro().get(n);
       if (tabuleiro.verificaCasaVazia(bt)){
            tabuleiro.marcaTabuleiro(jogador, bt);
            jogador = false;
            jogadaFacilSeguinte(jogador, mi);
       }
    }

    public void jogadaFacilSeguinte(Boolean jogador, MotorInferencia mi) {
        Button bt = mi.regraFacil();
        switch (this.nivel){
            case 1:
                bt = mi.regraFacil();
                break;
            case 2:
                bt = mi.regraMedio();
                break;
            case 3:
                bt = mi.regraDificil();
                break;
            default:
                break;
        }
        tabuleiro.marcaTabuleiro(jogador, bt);
        if(tabuleiro.verificaJogoTerminado())
            tabuleiro.exibeVencedor();
    }

    public void limpaTabuleiro(){
       tabuleiro.desmarcaTabuleiro();
    }

    public boolean verificaTabuleiroVazio(){
        for(Button bt : getTabuleiro()){
            if(!tabuleiro.verificaCasaVazia(bt))
                return false;
        }
        return true;
    }



    public void nivel1(View view) {
        boolean jogador = true;
        MotorInferencia mi = new MotorInferencia(getTabuleiro());
        if (!tabuleiro.verificaJogoTerminado()) {
            switch (view.getId()) {
                case R.id.button0:
                    jogadaFacil(0, jogador, mi);
                    break;
                case R.id.button1:
                    jogadaFacil(1, jogador, mi);
                    break;
                case R.id.button2:
                    jogadaFacil(2, jogador, mi);
                    break;
                case R.id.button3:
                    jogadaFacil(3, jogador, mi);
                    break;
                case R.id.button4:
                    jogadaFacil(4, jogador, mi);
                    break;
                case R.id.button5:
                    jogadaFacil(5, jogador, mi);
                    break;
                case R.id.button6:
                    jogadaFacil(6, jogador, mi);
                    break;
                case R.id.button7:
                    jogadaFacil(7, jogador, mi);
                    break;
                case R.id.button8:
                    jogadaFacil(8, jogador, mi);
                    break;
                default:
                    break;
            }
        }
    }

    /*//////////////////////////////////////////////////////////////////////////////////////////*/

    public void nivel2(View view) {
        Boolean jogador = true;
        MotorInferencia mi = new MotorInferencia(getTabuleiro());

        if (!tabuleiro.verificaJogoTerminado()) {
            switch (view.getId()) {
                case R.id.button0:
                    jogadaFacil(0, jogador, mi);
                    break;
                case R.id.button1:
                    jogadaFacil(1, jogador, mi);
                    break;
                case R.id.button2:
                    jogadaFacil(2, jogador, mi);
                    break;
                case R.id.button3:
                    jogadaFacil(3, jogador, mi);
                    break;
                case R.id.button4:
                    jogadaFacil(4, jogador, mi);
                    break;
                case R.id.button5:
                    jogadaFacil(5, jogador, mi);
                    break;
                case R.id.button6:
                    jogadaFacil(6, jogador, mi);
                    break;
                case R.id.button7:
                    jogadaFacil(7, jogador, mi);
                    break;
                case R.id.button8:
                    jogadaFacil(8, jogador, mi);
                    break;
                default:
                    break;
            }
        }
    }

    /*//////////////////////////////////////////////////////////////////////////////////////////////////*/
    public void nivel3(View view) {
        Boolean jogador = true;
        MotorInferencia mi = new MotorInferencia(getTabuleiro());

        if (!tabuleiro.verificaJogoTerminado()) {
            switch (view.getId()) {
                case R.id.button0:
                    jogadaFacil(0, jogador, mi);
                    break;
                case R.id.button1:
                    jogadaFacil(1, jogador, mi);
                    break;
                case R.id.button2:
                    jogadaFacil(2, jogador, mi);
                    break;
                case R.id.button3:
                    jogadaFacil(3, jogador, mi);
                    break;
                case R.id.button4:
                    jogadaFacil(4, jogador, mi);
                    break;
                case R.id.button5:
                    jogadaFacil(5, jogador, mi);
                    break;
                case R.id.button6:
                    jogadaFacil(6, jogador, mi);
                    break;
                case R.id.button7:
                    jogadaFacil(7, jogador, mi);
                    break;
                case R.id.button8:
                    jogadaFacil(8, jogador, mi);
                    break;
                default:
                    break;
            }
        }
    }
}
