/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.dao;

import java.util.List;

/**
 *
 * @author OUMAIMA
 */
public interface Idao  < T > {
    Boolean create ( T o);
    T getById(int o);
    List<T>getAll();
    
}
