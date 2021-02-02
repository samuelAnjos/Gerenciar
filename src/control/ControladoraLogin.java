
package control;

import model.DAO.UsuarioDAO;
import model.controladora.controladoraL;

/**
 *
 * @author samuel
 */
public class ControladoraLogin {
    UsuarioDAO usu;

    public ControladoraLogin() {
	usu = new UsuarioDAO();
    }
    
    
    
    public boolean verificarAcesso(String login, String senha){
	return usu.verificarAcesso(login, senha);
    }
}
