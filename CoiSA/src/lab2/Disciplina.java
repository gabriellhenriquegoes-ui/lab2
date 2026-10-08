package lab2;

import java.util.Arrays;

/**
 * Representação de um objeto disciplina, identificado pelo nome.
 * contendo um array de notas e pesos.
 *
 * @author Gabriell Goes
 */
public class Disciplina {
    private String nomeDisciplina;
    private int horas;
    private final int max_notas = 4;
    private double[] notas = new double[max_notas];
    private int[] pesos = new int[max_notas];
    private double n_final;


    /**
     * Inicializa o objeto disciplia recebendo como parametro o nome da disciplina.
     * Cada nota é inicializada com zero.
     * As horas estudas inicialmente é zero.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        for(int i = 0; i < this.max_notas; i++){
            this.notas[i] = 0.0;
            this.pesos[i] = 1;
        }
    }

    /**
     * Inicializa o objeto disciplia recebendo como parametro o nome da disciplina
     * e a quantidade de notas.
     * Inicializa as notas com zero.
     * Instancia um novo array com o tamnho igual ao da quantidade de notas.
     * As horas estudas inicialmente é zero.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param max_notas a quantidade de notas
     */
    public Disciplina(String nomeDisciplina,int max_notas){
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        this.notas = new double[max_notas];
        for(int i = 0; i < max_notas; i++){
            this.notas[i] = 0.0;
            this.pesos[i] = 1;
        }
    }

    /**
     * Inicializa o objeto disciplia recebendo como parametro o nome da disciplina, a quantidade de notas
     * e um array contendo o peso de cada nota.
     * Instancia dois novos arrays de notas e pesos.
     * As notas são inicializadas com zero.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param max_notas a quantidade de notas
     * @param pesos array com o peso de cada nota
     */
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

    /**
     * Adiciona horas de estudo.
     *
     * @param horas quantidade que deve ser somada a horas já estudadas
     */
    public void cadastraHoras(int horas){
        this.horas += horas;
    }

    /**
     * Cadastra a nota da prova na nota correspondente.
     *
     * @param nota a nota correspondente
     * @param valorNota o valor da nota que deve ser associado
     */
    public void cadastraNota(int nota, double valorNota){
        this.notas[nota-1] = valorNota;
    }

    /**
     * Calcula a media do estudante e informa se ele foi aprovado.
     *
     * @return valor boleano informando se o estudante foi aprovado
     */
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

    /**
     * Metodo que retorna uma String contendo a situação da disciplina.
     * Seguindo o formato "Nome da disciplina, horas estudadas, media final e as notas que o aluno tirou em cada prova."
     * @return
     */
    @Override
    public String toString(){
        return this.nomeDisciplina + " " + this.horas + " " + this.n_final + " " + Arrays.toString(this.notas);
    }
}
