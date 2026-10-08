package lab2;

//programa muito bem feito, não acho que exista nada a melhorar

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horas;
    private final int max_notas = 4;
    private double[] notas = new double[max_notas];
    private int[] pesos = new int[max_notas];
    private double n_final;

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        for(int i = 0; i < this.max_notas; i++){
            this.notas[i] = 0.0;
            this.pesos[i] = 1;
        }
    }

    public Disciplina(String nomeDisciplina,int max_notas){
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        this.notas = new double[max_notas];
        for(int i = 0; i < max_notas; i++){
            this.notas[i] = 0.0;
            this.pesos[i] = 1;
        }
    }
    public Disciplina(String nomeDisciplina, int max_notas, int[] pesos){
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        this.notas = new double[max_notas];
        this.pesos = new int[pesos.length];
        for(int i = 0; i < max_notas; i++){
            this.notas[i] = 0.0;
            this.pesos[i] = pesos[i];
        }
    }

    public void cadastraHoras(int horas){
        this.horas += horas;
    }
    public void cadastraNota(int nota, double valorNota){
        this.notas[nota-1] = valorNota;
    }
    public boolean aprovado(){
        for(int i = 0; i < notas.length; i++) {
            this.n_final += notas[i]*pesos[i];
        }
        this.n_final /= notas.length;
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
