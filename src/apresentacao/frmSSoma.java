package apresentacao;

import controle.ControleQuestoes;
import controle.Numeros;
import controle.Validacao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class frmSSoma extends javax.swing.JDialog
{

    private List<List> questoes;
    private int numQuestao;
    private int numQuesta;
    private int numSuperior;
    private int numInferior;
    private int resposta;
    private int qntQuestoes;
    private ControleQuestoes objControle;
    
    
    public frmSSoma(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        
         this.objControle = new ControleQuestoes();
        
        
        /*questoes = new ArrayList<>();
        Numeros objNumeros = new Numeros();
        questoes = objNumeros.getNumeros();
        
        this.qntQuestoes = questoes.size() - 1;
        
        
        
       
        this.numQuestao = 0;
        this.numQuesta = numQuestao + 1;
        
        this.numSuperior = (int) questoes.get(numQuestao).get(0);
        this.numInferior = (int) questoes.get(numQuestao).get(1);
        this.resposta = numSuperior + numInferior;*/
        lblNumeroQuestao.setText(Integer.toString(objControle.getNumQuesta()));
        lblNumeroSuperior.setText(Integer.toString(objControle.getNumSuperior()));
        lblNumeroInferior.setText(Integer.toString(objControle.getNumInferior()));
        
        
    }

    
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
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Soma");

        lblNumeroSuperior.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumeroSuperior.setText("8788787");

        lblNumeroInferior.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumeroInferior.setText("7878787");

        txfResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

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

        jPasswordField1.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNumeroQuestao)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnResponder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfResultado)
                            .addComponent(lblNumeroInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNumeroSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblResposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResponderActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnResponderActionPerformed
    {//GEN-HEADEREND:event_btnResponderActionPerformed
        Validacao objValidacao = new Validacao(txfResultado.getText());
        
        if(objValidacao.getMensagem().equals(""))
        {

            int resposta = objValidacao.getRespostaValida();

            if(resposta != this.objControle.getResposta() )
            {
                txfResultado.setText("");

                if(this.objControle.getNumQuestao()== this.objControle.getQntQuestoes())
                {
                    this.dispose();
                }


                if(this.objControle.getNumQuestao() < this.objControle.getQntQuestoes())
                {
                    
                    this.objControle.setNumQuestao( this.objControle.getNumQuestao() + 1  );
                    this.objControle.setNumQuesta(this.objControle.getNumQuestao() + 1);
                }

                this.objControle.setNumSuperior((int) this.objControle.getQuestoes().get(this.objControle.getNumQuestao()).get(0));
                this.objControle.setNumInferior((int) this.objControle.getQuestoes().get(this.objControle.getNumQuestao()).get(1));
                
                this.objControle.setResposta(this.objControle.getNumSuperior() + this.objControle.getNumInferior());
                
                lblNumeroQuestao.setText(Integer.toString(this.objControle.getNumQuesta()));
                lblNumeroSuperior.setText(Integer.toString(this.objControle.getNumSuperior()));
                lblNumeroInferior.setText(Integer.toString(this.objControle.getNumSuperior()));
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, objValidacao.getMensagem(), "Número Invalido!!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnResponderActionPerformed

   
    public static void main(String args[])
    {
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmSSoma dialog = new frmSSoma(new javax.swing.JFrame(), true);
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
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblNumeroInferior;
    private javax.swing.JLabel lblNumeroQuestao;
    private javax.swing.JLabel lblNumeroSuperior;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JTextField txfResultado;
    // End of variables declaration//GEN-END:variables
}
