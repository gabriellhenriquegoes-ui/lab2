package lab2;

public class RegistroResumos {
    private String[] tema;
    private String[] conteudo;
    private int numeroDeResumos;
    private int resumos;

    public RegistroResumos(int numeroDeResumos){
        this.numeroDeResumos = numeroDeResumos;
        String[] conteudo = new String[numeroDeResumos];
        String[] tema = new String[numeroDeResumos];
        this.resumos = 0;
    }
    public void adicionaResumo(String tema, String conteudo){
        if(!this.temResumo(tema)){
            int idx = this.resumos % this.numeroDeResumos;
            this.tema[idx] = tema;
            this.conteudo[idx] = conteudo;
            this.resumos++;
        }
    }
    public boolean temResumo(String tema){
        for(String tema2:this.tema){
            if(tema2.equals(tema)) {
                return true;
            }
        }
        return false;
    }
}
