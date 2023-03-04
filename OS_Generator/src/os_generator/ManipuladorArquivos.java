/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os_generator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gabif
 */
public class ManipuladorArquivos {
    
    private static FileWriter arquivo;
    private static PrintWriter escritor;
    
    public static void criaArquivoTex(String nomeArquivo){
        try {
            ManipuladorArquivos.arquivo = new FileWriter(nomeArquivo);
            ManipuladorArquivos.escritor = new PrintWriter(arquivo);
            
            escreveCabecalho();
            
        } catch (IOException ex) {
            Logger.getLogger(ManipuladorArquivos.class.getName()).log(Level.SEVERE, null, ex);
            
            JOptionPane.showMessageDialog(null, 
                    "Erro - Problema na criação do arquivo!", 
                    "Warning - Error", 0);
        }
        
    }
    
    private static void escreveCabecalho(){
        ManipuladorArquivos.escritor.printf("""
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
                        OS_Generator.orgInfo.getNome(),OS_Generator.orgInfo.getEndereco(),
                        OS_Generator.orgInfo.getCep(), OS_Generator.orgInfo.getTelefone(),
                        OS_Generator.orgInfo.getWhatsapp());
    }

    
    public static void escreveDadosCliente(Cliente cliente){
        ManipuladorArquivos.escritor.printf("""
                        \\begin{tabular}{llllll}
                            \\textbf{Cliente:} & %s & \\textbf{Condutor:} & \\multicolumn{3}{l}{%s} \\\\
                            \\textbf{Veículo:} & %s & \\textbf{Placa:} & %s & \\textbf{Ano:} & %d \\\\
                        \\end{tabular}
                        
                        \\vspace{1cm}
                        """, cliente.getNome(), cliente.getNomeCondutor(), 
                        cliente.getVeiculo(), cliente.getPlaca(), cliente.getAno());
    }

    public static void escreveProdutos(ArrayList<ItemOS> produtos){
        
        ManipuladorArquivos.escritor.printf("""
                        {\\large\\textbf{Peças:}}
                        
                        \\vspace{1cm}
                        \\begin{tabular}{c|l|l}
                            \\textbf{Quantidade} & \\textbf{Produto}\\hspace{8.23cm} & \\textbf{Preço (R\\$)}\\\\
                        
                        """);
        
        for (ItemOS produto : produtos) {
            ManipuladorArquivos.escritor.printf("%d & %s & %.2f \\\\\n", 
                produto.getQuantidade(), produto.getDescricao(),produto.getValorTT());
        }
        
        ManipuladorArquivos.escritor.printf("""
                        
                        \\end{tabular}
                        
                        \\vspace{1cm}
                        
                        """);
        
    }
    
    public static void escreveServicos(ArrayList<ItemOS> servicos){
        
        ManipuladorArquivos.escritor.printf("""
                        {\\large\\textbf{Serviços:}}
                            
                            \\vspace{1cm}
                            \\begin{tabular}{c|l|l}
                                \\textbf{Quantidade} & \\textbf{Serviço}\\hspace{8.5cm} & \\textbf{Preço (R\\$)}\\\\
                        
                        """);
        
        for (ItemOS servico : servicos) {
            ManipuladorArquivos.escritor.printf("%d & %s & %.2f \\\\\n", 
                servico.getQuantidade(), servico.getDescricao(),servico.getValorTT());
        }
        
        ManipuladorArquivos.escritor.printf("""
                        
                        \\end{tabular}
                        
                        \\vspace{1cm}
                        
                        """);
        
        finalizaDados();
    }
    
    private static void finalizaDados(){
        ManipuladorArquivos.escritor.printf("""
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
        
    public static void fechaArquivo(){
        try {
            ManipuladorArquivos.arquivo.close();
            ManipuladorArquivos.arquivo = null;
            ManipuladorArquivos.escritor = null;
            
            JOptionPane.showMessageDialog(null, 
                    "Seu arquivo foi gerado com sucesso!", 
                    "Passando para avisar...",0);
        } catch (IOException ex) {
            Logger.getLogger(ManipuladorArquivos.class.getName()).log(Level.SEVERE, null, ex);
            
            JOptionPane.showMessageDialog(null, 
                    "Erro - Problema ao salvar o arquivo!", 
                    "Warning - Error", 0);
        }
        
    }
    
}
