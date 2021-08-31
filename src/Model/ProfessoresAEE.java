package Model;

public class ProfessoresAEE {
    
     private String professor_aee, escola_vinculada, prof_regular,
                    auxiliar_sala, turno_professor, dt_cria_professor, estatus, 
                    id_professor; 		
     private int fk_professor;

   

    public String getProfessor_aee() {
        return professor_aee;
    }

    public void setProfessor_aee(String professor_aee) {
        this.professor_aee = professor_aee;
    }

    public String getEscola_vinculada() {
        return escola_vinculada;
    }

    public void setEscola_vinculada(String escola_vinculada) {
        this.escola_vinculada = escola_vinculada;
    }

    public String getProf_regular() {
        return prof_regular;
    }

    public void setProf_regular(String prof_regular) {
        this.prof_regular = prof_regular;
    }

    public String getAuxiliar_sala() {
        return auxiliar_sala;
    }

    public void setAuxiliar_sala(String auxiliar_sala) {
        this.auxiliar_sala = auxiliar_sala;
    }

    public String getTurno_professor() {
        return turno_professor;
    }

    public void setTurno_professor(String turno_professor) {
        this.turno_professor = turno_professor;
    }

    public String getDt_cria_professor() {
        return dt_cria_professor;
    }

    public void setDt_cria_professor(String dt_cria_professor) {
        this.dt_cria_professor = dt_cria_professor;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public int getFk_professor() {
        return fk_professor;
    }

    public void setFk_professor(int fk_professor) {
        this.fk_professor = fk_professor;
    }

    public String getId_professor() {
        return id_professor;
    }

    public void setId_professor(String id_professor) {
        this.id_professor = id_professor;
    }

    
    
    
    public ProfessoresAEE(String professor_aee, String escola_vinculada, 
                            String prof_regular, String auxiliar_sala, 
                            String turno_professor, String dt_cria_professor, 
                            String estatus, int fk_professor) 
    {
        this.professor_aee = professor_aee;
        this.escola_vinculada = escola_vinculada;
        this.prof_regular = prof_regular;
        this.auxiliar_sala = auxiliar_sala;
        this.turno_professor = turno_professor;
        this.dt_cria_professor = dt_cria_professor;
        this.estatus = estatus;
        this.fk_professor = fk_professor;
    }

    public ProfessoresAEE(String professor_aee, String escola_vinculada, 
            String prof_regular, String auxiliar_sala, String turno_professor, 
            String dt_cria_professor, String estatus, int fk_professor, 
            String id_professor) 
    {
        this.professor_aee = professor_aee;
        this.escola_vinculada = escola_vinculada;
        this.prof_regular = prof_regular;
        this.auxiliar_sala = auxiliar_sala;
        this.turno_professor = turno_professor;
        this.dt_cria_professor = dt_cria_professor;
        this.estatus = estatus;
        this.fk_professor = fk_professor;
        this.id_professor = id_professor;
    }
    

    public ProfessoresAEE(String professor_aee, String escola_vinculada, 
            String prof_regular, String auxiliar_sala, String turno_professor, 
            String dt_cria_professor, String estatus, String id_professor, 
            int fk_professor) 
    {
        this.professor_aee = professor_aee;
        this.escola_vinculada = escola_vinculada;
        this.prof_regular = prof_regular;
        this.auxiliar_sala = auxiliar_sala;
        this.turno_professor = turno_professor;
        this.dt_cria_professor = dt_cria_professor;
        this.estatus = estatus;
        this.id_professor = id_professor;
        this.fk_professor = fk_professor;
    }

   

   
    
}