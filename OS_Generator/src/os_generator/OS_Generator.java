/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package os_generator;

import java.io.File;
import java.util.ArrayList;
import ui.*;

/**
 * Organiza e estrutura a lógica do programa, dados e métodos essenciais e gerais do mesmo.
 * @author gabif
 */
public class OS_Generator {

    // Declaração de UIs
    /**
     * Variável que inicializa e mantém a interface gráfica de Menu do programa.
     */
    public static final MenuUI menu = new MenuUI();
    /**
     * Variável que inicializa e mantém a interface gráfica de atualização e visualização
     * dos dados do cliente do programa.
     */
    public static final ClientDataUI clientData = new ClientDataUI();
    /**
     * Variável que inicializa e mantém a interface gráfica de construção da OS.
     */
    public static final FactoryUI factory = new FactoryUI();
    /**
     * Variável que inicializa e mantém a interface gráfica de atualização e visualização
     * dos dados da empresa do programa.
     */
    public static final OrganizationDataUI orgData = new OrganizationDataUI();
    /**
     * Variável que inicializa e mantém a interface gráfica de atualização e visualização
     * das configurações do programa.
     */
    public static final ConfigUI configUi = new ConfigUI();
    
    // Declaração de Variáveis
    /**
     * Variável que matém os dados do cliente para quem se destina a OS.
     */
    public static Cliente clientInfo;
    /**
     * Variável que mantém os dados da empresa que está gerando a OS.
     */
    public static Empresa orgInfo;
    /**
     * Variável que mantém a lista de produtos presentes na OS.
     */
    public static ArrayList<ItemOS> produtos = new ArrayList<>();
    /**
     * Variável que mantém a lista de serviços presentes na OS. 
     */
    public static ArrayList<ItemOS> servicos = new ArrayList<>();        
    /**
     * Variável que mantém o caminho em que se deseja exportar a OS.
     */
    public static String caminho = " ";
    
    /**
     * Método que contém a lógica do programa, inicializando as janelas, interfaces
     * gráficas e dados.
     * @param args Lista de arqumentos passados na chamada do programa.
     */
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
    
    /**
     * Método que atualiza os dados do Cliente para quem é destinado a OS.
     * @param nome O nome do cliente para quem está sendo feito o orçamento.
     * @param nomeCondutor O nome do condutor do veículo que está sendo orçado.
     * @param veiculo O modelo do veículo que está sendo orçado.
     * @param placa A placa do veículo que está sendo orçado.
     * @param ano O ano do veículo que está sendo orçado.
     * @param motor O modelo do motor do veículo que está sendo orçado.
     */
    public static void atualizaCliente(String nome, String nomeCondutor, String veiculo, String placa, int ano, String motor){
        OS_Generator.clientInfo = new Cliente(nome, nomeCondutor, veiculo, placa, ano, motor);
    }
    
    /**
     * Método que atualiza os dados da Empresa que estará gerando a OS.
     * @param nome O nome da empresa que está emitindo a OS.
     * @param endereco O endereço físico da empresa emissora da OS.
     * @param cep O CEP do endereço físico da empresa emissora da OS.
     * @param telefone O número de telefone da empresa emissora da OS.
     * @param whatsapp O número do Whatsapp da empresa emissora da OS.
     * @param escalaLogo O fator de escala com que a logo aparecerá no arquivo exportado da OS.
     */
    public static void atualizaEmpresa(String nome, String endereco, String cep, String telefone, String whatsapp, float escalaLogo){
        OS_Generator.orgInfo = new Empresa(nome, endereco, cep, telefone, whatsapp, escalaLogo);
    }
    
    /**
     * Função que calcula o valor total de produtos da OS.
     * @return Retorna o valor real total de todos os produtos presentes na OS.
     */
    public static float getTTprodutos(){
        float ret = 0;
        for(int i = 0; i < produtos.size(); i++){
            ret += produtos.get(i).getValorTT();
        }
        return ret;
    }
    
    /**
     * Função que calcula o valor total de servicos da OS.
     * @return Retorna o valor real total de todos os servicos presentes na OS.
     */
    public static float getTTservicos(){
        float ret = 0;
        for(int i = 0; i < servicos.size(); i++){
            ret += servicos.get(i).getValorTT();
        }
        return ret;
    }
    
    /**
     * Função que calcula o valor total da OS, somando o valor total dos produtos
     * e serviços lançados na mesma.
     * @return Retorna o valor real total de todos os itens presentes na OS.
     */
    public static float getTT(){
        return getTTprodutos()+getTTservicos();
    }
    
    /**
     * Método utilizado para controlar o fluxo de comando, gerando o arquivo
     * TEX contendo a OS escrita em LATEX no modelo estático definido.
     */
    public static void exportaArquivo(){
        ManipuladorArquivos.criaArquivoTex(caminho + File.separator + "main.tex");
        ManipuladorArquivos.escreveDadosCliente(clientInfo);
        ManipuladorArquivos.escreveProdutos(produtos);
        ManipuladorArquivos.escreveServicos(servicos);
        ManipuladorArquivos.fechaArquivoTex();
        // Experimental (Não Funcional) Abaixo
        // ManipuladorArquivos.geraPDF(caminho);
    }
    
}
