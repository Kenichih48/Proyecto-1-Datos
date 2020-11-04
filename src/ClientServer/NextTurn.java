package ClientServer;

import java.io.Serializable;

public class NextTurn implements Serializable{
    private String mensaje;
    
public NextTurn(){
    super();
}
    
public NextTurn(String mensaje){
    super();
    this.mensaje = mensaje;
}

public String getmensaje(){
    return mensaje;
}

public void setmensaje(String mensaje){
    this.mensaje = mensaje;
}

}
