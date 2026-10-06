package lab2;

//programa muito bem feito, não acho que exista nada a melhorar

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horas;
    private final int max_notas = 4;
    private double[] notas = new double[max_notas];
    private double n_final;

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        for(int i = 0; i < max_notas; i++){
            this.notas[i] = 0;
        }
    }
    public void cadastraHoras(int horas){
        this.horas += horas;
    }
    public void cadastraNota(int nota, double valorNota){
        this.notas[nota-1] = valorNota;
    }
    public boolean aprovado(){
        for(double nota:this.notas) {
            this.n_final += nota;
        }
        this.n_final /= 4;
        if(this.n_final >= 7.0) {
            return true;
        }
       return false;
    }

    @Override
    public String toString(){
        return this.nomeDisciplina + " " + this.horas + " " + this.n_final + " " + Arrays.toString(this.notas);
    }
}
