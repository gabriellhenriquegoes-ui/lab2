package lab2;

/**
 * Representação do objeto resumo, todo resumo
 * precisar ter tema e conteudo.
 *
 */
public class Resumo {
    private String tema;
    private String conteudo;

    /**
     * Inicializa o objeto resumo com os parametros tema e conteudo.
     *
     * @param tema o tema do resumo
     * @param conteudo o conteudo do resumo
     */
    public Resumo(String tema, String conteudo){
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna o tema de um resumo.
     *
     * @return o tema do resumo
     */
    public String getTema(){
        return this.tema;
    }

    /**
     * Retorna o conteudo de um resumo.
     *
     * @return o conteudo do resumo
     */
    public String getConteudo(){
        return this.conteudo;
    }
}
