package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Arquivo 
{
    private final String nome;
    private String conteudo;
    
    
    public Arquivo(String nome)
    {
        this.nome = nome;
    }
    
    public String ler() throws IOException
    {
        
        FileReader ler = new FileReader(this.nome);
        BufferedReader reader = new BufferedReader(ler);  
        String linha;
        
        this.conteudo = "";
        
        while( (linha = reader.readLine()) != null )
        {
            this.conteudo += linha + ";"; 
        }
        
        
        return this.conteudo;
    }
    
    
    public void escrever(String conteudo) throws IOException
    {
        this.conteudo = conteudo;
        
        // Cria arquivo
        File file = new File(this.nome);

        // Se o arquivo nao existir, ele gera
        if (!file.exists()) {
            file.createNewFile();
        }

        // Prepara para escrever no arquivo
        FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
        // Escreve e fecha arquivo
        try (BufferedWriter bw = new BufferedWriter(fw))
        {
            // Escreve e fecha arquivo
            bw.write(this.conteudo);
        }
        
        
    }
    
    public void sobrescrever() throws IOException
    {
        escrever("");
    }
    
    
}
