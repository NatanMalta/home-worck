package controle;


public class Validacao
{
    private String resposta;
    private int respostaValida;
    private String mensagem;
    
    public Validacao(String resposta)
    {
        this.resposta = resposta;
        this.mensagem = "";
        validar();
    }
    
    private void validar()
    {
        try
        {
            this.respostaValida = Integer.parseInt(this.resposta);
            
        } catch (NumberFormatException e)
        {
            this.mensagem = "Você digitou um número inválido";
        }
        
    }

    public int getRespostaValida()
    {
        return respostaValida;
    }

    public String getMensagem()
    {
        return mensagem;
    }
    
    
    
}
