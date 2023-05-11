/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os_generator;

/**
 * Classe que representa o cliente que solicitou a Ordem de Serviço, contendo
 * os dados e métodos referente as informações do mesmo que apareceram na OS.
 * @author gabif
 */
public class Cliente {
    
    /**
     * Variável que guarda o nome do cliente.
     */
    private String nome;
    /**
     * Variável que guarda o nome do condutor do veículo que está sendo orçado.
     */
    private String nomeCondutor;
    /**
     * Variável que guarda o tipo do veículo que está sendo feito o orçamento.
     */
    private String veiculo;
    /**
     * Variável que guarda a placa do veículo que está sendo feito o orçamento.
     */
    private String placa;
    /**
     * Variável que guarda o ano do veículo que está sendo orçado.
     */
    private int ano;
    /**
     * Variável que guarda o modelo do motor do veículo que está sendo orçado.
     */
    private String motor;

    /**
     * Cria-se uma instancia de um objeto da classe cliente, conhecendo todas
     * as informações do cliente.
     * @param nome O nome do cliente para quem está sendo feito o orçamento.
     * @param nomeCondutor O nome do condutor do veículo que está sendo orçado.
     * @param veiculo O modelo do veículo que está sendo orçado.
     * @param placa A placa do veículo que está sendo orçado.
     * @param ano O ano do veículo que está sendo orçado.
     * @param motor O modelo do motor do veículo que está sendo orçado.
     */
    public Cliente(String nome, String nomeCondutor, String veiculo, String placa, int ano, String motor) {
        setNome(nome);
        setNomeCondutor(nomeCondutor);
        setVeiculo(veiculo);
        setPlaca(placa);
        setAno(ano);
        setMotor(motor);
    }
    
    /**
     * Redefine o ano do veículo na instância atual.
     * @param ano O ano do veículo que está sendo orçado.
     */
    private void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * Redefine o modelo do motor do veículo na instância atual.
     * @param motor O modelo do motor do veículo que está sendo orçado.
     */
    private void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     * Redefine o nome do cliente na instância atual.
     * @param nome O nome do cliente para qual está sendo feita a OS.
     */
    private void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Redefine o nome do condutor na instância atual.
     * @param nomeCondutor O nome do condutor do veículo que está sendo orçado.
     */
    private void setNomeCondutor(String nomeCondutor) {
        this.nomeCondutor = nomeCondutor;
    }

    /**
     * Redefine a placa do veículo na instância atual.
     * @param placa A placa do veículo que está sendo orçado.
     */
    private void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Redefine o modelo do veículo do veículo na instância atual.
     * @param veiculo O modelo do veículo do veículo que está sendo orçado.
     */
    private void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
    
    /**
     * Usada para acessar e obter o nome do cliente.
     * @return Retorna uma String com o nome do cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Usada para acessar e obter o nome do condutor do veículo.
     * @return Retorna uma String com o nome do condutor do veículo.
     */
    public String getNomeCondutor() {
        return nomeCondutor;
    }

    /**
     * Usada para acessar e obter o modelo do veículo.
     * @return Retorna uma String com o modelo do veículo.
     */
    public String getVeiculo() {
        return veiculo;
    }

    /**
     * Usada para acessar e obter a placa do veículo.
     * @return Retorna uma String com a placa do veículo.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Usada para acessar e obter o ano do veículo.
     * @return Retorna um inteiro representando o ano do veículo.
     */
    public int getAno() {
        return ano;
    }

    /**
     * Usada para acessar e obter o modelo do motor do veículo.
     * @return Retorna uma String com o modelo do motor do veículo.
     */
    public String getMotor() {
        return motor;
    }
    
}
