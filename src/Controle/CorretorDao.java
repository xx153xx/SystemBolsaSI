
package Controle;

import Bolsa.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CorretorDao {
    private Connection conecta;
    
    private String chavecadastro;
    private String nome;
    private String cpf;
    private String ctps;
    private String usuario;
    private String senha;
    
    public CorretorDao(){
    
    this.conecta = new Conexao().getConnection();
    
}
    public void adicionar (Corretor corretor) {
        
        String sql = "INSERT INTO cadastrocorretor(chave,nome,cpf,ctps,usuario,senha) VALUES(?,?,?,?,?,?)" ;
        
        try{
     PreparedStatement stmt = conecta.prepareStatement(sql);
     
     stmt.setString(1, corretor.getChavecadastro());
     stmt.setString(2, corretor.getNome());
     stmt.setString(3, corretor.getCpf());
     stmt.setString(4, corretor.getCtps());
     stmt.setString(5, corretor.getUsuario());
     stmt.setString(6, corretor.getSenha());
     
     stmt.execute();
     stmt.close();
     
           
   }catch(SQLException erro){
       throw new RuntimeException(erro);
   }
    }
    
}
