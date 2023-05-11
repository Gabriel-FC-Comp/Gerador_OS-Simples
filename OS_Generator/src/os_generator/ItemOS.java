/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os_generator;

/**
 * Classe que representa um item que faz parte da Ordem de Serviço, contendo os métodos
 * e características básicas que um item possuiria em uma OS simples.
 * @author gabif
 */
public class ItemOS{
    
    /**
     * Variável que indica a multiplicidade do item na OS.
     */
    private  int quantidade;
    /**
     * Variável que contem uma descrição breve do que o item representa, ou o nome do mesmo.
     */
    private String descricao;
    /**
     * Variável que armazena o valor unitário do item.
     */
    private float valorUN;
    /**
     * Variável que armazena o valor total do item, considerando sua multiplicidade/qtde.
     */
    private float valorTT;
    /**
     * Variável que armazena o tipo do item, possibilitando categorizá-lo.
     */
    private String tipo;

    /**
     * Método que cria uma nova instância de um item da OS, passados os dados e informações
     * do mesmo.
     * @param quantidade Refere-se a multiplicidade do item na OS.
     * @param descricao Refere-se ao nome/descrição do que o item representa.
     * @param valorUN Refere-se ao valor de uma unidade de item na OS.
     * @param tipo Refere-se ao tipo/categoria pensada para o item.
     */
    public ItemOS(int quantidade, String descricao, float valorUN, String tipo) {
        setQuantidade(quantidade);
        setDescricao(descricao);
        setValorUN(valorUN);
        setValorTT(valorUN*quantidade);
        setTipo(tipo);
    }

    /**
     * Método que atualiza a multiplicidade do item na OS.
     * @param quantidade Refere-se a nova quantidade/multiplicidade do item na OS.
     */
    private void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Método que atualiza a descrição/nome do item na OS.
     * @param descricao Refere-se a nova descrição/nome do item na OS.
     */
    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Método que atualiza o valor unitário do item na OS.
     * @param valorUN Refere-se o novo valor unitário do item na OS.
     */
    private void setValorUN(float valorUN) {
        this.valorUN = valorUN;
    }

    /**
     * Método que atualiza o valor total do item na OS.
     * @param valorTT Refere-se o novo valor total do item na OS.
     */
    private void setValorTT(float valorTT) {
        this.valorTT = valorTT;
    }

    /**
     * Método que atualiza o tipo do item na OS.
     * @param tipo Refere-se o novo tipo do item na OS.
     */
    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Método utilizado para acessar e obter a multiplicidade do item
     * presente na OS.
     * @return Retorna a multiplicidade do item presente na OS.
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Método utilizado para acessar e obter a descrição/nome do item presente na OS.
     * @return Retorna a descrição/nome do item presente na OS.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Método utilizado para acessar e obter o valor unitário do item presente na OS.
     * @return Retorna o valor unitário do item presente na OS.
     */
    public float getValorUN() {
        return valorUN;
    }

    /**
     * Método utilizado para acessar e obter o tipo do item presente na OS.
     * @return Retorna o tipo do item presente na OS.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método utilizado para acessar e obter o valor total do item presente na OS.
     * @return Retorna o valor total do item presente na OS.
     */
    public float getValorTT() {
        return valorTT;
    }

    @Override
    /**
     * Método que converte o os dados do item em uma String no formato desejado
     * para apresentação no documento da OS.
     */
    public String toString() {
        return getQuantidade() + " |-| " + getDescricao() + " |-| " + 
                getValorUN() + " |-| " + getValorTT();
    }
    
}
