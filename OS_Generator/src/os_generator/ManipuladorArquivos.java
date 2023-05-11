/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os_generator;

import de.nixosoft.jlr.JLRGenerator;
import de.nixosoft.jlr.JLROpener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Classe que organiza e retém os métodos e variáveis referentes a leitura e escrita
 * de arquivos necessárias no programa.
 * @author gabif
 */
public class ManipuladorArquivos {

    /**
     * Variável para manter o arquivo da OS que será exportado configurado.
     */
    private static FileWriter arquivoTex;
    /**
     * Variável para escrever no arquivo da OS que sera exportado.
     */
    private static PrintWriter escritorTex;

    /**
     * Metodo que cria o arquivo da OS que será exportado, abrindo-o e deixando-o
     * disponível para gravação da configuração e layout da OS.
     * @param nomeArquivo Caminho do arquivo, contendo o nome do mesmo no final do caminho.
     */
    public static void criaArquivoTex(String nomeArquivo) {
        try {
            ManipuladorArquivos.arquivoTex = new FileWriter(nomeArquivo);
            ManipuladorArquivos.escritorTex = new PrintWriter(arquivoTex);

            escreveCabecalho();

        } catch (IOException ex) {
            Logger.getLogger(ManipuladorArquivos.class.getName()).log(Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(null,
                    "Erro - Problema na criação do arquivo!",
                    "Warning - Error", 0);
        }

    }

    /**
     * Método que mantém os comandos e configurações que representarão o cabeçalho e parte inicial
     * da OS, escrevendo-os no arquivo de saída.
     */
    private static void escreveCabecalho() {
        ManipuladorArquivos.escritorTex.printf("""
                        \\documentclass{article}
                        \\usepackage[utf8]{inputenc}
                        \\usepackage[left=1.5cm,top=1.5cm,right=1.5cm,bottom=1.5cm]{geometry}
                        \\usepackage{graphicx,xcolor,comment,enumerate,multirow,multicol,indentfirst}
                        
                        \\title{OrçamentoGenerico}
                        \\author{Gabriel Finger Conte}
                        \\date{March 2023}
                        
                        \\begin{document}
                        
                        \\begin{tabular}{l|l|l|l|l|}
                            \\multirow{4}{*}{\\includegraphics[scale=%f]{Logo.jpg}}\\\\
                            & \\multicolumn{4}{l}{\\large\\textbf{%s}}\\\\
                            & \\textbf{Endereço:} & %s & \\textbf{CEP:} & %s \\\\
                            & \\textbf{Telefone:} & %s & \\textbf{Whatsapp:} & %s \\\\
                        \\end{tabular}
                        
                        \\vspace{1.5cm}
                        
                        \\begin{center}
                            {\\large\\textbf{Ordem de Serviço}}
                        \\end{center}
                        
                        \\vspace{1cm}
                        """, OS_Generator.orgInfo.getEscalaLogo(),
                OS_Generator.orgInfo.getNome(), OS_Generator.orgInfo.getEndereco(),
                OS_Generator.orgInfo.getCep(), OS_Generator.orgInfo.getTelefone(),
                OS_Generator.orgInfo.getWhatsapp());
    }

    /**
     * Método que mantém os comandos e configurações que representarão os dados do cliente
     * na OS, escrevendo-os no arquivo de saída.
     * @param cliente Array contendo os dados do cliente que a OS é destinada.
     */
    public static void escreveDadosCliente(Cliente cliente) {
        ManipuladorArquivos.escritorTex.printf("""
                        \\begin{tabular}{llllll}
                            \\textbf{Cliente:} & %s & \\textbf{Condutor:} & \\multicolumn{3}{l}{%s} \\\\
                            \\textbf{Veículo:} & %s & \\textbf{Placa:} & %s & \\textbf{Ano:} & %d \\\\
                        \\end{tabular}
                        
                        \\vspace{1cm}
                        """, cliente.getNome(), cliente.getNomeCondutor(),
                cliente.getVeiculo(), cliente.getPlaca(), cliente.getAno());
    }

    /**
     * Método que mantém os comandos e configurações que representarão a tabela e dados
     * dos produtos na OS, escrevendo-os no arquivo de saída.
     * @param produtos Array contendo os dados dos itens da OS que são produtos.
     */
    public static void escreveProdutos(ArrayList<ItemOS> produtos) {

        ManipuladorArquivos.escritorTex.printf("""
                        {\\large\\textbf{Peças:}}
                        
                        \\vspace{1cm}
                        \\begin{tabular}{c|l|l}
                            \\textbf{Quantidade} & \\textbf{Produto}\\hspace{8.23cm} & \\textbf{Preço (R\\$)}\\\\
                        
                        """);

        for (ItemOS produto : produtos) {
            ManipuladorArquivos.escritorTex.printf("%d & %s & %.2f \\\\\n",
                    produto.getQuantidade(), produto.getDescricao(), produto.getValorTT());
        }

        ManipuladorArquivos.escritorTex.printf("""
                        
                        \\end{tabular}
                        
                        \\vspace{1cm}
                        
                        """);

    }

    /**
     * Método que mantém os comandos e configurações que representarão a tabela e dados
     * dos serviços na OS, escrevendo-os no arquivo de saída.
     * @param servicos Refere-se ao Array contendo os dados dos itens da OS que são serviços.
     */
    public static void escreveServicos(ArrayList<ItemOS> servicos) {

        ManipuladorArquivos.escritorTex.printf("""
                        {\\large\\textbf{Serviços:}}
                            
                            \\vspace{1cm}
                            \\begin{tabular}{c|l|l}
                                \\textbf{Quantidade} & \\textbf{Serviço}\\hspace{8.5cm} & \\textbf{Preço (R\\$)}\\\\
                        
                        """);

        for (ItemOS servico : servicos) {
            ManipuladorArquivos.escritorTex.printf("%d & %s & %.2f \\\\\n",
                    servico.getQuantidade(), servico.getDescricao(), servico.getValorTT());
        }

        ManipuladorArquivos.escritorTex.printf("""
                        
                        \\end{tabular}
                        
                        \\vspace{1cm}
                        
                        """);

        finalizaDados();
    }

    /**
     * Método que mantém os comandos e configurações que representarão a parte final,
     * notas de rodapé e partes finais da OS, escrevendo-os no arquivo de saída.
     */
    private static void finalizaDados() {
        ManipuladorArquivos.escritorTex.printf("""
                        \\begin{tabular}{ll}
                            \\textbf{Total Peças:} & R\\$ %.2f \\\\
                            \\textbf{Total Serviços:} & R\\$ %.2f \\\\
                            \\textbf{Total:} & R\\$ %.2f \\\\
                        \\end{tabular}
                        \\vspace{1cm}
                        
                        \\textbf{Observação:} Esse orçamento pode sofrer oscilação de valores.
                        
                        \\end{document}
                        """, OS_Generator.getTTprodutos(), OS_Generator.getTTservicos(),
                OS_Generator.getTT());

    }

    /**
     * Método que fecha o arquivo da OS, finalizando sua exportação e liberando
     * a memória alocada para mantê-lo aberto.
     */
    public static void fechaArquivoTex() {
        try {
            
            ManipuladorArquivos.arquivoTex.close();
            ManipuladorArquivos.arquivoTex = null;
            ManipuladorArquivos.escritorTex = null;

            JOptionPane.showMessageDialog(null,
                    "Seu arquivo foi gerado com sucesso!",
                    "Passando para avisar...", 0);
        } catch (IOException ex) {
            Logger.getLogger(ManipuladorArquivos.class.getName()).log(Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(null,
                    "Erro - Problema ao salvar o arquivo!",
                    "Warning - Error", 0);
        }

    }
    
    /**
     * Método Experimental (Não Funcional) tentando integrar a geração automatica
     * do PDF ao invés de apenas gerar o Arquivo TEX.
     * @param caminhoArquivoTex 
     */
    public static void geraPDF(String caminhoArquivoTex){
        // Trecho adaptado de https://www.nixo-soft.de/jlrtutorial/
            
        try {
            JLRGenerator geradorPdf = new JLRGenerator();
            
            File workDirectory = new File(System.getProperty("user.home") +
                    File.separator + "Downloads");
            File outputPath = new File(caminhoArquivoTex);
            File arquivo = new File(caminhoArquivoTex + File.separator + "main.tex");
            
            geradorPdf.generate(arquivo, outputPath, outputPath);
            File pdf1 = geradorPdf.getPDF();
            JLROpener.open(pdf1);
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro - Problema na geração do PDF!", 
                    "Warning - Error", 0);
            Logger.getLogger(ManipuladorArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Método utilizado para gerar o arquivo de configuração, salvando os 
     * dados atuais da empresa para que não seja necessário reescrevê-los toda
     * reinicialização do programa.
     * @throws IOException Caso haja um erro na abertura ou escrita do arquivo de
     * configurações emite a Exception.
     */
    public static void salvaDadosOrg() throws IOException {
        
        FileWriter arquivo;

        arquivo = new FileWriter(System.getProperty("user.dir") 
                    + File.separator + File.separator + "dadosOrg.txt");
        PrintWriter escritor = new PrintWriter(arquivo);
        escritor.printf("""
                            %s |%s |%s |%s |%s |%f |%s
                            """, OS_Generator.orgInfo.getNome(),
                OS_Generator.orgInfo.getEndereco(), OS_Generator.orgInfo.getCep(),
                OS_Generator.orgInfo.getTelefone(), OS_Generator.orgInfo.getWhatsapp(),
                OS_Generator.orgInfo.getEscalaLogo(),OS_Generator.caminho);
        arquivo.close();

    }

    /**
     * Método utilizado para importar e atualizar os dados atuais da empresa no programa
     * a partir do arquivo de configuração salvo.
     */
    public static void importaDadosOrg(){
        
        try {
            FileReader arquivo;
            arquivo = new FileReader(System.getProperty("user.dir") 
                    + File.separator + "dadosOrg.txt");
            BufferedReader leitor = new BufferedReader(arquivo);
            
            String[] dados = leitor.readLine().split("\\|");
            
            OS_Generator.atualizaEmpresa(dados[0],dados[1],dados[2],dados[3],dados[4],
                    Float.parseFloat(dados[5].replace(",", ".")));
            OS_Generator.orgData.preencheCamposImportados();
            Configuracoes.setCaminho(dados[6]);
            
            arquivo.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManipuladorArquivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManipuladorArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
