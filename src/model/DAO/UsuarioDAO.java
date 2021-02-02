
package model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Entidades.Usuario;
import model.controladora.controladoraL;

/**
 *
 * @author samuel
 */
public class UsuarioDAO {
    
    controladoraL contro;
    
    public UsuarioDAO() {
	contro = new controladoraL();
    }
    
    public boolean salvar(Usuario usuario){
	try {
	    String sql = "insert into clientes (nome,endereco,fone,login,senha) values (?,?,?,?,?)";
	    PreparedStatement pst = contro.getConexao().prepareStatement(sql);
	    pst.setString(1, usuario.getNome());
	    pst.setString(2, usuario.getEndereco());
	    pst.setString(3, usuario.getFone());
	    pst.setString(4, usuario.getLogin());
	    pst.setString(5, usuario.getSenha());
	    pst.execute();
	    contro.getConexao().commit();
	    contro.desconecta();
	    return true;
	} catch (Exception e) {
	    System.out.println("Erro: " + e);
	}
        return false;
    }

    public boolean verificarAcesso(String login, String senha) {
	try {
	    String sql = "SELECT 1 FROM usuario " +
                     "WHERE login = ? " +
                     "and   senha = ?  ";
	    PreparedStatement pst = contro.getConexao().prepareStatement(sql);
	    pst.setString(1, login);
	    pst.setString(2, senha);
	    
	     ResultSet rs = pst.executeQuery();
	    
	    while (rs.next()) {
		contro.desconecta();
		return true;
	    }
	} catch (Exception e) {
	    System.out.println("Erro: " + e);
	}
	return false;
    }
    
    
}
