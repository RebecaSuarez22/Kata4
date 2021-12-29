/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.BufferedReader;
import java.io.File;

/**
 *
 * @author Rebe
 */
public class Mail {

    public String getMail(String email) {        
        return email.substring(email.lastIndexOf("@")+1,email.length()-1);
    }
    
}
