package lab2;

/**
 *
 */

public class RegistroTempoOnline {
    private int tempoonline;
    private String nomedisciplina;
    private int tempoesperado;

    public RegistroTempoOnline(String nomedisciplina, int tempoesperado){
        this.nomedisciplina = nomedisciplina;
        this.tempoesperado = tempoesperado;
        this.tempoonline = 0;
    }
    public RegistroTempoOnline(String nomedisciplina){
        this.nomedisciplina = nomedisciplina;
        this.tempoesperado = 120;
        this.tempoonline = 0;
    }
    public void adicionaTempoOnline(int tempoonline){
        this.tempoonline += tempoonline;
    }
    public boolean atingiuMetaTempoOnline(){
        if(this.tempoonline >= this.tempoesperado){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return  this.nomedisciplina + " " + this.tempoonline + "/" + this.tempoesperado;
    }
}
