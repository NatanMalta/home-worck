package modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Dontpad
{
    private final String url;
    private String conteudo;
    private final String USER_AGENT;
  
    public Dontpad(String url)
    {
        this.url = url;
        this.USER_AGENT = "Mozilla/5.0";
    }
    
    public String ler() throws IOException
    {
        
        String GET_URL = "http://dontpad.com/" + this.url;
        URL obj = new URL(GET_URL);
        HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("UserAgent", this.USER_AGENT);
        int responseCode = httpURLConnection.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
        BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine+";");
        } in.close();
        
        

        // print result
        String rresponse = new String(response);
        int inicio = rresponse.indexOf("<textarea id=\"text\">") + 20;
        rresponse = rresponse.substring(inicio);
        int fim = rresponse.indexOf("<");
        this.conteudo = rresponse.substring(0, fim);
        
        



    } else {
        System.out.println("GET request not worked");
     }


    return this.conteudo;
    
    }
    
    public void escrever(String conteudo) throws MalformedURLException, IOException
    {
        this.conteudo = conteudo;        
        String POST_URL = "http://dontpad.com/" + this.url;

        String POST_PARAMS = "text="+conteudo;

        URL obj = new URL(POST_URL);
        HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection(); 
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", this.USER_AGENT);

        // For POST only - START
        httpURLConnection.setDoOutput(true);
        try (OutputStream os = httpURLConnection.getOutputStream())
        {
            os.write(POST_PARAMS.getBytes());
            os.flush();
            // For POST only - END
        }

        int responseCode = httpURLConnection.getResponseCode();
        System.out.println("POST Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { try ( // success
                BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()))) {
            String inputLine;
            StringBuffer response = new StringBuffer();
                while ((inputLine = in .readLine()) != null) {
                    response.append(inputLine);
                }
                // print result
            }
            
        } else {
            System.out.println("POST request not worked");
        }
        
        
    
}
        
    public void sobrescrever() throws IOException
    {
        escrever(" ");
    }
    
}
