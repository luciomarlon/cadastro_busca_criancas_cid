
package View;

import DAO.DAO_Acompanhamentos;
import DAO.DAO_Alunos;
import Model.Acompanhamentos;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


public class FrmAtualizarAcompanhamentos extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Acompanhamentos
     */
    public FrmAtualizarAcompanhamentos() {
        initComponents();
        restauraComboAluno();
        AutoCompleteDecorator.decorate(cbAluno);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAcompanhamento = new javax.swing.JTextArea();
        txtInstrumentos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNatureza = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        btnAtualizarAcompanhamento = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        cbAluno = new javax.swing.JComboBox<>();
        brnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("ATUALIZAR ACOMPANHAMENTOS");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Aluno");

        txtAcompanhamento.setBackground(new java.awt.Color(204, 255, 255));
        txtAcompanhamento.setColumns(20);
        txtAcompanhamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAcompanhamento.setRows(5);
        jScrollPane2.setViewportView(txtAcompanhamento);

        txtInstrumentos.setBackground(new java.awt.Color(204, 255, 255));
        txtInstrumentos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Local");

        txtNatureza.setBackground(new java.awt.Color(204, 255, 255));
        txtNatureza.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Municipal/Estadual/Federal");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Observações");

        txtObservacoes.setBackground(new java.awt.Color(204, 255, 255));
        txtObservacoes.setColumns(20);
        txtObservacoes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtObservacoes.setRows(5);
        jScrollPane1.setViewportView(txtObservacoes);

        btnAtualizarAcompanhamento.setBackground(new java.awt.Color(204, 255, 255));
        btnAtualizarAcompanhamento.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAtualizarAcompanhamento.setText("Atualizar");
        btnAtualizarAcompanhamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarAcompanhamentoActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Acompanhamento");

        cbAluno.setEditable(true);
        cbAluno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbAluno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));

        brnCancelar.setBackground(new java.awt.Color(204, 255, 255));
        brnCancelar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        brnCancelar.setText("Fechar");
        brnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtualizarAcompanhamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(brnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(txtInstrumentos)
                    .addComponent(jLabel27)
                    .addComponent(txtNatureza)
                    .addComponent(jLabel26)
                    .addComponent(jScrollPane1)
                    .addComponent(cbAluno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtInstrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtNatureza, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizarAcompanhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarAcompanhamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarAcompanhamentoActionPerformed
//        String acompanhamento, instrumento, natureza, observacoes;
        txtAcompanhamento.getText();
        txtInstrumentos.getText();
        txtNatureza.getText();
        txtObservacoes.getText();

        
        if (cbAluno.getSelectedItem().equals("SELECIONE"))
        {
            JOptionPane.showMessageDialog(null,"Selecione o ALUNO");
        }
        else
        {
            Acompanhamentos objacompanha = new Acompanhamentos(
                txtAcompanhamento.getText(),
                txtInstrumentos.getText(),
                txtNatureza.getText(),
                txtObservacoes.getText(),
                cbAluno.getSelectedIndex()
                
            );

            DAO_Acompanhamentos inserirAcompanhamento = new DAO_Acompanhamentos();

            try
            {
                inserirAcompanhamento.adicionarAcompanhamento(objacompanha);
                JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
                cbAluno.setSelectedItem("SELECIONE");
                txtAcompanhamento.setText("");
                txtInstrumentos.setText("");
                txtNatureza.setText("");
                txtObservacoes.setText("");
                
            }
            catch(HeadlessException erro)
            {
                JOptionPane.showMessageDialog(null,"Ocorreu um erro ao "
                    + "cadastrar acompanhamento" + erro);
            }

        }
    }//GEN-LAST:event_btnAtualizarAcompanhamentoActionPerformed

    private void brnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnCancelarActionPerformed
       FrmAtualizarAcompanhamentos cadastroAcompanhamentos = new FrmAtualizarAcompanhamentos();
        cadastroAcompanhamentos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_brnCancelarActionPerformed
    ArrayList<Integer> id_aluno = new ArrayList<>();
        
    public void restauraComboAluno()
        {
           try
           {
               DAO_Alunos objalunos = new DAO_Alunos();
               ResultSet resultadoSetado = objalunos.listarAcompanhamentoAlunos();

               while (resultadoSetado.next())
               {
                   id_aluno.add(resultadoSetado.getInt(1));                                                          
                   cbAluno.addItem(resultadoSetado.getString(5));                                
               }
           }
           catch(SQLException erro)
            {
                       JOptionPane.showMessageDialog(null,"Erro ao carregar ComboBox" + erro);
            }
       }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAtualizarAcompanhamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAtualizarAcompanhamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAtualizarAcompanhamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAtualizarAcompanhamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAtualizarAcompanhamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnCancelar;
    private javax.swing.JButton btnAtualizarAcompanhamento;
    private javax.swing.JComboBox<String> cbAluno;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAcompanhamento;
    private javax.swing.JTextField txtInstrumentos;
    private javax.swing.JTextField txtNatureza;
    private javax.swing.JTextArea txtObservacoes;
    // End of variables declaration//GEN-END:variables
}
