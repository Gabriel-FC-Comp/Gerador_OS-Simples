/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os_generator;

import java.awt.Color;

/**
 *
 * @author gabif
 */
public class Configuracoes {

    public static void cores1(){
        configuraCores(Color.BLACK, 
                Color.YELLOW, 
                Color.yellow, 
                Color.black, 
                Color.yellow, 
                Color.black, 
                Color.BLACK, 
                Color.YELLOW);
    }
    
    public static void configuraCores(Color background1, Color background2,
            Color labels1, Color labels2, Color buttons1, Color buttons2,
            Color buttons1Label, Color buttons2Label){
        
        OS_Generator.factory.setCoresUI(background1, background2, buttons1, 
                buttons2, labels1, labels2, buttons1Label, buttons2Label);
        
        OS_Generator.clientData.setCoresUI(background1, labels1, 
                buttons1, buttons1Label);
        
        OS_Generator.menu.setCoresUI(background1, labels1, buttons1, 
                buttons1Label);
        
        OS_Generator.orgData.setCoresUI(background1, labels1, buttons1, 
                buttons1Label);
    }
    
    public static void setCaminho(String novoCaminho){
        OS_Generator.caminho = novoCaminho;
    }
}
