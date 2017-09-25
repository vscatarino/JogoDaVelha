package br.com.viniciusprojetos.jogodavelha.inteligencia;

import android.widget.Button;

import java.util.List;

/**
 * Created by vinicius on 18/09/17.
 */

public class MotorInferencia {
    Regras regras;
    List<Button> btns;

    public MotorInferencia(List<Button> btns){
        this.btns = btns;
        this.regras = new Regras(btns);
    }

    public Button regraFacil(){
        if(regras.iniciandoJogo() != null){
            return regras.iniciandoJogo();
        }else if(regras.defesaJogo() != null){
            return regras.defesaJogo();
        }else if(regras.ataqueJogo() != null){
            return regras.ataqueJogo();
        }else {
            return regras.getBtVazio();
        }
    }

    public Button regraMedio(){
        if(regras.iniciandoJogo() != null){
            return regras.iniciandoJogo();
        }else if(regras.impedirVitoria() != null){
            return regras.impedirVitoria();
        }else if(regras.defesaJogo() != null){
            return regras.defesaJogo();
        }else if(regras.ataqueJogo() != null){
            return regras.ataqueJogo();
        }else {
            return regras.getBtVazio();
        }
    }

    public Button regraDificil(){
        if(regras.iniciandoJogo() != null){
            return regras.iniciandoJogo();
        }else if(regras.tentarVencer() != null){
            return regras.tentarVencer();
        }else if(regras.impedirVitoria() != null){
            return regras.impedirVitoria();
        }else if(regras.defesaJogo() != null){
            return regras.defesaJogo();
        }else if(regras.ataqueJogo() != null){
            return regras.ataqueJogo();
        }else {
            return regras.getBtVazio();
        }
    }
}
