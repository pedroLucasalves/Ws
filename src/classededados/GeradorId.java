/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classededados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Pedro
 */
public class GeradorId {
    
    private int idProduto = 0;
    private int idMarca = 0;
    
    String arquivoIds = "C:\\Users\\Jd\\Documents\\ADS\\2 periodo ADS\\OOB\\ProjetoWs\\src\\arquivo\\GeradorId";
    
    public GeradorId() throws Exception{
            FileWriter fileId = null;
            BufferedWriter bufId = null;
            FileReader fr = null;
            BufferedReader br = null;
            
            try {
            if(!(new File(arquivoIds)).exists()){
                fileId = new FileWriter(arquivoIds,true);
                bufId = new BufferedWriter(fileId);
                bufId.write(idProduto + ";" + idMarca);
                
            }
        } catch (Exception e) {
        }
    }
    
}
