package lab2;

//programa muito bem feito, não acho que exista nada a melhorar

import java.util.Arrays;
import java.util.Locale;

public class RegistroResumos {
    private Resumo[] resumo;
    private int numeroDeResumos;
    private int contaResumos;

    public RegistroResumos(int numeroDeResumos){
        this.numeroDeResumos = numeroDeResumos;
        this.resumo = new Resumo[numeroDeResumos];
        this.contaResumos = 0;
    }
    public void adiciona(String tema, String conteudo){
        if(!this.temResumo(tema)){
            int idx = this.contaResumos % this.numeroDeResumos;
            Resumo r1 = new Resumo(tema, conteudo);
            resumo[idx] = r1;
            this.contaResumos++;
        }
    }
    public boolean temResumo(String tema){
        for(int i = 0; i < conta(); i++){
            if(this.resumo[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }
    public String[] pegaResumos(){
        String[] pegaResumos = new String[this.resumo.length];
        for(int i = 0; i < this.resumo.length; i++){
            if(this.resumo[i] != null){
                pegaResumos[i] = this.resumo[i].getTema() + ": " + this.resumo[i].getConteudo();
            }
        }
        return pegaResumos;
    }
    String imprimeResumos(){
        String saida = "- " + conta() + " resumo(s) cadastrado(s)\n- ";
        for(int i = 0; i < this.conta() ; i++){
            if(i == this.conta()-1) {
                saida += this.resumo[i].getTema();
            }else{
                saida += this.resumo[i].getTema() + " | ";
            }
        }
        return saida;
    }
    public int conta(){
        int conta = 0;
        for(int i = 0; i<this.resumo.length; i++){
            if(this.resumo[i] != null){
                conta++;
            }
        }
        return conta;
    }
    public String[] busca(String chaveDeBusca){
        String[] txtbusca = new String[conta()];
        int contem = 0;
        for(int i = 0; i < conta(); i++ ){
            if(resumo[i].getConteudo().toLowerCase().contains(chaveDeBusca.toLowerCase())){
                txtbusca[contem++] = resumo[i].getTema();
            }
        }
        String[] txtfinal = new String[contem];
        for(int i = 0; i < txtbusca.length; i ++){
            if(txtbusca[i] != null){
                txtfinal[i] = txtbusca[i];
            }
        }
        Arrays.sort(txtfinal);
        return txtfinal;
    }
}
