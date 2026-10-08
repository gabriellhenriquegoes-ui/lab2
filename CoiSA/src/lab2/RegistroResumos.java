package lab2;

import java.util.Arrays;
import java.util.Locale;

/**
 * Representação do objeto registro de resumos, contendo objetos do tipo resumo.
 */
public class RegistroResumos {
    private Resumo[] resumo;
    private int numeroDeResumos;
    private int contaResumos;

    /**
     * Constroi um registro de resumos e instancia
     * um novo array com base no numero de resumos.
     * Inicializa a contagem de resumos com zero.
     *
     * @param numeroDeResumos o numero de resumos
     */
    public RegistroResumos(int numeroDeResumos){
        this.numeroDeResumos = numeroDeResumos;
        this.resumo = new Resumo[numeroDeResumos];
        this.contaResumos = 0;
    }

    /**
     * Adiciona o objeto resumo ao array de resumos
     *
     * @param tema o tema do resumo
     * @param conteudo o conteudo do resumo
     */
    public void adiciona(String tema, String conteudo){
        if(!this.temResumo(tema)){
            int idx = this.contaResumos % this.numeroDeResumos;
            Resumo r1 = new Resumo(tema, conteudo);
            resumo[idx] = r1;
            this.contaResumos++;
        }
    }

    /**
     * Verifica se o reumo ja existe no array resumos e retorna um valor boleano.
     *
     * @param tema o tema do resumo
     * @return valor boleano para informar se o resumo ja existe no array resumo
     */
    public boolean temResumo(String tema){
        for(int i = 0; i < conta(); i++){
            if(this.resumo[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Monta um array de resumos com o tema e o conteudo.
     *
     * @return um array de string conteudo os resumos
     */
    public String[] pegaResumos(){
        String[] pegaResumos = new String[this.resumo.length];
        for(int i = 0; i < this.resumo.length; i++){
            if(this.resumo[i] != null){
                pegaResumos[i] = this.resumo[i].getTema() + ": " + this.resumo[i].getConteudo();
            }
        }
        return pegaResumos;
    }

    /**
     * Monta uma string no formato "numero de resumos cadastrados, o tema e o conteudo de resumo"
     *
     * @return a representação em string dos resumos
     */
    public String imprimeResumos(){
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

    /**
     * Conta quantos resumos estão registrados.
     *
     * @return um inteiro corresponde a quantidade de resumos cadastrados
     */
    public int conta(){
        int conta = 0;
        for(int i = 0; i<this.resumo.length; i++){
            if(this.resumo[i] != null){
                conta++;
            }
        }
        return conta;
    }

    /**
     * Verifica se uma palavra faz parte do conteudo de um resumo.
     *
     * @param chaveDeBusca a palavra que deve ser buscada
     * @return um array de resumos na qual a palavra faz parte
     */
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
