package lab2;

public class RegistroResumos {
    private String[] tema;
    private String[] conteudo;
    private int numeroDeResumos;
    private int contaResumos;

    public RegistroResumos(int numeroDeResumos){
        this.numeroDeResumos = numeroDeResumos;
        this.conteudo = new String[numeroDeResumos];
        this.tema = new String[numeroDeResumos];
        this.contaResumos = 0;
    }
    public void adiciona(String tema, String conteudo){
        if(!this.temResumo(tema)){
            int idx = this.contaResumos % this.numeroDeResumos;
            this.tema[idx] = tema;
            this.conteudo[idx] = conteudo;
            this.contaResumos++;
        }
    }
    public boolean temResumo(String tema){
        for(int i = 0; i < conta(); i++){
            if(this.tema[i].equals(tema)) {
                return true;
            }
        }
        return false;
    }
    public String[] pegaResumos(){
        String[] pegaResumos = new String[this.tema.length];
        for(int i = 0; i < this.tema.length; i++){
            if(this.tema[i] != null){
                pegaResumos[i] = this.tema[i] + ": " + this.conteudo[i];
            }
        }
        return pegaResumos;
    }
    String imprimeResumos(){
        String saida = "- " + conta() + " resumo(s) cadastrado(s)\n - ";
        for(int i = 0; i < this.conta() ; i++){
            if(i == this.conta()-1) {
                saida += this.tema[i];
            }else{
                saida += this.tema[i] + " | ";
            }
        }
        return saida;
    }
    public int conta(){
        int conta = 0;
        for(int i = 0; i<this.tema.length; i++){
            if(this.tema[i] != null){
                conta++;
            }
        }
        return conta;
    }
}
