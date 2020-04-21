package homework;

import apresentacao.frmPrincipal;
import controle.Numeros;
import java.io.IOException;


public class HomeWork
{

   
    
    public  static void main(String[] args) throws IOException
    {
        
        
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {
            Process process = Runtime.getRuntime().exec("cmd /c taskkill /F /IM explorer.exe");
        }
        
        frmPrincipal frmP = new frmPrincipal();
        frmP.setVisible(true);
        
    }
    
}
