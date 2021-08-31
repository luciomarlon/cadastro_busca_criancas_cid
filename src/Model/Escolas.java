package Model;

public class Escolas {
    
    private int ano_escolar, setor;
    private String nome_escola, estatus, dt_cria_escola;

    public int getAno_escolar() {
        return ano_escolar;
    }

    public void setAno_escolar(int ano_escolar) {
        this.ano_escolar = ano_escolar;
    }

    public int getSetor() {
        return setor;
    }

    public void setSetor(int setor) {
        this.setor = setor;
    }

    public String getNome_escola() {
        return nome_escola;
    }

    public void setNome_escola(String nome_escola) {
        this.nome_escola = nome_escola;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getDt_cria_escola() {
        return dt_cria_escola;
    }

    public void setDt_cria_escola(String dt_cria_escola) {
        this.dt_cria_escola = dt_cria_escola;
    }

    public Escolas(int ano_escolar, int setor, String nome_escola, String estatus, 
                       String dt_cria_escola) {
        this.ano_escolar = ano_escolar;
        this.setor = setor;
        this.nome_escola = nome_escola;
        this.estatus = estatus;
        this.dt_cria_escola = dt_cria_escola;
    }

    
}
