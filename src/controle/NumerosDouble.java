package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class NumerosDouble
{
    
   
    public List<List> questoes;
    
    
    public NumerosDouble(int max, int min)
    {
        this.questoes = new ArrayList();
        Random objRandom = new Random();
        
        Double dividendo;
        Double divisor;
        Integer dividendoInt;
        Integer divisorInt;
         
        
        
        for (int i = 0; i < 10; i++)
        {
            List<Double> questao = new ArrayList<>();
            
            dividendoInt = objRandom.nextInt((max - min) + 1) + min;
            divisorInt = (int)(Math.random() * 10);
            
            while(divisorInt < 2)
            {
                divisorInt = (int)(Math.random() * 10);
            }
            
            dividendo =  dividendoInt.doubleValue();
            divisor = divisorInt.doubleValue();
            
            while(dividendo % divisor != 0)
            {
                
                dividendoInt = objRandom.nextInt((max - min) + 1) + min;
                divisorInt = (int)(Math.random() * 10);

                while(divisorInt < 2)
                {
                    divisorInt = (int)(Math.random() * 10);
                }

                dividendo =  dividendoInt.doubleValue();
                divisor = divisorInt.doubleValue();
                   
            }
            
            questao.add(dividendo);
            questao.add(divisor);
            
            this.questoes.add(questao);
            
            
        }
        
        
        
    }

    public List<List> getQuestoes()
    {
        return questoes;
    }
    
    
}
