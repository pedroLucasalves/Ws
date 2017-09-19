/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import classededados.Produto;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Pedro
 */
public class ProdutoDAO implements interfaces.CRUD{

   String  arquivoProduto = "C:\\Users\\Jd\\Documents\\ADS\\2 periodo ADS\\OOB\\ProjetoWs\\src\\arquivo\\Produto.csv";
    
    @Override
    public void incluir(Object objeto) throws Exception {
         Produto produto = (Produto) ( objeto);
         FileWriter fileProduto = null;
         BufferedWriter bufferProduto = null;
         FileWriter fileNome = null;
         BufferedWriter bufferedNome = null;
         FileWriter fileValor = null;
         BufferedWriter bufferedValor = null;
         FileWriter fileQtd = null;
         BufferedWriter bufferedQtd = null;
         
         try {
            fileProduto = new FileWriter(arquivoProduto);
            bufferProduto = new BufferedWriter(fileProduto);
            fileNome = new FileWriter(arquivoProduto);
            bufferedNome = new BufferedWriter(fileNome);
            fileValor = new FileWriter(arquivoProduto);
            bufferedValor =  new BufferedWriter(fileQtd);
            fileQtd = new FileWriter(arquivoProduto);
            bufferedQtd = new BufferedWriter(fileQtd);
            
            bufferProduto.write(produto.getId()+ ";" + produto.getNome() + "\n");
            
        } catch (Exception erro) {
            throw erro;
        }
         finally{
             if(bufferProduto != null);
             bufferProduto.close();
         }
        
    }

    @Override
    public void Excluir(Object objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<?> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
