package Model;

public class AlunosAEE {
    
    private String  cpf, data_cadastro, ano_escolar, nome_aluno, sexo, 
                    data_nasc, nome_responsavel, telefone, suspeita, laudo, 
                    tipo_diag, descricao_diag, tipo_hd, descricao_hd, 
                    turno_escolar, turno_aee, profregular, estatus, observacoes,
                    transporte, auxiliar, mobilidade, id_aluno;
    
    private int fk_beneficios, fk_cid_aluno, fk_cid_aluno_hd, fk_professor_escola; 

 


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getAno_escolar() {
        return ano_escolar;
    }

    public void setAno_escolar(String ano_escolar) {
        this.ano_escolar = ano_escolar;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getNome_responsavel() {
        return nome_responsavel;
    }

    public void setNome_responsavel(String nome_responsavel) {
        this.nome_responsavel = nome_responsavel;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSuspeita() {
        return suspeita;
    }

    public void setSuspeita(String suspeita) {
        this.suspeita = suspeita;
    }

    public String getLaudo() {
        return laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

    public String getTipo_diag() {
        return tipo_diag;
    }

    public void setTipo_diag(String tipo_diag) {
        this.tipo_diag = tipo_diag;
    }

    public String getDescricao_diag() {
        return descricao_diag;
    }

    public void setDescricao_diag(String descricao_diag) {
        this.descricao_diag = descricao_diag;
    }

    public String getTipo_hd() {
        return tipo_hd;
    }

    public void setTipo_hd(String tipo_hd) {
        this.tipo_hd = tipo_hd;
    }

    public String getDescricao_hd() {
        return descricao_hd;
    }

    public void setDescricao_hd(String descricao_hd) {
        this.descricao_hd = descricao_hd;
    }

    public String getTurno_escolar() {
        return turno_escolar;
    }

    public void setTurno_escolar(String turno_escolar) {
        this.turno_escolar = turno_escolar;
    }

    public String getTurno_aee() {
        return turno_aee;
    }

    public String getProfregular() {
        return profregular;
    }

    public void setProfregular(String profregular) {
        this.profregular = profregular;
    }
    
    public void setTurno_aee(String turno_aee) {
        this.turno_aee = turno_aee;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public int getFk_beneficios() {
        return fk_beneficios;
    }

    public void setFk_beneficios(int fk_beneficios) {
        this.fk_beneficios = fk_beneficios;
    }

    public int getFk_cid_aluno() {
        return fk_cid_aluno;
    }

    public void setFk_cid_aluno(int fk_cid_aluno) {
        this.fk_cid_aluno = fk_cid_aluno;
    }

    public int getFk_cid_aluno_hd() {
        return fk_cid_aluno_hd;
    }

    public void setFk_cid_aluno_hd(int fk_cid_aluno_hd) {
        this.fk_cid_aluno_hd = fk_cid_aluno_hd;
    }
    
        public String getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(String id_aluno) {
        this.id_aluno = id_aluno;
    }

    public int getFk_professor_escola() {
        return fk_professor_escola;
    }

    public void setFk_professor_escola(int fk_professor_escola) {
        this.fk_professor_escola = fk_professor_escola;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getAuxiliar() {
        return auxiliar;
    }

    public void setAuxiliar(String auxiliar) {
        this.auxiliar = auxiliar;
    }

    public String getMobilidade() {
        return mobilidade;
    }

    public void setMobilidade(String mobilidade) {
        this.mobilidade = mobilidade;
    }

  

    
    public AlunosAEE(String cpf, String data_cadastro, String ano_escolar, 
                    String nome_aluno, String sexo, String data_nasc, 
                    String nome_responsavel, String telefone, String suspeita, 
                    String laudo, String tipo_diag, String descricao_diag, 
                    String tipo_hd, String descricao_hd, String turno_escolar, 
                    String turno_aee, String profregular, String estatus, String observacoes, 
                    String transporte, String auxiliar, String mobilidade,
                    
                    int fk_cid_aluno, int fk_cid_aluno_hd, int fk_beneficios, 
                    int fk_professor_escola) 
                {

                    this.cpf = cpf;
                    this.data_cadastro = data_cadastro;
                    this.ano_escolar = ano_escolar;
                    this.nome_aluno = nome_aluno;
                    this.sexo = sexo;
                    this.data_nasc = data_nasc;
                    this.nome_responsavel = nome_responsavel;
                    this.telefone = telefone;
                    this.suspeita = suspeita;
                    this.laudo = laudo;
                    this.tipo_diag = tipo_diag;                                       
                    this.descricao_diag = descricao_diag;
                    this.tipo_hd = tipo_hd;                    
                    this.descricao_hd = descricao_hd;                    
                    this.turno_escolar = turno_escolar;
                    this.turno_aee = turno_aee;
                    this.profregular = profregular;
                    this.estatus = estatus;
                    this.observacoes = observacoes; 
                    this.transporte = transporte;
                    this.auxiliar = auxiliar;
                    this.mobilidade = mobilidade;
                    this.fk_cid_aluno = fk_cid_aluno;
                    this.fk_cid_aluno_hd  = fk_cid_aluno_hd;
                    this.fk_beneficios = fk_beneficios;
                    this.fk_professor_escola = fk_professor_escola; 
     
                }
    
      public AlunosAEE(String cpf, String data_cadastro, String ano_escolar, 
              String nome_aluno, String sexo, String data_nasc, 
              String nome_responsavel, String telefone, String suspeita,
              String laudo, String tipo_diag, String descricao_diag, 
              String tipo_hd, String descricao_hd, String turno_escolar, 
              String turno_aee, String profregular, String estatus, String observacoes,
              String transporte, String auxiliar, String mobilidade,
              
              int fk_cid_aluno, int fk_cid_aluno_hd, int fk_beneficios, 
              int fk_professor_escola, String id_aluno) 
            {
            
              this.cpf = cpf;
              this.data_cadastro = data_cadastro;
              this.ano_escolar = ano_escolar;
              this.nome_aluno = nome_aluno;
              this.sexo = sexo;
              this.data_nasc = data_nasc;
              this.nome_responsavel = nome_responsavel;
              this.telefone = telefone;
              this.suspeita = suspeita;
              this.laudo = laudo;
              this.tipo_diag = tipo_diag;                      
              this.descricao_diag = descricao_diag;
              this.tipo_hd = tipo_hd;              
              this.descricao_hd = descricao_hd;              
              this.turno_escolar = turno_escolar;
              this.turno_aee = turno_aee;
              this.profregular = profregular;
              this.estatus = estatus;
              this.observacoes = observacoes;
              this.transporte = transporte;
              this.auxiliar = auxiliar;
              this.mobilidade = mobilidade;
              this.fk_cid_aluno = fk_cid_aluno;
              this.fk_cid_aluno_hd  = fk_cid_aluno_hd;
              this.fk_beneficios = fk_beneficios;
              this.fk_professor_escola = fk_professor_escola;  
              this.id_aluno = id_aluno;
          } 

}
