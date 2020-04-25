package controle;


import java.util.*;

/*import java.util.ArrayList;
import java.util.List;
import java.util.Random;
*/

public class Numeros
{
    
    private final List<List> numeros;
        
    public Numeros(int max, int min, boolean multi, boolean divi)
    {
        Random objRandom = new Random();
        int maximo = max;
        int minimo = min;
        this.numeros = new ArrayList<>();
                
        List<Integer> questao = new ArrayList<>();
        
        for (int i = 0; i < 10; i++)
        {
            int numSuperior = objRandom.nextInt((maximo - minimo) + 1) + minimo;
            
            int numInferior = objRandom.nextInt((numSuperior - minimo) + 1) + minimo;
            if(multi)
            {
                numInferior = (int)(Math.random() * 10);
                if(numInferior < 2){
                    numInferior = 2;
                }
            }
            if(divi){
               
                numInferior = (int)(Math.random() * 10);
                if(numInferior < 2){
                    numInferior = 2;
                }
                
                while(numSuperior % 2 != 0)
                {
                    numSuperior = objRandom.nextInt((maximo - minimo) + 1) + minimo;
                }
                
                while(numInferior % 2 != 0)
                {
                    numInferior = (int)(Math.random() * 10);
                    if(numInferior < 2){
                        numInferior = 2;
                    }
                }
                
                while(numSuperior % numInferior != 0)
                {
                    numSuperior = objRandom.nextInt((maximo - minimo) + 1) + minimo;
                    numInferior = (int)(Math.random() * 10);
                    if(numInferior < 2){
                        numInferior = 2;
                    }
                    
                    while(numSuperior % 2 != 0)
                    {
                        numSuperior = objRandom.nextInt((maximo - minimo) + 1) + minimo;
                    }

                    while(numInferior % 2 != 0)
                    {
                        numInferior = (int)(Math.random() * 10);
                        if(numInferior < 2){
                            numInferior = 2;
                        }
                    }
                    
                    
                    
                    
                }
                
                
                
            }
            
                        
            questao.add(numSuperior);
            questao.add(numInferior);
            this.numeros.add(questao);
            questao = new ArrayList<>();
            
        }
              
    }
    
    
    public Numeros(int max, int min)
    {
        Random objRandom = new Random();
        int maximo = max;
        int minimo = min;
        this.numeros = new ArrayList<>();
                
        List<Integer> questao = new ArrayList<>();
        
        for (int i = 0; i < 10; i++)
        {
            int numSuperior = objRandom.nextInt((maximo - minimo) + 1) + minimo;
            
            int numInferior = objRandom.nextInt((numSuperior - minimo) + 1) + minimo; 
            numInferior = (int)(Math.random() * 10);
            if(numInferior < 2){
                numInferior = 2;
            }

            while(numSuperior % 2 != 0)
            {
                numSuperior = objRandom.nextInt((maximo - minimo) + 1) + minimo;
            }

            while(numInferior % 2 != 0)
            {
                numInferior = (int)(Math.random() * 10);
                if(numInferior < 2){
                    numInferior = 2;
                }
            }

            while(numSuperior % numInferior != 0)
            {
                numSuperior = objRandom.nextInt((maximo - minimo) + 1) + minimo;
                numInferior = (int)(Math.random() * 10);
                if(numInferior < 2){
                    numInferior = 2;
                }

                while(numSuperior % 2 != 0)
                {
                    numSuperior = objRandom.nextInt((maximo - minimo) + 1) + minimo;
                }

                while(numInferior % 2 != 0)
                {
                    numInferior = (int)(Math.random() * 10);
                    if(numInferior < 2){
                        numInferior = 2;
                    }
                }

        }

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
