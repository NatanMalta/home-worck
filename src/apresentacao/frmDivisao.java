/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import controle.ControleQuestoes;
import controle.Validacao;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class frmDivisao extends javax.swing.JDialog
{

    /**
     * Creates new form frmDivisao
     */
    
    private final ControleQuestoes objControle;
     
     public boolean getTerminou()
    {
        return this.objControle.getTerminou();
    }
    
    public frmDivisao(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        this.objControle = new ControleQuestoes(lblNumeroQuestao, lblNumeroSuperior, lblNumeroInferior, this, "/", 999,9, false, true); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNumeroSuperior = new javax.swing.JLabel();
        lblNumeroInferior = new javax.swing.JLabel();
        txfResultado = new javax.swing.JTextField();
        btnResponder = new javax.swing.JButton();
        lblResposta = new javax.swing.JLabel();
        lblNumeroQuestao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Divisão");

        jPanel1.setPreferredSize(new java.awt.Dimension(200, 204));

        lblNumeroSuperior.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumeroSuperior.setText("200");

        lblNumeroInferior.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumeroInferior.setText("2");

        btnResponder.setText("Responder");
        btnResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponderActionPerformed(evt);
            }
        });

        lblResposta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblNumeroQuestao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumeroQuestao.setText("N° 1");

        jLabel1.setText("/");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(lblResposta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNumeroQuestao)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lblNumeroSuperior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNumeroInferior))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnResponder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txfResultado)))))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblResposta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroSuperior)
                    .addComponent(lblNumeroInferior)
                    .addComponent(lblNumeroQuestao)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResponder)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResponderActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnResponderActionPerformed
    {//GEN-HEADEREND:event_btnResponderActionPerformed
Validacao objValidacao = new Validacao(txfResultado.getText());
        
        if(objValidacao.getMensagem().equals(""))
        {
            if(objControle.verificarResposta(objValidacao.getRespostaValida()))
            {
                txfResultado.setText("");
                this.objControle.verificarUltimaQuestao();
                this.objControle.proximaQuestao();
                                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "resposta incorreta", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, objValidacao.getMensagem(), "Número Invalido!!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnResponderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmDivisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmDivisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmDivisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmDivisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmDivisao dialog = new frmDivisao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResponder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNumeroInferior;
    private javax.swing.JLabel lblNumeroQuestao;
    private javax.swing.JLabel lblNumeroSuperior;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JTextField txfResultado;
    // End of variables declaration//GEN-END:variables
}
