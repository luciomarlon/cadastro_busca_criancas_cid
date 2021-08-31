
package View;

import DAO.DAO_ProfessoresAEE;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmBuscarProfessor extends javax.swing.JFrame {

    public FrmBuscarProfessor() {
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
        btnLimpar = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        txtPesquisarProfessores = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

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
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 670, 200, 60));

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

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    
        java.awt.EventQueue.invokeLater(() -> {
            new FrmBuscarProfessor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbListarProfessores;
    private javax.swing.JTextField txtPesquisarProfessores;
    // End of variables declaration//GEN-END:variables
    public void AlteracaoProfessor()
    {
         String  professor_aee, qtd_alunos, escola_vinculada, professor_regular, 
                 auxiliar_sala, turno_professor, datacadastro, estatusprofessor, 
                 escola_sede, id_professor;     
         
         
         if (tbListarProfessores.getSelectedRow() < 0)
         {
             JOptionPane.showMessageDialog(null, "Selecione um PROFESSOR");
         }
         else
         {
             int linha = tbListarProfessores.getSelectedRow();
//             professor_aee = (String) tbListarProfessores.getValueAt(linha, 0);
//             escola_vinculada = (String) tbListarProfessores.getValueAt(linha, 1); 
//             professor_regular = (String) tbListarProfessores.getValueAt(linha, 2);
//             auxiliar_sala = (String) tbListarProfessores.getValueAt(linha, 3);
//             turno_professor = (String) tbListarProfessores.getValueAt(linha, 4);
//             datacadastro = (String)tbListarProfessores.getValueAt(linha, 5);
//             estatusprofessor = (String)tbListarProfessores.getValueAt(linha, 6); 
//             escola_sede = (String)tbListarProfessores.getValueAt(linha, 7); 
//             id_professor = (String)tbListarProfessores.getValueAt(linha, 8);  
             professor_aee = (String) tbListarProfessores.getValueAt(linha, 0);
             qtd_alunos = (String) tbListarProfessores.getValueAt(linha, 1); 
             escola_vinculada = (String) tbListarProfessores.getValueAt(linha, 2); 
             professor_regular = (String) tbListarProfessores.getValueAt(linha, 3);
             auxiliar_sala = (String) tbListarProfessores.getValueAt(linha, 4);
             turno_professor = (String) tbListarProfessores.getValueAt(linha, 5);
             datacadastro = (String)tbListarProfessores.getValueAt(linha, 6);
             estatusprofessor = (String)tbListarProfessores.getValueAt(linha, 7); 
             escola_sede = (String)tbListarProfessores.getValueAt(linha, 8); 
             id_professor = (String)tbListarProfessores.getValueAt(linha, 9);  
//             
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
        
        
        "Professor","Qtd_Alunos","Escola Vinculada","Professor Regular", "Auxiliar","Turno",
        "Data-Cadastro","Estatus" ,"Escola Sede", "ID"}));
         tbListarProfessores.getColumnModel().getColumn(9).setMinWidth(0);
         tbListarProfessores.getColumnModel().getColumn(9).setMaxWidth(0);
         tbListarProfessores.getColumnModel().getColumn(7).setMinWidth(0);
         tbListarProfessores.getColumnModel().getColumn(7).setMaxWidth(0);
         tbListarProfessores.getColumnModel().getColumn(6).setMinWidth(0);
         tbListarProfessores.getColumnModel().getColumn(6).setMaxWidth(0);
        
        DefaultTableModel tabelaProfessores = 
                (DefaultTableModel)tbListarProfessores.getModel();
        
        DAO.DAO_ProfessoresAEE listarprofessor = new DAO_ProfessoresAEE();
        ResultSet retornaProfessor = listarprofessor.listarProfessores();
        
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
                    retornaProfessor.getString(9),
                    retornaProfessor.getString(10)
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
        
        "Professor","Qtd_Alunos","Escola Vinculada","Professor Regular", "Auxiliar","Turno",
        "Data-Cadastro","Estatus" ,"Escola Sede", "ID"}));
         tbListarProfessores.getColumnModel().getColumn(9).setMinWidth(0);
         tbListarProfessores.getColumnModel().getColumn(9).setMaxWidth(0);
         tbListarProfessores.getColumnModel().getColumn(7).setMinWidth(0);
         tbListarProfessores.getColumnModel().getColumn(7).setMaxWidth(0);
         tbListarProfessores.getColumnModel().getColumn(6).setMinWidth(0);
         tbListarProfessores.getColumnModel().getColumn(6).setMaxWidth(0);
        
        
        String pesquisarprofessor   = txtPesquisarProfessores.getText().toUpperCase();        
        String escola_vinculada     = txtPesquisarProfessores.getText().toUpperCase();
        String auxiliar_sala        = txtPesquisarProfessores.getText().toUpperCase();
        
        
        DefaultTableModel tabela = (DefaultTableModel) tbListarProfessores.getModel();
        tabela.setNumRows(0);
        
        DAO_ProfessoresAEE buscarprofessor = new DAO_ProfessoresAEE();
        ResultSet buscar = buscarprofessor.BuscarProfessor(
                pesquisarprofessor,                 
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
                    buscar.getString(9),
                    buscar.getString(10)
                   
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
