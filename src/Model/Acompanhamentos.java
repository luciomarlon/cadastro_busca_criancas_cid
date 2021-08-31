/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LucioMarlon
 */
public class Acompanhamentos {
    private String acompanhamentos, instrumento, natureza, observacoes;
    private int fk_acompanhamento;
    
    public String getAcompanhamentos() {
        return acompanhamentos;
    }

    public void setAcompanhamentos(String acompanhamentos) {
        this.acompanhamentos = acompanhamentos;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getFk_acompanhamento() {
        return fk_acompanhamento;
    }

    public void setFk_acompanhamento(int fk_acompanhamento) {
        this.fk_acompanhamento = fk_acompanhamento;
    }

    public Acompanhamentos(String acompanhamentos, String instrumento, 
            String natureza, String observacoes, int fk_acompanhamento) 
    {
        this.acompanhamentos = acompanhamentos;
        this.instrumento = instrumento;
        this.natureza = natureza;
        this.observacoes = observacoes;
        this.fk_acompanhamento = fk_acompanhamento;
    }
    
    public Acompanhamentos(String acompanhamentos, String instrumento, 
            String natureza, String observacoes, int fk_acompanhamento, 
            int id_acompanha) 
    {
        this.acompanhamentos = acompanhamentos;
        this.instrumento = instrumento;
        this.natureza = natureza;
        this.observacoes = observacoes;
        this.fk_acompanhamento = fk_acompanhamento;
    }

    public int getId_acompanha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
