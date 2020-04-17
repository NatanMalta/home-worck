package controle;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public final class ControleQuestoes
{
    private List<List> questoes;
    private int numQuestao;
    private int numQuesta;
    private int numSuperior;
    private int numInferior;
    private int resposta;
    private final int qntQuestoes;
    private final JLabel lblNumeroQuestao;
    private final JLabel lblNumeroSuperior;
    private final JLabel lblNumeroInferior;
    private final JDialog form;
    
    public ControleQuestoes(JLabel lblNumeroQuestao, JLabel lblNumeroSuperior, JLabel lblNumeroInferior, JDialog form)
    {
        
        this.lblNumeroQuestao = lblNumeroQuestao;
        this.lblNumeroSuperior = lblNumeroSuperior;
        this.lblNumeroInferior = lblNumeroInferior;
        this.form = form;
        
        Numeros objNumeros = new Numeros();
        this.questoes = new ArrayList<>();
        this.questoes = objNumeros.getNumeros();
        System.out.println(questoes);
        this.qntQuestoes = questoes.size() - 1;
        this.numQuestao = 0;
        this.numQuesta = numQuestao + 1;
        this.numSuperior = (int) questoes.get(numQuestao).get(0);
        this.numInferior = (int) questoes.get(numQuestao).get(1);
        this.resposta = numSuperior + numInferior;
        System.out.println(resposta);
        atualizarLabel();
               
    }
   
    public boolean verificarResposta(int resposta)
    {
        return resposta != this.resposta;
    }
    
    public void proximaQuestao()
    {
          
        if(this.numQuestao < this.qntQuestoes)
        {

            this.numQuestao += 1;
            this.numQuesta = this.numQuestao + 1;
        }

        this.numSuperior = (int) this.questoes.get(this.numQuestao).get(0);
        this.numInferior = (int) this.questoes.get(this.numQuestao).get(1);
        this.resposta = this.numSuperior + this.numInferior;
        System.out.println(this.resposta);
        atualizarLabel();

            
    }

    public void verificarUltimaQuestao()
    {
        if(this.numQuestao == this.qntQuestoes)
        {
            JOptionPane.showMessageDialog(null, "Parabéns você acertou todas as questões", "Parabéns", JOptionPane.PLAIN_MESSAGE);
            form.dispose();
        }
    }
 
    
    public void atualizarLabel()
    {
        lblNumeroQuestao.setText(Integer.toString(numQuesta));
        lblNumeroSuperior.setText(Integer.toString(numSuperior));
        lblNumeroInferior.setText(Integer.toString(numInferior));
    }
    
}
