package Pruebas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class ReadJSONExample 
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) 
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("cards.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray cardList = (JSONArray) obj;
            System.out.println(cardList + "\n");
             
            //Iterate over employee array
            cardList.forEach( card -> parseCardObject( (JSONObject) card ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
 
    private static void parseCardObject(JSONObject card) 
    {
        //Get card object within list
        JSONObject cardObject = (JSONObject) card.get("card");
        
        //Get card type
        String tipo = (String) cardObject.get("tipo");    
        System.out.println(tipo); 
        
        //Get card name 
        String nombre = (String) cardObject.get("nombre");    
        System.out.println(nombre);  
        
        //Get card cost
        String costo = (String) cardObject.get("costo");    
        System.out.println("costo: " + costo);
        
        /*if (tipo == "esbirro"){
        //Get card attack
            String ataque = (String) cardObject.get("ataque");  
            System.out.println(ataque);
        }*/
        switch(tipo){
            case "esbirro":
                String ataque = (String) cardObject.get("ataque");    
                System.out.println("ataque: " + ataque + "\n");
                break;
            case "hechizo":
                String id = (String) cardObject.get("id");    
                System.out.println("id: " + id + "\n");  
                break;  
            case "secreto":
                String ids = (String) cardObject.get("id");    
                System.out.println("id: " + ids + "\n");  
                break;  
        }
        
        
        
    }
}