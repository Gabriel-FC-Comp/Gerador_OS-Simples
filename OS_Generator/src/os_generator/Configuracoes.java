/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os_generator;

import java.awt.Color;

/**
 * Organiza os métodos que alteram as configurações do software.
 * @author gabif
 */
public class Configuracoes {

    /**
     * Método que redefine as cores das UIs do software para o padrão 1.
     */
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
    
    /**
     * Método que altera as cores dos elementos das interfaces gráficas, usando
     * tokens de cores para manter uma unidade visual no programa e alterar
     * facilmente todas as cores no mesmo.
     * @param background1 A cor de fundo predominante no software.
     * @param background2 A cor de fundo de porções/abas secundárias do software.
     * @param labels1 A cor dos textos presentes no fundo predominante do software.
     * @param labels2 A cor dos textos presentes no fundo de porções/abas secundárias do software.
     * @param buttons1 A cor de fundo dos botões presentes no fundo predominante do software.
     * @param buttons2 A cor de fundo dos botões presentes no fundo de porções/abas secundárias do software.
     * @param buttons1Label A cor dos textos dos botões presentes no fundo predominante do software.
     * @param buttons2Label A cor dos textos dos botões presentes no fundo de porções/abas secundárias do software.
     */
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
    
    /**
     * Método que altera o caminho onde será salvo o arquivo Latex exportado
     * pelo programa.
     * @param novoCaminho Contém o novo caminho que será utilizado para salvar o arquivo exportado.
     */
    public static void setCaminho(String novoCaminho){
        OS_Generator.caminho = novoCaminho;
    }
}
