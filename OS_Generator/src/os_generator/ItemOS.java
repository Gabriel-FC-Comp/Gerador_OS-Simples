/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os_generator;

import java.awt.Component;

/**
 *
 * @author gabif
 */
public class ItemOS{
    
    private  int quantidade;
    private String descricao;
    private float valorUN;
    private float valorTT;
    private String tipo;

    public ItemOS(int quantidade, String descricao, float valorUN, String tipo) {
        setQuantidade(quantidade);
        setDescricao(descricao);
        setValorUN(valorUN);
        setValorTT(valorUN*quantidade);
        setTipo(tipo);
    }

    private void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private void setValorUN(float valorUN) {
        this.valorUN = valorUN;
    }

    private void setValorTT(float valorTT) {
        this.valorTT = valorTT;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValorUN() {
        return valorUN;
    }

    public String getTipo() {
        return tipo;
    }

    public float getValorTT() {
        return valorTT;
    }

    @Override
    public String toString() {
        return getQuantidade() + " |-| " + getDescricao() + " |-| " + 
                getValorUN() + " |-| " + getValorTT();
    }
    
    
    
}
