package controle;

import java.util.ArrayList;
import java.util.List;

public class ControleQuestoes
{
    private List<List> questoes;
    private int numQuestao;
    private int numQuesta;
    private int numSuperior;
    private int numInferior;
    private int resposta;
    private int qntQuestoes;
    
    public ControleQuestoes()
    {
        
        Numeros objNumeros = new Numeros();
        this.questoes = new ArrayList<>();
        this.questoes = objNumeros.getNumeros();
        this.qntQuestoes = questoes.size() - 1;
        this.numQuestao = 0;
        this.numQuesta = numQuestao + 1;
        this.numSuperior = (int) questoes.get(numQuestao).get(0);
        this.numInferior = (int) questoes.get(numQuestao).get(1);
        this.resposta = numSuperior + numInferior;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public List<List> getQuestoes()
    {
        return questoes;
    }

    public void setQuestoes(List<List> questoes)
    {
        this.questoes = questoes;
    }

    public int getNumQuestao()
    {
        return numQuestao;
    }

    public void setNumQuestao(int numQuestao)
    {
        this.numQuestao = numQuestao;
    }

    public int getNumQuesta()
    {
        return numQuesta;
    }

    public void setNumQuesta(int numQuesta)
    {
        this.numQuesta = numQuesta;
    }

    public int getNumSuperior()
    {
        return numSuperior;
    }

    public void setNumSuperior(int numSuperior)
    {
        this.numSuperior = numSuperior;
    }

    public int getNumInferior()
    {
        return numInferior;
    }

    public void setNumInferior(int numInferior)
    {
        this.numInferior = numInferior;
    }

    public int getResposta()
    {
        return resposta;
    }

    public void setResposta(int resposta)
    {
        this.resposta = resposta;
    }

    public int getQntQuestoes()
    {
        return qntQuestoes;
    }

    public void setQntQuestoes(int qntQuestoes)
    {
        this.qntQuestoes = qntQuestoes;
    }
    
    
    
    
    
    
    
}
