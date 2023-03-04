/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os_generator;

/**
 *
 * @author gabif
 */
public final class Empresa {
    
    private String nome;
    private String endereco;
    private String cep;
    private String telefone;
    private String whatsapp;
    private float escalaLogo;

    public Empresa(String nome, String endereco, String cep, String telefone, String whatsapp, float escalaLogo) {
        setNome(nome);
        setEndereco(endereco);
        setCep(cep);
        setTelefone(telefone);
        setWhatsapp(whatsapp);
        setEscalaLogo(escalaLogo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public void setEscalaLogo(float escalaLogo) {
        this.escalaLogo = escalaLogo;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public float getEscalaLogo() {
        return escalaLogo;
    }
    
}
