/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author Pedro
 */
public interface CRUD {
       void incluir( Object objeto) throws Exception;
       void Excluir( Object objeto) throws Exception;
       ArrayList<?> listar() throws Exception;
}
