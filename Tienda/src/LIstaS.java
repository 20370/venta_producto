


public class LIstaS {
    public NodoCliente inicio,fin;
    NodoCliente cabeza;
    NodoCliente aux;
    public LIstaS(){
        inicio=null;
        fin=null;
        
        

            
    }public void mostralista(){
        System.out.println("");
        System.out.println("paso por obtener");
        
         NodoCliente nuevo = new NodoCliente(NodoCliente.cabeza.getNombrec(), NodoCliente.cabeza.getCorreoc(),NodoCliente.cabeza.getUsuarioc(),NodoCliente.cabeza.getContrac(),NodoCliente.cabeza.getTarjeta(),NodoCliente.cabeza.getTipo());
          
         System.out.println("Nodo "+NodoCliente.cabeza.getNombrec());
         
              if(NodoCliente.cabeza==nuevo){
           
              User.tablau.addRow(new Object[]{NodoCliente.cabeza.getNombrec(),NodoCliente.cabeza.getCorreoc(),NodoCliente.cabeza.getUsuarioc(),NodoCliente.cabeza.getContrac()
           ,NodoCliente.cabeza.getTarjeta(),NodoCliente.cabeza.getTipo()});
              
              }else{
                    NodoCliente.aux = NodoCliente.cabeza;
           
         User.tablau.addRow(new Object[]{NodoCliente.aux.getNombrec(),NodoCliente.aux.getCorreoc(),NodoCliente.aux.getUsuarioc(),NodoCliente.aux.getContrac()
           ,NodoCliente.aux.getTarjeta(),NodoCliente.aux.getTipo()});
            
          
//        Ver_Producto.tablaverp.addRow(new Object[]{cabeza.getId(),cabeza.getNombre(),cabeza.getDescrip(),cabeza.getPrecio()
//           ,cabeza.getExistencia(),cabeza.getDirec()});
          
//           


     
                
//         if(cabeza==null){
//            System.out.println("entra en fi");
//            cabeza = nuevo;
//            System.out.println("if "+cabeza.getNombrec());
//           
//             User.tablau.addRow(new Object[]{cabeza.getNombrec(),cabeza.getCorreoc(),cabeza.getUsuarioc(),cabeza.getContrac()
//           ,cabeza.getTarjeta(),cabeza.getTipo()});
//             
//        }else{
//            NodoCliente aux = cabeza;
//            while(aux.getSiguiente()!= null){
//                aux = aux.getSiguiente();
//                System.out.println("while "+aux.getNombrec());
//            }
//            aux.setSiguiente(nuevo);
        }
        
        
    }
    public void registro(){
//             System.out.println("");
//        System.out.println("paso por obtener");
//     
//        
//     
//        if(cabeza==null){
//            cabeza = nuevo;
//            System.out.println("if "+cabeza.getNombrec());
//            
////             User.tablau.addRow(new Object[]{cabeza.getNombrec(),cabeza.getCorreoc(),cabeza.getUsuarioc(),cabeza.getContrac()
////           ,cabeza.getTarjeta(),cabeza.getTipo()});
//             
//        }else{
//            NodoCliente aux = cabeza;
//            while(aux.getSiguiente()!= null){
//                aux = aux.getSiguiente();
//                System.out.println("while "+aux.getNombrec());
//            }
//            aux.setSiguiente(nuevo);
//        }
        
    }
}
   

