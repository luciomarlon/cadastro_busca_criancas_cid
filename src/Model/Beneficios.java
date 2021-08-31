
package Model;


public class Beneficios {
    private String beneficio_recebido, secretaria, autarquia, telefone;
    private int id_beneficios;

    public int getId_beneficios() {
        return id_beneficios;
    }

    public void setId_beneficios(int id_beneficios) {
        this.id_beneficios = id_beneficios;
    }
    
    public String getBeneficio_recebido() {
        return beneficio_recebido;
    }

    public void setBeneficio_recebido(String beneficio_recebido) {
        this.beneficio_recebido = beneficio_recebido;
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }

    public String getAutarquia() {
        return autarquia;
    }

    public void setAutarquia(String autarquia) {
        this.autarquia = autarquia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Beneficios(String beneficio_recebido, String secretaria, 
                    String autarquia, String telefone) 
    {
        this.beneficio_recebido = beneficio_recebido;
        this.secretaria = secretaria;
        this.autarquia = autarquia;
        this.telefone = telefone;
    }
    
    
     public Beneficios(String beneficio_recebido, String secretaria, 
                    String autarquia, String telefone, int id_beneficios) 
     {
        this.beneficio_recebido = beneficio_recebido;
        this.secretaria = secretaria;
        this.autarquia = autarquia;
        this.telefone = telefone;        
    }
    
}
