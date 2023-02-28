/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package os_generator;

import java.util.ArrayList;
import ui.*;

/**
 *
 * @author gabif
 */
public class OS_Generator {

    public static final MenuUI menu = new MenuUI();
    public static final ClientDataUI clientData = new ClientDataUI();
    public static final FactoryUI factory = new FactoryUI();
    public static Cliente clientInfo;
    public static ArrayList<ItemOS> produtos = new ArrayList<>();
    public static ArrayList<ItemOS> servicos = new ArrayList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        menu.setVisible(true);
    }
    
    public static void atualizaCliente(String nome, String nomeCondutor, String veiculo, String placa, int ano, String motor){
        OS_Generator.clientInfo = new Cliente(nome, nomeCondutor, veiculo, placa, ano, motor);
    }
    
    public static float getTTprodutos(){
        float ret = 0;
        for(int i = 0; i < produtos.size(); i++){
            ret += produtos.get(i).getValorTT();
        }
        return ret;
    }
    
    public static float getTTservicos(){
        float ret = 0;
        for(int i = 0; i < servicos.size(); i++){
            ret += servicos.get(i).getValorTT();
        }
        return ret;
    }
    
    public static float getTT(){
        return getTTprodutos()+getTTservicos();
    }
}
