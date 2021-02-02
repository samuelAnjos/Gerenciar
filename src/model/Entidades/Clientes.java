
package model.Entidades;

/**
 *
 * @author samuel
 */
public class Clientes {
    private int idcli;
    private String nome;
    private String ende;
    private String fone;
    private String email;

    public Clientes() {
    }

    public Clientes(int idcli, String nome, String ende, String fone, String email) {
	this.idcli = idcli;
	this.nome = nome;
	this.ende = ende;
	this.fone = fone;
	this.email = email;
    }

    public int getIdcli() {
	return idcli;
    }

    public void setIdcli(int idcli) {
	this.idcli = idcli;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getEnde() {
	return ende;
    }

    public void setEnde(String ende) {
	this.ende = ende;
    }

    public String getFone() {
	return fone;
    }

    public void setFone(String fone) {
	this.fone = fone;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }
    
    
}
