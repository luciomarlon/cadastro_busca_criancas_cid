
package View;

import DAO.DAO_Cid;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class FrmPesquisarAlunosDeficiencia extends javax.swing.JFrame {

    public FrmPesquisarAlunosDeficiencia() {
        initComponents();
        AutoCompleteDecorator.decorate(cbBuscarTipo);
        ListarDeficiencias();     
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListarCid = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        txtPesquisarCidDiagosticos = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        cbBuscarTipo = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        MenuProfessor = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCAR/LISTAR ALUNOS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Listar/Pesquisar - Deficiencias");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, -1, -1));

        tbListarCid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbListarCid.setEditingColumn(0);
        tbListarCid.setEditingRow(0);
        jScrollPane1.setViewportView(tbListarCid);
        tbListarCid.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 1860, 460));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Buscar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

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
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 670, 200, 60));

        txtPesquisarCidDiagosticos.setBackground(new java.awt.Color(204, 255, 255));
        txtPesquisarCidDiagosticos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtPesquisarCidDiagosticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 430, 35));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 120, 40));

        cbBuscarTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbBuscarTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "Diagnostico - UNICO", "Hipotese Diagnostica - UNICA", "Diagnostico - MULTIPLAS", "Hipotese Diagnostica - MULTIPLAS" }));
        cbBuscarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarTipoActionPerformed(evt);
            }
        });
        getContentPane().add(cbBuscarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 270, 40));

        jMenu1.setText("Cadastros");

        jMenu5.setText("Alunos");

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem13.setText("Aluno");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem14.setText("Acompanhamentos");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Endereços");
        jMenu5.add(jMenuItem3);

        jMenu1.add(jMenu5);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem4.setText("Professores");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem5.setText("Escolas");
        jMenu1.add(jMenuItem5);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem2.setText("Cid 10");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Buscar");

        jMenu6.setText("Alunos");

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Aluno - Professor - Diagnostico - HD");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jCheckBoxMenuItem1);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setText("Nome - Tipo Diagnostico - CID/Diag - Descricao Diag - CID/HD - Descricao HD - Turnos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem19.setText("Escola - Professor - Aluno - CID/Diag - CID/HD - Turnos");
        jMenu6.add(jMenuItem19);

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem17.setText("Endereço Aluno");
        jMenu6.add(jMenuItem17);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem16.setText("Professor - Alunos(Diag - HD) - Escola - Setor");
        jMenu6.add(jMenuItem16);

        jMenu3.add(jMenu6);

        jMenu7.setText("Professor");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem7.setText("Aluno - Escola - Professor - Setor");
        jMenu7.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem8.setText("Escola  - Aluno - Setor - Diag - HD");
        jMenu7.add(jMenuItem8);

        jMenu3.add(jMenu7);

        jMenu8.setText("Escolas");

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem15.setText("Professores + Alunos");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem15);

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem18.setText("Alunos");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem18);

        jMenu3.add(jMenu8);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Atualizar");

        jMenu13.setText("Aluno");

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem10.setText("Aluno");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem11.setText("Acompanhamentos");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem12.setText("Endereço");
        jMenu13.add(jMenuItem12);

        jMenu2.add(jMenu13);

        MenuProfessor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_MASK));
        MenuProfessor.setText("Professor");
        MenuProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProfessorActionPerformed(evt);
            }
        });
        jMenu2.add(MenuProfessor);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem9.setText("Escola");
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Relatorios");

        jMenu10.setText("Aluno");

        jMenuItem23.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem23.setText("Completo / Individual");
        jMenu10.add(jMenuItem23);

        jMenu4.add(jMenu10);

        jMenu11.setText("Professor");

        jMenuItem26.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        jMenuItem26.setText("Alunos");
        jMenu11.add(jMenuItem26);

        jMenu4.add(jMenu11);

        jMenu12.setText("Escola");

        jMenuItem29.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        jMenuItem29.setText("Aluno");
        jMenu12.add(jMenuItem29);

        jMenuItem30.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jMenuItem30.setText("Professores");
        jMenu12.add(jMenuItem30);

        jMenu4.add(jMenu12);

        jMenuBar1.add(jMenu4);

        jMenu9.setText("Estatisticas");

        jMenu15.setText("CID - 10");

        jMenuItem31.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem31.setText("Total de alunos - Diag Unico CID");
        jMenu15.add(jMenuItem31);

        jMenuItem32.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem32.setText("Total de alunos - Hipotese Unico CID");
        jMenu15.add(jMenuItem32);

        jMenuItem33.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem33.setText("Total de alunos - Multiplos Dignosticos");
        jMenu15.add(jMenuItem33);

        jMenuItem34.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem34.setText("Total de alunos - Multiplas Hipóteses");
        jMenu15.add(jMenuItem34);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Total de alunos - Não especificado");
        jMenu15.add(jMenuItem1);

        jMenu9.add(jMenu15);

        jMenu16.setText("Setor");

        jMenuItem35.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem35.setText("Diagnosticos por setor - Por CID ");
        jMenu16.add(jMenuItem35);

        jMenu9.add(jMenu16);

        jMenu14.setText("Dianosticos");

        jMenuItem37.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem37.setText("Por Escolas");
        jMenu14.add(jMenuItem37);

        jMenuItem39.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem39.setText("Por Professor");
        jMenu14.add(jMenuItem39);

        jMenu9.add(jMenu14);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleName("BUSCAR/ALUNOS DEFICIENCIA");
        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

            Limpar();
         
//            cbBuscarTipo.setSelectedItem("SELECIONE");
//            txtPesquisarCidDiagosticos.setText("");
            
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        FrmPesquisarAlunosDeficiencia alunosdeficiencia = new FrmPesquisarAlunosDeficiencia();
        alunosdeficiencia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
                 
                if(txtPesquisarCidDiagosticos.getText().equals(""))
                {
                    ListarDeficiencias();
//                    cbBuscarTipo.setSelectedItem("SELECIONE");                    
                }
                else
                {
                    PesquisarDiagnostico();
              
                }                
       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbBuscarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarTipoActionPerformed

        if (cbBuscarTipo.getSelectedItem().equals("SELECIONE"))
                
        {
            PesquisarDiagnostico();            
            tbListarCid.editCellAt(0,0);
        }
        
        else if(cbBuscarTipo.getSelectedItem().equals("Diagnostico - UNICO"))
        {
            PesquisarTipoDiagnosticoUnico();
            txtPesquisarCidDiagosticos.getText();
            tbListarCid.editCellAt(0,0);
        } 
   
        
        else if(cbBuscarTipo.getSelectedItem().equals("Hipotese Diagnostica"))
        {            
            PesquisarHD();            
            txtPesquisarCidDiagosticos.getText();
            tbListarCid.editCellAt(0,0);
        } 
        
        
        else if(cbBuscarTipo.getSelectedItem().equals("Hipotese Diagnostica - UNICA"))
        {            
            PesquisarHDunico();            
            txtPesquisarCidDiagosticos.getText();
            tbListarCid.editCellAt(0,0);
        } 
        
        else if(cbBuscarTipo.getSelectedItem().equals("Diagnostico - MULTIPLAS"))
        {            
            PesquisarTipoDiagnosticoMultiplo();            
            txtPesquisarCidDiagosticos.getText();
            tbListarCid.editCellAt(0,0);
        } 
        
         else if(cbBuscarTipo.getSelectedItem().equals("Hipotese Diagnostica - MULTIPLAS"))
        {            
            PesquisarHDMultiplo();            
            txtPesquisarCidDiagosticos.getText();
            tbListarCid.editCellAt(0,0);
        } 
        
        
        
    }//GEN-LAST:event_cbBuscarTipoActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        FrmCadastroAlunos cadastrarAlunos = new FrmCadastroAlunos();
        cadastrarAlunos.setLocationRelativeTo(null);
        cadastrarAlunos.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        FrmAcompanhamentos acompanhamentos = new FrmAcompanhamentos();
        acompanhamentos.setLocationRelativeTo(null);
        acompanhamentos.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //        FrmCadastroProfessor telaCadastroProfessor = new FrmCadastroProfessor(this, true);
        //        telaCadastroProfessor.setVisible(true);
        FrmCadastroProfessor  cadastroProfessor = new FrmCadastroProfessor();
        cadastroProfessor.setLocationRelativeTo(null);
        cadastroProfessor.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FrmCadastroCid cadastrocid = new FrmCadastroCid();
        cadastrocid.setLocationRelativeTo(null);
        cadastrocid.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        FrmPesquisarAlunos buscaalunos = new FrmPesquisarAlunos();
        buscaalunos.setLocationRelativeTo(null);
        buscaalunos.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        TelasBusca buscar = new TelasBusca();
        buscar.setLocationRelativeTo(null);
        buscar.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        FrmAtualizarAlunos atualizaAlunos = new FrmAtualizarAlunos();
        atualizaAlunos.setLocationRelativeTo(null);
        atualizaAlunos.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        FrmAtualizarAcompanhamentos atualizaAcompanhamento = new FrmAtualizarAcompanhamentos();
        atualizaAcompanhamento.setLocationRelativeTo(null);
        atualizaAcompanhamento.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void MenuProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProfessorActionPerformed
        FrmAtualizaProfessor atualizaProfessor = new FrmAtualizaProfessor();
        atualizaProfessor.setLocationRelativeTo(null);
        atualizaProfessor.setVisible(true);
    }//GEN-LAST:event_MenuProfessorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    
        java.awt.EventQueue.invokeLater(() -> {
            new FrmPesquisarAlunosDeficiencia().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuProfessor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cbBuscarTipo;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbListarCid;
    private javax.swing.JTextField txtPesquisarCidDiagosticos;
    // End of variables declaration//GEN-END:variables
    
    
    private void ListarDeficiencias()
    {
        
            tbListarCid.setModel(new DefaultTableModel(null, 
             new String[]{

            "Nome aluno","Cid Diagnostico","Tipo Diagnostico", "Descricao Diag","Cid HD",
            "Tipo HD","Descricao HD" ,"Turno Escolar", "Turno AEE", 
            "Professor AEE","Professor Regular","Transporte","Auxiliar","Mobilidade", 
            "Ano Escolar"}));
            
            
//         tbListarCid.getColumnModel().getColumn(8).setMinWidth(0);
//         tbListarCid.getColumnModel().getColumn(8).setMaxWidth(0);
        
        DefaultTableModel tabelaProfessores = 
                (DefaultTableModel)tbListarCid.getModel();
        
        DAO_Cid listardeficiencias = new DAO_Cid();
        ResultSet retornardeficiencia = listardeficiencias.listarCidDeficiencias();
        
        try
        {
            while(retornardeficiencia.next())
            {
                tabelaProfessores.addRow(new Object[]{
                    retornardeficiencia.getString(1),
                    retornardeficiencia.getString(2),
                    retornardeficiencia.getString(3),
                    retornardeficiencia.getString(4),
                    retornardeficiencia.getString(5),
                    retornardeficiencia.getString(6),
                    retornardeficiencia.getString(7),
                    retornardeficiencia.getString(8),
                    retornardeficiencia.getString(9),
                    retornardeficiencia.getString(10),
                    retornardeficiencia.getString(11),
                    retornardeficiencia.getString(12),
                    retornardeficiencia.getString(13),
                    retornardeficiencia.getString(14),
                    retornardeficiencia.getString(15)
                });
            }
        
        }
        catch(SQLException erro)
        {
                throw new RuntimeException("Erro ao listar "
                        + "tabela PROFESSORES." + erro);                          
        }     
        
    }
    

    
    public void PesquisarDiagnostico()
    {
        
         tbListarCid.setModel(new DefaultTableModel(null, 
             new String[]{
            "Nome aluno","Cid Diagnostico","Tipo Diagnostico", "Descricao Diag","Cid HD",
            "Tipo HD","Descricao HD" ,"Turno Escolar", "Turno AEE", 
            "Professor AEE","Professor Regular","Transporte","Auxiliar",
            "Mobilidade", "Ano Escolar"}));
//            tbListarCid.getColumnModel().getColumn(8).setMinWidth(0);
//            tbListarCid.getColumnModel().getColumn(8).setMaxWidth(0);
        
        String nome_aluno               = txtPesquisarCidDiagosticos.getText();         
        String codigo_cid               = txtPesquisarCidDiagosticos.getText();                  
        String descricao_diagnostico    = txtPesquisarCidDiagosticos.getText();
        String professor_aee            = txtPesquisarCidDiagosticos.getText();
       
         DAO_Cid buscarcid = new DAO_Cid();
         ResultSet buscar = buscarcid.PesquisarDiagnostico(
                 nome_aluno,
                 codigo_cid,                               
                 descricao_diagnostico,
                 professor_aee
                 );
            
        DefaultTableModel tabela = (DefaultTableModel) tbListarCid.getModel();
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
                    buscar.getString(15)
                    
                    
                });
            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema " + error.getMessage());
        }
    
    }
    
    public void PesquisarTipoDiagnosticoUnico()
    {
        
         tbListarCid.setModel(new DefaultTableModel(null, 
             new String[]{
            "Nome aluno","Cid Diagnostico","Tipo Diagnostico", "Descricao Diag","Cid HD",
            "Tipo HD","Descricao HD" ,"Turno Escolar", "Turno AEE", 
            "Professor AEE","Professor Regular","Transporte","Auxiliar",
            "Mobilidade", "Ano Escolar"}));
//            tbListarCid.getColumnModel().getColumn(8).setMinWidth(0);
//            tbListarCid.getColumnModel().getColumn(8).setMaxWidth(0);
        
//        String codigo_cid_diag_unico = txtPesquisarCidDiagosticos.getText();          
        String descricao_diagnostico = txtPesquisarCidDiagosticos.getText();  
        
       
         DAO_Cid buscarcid = new DAO_Cid();
         ResultSet buscar = buscarcid.PesquisarDiagnosticoUnico(

                 descricao_diagnostico
                 
                 );
            
        DefaultTableModel tabela = (DefaultTableModel) tbListarCid.getModel();
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
                    buscar.getString(15)
                    
                });
            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema " + error.getMessage());
        }
    
    }
    
    public void PesquisarTipoDiagnosticoMultiplo()
    {
        
         tbListarCid.setModel(new DefaultTableModel(null, 
             new String[]{
            "Nome aluno","Cid Diagnostico","Tipo Diagnostico", "Descricao Diag","Cid HD",
            "Tipo HD","Descricao HD" ,"Turno Escolar", "Turno AEE", 
            "Professor AEE","Professor Regular","Transporte","Auxiliar",
            "Mobilidade", "Ano Escolar"}));
//            tbListarCid.getColumnModel().getColumn(8).setMinWidth(0);
//            tbListarCid.getColumnModel().getColumn(8).setMaxWidth(0);
        
//        String codigo_cid_diag_unico = txtPesquisarCidDiagosticos.getText();          
        String descricao_diagnostico = txtPesquisarCidDiagosticos.getText();  
        
       
         DAO_Cid buscarcid = new DAO_Cid();
         ResultSet buscar = buscarcid.PesquisarDiagnosticoMulti(

                 descricao_diagnostico
                 
                 );
            
        DefaultTableModel tabela = (DefaultTableModel) tbListarCid.getModel();
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
                    buscar.getString(15)

                    
                });
            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema " + error.getMessage());
        }
    
    }
    
    
     public void PesquisarHD()
    {
        
         tbListarCid.setModel(new DefaultTableModel(null, 
             new String[]{
            "Nome aluno","Cid Diagnostico","Tipo Diagnostico", "Descricao Diag","Cid HD",
            "Tipo HD","Descricao HD" ,"Turno Escolar", "Turno AEE", 
            "Professor AEE","Professor Regular","Transporte","Auxiliar",
            "Mobilidade", "Ano Escolar"}));
//            tbListarCid.getColumnModel().getColumn(8).setMinWidth(0);
//            tbListarCid.getColumnModel().getColumn(8).setMaxWidth(0);
        
        String nome_aluno = txtPesquisarCidDiagosticos.getText();         
        String codigo_cid_hd = txtPesquisarCidDiagosticos.getText();                  
        String descricao_hd = txtPesquisarCidDiagosticos.getText();
        String professor_aee = txtPesquisarCidDiagosticos.getText();
       
         DAO_Cid buscarcid = new DAO_Cid();
         ResultSet buscar = buscarcid.PesquisarHd(
                 nome_aluno,
                 codigo_cid_hd,                               
                 descricao_hd,
                 professor_aee
                 );
            
        DefaultTableModel tabela = (DefaultTableModel) tbListarCid.getModel();
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
                    buscar.getString(15)

                    
                });
            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema " + error.getMessage());
        }
    
    }
    
    
    
    
    public void PesquisarHDunico()
    {
        
         tbListarCid.setModel(new DefaultTableModel(null, 
             new String[]{
            "Nome aluno","Cid Diagnostico","Tipo Diagnostico", "Descricao Diag","Cid HD",
            "Tipo HD","Descricao HD" ,"Turno Escolar", "Turno AEE", 
            "Professor AEE","Professor Regular","Transporte","Auxiliar",
            "Mobilidade", "Ano Escolar"}));
//            tbListarProfessores.getColumnModel().getColumn(8).setMinWidth(0);
//            tbListarProfessores.getColumnModel().getColumn(8).setMaxWidth(0);
        
//        String codigo_cid = txtPesquisarCidDiagosticos.getText();           
        String descricao_hd = txtPesquisarCidDiagosticos.getText();   
       
         DAO_Cid buscarcid = new DAO_Cid();
         ResultSet buscar = buscarcid.PesquisarHDUnico(
//                 codigo_cid,
                 descricao_hd
                 );
            
        DefaultTableModel tabela = (DefaultTableModel) tbListarCid.getModel();
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
                    buscar.getString(15)

                    
                });
            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema " + error.getMessage());
        }
    
    }
    
     public void PesquisarHDMultiplo()
    {
        
         tbListarCid.setModel(new DefaultTableModel(null, 
             new String[]{
           "Nome aluno","Cid Diagnostico","Tipo Diagnostico", "Descricao Diag","Cid HD",
            "Tipo HD","Descricao HD" ,"Turno Escolar", "Turno AEE", 
            "Professor AEE","Professor Regular","Transporte","Auxiliar",
            "Mobilidade", "Ano Escolar"}));
//            tbListarCid.getColumnModel().getColumn(8).setMinWidth(0);
//            tbListarCid.getColumnModel().getColumn(8).setMaxWidth(0);
        
//        String codigo_hd_multiplo = txtPesquisarCidDiagosticos.getText();          
        String descricao_hd = txtPesquisarCidDiagosticos.getText();  
        
       
         DAO_Cid buscarcid = new DAO_Cid();
         ResultSet buscar = buscarcid.PesquisarHdMultiplo(
//                 codigo_hd_multiplo,
                 descricao_hd                 
                 );
            
        DefaultTableModel tabela = (DefaultTableModel) tbListarCid.getModel();
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
                    buscar.getString(15)

                    
                });
            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema " + error.getMessage());
        }
    
    }
    
    public void  Limpar()
    {

        
       DefaultTableModel model = (DefaultTableModel) tbListarCid.getModel ();
            model.setRowCount (0);
         
//        cbBuscarTipo.setSelectedItem("SELECIONE");
        txtPesquisarCidDiagosticos.setText("");
    }


}
