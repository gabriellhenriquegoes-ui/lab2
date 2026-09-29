package lab2;

public class Disciplina {
    private String nomeDisciplina;
    private int horas;
    private final int max_notas = 4;
    private double[] notas = new double[max_notas];

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        for(int i = 0; i < max_notas; i++){
            this.notas[i] = 0
        }
    }
    public void cadastraHoras(int horas){
        this.horas += horas;
    }
    public void cadastraNota(int nota, double valorNota){
        this.notas[nota-1] = valorNota;
    }
    public boolean aprovado(){
        int soma = 0;
        for(int nota:this.notas){
            soma +=
        }
    }
}
