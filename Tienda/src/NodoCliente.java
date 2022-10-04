
public class NodoCliente {
    private String  nombrec;
    private String correoc;
    private String usuarioc;
    private String contrac;
    private String tarjeta;
    private String tipo;
    private NodoCliente siguiente;
    public static NodoCliente cabeza;
    public static  NodoCliente aux; 
    public NodoCliente (String nombrec, String correoc, String usuarioc, String contrac,String tarjeta, String tipo){
        this.nombrec=nombrec;
        this.correoc=correoc;
        this.usuarioc=usuarioc;
        this.contrac=contrac;
        this.tarjeta=tarjeta;
        this.tipo=tipo;
        
      
        this.siguiente=siguiente;
        
        
    }

    /**
     * @return the nombrec
     */
    public String getNombrec() {
        return nombrec;
    }

    /**
     * @param nombrec the nombrec to set
     */
    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    /**
     * @return the correoc
     */
    public String getCorreoc() {
        return correoc;
    }

    /**
     * @param correoc the correoc to set
     */
    public void setCorreoc(String correoc) {
        this.correoc = correoc;
    }

    /**
     * @return the usuarioc
     */
    public String getUsuarioc() {
        return usuarioc;
    }

    /**
     * @param usuarioc the usuarioc to set
     */
    public void setUsuarioc(String usuarioc) {
        this.usuarioc = usuarioc;
    }

    /**
     * @return the contrac
     */
    public String getContrac() {
        return contrac;
    }

    /**
     * @param contrac the contrac to set
     */
    public void setContrac(String contrac) {
        this.contrac = contrac;
    }

    /**
     * @return the tarjeta
     */
    public String getTarjeta() {
        return tarjeta;
    }

    /**
     * @param tarjeta the tarjeta to set
     */
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the siguiente
     */
    public NodoCliente getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCliente siguiente) {
        this.siguiente = siguiente;
    }
    
    
}

