/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab2.student;

import java.time.LocalDate;

/**
 *
 * @author Exile
 */
public interface IBook extends IProduct {

    public String getISBN();
    
    public String getAuthor();
    
    public int getPages();            
}
