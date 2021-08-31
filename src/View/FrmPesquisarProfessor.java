
package View;

import DAO.DAO_ProfessoresAEE;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmPesquisarProfessor extends javax.swing.JFrame {

    public FrmPesquisarProfessor() {
        initComponents();
        ListarProfessores();     
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListarProfessores = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        txtPesquisarProfessores = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
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
        setTitle("BUSCAR/LISTAR PROFESSORES");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Listar/Pesquisar - Professores");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, -1, -1));

        tbListarProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbListarProfessores.setEditingColumn(0);
        tbListarProfessores.setEditingRow(0);
        jScrollPane1.setViewportView(tbListarProfessores);
        tbListarProfessores.getAccessibleContext().setAccessibleName("");

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
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 660, 200, 60));

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
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 660, 200, 60));

        txtPesquisarProfessores.setBackground(new java.awt.Color(204, 255, 255));
        txtPesquisarProfessores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtPesquisarProfessores, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 430, 35));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 120, 40));

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

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
       FrmPesquisarProfessor pesquisaralunos = new FrmPesquisarProfessor();
//        pesquisaralunos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        AlteracaoProfessor();
        Limpar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

            Limpar();
            txtPesquisarProfessores.setText("");
            
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        FrmTelaPrincipal telaPrincipal = new FrmTelaPrincipal();        
        telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
                 
                if(txtPesquisarProfessores.getText().equals(""))
                {
                    ListarProfessores();                    
                }
                else
                {
                    PesquisarProfessores();
                }
               
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            new FrmPesquisarProfessor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuProfessor;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLimpar;
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
    private javax.swing.JTable tbListarProfessores;
    private javax.swing.JTextField txtPesquisarProfessores;
    // End of variables declaration//GEN-END:variables
    public void AlteracaoProfessor()
    {
         String  professor_aee, escola_vinculada, professor_regular, 
                 auxiliar_sala, turno_professor, datacadastro, estatusprofessor, 
                 escola_sede, id_professor;     
         
         
         if (tbListarProfessores.getSelectedRow() < 0)
         {
             JOptionPane.showMessageDialog(null, "Selecione um PROFESSOR");
         }
         else
         {
             int linha = tbListarProfessores.getSelectedRow();
             professor_aee = (String) tbListarProfessores.getValueAt(linha, 0);
             escola_vinculada = (String) tbListarProfessores.getValueAt(linha, 1); 
             professor_regular = (String) tbListarProfessores.getValueAt(linha, 2);
             auxiliar_sala = (String) tbListarProfessores.getValueAt(linha, 3);
             turno_professor = (String) tbListarProfessores.getValueAt(linha, 4);
             datacadastro = (String)tbListarProfessores.getValueAt(linha, 5);
             estatusprofessor = (String)tbListarProfessores.getValueAt(linha, 6); 
             escola_sede = (String)tbListarProfessores.getValueAt(linha, 7); 
             id_professor = (String)tbListarProfessores.getValueAt(linha, 8);  
          
             FrmAtualizaProfessor atualizaprofessor = new FrmAtualizaProfessor();
             atualizaprofessor.setVisible(true);
             
             atualizaprofessor.AtualizaProfessor(professor_aee, escola_vinculada, 
                     professor_regular, auxiliar_sala, turno_professor, 
                     datacadastro, estatusprofessor, escola_sede, id_professor);
         }
    }
    
    private void ListarProfessores()
    {
        tbListarProfessores.setModel(new DefaultTableModel(null, 
             new String[]{      
        
        
        "Professor","Escola Vinculada","Professor Regular", "Auxiliar","Turno",
        "Data-Cadastro","Estatus" ,"Escola Sede", "ID"}));
         tbListarProfessores.getColumnModel().getColumn(8).setMinWidth(0);
         tbListarProfessores.getColumnModel().getColumn(8).setMaxWidth(0);
         tbListarProfessores.getColumnModel().getColumn(6).setMinWidth(0);
         tbListarProfessores.getColumnModel().getColumn(6).setMaxWidth(0);
         tbListarProfessores.getColumnModel().getColumn(5).setMinWidth(0);
         tbListarProfessores.getColumnModel().getColumn(5).setMaxWidth(0);
        
        DefaultTableModel tabelaProfessores = 
                (DefaultTableModel)tbListarProfessores.getModel();
        
        DAO.DAO_ProfessoresAEE listaalunos = new DAO_ProfessoresAEE();
        ResultSet retornaProfessor = listaalunos.listarProfessor();
        
        try
        {
            while(retornaProfessor.next())
            {
                tabelaProfessores.addRow(new Object[]{
                    retornaProfessor.getString(1),
                    retornaProfessor.getString(2),
                    retornaProfessor.getString(3),
                    retornaProfessor.getString(4),
                    retornaProfessor.getString(5),
                    retornaProfessor.getString(6),
                    retornaProfessor.getString(7),
                    retornaProfessor.getString(8),
                    retornaProfessor.getString(9)
                });
            }
        
        }
        catch(SQLException erro)
        {
                throw new RuntimeException("Erro ao listar "
                        + "tabela PROFESSORES." + erro);                          
        }     
        
    }
    
    private void PesquisarProfessores()
    {
        
        tbListarProfessores.setModel(new DefaultTableModel(null, 
             new String[]{     
        
        "Professor","Escola Vinculada","Professor Regular", "Auxiliar","Turno",
        "Data-Cadastro","Estatus" ,"Escola Sede", "ID"}));
         tbListarProfessores.getColumnModel().getColumn(8).setMinWidth(0);
         tbListarProfessores.getColumnModel().getColumn(8).setMaxWidth(0);
         tbListarProfessores.getColumnModel().getColumn(6).setMinWidth(0);
         tbListarProfessores.getColumnModel().getColumn(6).setMaxWidth(0);
         tbListarProfessores.getColumnModel().getColumn(5).setMinWidth(0);
         tbListarProfessores.getColumnModel().getColumn(5).setMaxWidth(0);
        
        String pesquisarescola      = txtPesquisarProfessores.getText().toUpperCase(); 
        String pesquisarprofessor   = txtPesquisarProfessores.getText().toUpperCase();        
        String escola_vinculada     = txtPesquisarProfessores.getText().toUpperCase();
        String auxiliar_sala        = txtPesquisarProfessores.getText().toUpperCase();
        
        
        DefaultTableModel tabela = (DefaultTableModel) tbListarProfessores.getModel();
        tabela.setNumRows(0);
        
        DAO_ProfessoresAEE buscarprofessor = new DAO_ProfessoresAEE();
        ResultSet buscar = buscarprofessor.PesquisarProfessor(
                pesquisarprofessor, 
                pesquisarescola,
                escola_vinculada,
                auxiliar_sala);                 
        
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
                    buscar.getString(9)                   
                });
                
            }
        }catch(SQLException error){
            throw new RuntimeException("Houve um problema ao efetuar a buscar"
                    + " " + error.getMessage());
        }        
    }
    
//    public void PesquisarPorSetor()
//    {
//        
//          String tipo_hd = txtPesquisaAlunos.getText();
//       
//         DAO_Alunos buscaralunos = new DAO_Alunos();
//         ResultSet buscar = buscaralunos.PesquisaHD(tipo_hd);
//            
//        DefaultTableModel tabela = (DefaultTableModel) tbListarAlunos.getModel();
//        tabela.setNumRows(0);
//            try{
//            while(buscar.next()){
//                tabela.addRow(new Object []{
//                    buscar.getString(1),
//                    buscar.getString(2),
//                    buscar.getString(3),
//                    buscar.getString(4),
//                    buscar.getString(5),
//                    buscar.getString(6),
//                    buscar.getString(7),
//                    buscar.getString(8),
//                    buscar.getString(9),
//           
//                    
//                });
//            }
//        }catch(SQLException error){
//            throw new RuntimeException("Houve um problema " + error.getMessage());
//        }
//    
//    }
    
    public void  Limpar()
    {

        
       DefaultTableModel model = (DefaultTableModel) tbListarProfessores.getModel ();
            model.setRowCount (0);
         
//        cbBuscarTipo.setSelectedItem("SELECIONE");
    }


}
