/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.DAO_Alunos;
import DAO.DAO_Beneficios;
import DAO.DAO_Cid;
import DAO.DAO_ProfessoresAEE;
import DAO.LimitarDigitos;
import Model.AlunosAEE;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


public class FrmCadastroAlunos extends javax.swing.JFrame {

   
    public FrmCadastroAlunos() {
        initComponents();

        AutoCompleteDecorator.decorate(cbBeneficios);        
        AutoCompleteDecorator.decorate(cbCidDiagAluno);
        AutoCompleteDecorator.decorate(cbTipoDiag);
        AutoCompleteDecorator.decorate(cbEstatus);
        AutoCompleteDecorator.decorate(cbLaudo);        
        AutoCompleteDecorator.decorate(cbSexo);
        AutoCompleteDecorator.decorate(cbSuspeita);
        AutoCompleteDecorator.decorate(cbCidAluno_hd);
        AutoCompleteDecorator.decorate(cbTipoHD);
        AutoCompleteDecorator.decorate(cbTurnoAEE);
        AutoCompleteDecorator.decorate(cbTurnoEscolar);
        AutoCompleteDecorator.decorate(cbProfessor);
        AutoCompleteDecorator.decorate(cbTransporte);        
        AutoCompleteDecorator.decorate(cbAuxiliar);
        
         
        restauraComboBoxProfessor();
        restauraComboBoxCidDiagnostico();
        restauraComboBoxCidHD();          
        restauraComboBoxBeneficio();
        txtCpfAluno.setDocument(new LimitarDigitos(13)); 
        txtTelefone.setDocument(new LimitarDigitos(11));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtResponsavel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDescDiagnostico = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtAnoEscolar = new javax.swing.JTextField();
        txtDescricaoHD = new javax.swing.JTextField();
        cbSexo = new javax.swing.JComboBox<>();
        cbSuspeita = new javax.swing.JComboBox<>();
        cbLaudo = new javax.swing.JComboBox<>();
        cbBeneficios = new javax.swing.JComboBox<>();
        cbEstatus = new javax.swing.JComboBox<>();
        cbCidDiagAluno = new javax.swing.JComboBox<>();
        cbTipoDiag = new javax.swing.JComboBox<>();
        cbTipoHD = new javax.swing.JComboBox<>();
        cbCidAluno_hd = new javax.swing.JComboBox<>();
        cbTurnoAEE = new javax.swing.JComboBox<>();
        txtCpfAluno = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JFormattedTextField();
        txtDatacadastro = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        cbTurnoEscolar = new javax.swing.JComboBox<>();
        cbProfessor = new javax.swing.JComboBox<>();
        cbAuxiliar = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cbTransporte = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtMobilidade = new javax.swing.JTextField();
        txtProfessorregular = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CREI - CENTRO DE REFERENCIA EDUCAÇÃO INCLUSIVA");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CPF aluno ou responsável");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 26));

        txtNomeAluno.setBackground(new java.awt.Color(204, 255, 255));
        txtNomeAluno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtNomeAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 571, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Sexo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 53, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Data de Nascimento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, -1, -1));

        txtResponsavel.setBackground(new java.awt.Color(204, 255, 255));
        txtResponsavel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 500, 35));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Nome Responsável");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 208, 26));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Telefone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 100, 26));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Laudo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 63, 26));

        txtDescDiagnostico.setBackground(new java.awt.Color(204, 255, 255));
        txtDescDiagnostico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtDescDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 480, 35));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Descrição do Diagnóstico - Único e Múltiplos");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 405, 26));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Descrição da Hipótese Diagnóstica - Único e Múltiplos");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 490, 26));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Tipo HD");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 77, 26));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("CID - HD");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 98, 26));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Turno Escola");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 140, 26));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Turno AEE");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 680, 100, 26));

        btnBuscar.setBackground(new java.awt.Color(204, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBuscar.setText("Fechar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 900, 200, 60));

        btnCadastrar.setBackground(new java.awt.Color(204, 255, 255));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 900, 200, 60));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Estatus do aluno: Ativo - Desativado");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 338, 26));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Professor Regular");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 760, 170, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Fonte da suspeita");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, 26));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Benfícios");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 145, 26));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Data Cadastro");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtTelefone.setBackground(new java.awt.Color(204, 255, 255));
        txtTelefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 190, 35));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Ano escolar");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 680, -1, -1));

        txtAnoEscolar.setBackground(new java.awt.Color(204, 255, 255));
        txtAnoEscolar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtAnoEscolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 710, 170, 35));

        txtDescricaoHD.setBackground(new java.awt.Color(204, 255, 255));
        txtDescricaoHD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtDescricaoHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 480, 35));

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "Feminino", "Masculino" }));
        getContentPane().add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 110, 35));

        cbSuspeita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "Familiar", "Medico", "Professor" }));
        getContentPane().add(cbSuspeita, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 120, 35));

        cbLaudo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "Sim", "Não" }));
        getContentPane().add(cbLaudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 110, 35));

        cbBeneficios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));
        getContentPane().add(cbBeneficios, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 110, 35));

        cbEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "D" }));
        getContentPane().add(cbEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 110, 35));

        cbCidDiagAluno.setEditable(true);
        cbCidDiagAluno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));
        cbCidDiagAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCidDiagAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(cbCidDiagAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 270, 35));

        cbTipoDiag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "MULTIPLO", "UNICO", "NE" }));
        cbTipoDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoDiagActionPerformed(evt);
            }
        });
        getContentPane().add(cbTipoDiag, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 120, 35));

        cbTipoHD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "MULTIPLO", "UNICO", "NE" }));
        getContentPane().add(cbTipoHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 120, 35));

        cbCidAluno_hd.setEditable(true);
        cbCidAluno_hd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));
        getContentPane().add(cbCidAluno_hd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 270, 35));

        cbTurnoAEE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "Manhã", "Inter", "Tarde" }));
        getContentPane().add(cbTurnoAEE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 710, 120, 35));

        txtCpfAluno.setBackground(new java.awt.Color(204, 255, 255));
        txtCpfAluno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCpfAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCpfAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 230, 35));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel18.setText("CREI - CADASTRO ALUNOS");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Observações/Acompanhamentos");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, -1, 26));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Tipo Diagnóstico");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 26));

        txtDataNasc.setBackground(new java.awt.Color(204, 255, 255));
        try {
            txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 160, 35));

        txtDatacadastro.setBackground(new java.awt.Color(204, 255, 255));
        try {
            txtDatacadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtDatacadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 35));

        txtObservacoes.setColumns(20);
        txtObservacoes.setRows(5);
        jScrollPane1.setViewportView(txtObservacoes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 480, 260));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("CID - Diagnóstico");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, 26));

        cbTurnoEscolar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "Manhã", "Inter", "Tarde" }));
        cbTurnoEscolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTurnoEscolarActionPerformed(evt);
            }
        });
        getContentPane().add(cbTurnoEscolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, 110, 35));

        cbProfessor.setEditable(true);
        cbProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));
        getContentPane().add(cbProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 800, 250, 35));

        cbAuxiliar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "Sim", "Não", "Parcial" }));
        getContentPane().add(cbAuxiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 720, 110, 35));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Auxiliar");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 680, 110, 26));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Utiliza Transporte");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 680, 170, 26));

        cbTransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "Sim", "Não", "Parcial" }));
        getContentPane().add(cbTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 720, 110, 35));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Recurso Mobilidade");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 770, 190, 26));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("Professor");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, 100, 30));

        txtMobilidade.setBackground(new java.awt.Color(204, 255, 255));
        txtMobilidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtMobilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 810, 260, 35));

        txtProfessorregular.setBackground(new java.awt.Color(204, 255, 255));
        txtProfessorregular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtProfessorregular, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 800, 170, 35));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        FrmCadastroAlunos telaalunos = new FrmCadastroAlunos();
        telaalunos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
    cadastrarAlunos();
    restauraComboBoxCidDiagnostico();
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtCpfAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfAlunoActionPerformed
                      // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfAlunoActionPerformed

    private void cbTipoDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoDiagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoDiagActionPerformed

    private void cbTurnoEscolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTurnoEscolarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTurnoEscolarActionPerformed

    private void cbCidDiagAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCidDiagAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCidDiagAlunoActionPerformed
    
    //    Vector<Integer> id_beneficio = new Vector<>();

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new FrmCadastroAlunos().setVisible(true);               
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> cbAuxiliar;
    private javax.swing.JComboBox<String> cbBeneficios;
    private javax.swing.JComboBox<String> cbCidAluno_hd;
    private javax.swing.JComboBox<String> cbCidDiagAluno;
    private javax.swing.JComboBox<String> cbEstatus;
    private javax.swing.JComboBox<String> cbLaudo;
    private javax.swing.JComboBox<String> cbProfessor;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbSuspeita;
    private javax.swing.JComboBox<String> cbTipoDiag;
    private javax.swing.JComboBox<String> cbTipoHD;
    private javax.swing.JComboBox<String> cbTransporte;
    private javax.swing.JComboBox<String> cbTurnoAEE;
    private javax.swing.JComboBox<String> cbTurnoEscolar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAnoEscolar;
    private javax.swing.JTextField txtCpfAluno;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JFormattedTextField txtDatacadastro;
    private javax.swing.JTextField txtDescDiagnostico;
    private javax.swing.JTextField txtDescricaoHD;
    private javax.swing.JTextField txtMobilidade;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextArea txtObservacoes;
    private javax.swing.JTextField txtProfessorregular;
    private javax.swing.JTextField txtResponsavel;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
 public void cadastrarAlunos()
 {
     
        int diagnostico = ComboRestauraCidDiagnostico();
        int hipotesediagostica = ComboHipotese();
        int beneficios = ComboBeneficios();
        int professor = ComboRestauraProfessor();
    
          txtTelefone.getText();
          txtCpfAluno.getText();
          txtDescDiagnostico.getText();
          txtDescricaoHD.getText();
          txtObservacoes.getText();
          txtResponsavel.getText();
          txtAnoEscolar.getText();
          txtMobilidade.getText();
          
          
          String dia = txtDataNasc.getText().substring(0, 2);
          String mes = txtDataNasc.getText().substring(3, 5);
          String ano = txtDataNasc.getText().substring(6);
          
          String diaCadastro = txtDatacadastro.getText().substring(0, 2);
          String mesCadastro = txtDatacadastro.getText().substring(3, 5);
          String anoCadastro = txtDatacadastro.getText().substring(6);
          
          String dataMySQL = ano+"-"+mes+"-"+dia;
          String dataCadastro = anoCadastro+"-"+mesCadastro+"-"+diaCadastro;
          
//        if (txtDatacadastro.getText().isEmpty())
//        {            
//            JOptionPane.showMessageDialog(null, "Campo DATA DO CADASTRO não "
//                    + " pode ficar vazio");
//        }
        if (dataCadastro.isEmpty())
        {            
            JOptionPane.showMessageDialog(null, "Campo DATA DO CADASTRO não "
                    + " pode ficar vazio");
        } 
        else if (cbSexo.getSelectedItem().equals("SELECIONE"))   
        {
            JOptionPane.showMessageDialog(null, "Campo SEXO não "
                    + "pode ficar vazio");
        }
        
//        else  if (txtCpfAluno.getText().isEmpty())
//        {
//            JOptionPane.showMessageDialog(null, "Campo CPF não pode ficar vazia");
//        }
        
        else if (dataMySQL.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Campo DATA DE NASCIMENTO "
                    + "não pode ficar vazia");
        } 
        
        else if (txtNomeAluno.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Campo NOME DO ALUNO "
                    + "não pode ficar vazio");
        }  
                
//        else if (txtResponsavel.getText().isEmpty())
//        {
//            JOptionPane.showMessageDialog(null, "campo RESPONSÁVEL não pode ficar "
//                    + "vazio");
//        }
           
        else if (cbLaudo.getSelectedItem().equals("SELECIONE"))   
        {
            JOptionPane.showMessageDialog(null, "LAUDO "
                    + " não pode ficar vazio.");            
        } 
        
         else if (cbSuspeita.getSelectedItem().equals("SELECIONE"))   
         {
                JOptionPane.showMessageDialog(null, "FONTE DE SUSPEITA "
                        + "não pode ficar vazio.");
         }
        
        
 
        else if (cbBeneficios.getSelectedItem().equals("SELECIONE"))   
        {
            JOptionPane.showMessageDialog(null, "BENEFÍCIOS "
                    + "não pode ficar vazio.");
        }
        
        else if (cbEstatus.getSelectedItem().equals("SELECIONE")) 
        {
            JOptionPane.showMessageDialog(null, "ESTATUS "
                    + "não pode ficar vazio.");
        }           
        
        else if (cbTipoDiag.getSelectedItem().equals("SELECIONE")) 
        {
            JOptionPane.showMessageDialog(null, "TIPO DIAGNOSTICO "
                    + "não pode ficar vazio.");            
        }
        
        else if (cbCidDiagAluno.getSelectedItem().equals("SELECIONE")) 
       {
            JOptionPane.showMessageDialog(null, "CID-DIAGNÓSTICO não "
                    + "pode ficar vazio.");
       }       

       else if (cbTipoHD.getSelectedItem().equals("SELECIONE")) 
        {
            JOptionPane.showMessageDialog(null, "TIPO HD "
                    + "não pode ficar vazio.");
        }         

        else if (cbCidAluno_hd.getSelectedItem().equals("SELECIONE")) 
        {
            JOptionPane.showMessageDialog(null, "CID-HD não pode ficar vazio.");
        }       

        else if (cbProfessor.getSelectedItem().equals("SELECIONE")) 
        {
            JOptionPane.showMessageDialog(null, "ESCOLHA O TURNO ESCOLAR");
        } 
        
        else if (cbTurnoAEE.getSelectedItem().equals("SELECIONE")) 
        {
            JOptionPane.showMessageDialog(null, "ESCOLHA O TURNO AEE");
        }
        else if (cbProfessor.getSelectedItem().equals("SELECIONE")) 
        {
            JOptionPane.showMessageDialog(null, "Escolha um PROFESSOR.");
        }
        
         else if (cbAuxiliar.getSelectedItem().equals("SELECIONE")) 
        {
            JOptionPane.showMessageDialog(null, "Escolha um AUXILIAR");
        }
         
        else if (cbTransporte.getSelectedItem().equals("SELECIONE")) 
        {
            JOptionPane.showMessageDialog(null, "Escolha um TRANSPORTE");
        }
        
        
        else
        {
            AlunosAEE objalunos = new AlunosAEE(
            
                    txtCpfAluno.getText(),                    
//                    txtDatacadastro.getText(),
                    dataCadastro,
                    txtAnoEscolar.getText().toUpperCase(),                    
                    txtNomeAluno.getText().toUpperCase(), 
                    cbSexo.getSelectedItem().toString(),
                    dataMySQL,
                    txtResponsavel.getText().toUpperCase(),
                    txtTelefone.getText().toUpperCase(),
                    cbSuspeita.getSelectedItem().toString(),        
                    cbLaudo.getSelectedItem().toString(), 
                    cbTipoDiag.getSelectedItem().toString(),
                    txtDescDiagnostico.getText().toUpperCase(),
                    cbTipoHD.getSelectedItem().toString(),
                    txtDescricaoHD.getText().toUpperCase(),                     
                    cbTurnoEscolar.getSelectedItem().toString(),                    
                    cbTurnoAEE.getSelectedItem().toString(),                     
                    txtProfessorregular.getText().toUpperCase(),                    
                    cbEstatus.getSelectedItem().toString(),
                    txtObservacoes.getText().toUpperCase(),
                    cbTransporte.getSelectedItem().toString(),
                    cbAuxiliar.getSelectedItem().toString(),
                    txtMobilidade.getText().toUpperCase(),                    
                    diagnostico,
                    hipotesediagostica,                    
                    beneficios,
                    professor                      
                    
            ); 
            
               DAO_Alunos inserirAlunos = new DAO_Alunos();
             
               try
               {
                    inserirAlunos.adicionarAlunos(objalunos);                        
                    JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
                    
                    txtCpfAluno.setText("");
                    txtDatacadastro.setText("");    
                    cbSexo.setSelectedItem("SELECIONE");
                    txtAnoEscolar.setText("");
                    txtNomeAluno.setText("");   
                    txtDataNasc.setText("");
                    txtResponsavel.setText("");
                    txtTelefone.setText("");                    
                    cbSuspeita.setSelectedItem("SELECIONE");
                    cbLaudo.setSelectedItem("SELECIONE");
                    txtDescDiagnostico.setText("");                 
                    txtDescricaoHD.setText("");
                    cbProfessor.setSelectedItem("SELECIONE");
                    cbTurnoEscolar.setSelectedItem("SELECIONE");    
                    cbTurnoAEE.setSelectedItem("SELECIONE");                    
                    cbTipoDiag.setSelectedItem("SELECIONE");    
                    cbTipoHD.setSelectedItem("SELECIONE");
                    cbEstatus.setSelectedItem("A");
                    txtObservacoes.setText("");
                    cbTransporte.setSelectedItem("SELECIONE");
                    cbAuxiliar.setSelectedItem("SELECIONE");
                    txtMobilidade.setText("");
                    cbCidDiagAluno.setSelectedItem("SELECIONE");
                    cbCidAluno_hd.setSelectedItem("SELECIONE");
                    cbBeneficios.setSelectedItem("SELECIONE");  
                    txtProfessorregular.setText("");
                    
               }
               catch(HeadlessException erro)
               {
                   JOptionPane.showMessageDialog(null,"Ocorreu um erro ao "
                           + "cadastrar aluno" + erro);
               }               
        }  
        
 }
ArrayList<Integer> id_beneficio = new ArrayList<>();
     public void restauraComboBoxBeneficio()
    {
        try
        {
            DAO_Beneficios objbeneficios = new DAO_Beneficios();
            ResultSet resultadoSetado = objbeneficios.listarBeneficio();
            
            while (resultadoSetado.next())
            {
                id_beneficio.add(resultadoSetado.getInt(1));                                                          
                cbBeneficios.addItem(resultadoSetado.getString(2));                                
            }
        }catch(SQLException erro)
         {
                    JOptionPane.showMessageDialog(null,"Erro ao carregar ComboBox" + erro);
         }
    }
    
    
     ArrayList<Integer> id_professor = new ArrayList<>();  
     
    public void restauraComboBoxProfessor()
    {      
        
        try
        {
            DAO_ProfessoresAEE objprofessor = new DAO_ProfessoresAEE();
            ResultSet resultadoSetado = objprofessor.listar();
            
            
            while (resultadoSetado.next())
            {
                id_professor.add(resultadoSetado.getInt(1));
                cbProfessor.addItem(resultadoSetado.getString(2));
                
            }
        }catch(SQLException erro)
         {
                    JOptionPane.showMessageDialog(null,"Erro ao carregar "
                            + "ComboBox" + erro);
         }
    }
//    Vector<Integer> id_cid = new Vector<>();
     ArrayList<Integer> id_cid = new ArrayList<>();
    public void restauraComboBoxCidDiagnostico()
    {
        try
        {
            DAO_Cid objalunos = new DAO_Cid();
            ResultSet resultadoSetado = objalunos.listarCid();
            
            while (resultadoSetado.next())
            {
                id_cid.add(resultadoSetado.getInt(1));
                cbCidDiagAluno.addItem(resultadoSetado.getString(2));                                                
                                             
            }
        }catch(SQLException erro)
         {
                    JOptionPane.showMessageDialog(null,"Erro ao carregar ComboBox" + erro);
         }
    }
    
    
    public void restauraComboBoxCidHD()
    {
        try
        {
            DAO_Cid objalunos = new DAO_Cid();
            ResultSet resultadoSetado = objalunos.listarCid();
            
            while (resultadoSetado.next())
            {
                id_cid.add(resultadoSetado.getInt(1));                                                          
                cbCidAluno_hd.addItem(resultadoSetado.getString(2));                                
            }
        }catch(SQLException erro)
         {
                    JOptionPane.showMessageDialog(null,"Erro ao carregar ComboBox" + erro);
         }
    }   
    
      public int ComboRestauraCidDiagnostico()
        {
            int diagnostico = 0;
                
        try
        {

            DAO_Cid objcid = new DAO_Cid();
            ResultSet resultadoSetado = objcid.buscarcid(cbCidDiagAluno.getSelectedItem().toString());
            
            while (resultadoSetado.next())
            {
                diagnostico = resultadoSetado.getInt(1);
            }
 
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Erro ao carregar "
                            + "ComboBox cid diagnostico" + erro);
         }
       return diagnostico;      
    
        }
      public int  ComboHipotese()
      {
            int hipotesediagostica = 0;
                
        try
        {

             DAO_Cid objcid = new DAO_Cid();
            ResultSet resultadoSetado = objcid.buscarcid(cbCidAluno_hd.getSelectedItem().toString());
            
            while (resultadoSetado.next())
            {
                hipotesediagostica = resultadoSetado.getInt(1);
            }
 
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Erro ao carregar "
                            + "ComboBox professor" + erro);
         }
       return hipotesediagostica;      
    
        }  
        public int ComboBeneficios()
       {
            int beneficios = 0;
                
        try
        {

          DAO_Beneficios objbeneficios = new DAO_Beneficios();
            ResultSet resultadoSetado = objbeneficios.buscarBeneficios(cbBeneficios.getSelectedItem().toString());
            
            while (resultadoSetado.next())
            {
                beneficios = resultadoSetado.getInt(1);
            }
 
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Erro ao carregar "
                            + "ComboBox professor" + erro);
         }
       return beneficios;      
    
        }
         public int ComboRestauraProfessor()
        {
            int professor = 0;
                
        try
        {

            DAO_ProfessoresAEE objprofessores = new DAO_ProfessoresAEE();
            ResultSet resultadoSetado = objprofessores.buscarProfessores(cbProfessor.getSelectedItem().toString());
            
            while (resultadoSetado.next())
            {
                professor = resultadoSetado.getInt(1);
            }
 
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Erro ao carregar "
                            + "ComboBox professor" + erro);
         }
       return professor;      
    
        }
    
   
}
