package model.controladora;

import java.sql.DriverManager;

/**
 *
 * @author samuel
 */
public class controladora {

    private final String driver = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/assis";
    private String password = "ovelhapreta";
    private String user = "root";

    private java.sql.Connection conexao = null;

    public controladora() {
	try {
	    Class.forName(driver);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public java.sql.Connection getConexao() {

	if(conexao == null){
	    try {
		conexao = DriverManager.getConnection(url,user,password);
		conexao.setAutoCommit(false);
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}
	return conexao;
    }
    
    public void desconecta(){
	try {
	    conexao.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
	conexao=null;
    }

}
