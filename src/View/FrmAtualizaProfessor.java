package View;

import DAO.DAO_Escolas;
import DAO.DAO_ProfessoresAEE;
import Model.ProfessoresAEE;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author LucioMarlon
 */
public class FrmAtualizaProfessor extends javax.swing.JFrame {

    /**
     * Creates new form FrmCadastro_Professor
     */
    public FrmAtualizaProfessor() {
        initComponents();
        AutoCompleteDecorator.decorate(cbEscola);
        restauraComboEscola();
        
    }

     String codigoAtualiza;
     
     public void AtualizaProfessor(String professor_aee,String escola_vinculada, 
                                    String professor_regular, String auxiliar_sala, 
                                    String turno_professor,String dataatualizacao,
                                    String estatusprofessor, String escola_sede, 
                                    String id_professor)

             
    {
        
        txtProfessorAEE.setText(professor_aee);                    
        txtEscolaVinculada.setText(escola_vinculada);                             
        txtProfessorRegular.setText(professor_regular);
        cbAuxiliarDeSala.setSelectedItem(auxiliar_sala);
        cbTurnoProfessor.setSelectedItem(turno_professor);
        txtDataAtualizacao.setText(dataatualizacao);
        cbEstatus.setSelectedItem(estatusprofessor);
        cbEscola.setSelectedItem(escola_sede);
        codigoAtualiza = id_professor;
        
    }
            
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        txtProfessorRegular = new javax.swing.JTextField();
        txtProfessorAEE = new javax.swing.JTextField();
        cbAuxiliarDeSala = new javax.swing.JComboBox<>();
        cbEstatus = new javax.swing.JComboBox<>();
        cbTurnoProfessor = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtEscolaVinculada = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbEscola = new javax.swing.JComboBox<>();
        brnCancelar = new javax.swing.JButton();
        txtDataAtualizacao = new javax.swing.JFormattedTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("CREI - ATUALIZAR PROFESSOR");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Professor AEE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Professor Regular");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Estatus");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Turno Professor");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Auxiliar de Sala");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Data Atualização");

        btnAtualizar.setBackground(new java.awt.Color(204, 255, 255));
        btnAtualizar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        txtProfessorRegular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtProfessorAEE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        cbAuxiliarDeSala.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbAuxiliarDeSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO", "PARCIAL" }));

        cbEstatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "A", "D" }));

        cbTurnoProfessor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbTurnoProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "Integral", "Manhã", "Inter", "Tarde", "Manhã/Tarde", "Manhã/Inter", "Tarde/Inter" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Escola Vinculada");

        txtEscolaVinculada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Escola");

        cbEscola.setEditable(true);
        cbEscola.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbEscola.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));

        brnCancelar.setBackground(new java.awt.Color(204, 255, 255));
        brnCancelar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        brnCancelar.setText("Fechar");
        brnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnCancelarActionPerformed(evt);
            }
        });

        txtDataAtualizacao.setBackground(new java.awt.Color(204, 255, 255));
        try {
            txtDataAtualizacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(cbAuxiliarDeSala, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(173, 173, 173)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbTurnoProfessor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(txtProfessorAEE, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProfessorRegular, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10))
                                .addGap(182, 182, 182)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtDataAtualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9)
                            .addComponent(txtEscolaVinculada, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(brnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cbEscola, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtProfessorAEE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEscolaVinculada, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtProfessorRegular, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbTurnoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(cbAuxiliarDeSala, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataAtualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        ComboRestaura();        
        atualizarProfessor();
        
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void brnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnCancelarActionPerformed
        FrmAtualizaProfessor atualizaprofessor = new FrmAtualizaProfessor();
        atualizaprofessor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_brnCancelarActionPerformed

    
    public void atualizarProfessor()
    {
        
        int id_codigoescola = ComboRestaura();
        
   
        txtEscolaVinculada.getText();
        txtProfessorRegular.getText();
    
        
          
        String diaAtualiza = txtDataAtualizacao.getText().substring(0, 2);
        String mesAtualiza = txtDataAtualizacao.getText().substring(3, 5);
        String anoAtualiza = txtDataAtualizacao.getText().substring(6);
        
        String dataAtualiza = anoAtualiza+"-"+mesAtualiza+"-"+diaAtualiza;
         



        if (txtProfessorAEE.getText().isEmpty())
        {            
            JOptionPane.showMessageDialog(null, "Campo professor não  "
                    + " pode ficar vazio");
        } 
        
        
        else if (cbAuxiliarDeSala.getSelectedItem().equals("SELECIONE"))   
        {
            JOptionPane.showMessageDialog(null, "AUXILIAR DE SALA "
                    + " não pode ficar vazio.");
        }  
        
        else if (cbTurnoProfessor.getSelectedItem().equals("SELECIONE"))   
        {
            JOptionPane.showMessageDialog(null, "Campo TURNO não "
                    + "pode ficar vazio");
        }  

//        else if (txtDataAtualizacao.getText().isEmpty())  
//        {
//            JOptionPane.showMessageDialog(null, "Atualização/cadastro"
//                    + "não pode ficar vazio.");
//        }  
        
         else if (dataAtualiza.isEmpty())  
        {
            JOptionPane.showMessageDialog(null, "Atualização/cadastro"
                    + "não pode ficar vazio.");
        }  
        

        else if (cbEstatus.getSelectedItem().equals("SELECIONE")) 
        {
            JOptionPane.showMessageDialog(null, "ESTATUS "
                    + "não pode ficar vazio.");
        }           
        
          else if (cbEscola.getSelectedItem().equals("SELECIONE"))   
        {
            JOptionPane.showMessageDialog(null, "ESCOLA "
                    + "não pode ficar vazio.");
        }
        
        
        else
        {
            
            DAO_ProfessoresAEE atualizaprofessor = new DAO_ProfessoresAEE();
            ProfessoresAEE alteraProfessores = new ProfessoresAEE(
                    
                    txtProfessorAEE.getText().toUpperCase(),
                    txtEscolaVinculada.getText().toUpperCase(),
                    txtProfessorRegular.getText().toUpperCase(),                    
                    cbAuxiliarDeSala.getSelectedItem().toString(),    
                    cbTurnoProfessor.getSelectedItem().toString(),                                                                        
//                    txtDataAtualizacao.getText(),
                    dataAtualiza,
                    cbEstatus.getSelectedItem().toString(),
                    id_codigoescola,
                    codigoAtualiza                          
                    
            ); 

            
               try
               {
                    txtProfessorAEE.setText("");
                    txtEscolaVinculada.setText("");
                    txtProfessorRegular.setText("");                
                    cbAuxiliarDeSala.setSelectedItem("SELECIONE"); 
                    cbTurnoProfessor.setSelectedItem("SELECIONE");                                                                    
                    txtDataAtualizacao.setText("");
                    cbEstatus.setSelectedItem("SELECIONE");
                    cbEscola.setSelectedItem("SELECIONE");
                    String codigo = this.codigoAtualiza;      
                   
                    atualizaprofessor.alterarProfessores(alteraProfessores);                        
                    JOptionPane.showMessageDialog(null,"Atualizado com sucesso");
                    
                    FrmPesquisarProfessor Pesquisa = new FrmPesquisarProfessor();                    
//                    Pesquisa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    Pesquisa.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                    this.dispose();
                    Pesquisa.setVisible(true);  
               }
               catch(HeadlessException erro)
               {
                   JOptionPane.showMessageDialog(null,"Ocorreu um erro ao "
                           + "cadastrar aluno" + erro);
               }               
        }
        
 }
    ArrayList<Integer> id_escola = new ArrayList<>();
     public void restauraComboEscola()
    {
        try
        {
            DAO_Escolas objescolas = new DAO_Escolas();
            ResultSet resultadoSetado = objescolas.listarEscolasCombobox();
            
            while (resultadoSetado.next())
            {
                id_escola.add(resultadoSetado.getInt(1));                                                          
                cbEscola.addItem(resultadoSetado.getString(3));                                
            }
        }
        catch(SQLException erro)
         {
                    JOptionPane.showMessageDialog(null,"Erro ao carregar "
                            + "ComboBox ESCOLA" + erro);
         }
    }
    
       public int ComboRestaura()
        {
            int id_escola = 0;
                
        try
        {

            DAO_Escolas objescolas = new DAO_Escolas();
            ResultSet resultadoSetado = objescolas.buscaEscola(cbEscola.getSelectedItem().toString());
            
            while (resultadoSetado.next())
            {
                id_escola = resultadoSetado.getInt(1);
            }
 
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Erro ao carregar "
                            + "ComboBox ESCOLA" + erro);
         }
       return id_escola;      
    
        }

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(() -> {
            new FrmAtualizaProfessor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnCancelar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JComboBox<String> cbAuxiliarDeSala;
    private javax.swing.JComboBox<String> cbEscola;
    private javax.swing.JComboBox<String> cbEstatus;
    private javax.swing.JComboBox<String> cbTurnoProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField txtDataAtualizacao;
    private javax.swing.JTextField txtEscolaVinculada;
    private javax.swing.JTextField txtProfessorAEE;
    private javax.swing.JTextField txtProfessorRegular;
    // End of variables declaration//GEN-END:variables



}
