/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os_generator;

/**
 *
 * @author gabif
 */
public class Cliente {
    
    private String nome;
    private String nomeCondutor;
    private String veiculo;
    private String placa;
    private int ano;
    private String motor;

    public Cliente(String nome, String nomeCondutor, String veiculo, String placa, int ano, String motor) {
        setNome(nome);
        setNomeCondutor(nomeCondutor);
        setVeiculo(veiculo);
        setPlaca(placa);
        setAno(ano);
        setMotor(motor);
    }
    
    private void setAno(int ano) {
        this.ano = ano;
    }

    private void setMotor(String motor) {
        this.motor = motor;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setNomeCondutor(String nomeCondutor) {
        this.nomeCondutor = nomeCondutor;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    private void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCondutor() {
        return nomeCondutor;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public String getMotor() {
        return motor;
    }
    
}
