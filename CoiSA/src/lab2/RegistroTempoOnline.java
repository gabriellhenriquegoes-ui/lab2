package lab2;

/**
 *Registra a quantidade horas que um aluno tem dedicado uma disciplina remota.
 *
 * @author Gabriell Goes
 */

public class RegistroTempoOnline {
    private int tempoonline;
    private String nomedisciplina;
    private int tempoesperado;

    /**
     * Constroi o registro de tempo online de uma disciplina com o nome da disciplina e o tempo esperado.
     * todo registro de tempo online começa como tempo online nulo.
     *
     * @param nomedisciplina o nome da disciplina.
     * @param tempoesperado o tempo online esperado.
     */
    public RegistroTempoOnline(String nomedisciplina, int tempoesperado){
        this.nomedisciplina = nomedisciplina;
        this.tempoesperado = tempoesperado;
        this.tempoonline = 0;
    }

    /**
     * Constroi o registro de tempo online de uma disciplina com o nome da disciplina.
     * todo registro de tempo online começa como tempo online nulo.
     * tempo online esperado é inicializado com o valor padrão: 120.
     *
     * @param nomedisciplina o nome da disciplina
     */
    public RegistroTempoOnline(String nomedisciplina){
        this.nomedisciplina = nomedisciplina;
        this.tempoesperado = 120;
        this.tempoonline = 0;
    }

    /**
     * Adiciona tempo online ao tempo online já acumulado pelo aluno.
     *
     * @param tempoonline o tempo online que deve ser adicionado ao tempo online ja existente
     */
    public void adicionaTempoOnline(int tempoonline){
        this.tempoonline += tempoonline;
    }

    /**
     * Verifica se o aluno ja atingiu o tempo online e retorn um boolean;
     *
     * @return o resultado se o tempo online foi atingido.
     */
    public boolean atingiuMetaTempoOnline(){
        if(this.tempoonline >= this.tempoesperado){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Retorna a representação textual do registro de tempo online.
     * Segue o formato "nome da disciplina - tempo online - tempo esperado"
     * @return
     */
    public String toString(){
        return  this.nomedisciplina + " " + this.tempoonline + "/" + this.tempoesperado;
    }
}
