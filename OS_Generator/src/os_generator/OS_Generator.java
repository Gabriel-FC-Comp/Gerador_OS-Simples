/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package os_generator;

import java.io.File;
import java.util.ArrayList;
import ui.*;

/**
 *
 * @author gabif
 */
public class OS_Generator {

    // Declaração de UIs
    public static final MenuUI menu = new MenuUI();
    public static final ClientDataUI clientData = new ClientDataUI();
    public static final FactoryUI factory = new FactoryUI();
    public static final OrganizationDataUI orgData = new OrganizationDataUI();
    public static final ConfigUI configUi = new ConfigUI();
    // Declaração de Variáveis
    public static Cliente clientInfo;
    public static Empresa orgInfo;
    public static ArrayList<ItemOS> produtos = new ArrayList<>();
    public static ArrayList<ItemOS> servicos = new ArrayList<>();        
    public static String caminho = " ";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Configuracoes.cores1();
        OS_Generator.menu.setVisible(true);
        ManipuladorArquivos.importaDadosOrg();
        OS_Generator.configUi.atualizaCampos();
        if(orgInfo == null || caminho.isBlank() || caminho.isEmpty()){
            OS_Generator.menu.desabilitaNewOSButton();
        }
        
    }
    
    public static void atualizaCliente(String nome, String nomeCondutor, String veiculo, String placa, int ano, String motor){
        OS_Generator.clientInfo = new Cliente(nome, nomeCondutor, veiculo, placa, ano, motor);
    }
    public static void atualizaEmpresa(String nome, String endereco, String cep, String telefone, String whatsapp, float escalaLogo){
        OS_Generator.orgInfo = new Empresa(nome, endereco, cep, telefone, whatsapp, escalaLogo);
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
    
    public static void exportaArquivo(){
        ManipuladorArquivos.criaArquivoTex(caminho + File.separator + "main.tex");
        ManipuladorArquivos.escreveDadosCliente(clientInfo);
        ManipuladorArquivos.escreveProdutos(produtos);
        ManipuladorArquivos.escreveServicos(servicos);
        ManipuladorArquivos.fechaArquivoTex();
        ManipuladorArquivos.geraPDF(caminho);
    }
    
}
