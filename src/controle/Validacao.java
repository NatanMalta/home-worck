package controle;


public class Validacao
{
    private String resposta;
    private int respostaValida;
    private Double respostaValidaD;
    private String mensagem;
    private String op;
    
    public Validacao(String resposta, String op)
    {
        this.op = op;
        this.resposta = resposta;
        this.mensagem = "";
        validar();
    }
    
    private void validar()
    {
        try
        {
            if("/".equals(this.op)) this.respostaValidaD = Double.parseDouble(this.resposta.replace(",","."));
            else this.respostaValida = Integer.parseInt(this.resposta);
              
        } catch (NumberFormatException e)
        {
            this.mensagem = "Você digitou um número inválido";
        }
        
    }

    public int getRespostaValida()
    {
        
        return respostaValida;
    }

    public Double getRespostaValidaD()
    {
        return respostaValidaD;
    }
    
    public String getMensagem()
    {
        return mensagem;
    }
    
    
    
}
