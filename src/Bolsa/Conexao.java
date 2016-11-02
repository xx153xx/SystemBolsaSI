/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bolsa;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conexao {
    public Connection getConnection() {
        try{
           
           return DriverManager.getConnection ("jdbc:mysql://localhost:3066/cadastro","root","admin");
    
    
}catch(Exception execao){
    
    throw new RuntimeException(execao);

}
}
}
