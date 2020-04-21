/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import controle.ControleQuestoes;
import controle.Validacao;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class frmSubtracao extends javax.swing.JDialog
{

    /**
     * Creates new form frmSubtracao
     */
     private final ControleQuestoes objControle;
     
     public boolean getTerminou()
    {
        return this.objControle.getTerminou();
    }
    
    public frmSubtracao(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        this.objControle = new ControleQuestoes(lblNumeroQuestao, lblNumeroSuperior, lblNumeroInferior, this, "-", 9999999,1000000, false,false); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        lblNumeroSuperior = new javax.swing.JLabel();
        lblNumeroInferior = new javax.swing.JLabel();
        txfResultado = new javax.swing.JTextField();
        btnResponder = new javax.swing.JButton();
        lblResposta = new javax.swing.JLabel();
        lblNumeroQuestao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Subtração");

        jPanel1.setPreferredSize(new java.awt.Dimension(200, 204));

        lblNumeroSuperior.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumeroSuperior.setText("8788787");

        lblNumeroInferior.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumeroInferior.setText("7878787");

        btnResponder.setText("Responder");
        btnResponder.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnResponderActionPerformed(evt);
            }
        });

        lblResposta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblNumeroQuestao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumeroQuestao.setText("N° 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumeroQuestao)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnResponder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfResultado)
                    .addComponent(lblNumeroInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNumeroSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroSuperior)
                    .addComponent(lblNumeroQuestao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumeroInferior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResponder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(frmSubtracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmSubtracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmSubtracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmSubtracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmSubtracao dialog = new frmSubtracao(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNumeroInferior;
    private javax.swing.JLabel lblNumeroQuestao;
    private javax.swing.JLabel lblNumeroSuperior;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JTextField txfResultado;
    // End of variables declaration//GEN-END:variables
}
