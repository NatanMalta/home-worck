package controle;


import java.util.*;

/*import java.util.ArrayList;
import java.util.List;
import java.util.Random;
*/

public class Numeros
{
    
    private final List<List> numeros;
        
    public Numeros()
    {
        Random objRandom = new Random();
        int maximo = 99999;
        int minimo = 10000;
        this.numeros = new ArrayList<>();
                
        List<Integer> questao = new ArrayList<>();
        
        for (int i = 0; i < 10; i++)
        {
            int numSuperior = objRandom.nextInt((maximo - minimo) + 1) + minimo;
            int numInferior = objRandom.nextInt((numSuperior - minimo) + 1) + minimo;
                        
            questao.add(numSuperior);
            questao.add(numInferior);
            this.numeros.add(questao);
            questao = new ArrayList<>();
            
        }
              
    }

    public List<List> getNumeros()
    {
        return numeros;
    }
}
