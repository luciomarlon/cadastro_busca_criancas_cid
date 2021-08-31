
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

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem14.setText("Acompanhamentos");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK));
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

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Aluno - Professor - Diagnostico - HD");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jCheckBoxMenuItem1);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem6.setText("Nome - Tipo Diagnostico - CID/Diag - Descricao Diag - CID/HD - Descricao HD - Turnos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem19.setText("Escola - Professor - Aluno - CID/Diag - CID/HD - Turnos");
        jMenu6.add(jMenuItem19);

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem17.setText("Endereço Aluno");
        jMenu6.add(jMenuItem17);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem16.setText("Professor - Alunos(Diag - HD) - Escola - Setor");
        jMenu6.add(jMenuItem16);

        jMenu3.add(jMenu6);

        jMenu7.setText("Professor");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem7.setText("Aluno - Escola - Professor - Setor");
        jMenu7.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem8.setText("Escola  - Aluno - Setor - Diag - HD");
        jMenu7.add(jMenuItem8);

        jMenu3.add(jMenu7);

        jMenu8.setText("Escolas");

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem15.setText("Professores + Alunos");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem15);

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
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

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem10.setText("Aluno");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem11.setText("Acompanhamentos");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem12.setText("Endereço");
        jMenu13.add(jMenuItem12);

        jMenu2.add(jMenu13);

        MenuProfessor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MenuProfessor.setText("Professor");
        MenuProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProfessorActionPerformed(evt);
            }
        });
        jMenu2.add(MenuProfessor);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.ALT_DOWN_MASK));
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

        jMenuItem31.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem31.setText("Total de alunos - Diag Unico CID");
        jMenu15.add(jMenuItem31);

        jMenuItem32.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem32.setText("Total de alunos - Hipotese Unico CID");
        jMenu15.add(jMenuItem32);

        jMenuItem33.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem33.setText("Total de alunos - Multiplos Dignosticos");
        jMenu15.add(jMenuItem33);

        jMenuItem34.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem34.setText("Total de alunos - Multiplas Hipóteses");
        jMenu15.add(jMenuItem34);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Total de alunos - Não especificado");
        jMenu15.add(jMenuItem1);

        jMenu9.add(jMenu15);

        jMenu16.setText("Setor");

        jMenuItem35.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem35.setText("Diagnosticos por setor - Por CID ");
        jMenu16.add(jMenuItem35);

        jMenu9.add(jMenu16);

        jMenu14.setText("Dianosticos");

        jMenuItem37.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem37.setText("Por Escolas");
        jMenu14.add(jMenuItem37);

        jMenuItem39.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
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
    private javax.swing.JMenuItem MenuProfessor;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cbBuscarTipo;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
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
    
    private void ListarAlunos()
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
                professor_aee
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
       
        String totaltxt = txtTotalDiagnosticos.getText();                        
        
        String totalLabel =  LbTotal.getText();
        
        
        DAO_Alunos diagnostico = new DAO_Alunos();
        ResultSet busca = diagnostico.TotalAlunos(total_diagnostico);
        
        
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
       
        String totaltxt = txtTotalDiagnosticos.getText();                        
        
        String totalLabel =  LbTotal.getText();
        
        
        DAO_Alunos diagnostico = new DAO_Alunos();
        ResultSet busca = diagnostico.TotalAlunosDiagUnico(total_diagnostico);
        
        
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
       
        String totaltxt = txtTotalDiagnosticos.getText();                        
        
        String totalLabel =  LbTotal.getText();
        
        
        DAO_Alunos diagnostico = new DAO_Alunos();
        ResultSet busca = diagnostico.TotalAlunosDiagMultiplo(total_diagnostico);
                
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
       
        String totaltxt = txtTotalDiagnosticos.getText();                        
        
        String totalLabel =  LbTotal.getText();
        
        
        DAO_Alunos diagnostico = new DAO_Alunos();
        ResultSet busca = diagnostico.TotalAlunosHDUnico(total_diagnostico);
        
        
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
       
        String totaltxt = txtTotalDiagnosticos.getText();                        
        
        String totalLabel =  LbTotal.getText();
        
        
        DAO_Alunos diagnostico = new DAO_Alunos();
        ResultSet busca = diagnostico.TotalAlunosHDMultiplo(total_diagnostico);
                
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
       
        DAO_Alunos buscaralunos = new DAO_Alunos();
        ResultSet buscar = buscaralunos.PesquisaHD(
                tipo_hd);
            
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
        
         DAO_Alunos diagnosticounico = new DAO_Alunos();
         ResultSet buscar = diagnosticounico.PesquisaDiagnosticoUnico(
                 descricao_diagnostico);
            
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
        
       
         DAO_Alunos buscarcid = new DAO_Alunos();
         ResultSet buscar = buscarcid.PesquisaDiagnosticoMultiplo(
                 descricao_diagnostico);
            
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
        
         DAO_Alunos hipotese = new DAO_Alunos();
         ResultSet buscar = hipotese.PesquisaHDUnico(
                 descricao_hipotese);
            
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
        
         DAO_Alunos hipotese = new DAO_Alunos();
         ResultSet buscar = hipotese.PesquisaHDMultiplo(
                 descricao_hipotese);
            
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
