package lab2;
/**
 *Representa o descanso de um aluno, podendo ser consultado o estado do aluno a qualquer momento.
 *
 * @author Gabriell Goes
 */


public class Descanso {
    private int descanso;
    private int semanas;

    /**
     * inicializa o descanso.
     * no qual as horas de descanso começam zeradas e começa na semana 1.
     */
    public Descanso(){
        this.descanso = 0;
        this.semanas = 1;
    }

    /**
     * define a quantidade de horas de descanso
     *
     * @param descanso inteiro que representa a quantidade de horas de descanso de um aluno
     */
    public void defineHorasDescanso(int descanso){
        this.descanso = descanso;
    }

    /**
     * define a quantidade de semanas de descanso.
     *
     * @param semanas inteiro que representa a quatidade de semanas.
     */
    public void defineNumeroSemanas(int semanas) {
        this.semanas = semanas;
    }

    /**
     *Calculo da quantidade de horas de descanso que aluno tem em cada semana e retorna o estado do aluno(descansado ou cansado).
     *
     * @return retorna o estado do aluno.
     */
    public String getStatusGeral(){
        if((this.descanso/this.semanas) >= 26){
            return "descansado";
        }else{
            return "cansado";
        }
    }
}