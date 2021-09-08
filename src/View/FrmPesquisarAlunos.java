
package View;

import DAO.DAO_Alunos;
import Model.AlunosAEE;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmPesquisarAlunos extends javax.swing.JFrame {

    public FrmPesquisarAlunos() {
        initComponents();
        ListarAlunos();     
        PesquisarTotal();
        lbMudaDiagnostico.setText("TOTAL DE REGISTROS");
        txtMudaDiagnostico.setText("TOTAL DE REGISTROS");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListarAlunos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        txtPesquisaAlunos = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        cbBuscarTipo = new javax.swing.JComboBox<>();
        txtTotalDiagnosticos = new javax.swing.JTextField();
        LbTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LbBusca = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lbMudaDiagnostico = new javax.swing.JLabel();
        txtMudaDiagnostico = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCAR/LISTAR ALUNOS");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Listar/Pesquisar - ALUNOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, -1, -1));

        tbListarAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cpf", "Data Cadastro", "professor", "Nome", "Nascimento", "sexo", "Laudo", "Suspeita", "Responsável", "Tipo Diagnostico", "Cid-Diag", "Descrição Diag", "Tipo HD", "Cid-HD", "Descrição HD", "Ano escolar", "Turno Escolar", "Turno AEE", "Professor Regular", "Obs/Acomp", "Transporte", "Auxiliar", "Mobilidade", "Telefone", "beneficios", "Estatus", "id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbListarAlunos.setEditingColumn(0);
        tbListarAlunos.setEditingRow(0);
        jScrollPane1.setViewportView(tbListarAlunos);
        if (tbListarAlunos.getColumnModel().getColumnCount() > 0) {
            tbListarAlunos.getColumnModel().getColumn(0).setMinWidth(0);
            tbListarAlunos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tbListarAlunos.getColumnModel().getColumn(0).setMaxWidth(0);
            tbListarAlunos.getColumnModel().getColumn(23).setMinWidth(0);
            tbListarAlunos.getColumnModel().getColumn(23).setPreferredWidth(0);
            tbListarAlunos.getColumnModel().getColumn(23).setMaxWidth(0);
            tbListarAlunos.getColumnModel().getColumn(25).setMinWidth(0);
            tbListarAlunos.getColumnModel().getColumn(25).setPreferredWidth(0);
            tbListarAlunos.getColumnModel().getColumn(25).setMaxWidth(0);
            tbListarAlunos.getColumnModel().getColumn(26).setMinWidth(0);
            tbListarAlunos.getColumnModel().getColumn(26).setPreferredWidth(0);
            tbListarAlunos.getColumnModel().getColumn(26).setMaxWidth(0);
        }
        tbListarAlunos.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 1860, 460));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Buscar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 710, 200, 60));

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 130, 40));

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnHome.setText("Fechar");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 710, 200, 60));

        txtPesquisaAlunos.setBackground(new java.awt.Color(204, 255, 255));
        txtPesquisaAlunos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPesquisaAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaAlunosActionPerformed(evt);
            }
        });
        getContentPane().add(txtPesquisaAlunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 430, 35));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 120, 40));

        cbBuscarTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbBuscarTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "Diagnostico - UNICO", "Diagnostico - MULTIPLO", "HD - UNICO", "HD - MULTIPLO" }));
        cbBuscarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarTipoActionPerformed(evt);
            }
        });
        getContentPane().add(cbBuscarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 260, 40));

        txtTotalDiagnosticos.setBackground(new java.awt.Color(102, 204, 255));
        txtTotalDiagnosticos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotalDiagnosticos.setForeground(new java.awt.Color(255, 0, 51));
        txtTotalDiagnosticos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalDiagnosticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalDiagnosticosActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotalDiagnosticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 670, 140, 30));

        LbTotal.setBackground(new java.awt.Color(153, 255, 204));
        LbTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(LbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 620, 50, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Você buscou por:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, -1, -1));

        LbBusca.setBackground(new java.awt.Color(153, 255, 204));
        LbBusca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbBusca.setText(" ");
        getContentPane().add(LbBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 630, 280, -1));

        txtTotal.setBackground(new java.awt.Color(102, 204, 255));
        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 0, 51));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 670, 80, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Temos atualmente ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 630, -1, -1));

        lbMudaDiagnostico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(lbMudaDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 630, -1, -1));

        txtMudaDiagnostico.setBackground(new java.awt.Color(102, 204, 255));
        txtMudaDiagnostico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMudaDiagnostico.setForeground(new java.awt.Color(255, 0, 51));
        txtMudaDiagnostico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMudaDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMudaDiagnosticoActionPerformed(evt);
            }
        });
        getContentPane().add(txtMudaDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 670, 230, 30));

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        FrmPesquisarAlunos pesquisaralunos = new FrmPesquisarAlunos();
//        pesquisaralunos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.dispose();
        
        AlteracaoAlunos();
//        Limpar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

//            Limpar();
            txtPesquisaAlunos.setText("");
            txtTotal.setText(""); 
            txtTotalDiagnosticos.setText("");
            txtMudaDiagnostico.setText("");
            LbTotal.setText("");
            LbBusca.setText("");
            lbMudaDiagnostico.setText("");
            cbBuscarTipo.setSelectedItem("SELECIONE");
            lbMudaDiagnostico.setText("TOTAL DE REGISTROS");
            txtMudaDiagnostico.setText("TOTAL DE REGISTROS");
             
            DefaultTableModel model = (DefaultTableModel) tbListarAlunos.getModel ();       
            model.setRowCount (0); 
            
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        FrmPesquisarAlunos pesquisaralunos = new FrmPesquisarAlunos();
        pesquisaralunos.setLocationRelativeTo(null);
        pesquisaralunos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
                 
                if(txtPesquisaAlunos.getText().equals(""))
                {
                    Limpar();
                    ListarAlunos();                    
                    PesquisarTotal();  
                    lbMudaDiagnostico.setText("TOTAL DE REGISTROS");
                    txtMudaDiagnostico.setText("TOTAL DE REGISTROS");
                    
                }
                else
                {
                    PesquisarAlunos();
                    PesquisarTotal();  

                }
               
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbBuscarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarTipoActionPerformed

            if (cbBuscarTipo.getSelectedItem().equals("SELECIONE"))
            {
                txtMudaDiagnostico.setText("REGISTROS");
                lbMudaDiagnostico.setText("REGISTROS");
                PesquisarTotal();  
                PesquisarAlunos();                
                ListarAlunos();
                PesquisarDiagnostico();
                tbListarAlunos.editCellAt(0,0);
                
            }            
            
            else if(cbBuscarTipo.getSelectedItem().equals("Diagnostico - UNICO"))
            {
                txtMudaDiagnostico.setText("DIAG. UNICO");
                lbMudaDiagnostico.setText("DIAG. UNICO");
                PesquisarTotalDiagUnico();
                PesquisarTipoDiagnosticoUnico();                
                txtPesquisaAlunos.getText();
                tbListarAlunos.editCellAt(0,0);
            }
            
            else if(cbBuscarTipo.getSelectedItem().equals("Diagnostico - MULTIPLO"))
            {
                txtMudaDiagnostico.setText("DIAG. MULTIPLO");
                lbMudaDiagnostico.setText("DIAG. MULTIPLO");
                PesquisarTotalDiagMultiplo();
                PesquisarTipoDiagnosticoMultiplo(); 
                txtPesquisaAlunos.getText();
                tbListarAlunos.editCellAt(0,0);
            } 
            
            else if(cbBuscarTipo.getSelectedItem().equals("HD - UNICO"))
            {
                txtMudaDiagnostico.setText("HD - UNICO");
                lbMudaDiagnostico.setText("HD - UNICO");                
                PesquisarHDTotalUnico();
                PesquisarTipoHDUnico(); 
                txtPesquisaAlunos.getText();
                tbListarAlunos.editCellAt(0,0);
            }
            
            else if(cbBuscarTipo.getSelectedItem().equals("HD - MULTIPLO"))
            {
                txtMudaDiagnostico.setText("HD - MULTIPLO");
                lbMudaDiagnostico.setText("HD - MULTIPLO");                
                PesquisarTotalHDMultiplo();
                PesquisarTipoHDMultiplo(); 
                txtPesquisaAlunos.getText();
                tbListarAlunos.editCellAt(0,0);
            } 

    }//GEN-LAST:event_cbBuscarTipoActionPerformed

    private void txtTotalDiagnosticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalDiagnosticosActionPerformed

    }//GEN-LAST:event_txtTotalDiagnosticosActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtMudaDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMudaDiagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMudaDiagnosticoActionPerformed

    private void txtPesquisaAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaAlunosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaAlunosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new FrmPesquisarAlunos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbBusca;
    private javax.swing.JLabel LbTotal;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cbBuscarTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMudaDiagnostico;
    private javax.swing.JTable tbListarAlunos;
    private javax.swing.JTextField txtMudaDiagnostico;
    private javax.swing.JTextField txtPesquisaAlunos;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalDiagnosticos;
    // End of variables declaration//GEN-END:variables
    public void AlteracaoAlunos()
    {
         String  cpf, dataCadastro,  anoescolar, nomealuno,  sexo, laudo,  
                 tipodiag, datanascimento,  responsavel, telefone,  suspeita,  
                 cid_diag, descdiagnostico, cid_hd, tipoHD,  descHD, turnoescolar,  
                 turnoaee,  profregular, estatus, observacoes, transporte, auxiliar, 
                 mobilidade, beneficios,  professor, id_aluno;
         
         if (tbListarAlunos.getSelectedRow() < 0)
         {
             JOptionPane.showMessageDialog(null, "Selecione um Aluno");
             FrmPesquisarAlunos pesquisar = new FrmPesquisarAlunos();
             pesquisar.setVisible(true);
             PesquisarAlunos();             
         }
         else
         {
             int linha = tbListarAlunos.getSelectedRow();

             cpf = (String) tbListarAlunos.getValueAt(linha, 0);
             dataCadastro = (String) tbListarAlunos.getValueAt(linha, 1); 
             professor = (String)tbListarAlunos.getValueAt(linha, 2);
             nomealuno = (String) tbListarAlunos.getValueAt(linha, 3);
             datanascimento = (String)tbListarAlunos.getValueAt(linha, 4); 
             sexo = (String) tbListarAlunos.getValueAt(linha, 5);
             laudo = (String)tbListarAlunos.getValueAt(linha, 6);
             suspeita = (String)tbListarAlunos.getValueAt(linha, 7);
             responsavel = (String)tbListarAlunos.getValueAt(linha, 8);
             tipodiag = (String)tbListarAlunos.getValueAt(linha, 9); 
             cid_diag = (String)tbListarAlunos.getValueAt(linha, 10);           
             descdiagnostico = (String)tbListarAlunos.getValueAt(linha, 11);              
             tipoHD = (String)tbListarAlunos.getValueAt(linha, 12);
             cid_hd = (String)tbListarAlunos.getValueAt(linha, 13);             
             descHD = (String)tbListarAlunos.getValueAt(linha, 14);
             anoescolar = (String) tbListarAlunos.getValueAt(linha, 15);
             turnoescolar = (String)tbListarAlunos.getValueAt(linha, 16);             
             turnoaee = (String)tbListarAlunos.getValueAt(linha, 17);    
             profregular = (String)tbListarAlunos.getValueAt(linha, 18);
             observacoes = (String)tbListarAlunos.getValueAt(linha, 19); 
             transporte = (String)tbListarAlunos.getValueAt(linha, 20); 
             auxiliar = (String)tbListarAlunos.getValueAt(linha, 21); 
             mobilidade = (String)tbListarAlunos.getValueAt(linha, 22);                
             telefone = (String)tbListarAlunos.getValueAt(linha, 23);
             beneficios = (String)tbListarAlunos.getValueAt(linha, 24);  
             estatus = (String)tbListarAlunos.getValueAt(linha, 25); 
             id_aluno = (String)tbListarAlunos.getValueAt(linha, 26);  
          
             
             FrmAtualizarAlunos atualizaalunos = new FrmAtualizarAlunos();
             atualizaalunos.setVisible(true);
             
             atualizaalunos.AtualizarAlunos(cpf, dataCadastro, anoescolar, 
                                            nomealuno, sexo, datanascimento, 
                                            responsavel,  telefone, suspeita, 
                                            laudo, tipodiag, descdiagnostico, 
                                            tipoHD, descHD, turnoescolar, 
                                            turnoaee, profregular, estatus, observacoes, 
                                            transporte, auxiliar, mobilidade, 
                                            cid_diag, cid_hd, beneficios, 
                                            professor, id_aluno);            
         }
    }
    
    public void ListarAlunos()
    {
        DefaultTableModel tabelaAlunos = 
                (DefaultTableModel)tbListarAlunos.getModel();
        
        DAO.DAO_Alunos listaalunos = new DAO_Alunos();
        ResultSet retornaAlunos = listaalunos.listarAlunos();
        
        try
        {
            while(retornaAlunos.next())
            {
                tabelaAlunos.addRow(new Object[]{
                    retornaAlunos.getString(1),
                    retornaAlunos.getString(2),
                    retornaAlunos.getString(3),
                    retornaAlunos.getString(4),
                    retornaAlunos.getString(5),
                    retornaAlunos.getString(6),
                    retornaAlunos.getString(7),
                    retornaAlunos.getString(8),
                    retornaAlunos.getString(9),
                    retornaAlunos.getString(10),
                    retornaAlunos.getString(11),
                    retornaAlunos.getString(12),
                    retornaAlunos.getString(13),                   
                    retornaAlunos.getString(14),
                    retornaAlunos.getString(15),
                    retornaAlunos.getString(16),
                    retornaAlunos.getString(17),
                    retornaAlunos.getString(18),
                    retornaAlunos.getString(19),
                    retornaAlunos.getString(20),
                    retornaAlunos.getString(21),
                    retornaAlunos.getString(22),
                    retornaAlunos.getString(23),
                    retornaAlunos.getString(24),
                    retornaAlunos.getString(25),
                    retornaAlunos.getString(26),
                    retornaAlunos.getString(27)
               
                });
              
            }
        
        }
        catch(SQLException erro)
        {
                throw new RuntimeException("Erro ao listar "
                        + "tabela ALUNOS." + erro);                          
        }     
        
    }
    
    public void PesquisarAlunos()
    {
        
        String Pesquisarescola  = txtPesquisaAlunos.getText().toUpperCase(); 
        String Pesquisaalunos   = txtPesquisaAlunos.getText().toUpperCase();
        String laudo            = txtPesquisaAlunos.getText().toUpperCase();
        String medico           = txtPesquisaAlunos.getText().toUpperCase();
        String sexo             = txtPesquisaAlunos.getText().toUpperCase();
        String descricao_diag   = txtPesquisaAlunos.getText().toUpperCase();
        String descricao_hd     = txtPesquisaAlunos.getText().toUpperCase();
        String professor_aee    = txtPesquisaAlunos.getText().toUpperCase();
        String mobilidade       = txtPesquisaAlunos.getText().toUpperCase();
        
        
        DefaultTableModel tabela = (DefaultTableModel) tbListarAlunos.getModel();
        tabela.setNumRows(0);
        
        DAO_Alunos buscaalunos = new DAO_Alunos();
        ResultSet buscar = buscaalunos.PesquisarAlunos(
                Pesquisarescola,                
                Pesquisaalunos, 
                sexo,
                laudo, 
                medico,
                descricao_diag,
                descricao_hd,
                professor_aee,
                mobilidade
        );
        
        try{
            while(buscar.next()){
                tabela.addRow(new Object []{
                    buscar.getString(1),
                    buscar.getString(2),
                    buscar.getString(3),
                    buscar.getString(4),
                    buscar.getString(5),
                    buscar.getString(6),
                    buscar.getString(7),
                    buscar.getString(8),
                    buscar.getString(9),
                    buscar.getString(10),
                    buscar.getString(11),
                    buscar.getString(12),
                    buscar.getString(13),
                    buscar.getString(14),
                    buscar.getString(15),
                    buscar.getString(16),
                    buscar.getString(17),
                    buscar.getString(18),
                    buscar.getString(19),
                    buscar.getString(20),
                    buscar.getString(21),
                    buscar.getString(22),
                    buscar.getString(23),
                    buscar.getString(24),
                    buscar.getString(25),
                    buscar.getString(26),
                    buscar.getString(27)
                });
                txtMudaDiagnostico.setText("REGISTROS");
                lbMudaDiagnostico.setText("REGISTROS");
            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema ao efetuar a busca"
                    + " " + error.getMessage());
        }        
    }
    
    
    private void PesquisarTotal()
    {
        
        String total_diagnostico   = txtPesquisaAlunos.getText().toUpperCase();  
        
        String mobilidade   = txtPesquisaAlunos.getText().toUpperCase();
       
        String totaltxt = txtTotalDiagnosticos.getText();                        
        
        String totalLabel =  LbTotal.getText();
        
        
        DAO_Alunos diagnostico = new DAO_Alunos();
        ResultSet busca = diagnostico.TotalAlunos(total_diagnostico, mobilidade);
        
        
        try{
                        
           while(busca.next()){
                totaltxt.equals(new Object []{
                    busca.getString(1)                       
                }
            
           );
           
           LbTotal.setText(busca.getString(1));
           LbBusca.setText(total_diagnostico);
           txtTotal.setText(busca.getString(1));
           txtTotalDiagnosticos.setText(total_diagnostico);

            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema ao efetuar a busca"
                    + " " + error.getMessage());
        }    
        
    }
    
    
    private void PesquisarTotalDiagUnico()
    {
        
        String total_diagnostico   = txtPesquisaAlunos.getText().toUpperCase();
        
        String mobilidade   = txtPesquisaAlunos.getText().toUpperCase();        
       
        String totaltxt = txtTotalDiagnosticos.getText();                        
        
        String totalLabel =  LbTotal.getText();
        
        
        DAO_Alunos diagnostico = new DAO_Alunos();
        ResultSet busca = diagnostico.TotalAlunosDiagUnico(total_diagnostico, mobilidade);
        
        
        try{
                        
           while(busca.next()){
                totaltxt.equals(new Object []{
                    busca.getString(1)                       
                }
            
           );
           
           LbTotal.setText(busca.getString(1));
           LbBusca.setText(total_diagnostico);
           txtTotal.setText(busca.getString(1));
           txtTotalDiagnosticos.setText(total_diagnostico);
            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema ao efetuar a busca"
                    + " " + error.getMessage());
        }    
        
    }
    
     private void PesquisarTotalDiagMultiplo()
    {
        
        String total_diagnostico   = txtPesquisaAlunos.getText().toUpperCase();       
        
        String mobilidade   = txtPesquisaAlunos.getText().toUpperCase();
       
        String totaltxt = txtTotalDiagnosticos.getText();                        
        
        String totalLabel =  LbTotal.getText();
        
        
        DAO_Alunos diagnostico = new DAO_Alunos();
        ResultSet busca = diagnostico.TotalAlunosDiagMultiplo(total_diagnostico, mobilidade);
                
        try{
                        
           while(busca.next()){
                totaltxt.equals(new Object []{
                    busca.getString(1)                       
                }
            
           );
           LbTotal.setText(busca.getString(1));
           LbBusca.setText(total_diagnostico);
           txtTotal.setText(busca.getString(1));
           txtTotalDiagnosticos.setText(total_diagnostico);
           
            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema ao efetuar a busca"
                    + " " + error.getMessage());
        }    
        
    }
     
     private void PesquisarHDTotalUnico()
    {
        
        String total_diagnostico   = txtPesquisaAlunos.getText().toUpperCase();   
        
        String mobilidade   = txtPesquisaAlunos.getText().toUpperCase();
       
        String totaltxt = txtTotalDiagnosticos.getText();                        
        
        String totalLabel =  LbTotal.getText();
        
        
        DAO_Alunos diagnostico = new DAO_Alunos();
        ResultSet busca = diagnostico.TotalAlunosHDUnico(total_diagnostico, mobilidade);
        
        
        try{
                        
           while(busca.next()){
                totaltxt.equals(new Object []{
                    busca.getString(1)                       
                }
            
           );
           
           LbTotal.setText(busca.getString(1));
           LbBusca.setText(total_diagnostico);
           txtTotal.setText(busca.getString(1));
           txtTotalDiagnosticos.setText(total_diagnostico);
           
            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema ao efetuar a busca"
                    + " " + error.getMessage());
        }    
        
    }
     
     
     private void PesquisarTotalHDMultiplo()
    {
        
        String total_diagnostico   = txtPesquisaAlunos.getText().toUpperCase();    
        
        String mobilidade   = txtPesquisaAlunos.getText().toUpperCase();
       
        String totaltxt = txtTotalDiagnosticos.getText();                        
        
        String totalLabel =  LbTotal.getText();
        
        
        DAO_Alunos diagnostico = new DAO_Alunos();
        ResultSet busca = diagnostico.TotalAlunosHDMultiplo(total_diagnostico, mobilidade);
                
        try{
                        
           while(busca.next()){
                totaltxt.equals(new Object []{
                    busca.getString(1)                       
                }
            
           );
           LbTotal.setText(busca.getString(1));
           LbBusca.setText(total_diagnostico);
           txtTotal.setText(busca.getString(1));
           txtTotalDiagnosticos.setText(total_diagnostico);

            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema ao efetuar a busca"
                    + " " + error.getMessage());
        }    
        
    }
    
    
    
     private void PesquisarDiagnostico()
     {
        
    String diagnostico = txtPesquisaAlunos.getText();
       
        DAO_Alunos buscaralunos = new DAO_Alunos();
        ResultSet buscar = buscaralunos.PesquisaDiagnostico(
                diagnostico);
            
        DefaultTableModel tabela = (DefaultTableModel) tbListarAlunos.getModel();
        tabela.setNumRows(0);
            try{
            while(buscar.next()){
                tabela.addRow(new Object []{
                    buscar.getString(1),
                    buscar.getString(2),
                    buscar.getString(3),
                    buscar.getString(4),
                    buscar.getString(5),
                    buscar.getString(6),
                    buscar.getString(7),
                    buscar.getString(8),
                    buscar.getString(9),
                    buscar.getString(10),
                    buscar.getString(11),
                    buscar.getString(12),
                    buscar.getString(13),
                    buscar.getString(14),
                    buscar.getString(15),
                    buscar.getString(16),
                    buscar.getString(17),
                    buscar.getString(18),
                    buscar.getString(19),
                    buscar.getString(20),
                    buscar.getString(21),
                    buscar.getString(22),
                    buscar.getString(23),
                    buscar.getString(24),
                    buscar.getString(25),
                    buscar.getString(26),
                    buscar.getString(27)
                });
              
            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema " + error.getMessage());
        }    
    }
     
    private void PesquisarHD()
    {
        
    String tipo_hd = txtPesquisaAlunos.getText();
    
    String mobilidade   = txtPesquisaAlunos.getText().toUpperCase();
       
        DAO_Alunos buscaralunos = new DAO_Alunos();
        ResultSet buscar = buscaralunos.PesquisaHD(tipo_hd, mobilidade);
            
        DefaultTableModel tabela = (DefaultTableModel) tbListarAlunos.getModel();
        tabela.setNumRows(0);
            try{
            while(buscar.next()){
                tabela.addRow(new Object []{
                    buscar.getString(1),
                    buscar.getString(2),
                    buscar.getString(3),
                    buscar.getString(4),
                    buscar.getString(5),
                    buscar.getString(6),
                    buscar.getString(7),
                    buscar.getString(8),
                    buscar.getString(9),
                    buscar.getString(10),
                    buscar.getString(11),
                    buscar.getString(12),
                    buscar.getString(13),
                    buscar.getString(14),
                    buscar.getString(15),
                    buscar.getString(16),
                    buscar.getString(17),
                    buscar.getString(18),
                    buscar.getString(19),
                    buscar.getString(20),
                    buscar.getString(21),
                    buscar.getString(22),
                    buscar.getString(23),
                    buscar.getString(24),
                    buscar.getString(25),
                    buscar.getString(26),
                    buscar.getString(27)
                });
              
            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema " + error.getMessage());
        }
    
    }
    
    public void PesquisarTipoDiagnosticoUnico()
    {
               
        String descricao_diagnostico = txtPesquisaAlunos.getText();  
        
        String mobilidade   = txtPesquisaAlunos.getText().toUpperCase();
        
         DAO_Alunos diagnosticounico = new DAO_Alunos();
         ResultSet buscar = diagnosticounico.PesquisaDiagnosticoUnico(descricao_diagnostico, mobilidade);
            
        DefaultTableModel tabela = (DefaultTableModel) tbListarAlunos.getModel();
        tabela.setNumRows(0);
            try{
            while(buscar.next()){
                tabela.addRow(new Object []{
                   buscar.getString(1),
                    buscar.getString(2),
                    buscar.getString(3),
                    buscar.getString(4),
                    buscar.getString(5),
                    buscar.getString(6),
                    buscar.getString(7),
                    buscar.getString(8),
                    buscar.getString(9),
                    buscar.getString(10),
                    buscar.getString(11),
                    buscar.getString(12),
                    buscar.getString(13),
                    buscar.getString(14),
                    buscar.getString(15),
                    buscar.getString(16),
                    buscar.getString(17),
                    buscar.getString(18),
                    buscar.getString(19),
                    buscar.getString(20),
                    buscar.getString(21),
                    buscar.getString(22),
                    buscar.getString(23),
                    buscar.getString(24),
                    buscar.getString(25),
                    buscar.getString(26),
                    buscar.getString(27)
                    
                });
              
            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema " + error.getMessage());
        }
    
    }
    
    public void PesquisarTipoDiagnosticoMultiplo()
    {
        
          
        String descricao_diagnostico = txtPesquisaAlunos.getText();  
        
        String mobilidade   = txtPesquisaAlunos.getText().toUpperCase();
        
       
         DAO_Alunos buscarcid = new DAO_Alunos();
         ResultSet buscar = buscarcid.PesquisaDiagnosticoMultiplo(descricao_diagnostico, mobilidade);
            
        DefaultTableModel tabela = (DefaultTableModel) tbListarAlunos.getModel();
        tabela.setNumRows(0);
            try{
            while(buscar.next()){
                tabela.addRow(new Object []{
                    buscar.getString(1),
                    buscar.getString(2),
                    buscar.getString(3),
                    buscar.getString(4),
                    buscar.getString(5),
                    buscar.getString(6),
                    buscar.getString(7),
                    buscar.getString(8),
                    buscar.getString(9),
                    buscar.getString(10),
                    buscar.getString(11),
                    buscar.getString(12),
                    buscar.getString(13),
                    buscar.getString(14),
                    buscar.getString(15),
                    buscar.getString(16),
                    buscar.getString(17),
                    buscar.getString(18),
                    buscar.getString(19),
                    buscar.getString(20),
                    buscar.getString(21),
                    buscar.getString(22),
                    buscar.getString(23),
                    buscar.getString(24),
                    buscar.getString(25),
                    buscar.getString(26),
                    buscar.getString(27)
                        
                });
            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema " + error.getMessage());
        }
    
    }
    
            
    public void PesquisarTipoHDUnico()

    {
               
        String descricao_hipotese = txtPesquisaAlunos.getText();  
        
        String mobilidade   = txtPesquisaAlunos.getText().toUpperCase();
        
         DAO_Alunos hipotese = new DAO_Alunos();
         ResultSet buscar = hipotese.PesquisaHDUnico(descricao_hipotese, mobilidade);
            
        DefaultTableModel tabela = (DefaultTableModel) tbListarAlunos.getModel();
        tabela.setNumRows(0);
            try{
            while(buscar.next()){
                tabela.addRow(new Object []{
                   buscar.getString(1),
                    buscar.getString(2),
                    buscar.getString(3),
                    buscar.getString(4),
                    buscar.getString(5),
                    buscar.getString(6),
                    buscar.getString(7),
                    buscar.getString(8),
                    buscar.getString(9),
                    buscar.getString(10),
                    buscar.getString(11),
                    buscar.getString(12),
                    buscar.getString(13),
                    buscar.getString(14),
                    buscar.getString(15),
                    buscar.getString(16),
                    buscar.getString(17),
                    buscar.getString(18),
                    buscar.getString(19),
                    buscar.getString(20),
                    buscar.getString(21),
                    buscar.getString(22),
                    buscar.getString(23),
                    buscar.getString(24),
                    buscar.getString(25),
                    buscar.getString(26),
                    buscar.getString(27)
                    
                });
             
            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema " + error.getMessage());
        }
    
    }

    
    public void PesquisarTipoHDMultiplo()

    {
               
        String descricao_hipotese = txtPesquisaAlunos.getText();  
        
        String mobilidade   = txtPesquisaAlunos.getText().toUpperCase();
        
         DAO_Alunos hipotese = new DAO_Alunos();
         ResultSet buscar = hipotese.PesquisaHDMultiplo(descricao_hipotese, mobilidade);
            
        DefaultTableModel tabela = (DefaultTableModel) tbListarAlunos.getModel();
        tabela.setNumRows(0);
            try{
            while(buscar.next()){
                tabela.addRow(new Object []{
                   buscar.getString(1),
                    buscar.getString(2),
                    buscar.getString(3),
                    buscar.getString(4),
                    buscar.getString(5),
                    buscar.getString(6),
                    buscar.getString(7),
                    buscar.getString(8),
                    buscar.getString(9),
                    buscar.getString(10),
                    buscar.getString(11),
                    buscar.getString(12),
                    buscar.getString(13),
                    buscar.getString(14),
                    buscar.getString(15),
                    buscar.getString(16),
                    buscar.getString(17),
                    buscar.getString(18),
                    buscar.getString(19),
                    buscar.getString(20),
                    buscar.getString(21),
                    buscar.getString(22),
                    buscar.getString(23),
                    buscar.getString(24),
                    buscar.getString(25),
                    buscar.getString(26),
                    buscar.getString(27)
                    
                });

            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema " + error.getMessage());
        }
    
    }
    // LIMPA A JANELA APÓS ENTRAR NA TELA DE ALTERAÇÃO DEIXAR OPCIONAL
    public void  Limpar()
    {
    
//    tbListarAlunos.setModel(new DefaultTableModel(null, 
//        new String[]{
//           "cpf","Data Cadastro", "Ano Escolar","Nome", "Sexo", 
//           "Laudo","Tipo Diagnostico","Nascimento","Responsável","Telefone",
//           "Suspeita","Cid-10","Descrição","Cid-HD","Tipo HD","Descrição HD",
//           "Turno Escolar","Turno AEE", "Estatus", "Observações","Benefícios",
//           "Professor","id"}));
        
//       DefaultTableModel model = (DefaultTableModel) tbListarAlunos.getModel ();       
//       model.setRowCount (0);     
//       
//       txtPesquisaAlunos.setText("");
     
       
    }


}
