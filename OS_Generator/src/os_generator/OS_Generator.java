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
    public static ArrayList<ItemOS> items = new ArrayList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        menu.setVisible(true);
    }
    
    public static void atualizaCliente(String nome, String nomeCondutor, String veiculo, String placa, int ano, String motor){
        OS_Generator.clientInfo = new Cliente(nome, nomeCondutor, veiculo, placa, ano, motor);
    }
    
}
