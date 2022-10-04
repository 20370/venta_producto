

public class Nodoap {
    private int id;
    private String nombre;
    
    private String descrip;
    private int precio;
    private String existencia;
    private String direc;
    
    private Nodoap siguiente;
    private Nodoap anterior;
    
    public Nodoap(int id, String nombre, String descrip, int precio,
            String existencia, String direc){
        this.id=id;
        this.nombre=nombre;
        this.descrip=descrip;
        this.precio=precio;
        this.existencia=existencia;
        this.direc=direc;
        
        setSiguiente(null);
        setAnterior(null);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descrip
     */
    public String getDescrip() {
        return descrip;
    }

    /**
     * @param descrip the descrip to set
     */
    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the existencia
     */
    public String getExistencia() {
        return existencia;
    }

    /**
     * @param existencia the existencia to set
     */
    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }

    /**
     * @return the direc
     */
    public String getDirec() {
        return direc;
    }

    /**
     * @param direc the direc to set
     */
    public void setDirec(String direc) {
        this.direc = direc;
    }

    /**
     * @return the siguiente
     */
    public Nodoap getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodoap siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Nodoap getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nodoap anterior) {
        this.anterior = anterior;
    }
    
    
}
