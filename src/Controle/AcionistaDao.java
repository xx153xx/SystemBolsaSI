
package Controle;

import SystemBolsa.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AcionistaDao {
    private Connection conecta;
    
    private String nome;
    private String cpf;
    private Float plano;
    private String usuario;
    private String senha;

public AcionistaDao() throws SQLException{
    
    this.conecta = new Conexao().getConnection();
}

public void adicionar (Acionista acionista) {
    
   String sql = "INSERT INTO cadastroacionista(Nome,CPF,ValorPlano,Usuario, Senha) VALUES(?,?,?,?,?)" ;
   
   try{
     PreparedStatement stmt = conecta.prepareStatement(sql);
     stmt.setString(1, acionista.getNome());
     stmt.setString(2, acionista.getCpf());
     stmt.setFloat(3, acionista.getPlano());
     stmt.setString(4, acionista.getUsuario());
     stmt.setString(5, acionista.getSenha());
     
     stmt.execute();
     stmt.close();
     
           
   }catch(SQLException erro){
       throw new RuntimeException(erro);
   }
   }
}


