/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bolsa;

import Bolsa.Conexao;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class SystemBolsa {
    
    public static void main(String[] args) throws SQLException{
        
        Connection co = new Conexao().getConnection();
        System.out.println("conexao aberta");
        co.close();
        
    }
    
}
