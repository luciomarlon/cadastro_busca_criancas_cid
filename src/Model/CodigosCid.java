package Model;


public class CodigosCid {
    
    private String cid, descricao; 
    private int id_cid;

    public CodigosCid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_cid() {
        return id_cid;
    }

    public void setId_cid(int id_cid) {
        this.id_cid = id_cid;
    }
    
    
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
//insetir construtor com codigos

    public CodigosCid(String cid, String descricao) {
        this.cid = cid;
        this.descricao = descricao;
    }
    
     public CodigosCid(String cid, String descricao, int id_cid) {
        this.cid = cid;
        this.descricao = descricao;        
    }
    
    
}
