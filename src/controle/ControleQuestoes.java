package controle;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public final class ControleQuestoes
{
    private List<List> questoes;
    private List<List> questoesD;
    private int numQuestao;
    private int numQuesta;
    private int numSuperior;
    private int numInferior;
    private int resposta;
    private Double respostaD;
    private int max;
    private int min;
    private Double dividendo;
    private Double divisor;
    private final int qntQuestoes;
    private final JLabel lblNumeroQuestao;
    private final JLabel lblNumeroSuperior;
    private final JLabel lblNumeroInferior;
    private final JDialog form;
    private final String operacao;
    private boolean terminou;
    
    public ControleQuestoes(JLabel lblNumeroQuestao, JLabel lblNumeroSuperior, JLabel lblNumeroInferior, JDialog form, String operacao, int max, int min, boolean multi, boolean divi )
    {
        this.terminou = false;
        this.max = max;
        this.min = min;
        this.lblNumeroQuestao = lblNumeroQuestao;
        this.lblNumeroSuperior = lblNumeroSuperior;
        this.lblNumeroInferior = lblNumeroInferior;
        this.form = form;
        this.operacao = operacao;
        Numeros objNumeros = new Numeros(max,min,multi,divi);
        NumerosDouble objNumDouble = new NumerosDouble(max, min);
        this.questoes = new ArrayList<>();
        this.questoesD = new ArrayList<>();
        this.questoesD = objNumDouble.getQuestoes();
        this.questoes = objNumeros.getNumeros();
        this.qntQuestoes = questoes.size() - 1;
        this.numQuestao = 0;
        this.numQuesta = numQuestao + 1;
        this.numSuperior = (int) questoes.get(numQuestao).get(0);
        this.numInferior = (int) questoes.get(numQuestao).get(1);
        this.dividendo = (Double) questoesD.get(numQuestao).get(0);
        this.divisor = (Double) questoesD.get(numQuestao).get(1);
        
        switch(operacao){
            case "+":
                this.resposta = numSuperior + numInferior;
                atualizarLabel();
            break;
            
            case "-":
                this.resposta = numSuperior - numInferior;
                atualizarLabel();
            break;
            
            case "*":
                this.resposta = numSuperior * numInferior;
                atualizarLabel();
            break;
                
            case "/":
                this.respostaD = dividendo / divisor;
                lblNumeroQuestao.setText(Integer.toString(numQuesta));
                lblNumeroSuperior.setText(Double.toString(dividendo).replace(".0",""));
                lblNumeroInferior.setText(Double.toString(divisor).replace(".0",""));
            break;
        }
        
        
        System.out.println(respostaD);
        
               
    }
   
    public boolean verificarResposta(int resposta)
    {
        return resposta == this.resposta;
        
    }
    
    public boolean verificarResposta(Double resposta)
    {
        return resposta.equals(this.respostaD);
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
        this.dividendo = (Double) questoesD.get(numQuestao).get(0);
        this.divisor = (Double) questoesD.get(numQuestao).get(1);
        
        switch(this.operacao){
            case "+":
                this.resposta = this.numSuperior + this.numInferior;
                atualizarLabel();
            break;
            
            case "-":
                this.resposta = this.numSuperior - this.numInferior;
                atualizarLabel();
            break;
            
            case "*":
                this.resposta = this.numSuperior * this.numInferior;
                atualizarLabel();
            break;
                
            case "/":
                this.respostaD = this.dividendo / this.divisor;
                lblNumeroQuestao.setText(Integer.toString(numQuesta));
                lblNumeroSuperior.setText(Double.toString(dividendo).replace(".0",""));
                lblNumeroInferior.setText(Double.toString(divisor).replace(".0",""));
            break;
        }
        
        
        System.out.println(this.respostaD);
        

            
    }

    public void verificarUltimaQuestao()
    {
        if(this.numQuestao == this.qntQuestoes)
        {
            this.terminou = true;
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
    
    public boolean getTerminou()
    {
        return this.terminou;
    }
    
}
