/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os_generator;

/**
 * Classe que representa a organização que está confeccionando a Ordem de Serviço, 
 * contendo os dados e métodos referente as informações do mesmo que apareceram na OS.
 * @author gabif
 */
public final class Empresa {
    
    /**
     * Variável que salva o nome da empresa.
     */
    private String nome;
    /**
     * Variável que salva o endereço físico da empresa.
     */
    private String endereco;
    /**
     * Variável que salva o CEP do endereço físico da empresa.
     */
    private String cep;
    /**
     * Variável que salva o telefone de contato da empresa.
     */
    private String telefone;
    /**
     * Variável que salva o número de Whatsapp da empresa.
     */
    private String whatsapp;
    /**
     * Variável que permite modificar a escala do logo da empresa no arquivo da OS.
     */
    private float escalaLogo;

    /**
     * Método que constroi uma instancia da empresa, a partir das informações passadas
     * para o método.
     * @param nome O nome da empresa que está emitindo a OS.
     * @param endereco O endereço físico da empresa emissora da OS.
     * @param cep O CEP do endereço físico da empresa emissora da OS.
     * @param telefone O número de telefone da empresa emissora da OS.
     * @param whatsapp O número do Whatsapp da empresa emissora da OS.
     * @param escalaLogo O fator de escala com que a logo aparecerá no arquivo exportado da OS.
     */
    public Empresa(String nome, String endereco, String cep, String telefone, String whatsapp, float escalaLogo) {
        setNome(nome);
        setEndereco(endereco);
        setCep(cep);
        setTelefone(telefone);
        setWhatsapp(whatsapp);
        setEscalaLogo(escalaLogo);
    }

    /**
     * Método usado para atualizar o nome da empresa na instância atual.
     * @param nome O novo nome da empresa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método usado para atualizar o endereço físico da empresa na instância atual.
     * @param endereco O novo endereço físico da empresa.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Método usado para atualizar o CEP do endereço físico da empresa na instância atual.
     * @param cep O novo CEP do endereço físico da empresa.
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Método utilizado para atualizar o número de telefone da empresa na instância atual.
     * @param telefone O novo número de telefone da emrpresa.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Método utilizado para atualizar o número de Whatsapp da empresa.
     * @param whatsapp O novo número de Whatsapp da empresa.
     */
    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    /**
     * Método utilizado para atualizar o fator de escala da logo no arquivo da OS.
     * @param escalaLogo O novo fator de escala desejado para a logo no arquivo da OS.
     */
    public void setEscalaLogo(float escalaLogo) {
        this.escalaLogo = escalaLogo;
    }
    
    /**
     * Metodo usado para acessar e obter o nome da empresa.
     * @return Retorna uma String com o nome da empresa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo usado para acessar e obter o endereço físico da empresa.
     * @return Retorna uma String com o endereço físico da empresa.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Metodo usado para acessar e obter o CEP do endereço físico da empresa.
     * @return Retorna uma String com o CEP do endereço físico da empresa.
     */
    public String getCep() {
        return cep;
    }

    /**
     * Metodo usado para acessar e obter o número de telefone da empresa.
     * @return Retorna uma String com o número de telefone da empresa.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Metodo usado para acessar e obter o número de Whatsapp da empresa.
     * @return Retorna uma String com o número de Whatsapp da empresa.
     */
    public String getWhatsapp() {
        return whatsapp;
    }
    
    /**
     * Metodo usado para acessar e obter a escala desejada para a logo.
     * @return Retorna um valor real que indica a escala da logo no arquivo gerado.
     */
    public float getEscalaLogo() {
        return escalaLogo;
    }
    
}
