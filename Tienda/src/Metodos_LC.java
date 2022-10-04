

public class Metodos_LC {
    public static Nodoap cabeza;
    public static Nodoap auxiliar;
    private static int tamano;
    
    
    public Metodos_LC(){
     setCabeza(null);
       tamano =0;
  
    }
    public boolean lista_vacia(){
    return cabeza==null;
    }
//      public boolean eliminar(int elemento ){
//            Nodoap actual;
//            boolean encontrado=false;
//            actual=auxiliar;
//            while (actual.getSiguiente()!=auxiliar && !encontrado) {              
//             encontrado=(actual.getSiguiente().getId()==elemento);
//                if (!encontrado) {
//                    actual=actual.getSiguiente();
//                }
//            }
//              encontrado=(actual.getSiguiente().getId()==elemento);
//              if (encontrado) {
//                  Nodoap auxil=actual.getSiguiente();
//          
//                  if (auxiliar==auxiliar.getSiguiente()) {
//                      auxiliar=null;
//                      
//                  }else{
//                      if (auxil==auxiliar) {
//                          auxiliar=actual;
//                          
//                      }
//                      actual.getSiguiente()=auxil.getSiguiente();
//                  }
//            
//          }
             
//            }
    public void ingresaD(int dat1, String dat2, String dat3, int dat4, String dat5, String dat6 ){

        Nodoap n = new Nodoap(dat1, dat2, dat3, dat4, dat5, dat6);
        
//         if(cabeza!=null){
//             n.setSiguiente(cabeza.getSiguiente());
//             cabeza.setSiguiente(n);
//             System.out.println("sin problema ");
//             System.out.println("cabezaaaaaa "+cabeza.getId());
//         }
//         Nodoap auxiliar=cabeza;
//         System.out.println("auxiliar "+auxiliar.getId());
//         cabeza=n;
//        System.out.println("nnn"+n);
//         System.out.println("cabezaaaaaa "+cabeza.getId());
//       return this ;
       if(cabeza == null){
            cabeza = n;
            cabeza.setSiguiente(cabeza);
        }else{
           
            Nodoap aux = cabeza;
            while(aux.getSiguiente()!= cabeza){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(n);
            n.setSiguiente(cabeza);
        }
         
         
//        
    }
    
    public static void muestraD(){
//        System.out.println("cabaezaa" +cabeza.getId());
////      cabeza.setSiguiente(auxiliar);
//      auxiliar=cabeza.getSiguiente();
//      
//        System.out.println("pasaaa nuevo "+auxiliar.getId());
////           auxiliar =
//
//        do {     
//           
//           
//            System.out.println("entro en do");
//            System.out.println("cabeza doo "+auxiliar.getId());
//              Editar_Producto.tablaeditar.addRow(new Object[]{cabeza.getId(),cabeza.getNombre(),cabeza.getDescrip(),cabeza.getPrecio()
//           ,cabeza.getExistencia(),cabeza.getDirec()});
//  
//////             
//             System.out.println("sale de do ");
////             
////          
//             
//              auxiliar =auxiliar.getSiguiente();
//             System.out.println("termina while "+auxiliar.getId());
//        } while (auxiliar!=cabeza.getSiguiente());
//   System.out.println("entra en while");
////     Editar_Producto.tablaeditar.addRow(new Object[]{cabeza.getId(),cabeza.getNombre(),cabeza.getDescrip(),cabeza.getPrecio()
////           ,cabeza.getExistencia(),cabeza.getDirec()});
//     
//            
////  Editar_Producto.tablaeditar.addRow(new Object[]{auxiliar.getId(),auxiliar.getNombre(),auxiliar.getDescrip(),auxiliar.getPrecio()
////           ,auxiliar.getExistencia(),auxiliar.getDirec()});
////           System.out.println("id "+auxiliar.getId());
//           
           
//       
         if(cabeza!=null){
             System.out.println("cabeza "+cabeza.getId());
            Nodoap auxiliar = cabeza;
            auxiliar =auxiliar.getSiguiente();
            
            System.out.println(cabeza.getId()+" Mi siguiente es: " + auxiliar.getId() );
//        Ver_Producto.tablaverp.addRow(new Object[]{cabeza.getId(),cabeza.getNombre(),cabeza.getDescrip(),cabeza.getPrecio()
//           ,cabeza.getExistencia(),cabeza.getDirec()});
           Editar_Producto.tablaeditar.addRow(new Object[]{cabeza.getId(),cabeza.getNombre(),cabeza.getDescrip(),cabeza.getPrecio()
           ,cabeza.getExistencia(),cabeza.getDirec()});
//           
         while(auxiliar!=cabeza){
             
             System.out.println("entra en while");
                System.out.println(auxiliar.getId() + " while Mi siguiente es " + auxiliar.getSiguiente().getId());
//              Ver_Producto.tablaverp.addRow(new Object[]{cabeza.getId(),cabeza.getNombre(),cabeza.getDescrip(),cabeza.getPrecio()
//           ,cabeza.getExistencia(),cabeza.getDirec()});
            Editar_Producto.tablaeditar.addRow(new Object[]{auxiliar.getId(),auxiliar.getNombre(),auxiliar.getDescrip(),auxiliar.getPrecio()
           ,auxiliar.getExistencia(),auxiliar.getDirec()});
//               
               auxiliar = auxiliar.getSiguiente();
                  
            }
        }else{
            System.out.println("Lista vacia");
        }
       
    
    
    
//    public static void modificar(){
//       do{
//            Nodoap auxiliar = cabeza;
//            
//            
//            System.out.println(cabeza.getId()+" Mi siguiente es: " + auxiliar.getId() );
//           if (auxiliar==cabeza) {
//               System.out.println("sennslskjlskjflsfjl");
//           }
//           auxiliar =auxiliar.getSiguiente();
//       }while(auxiliar!=cabeza);
//             
//             System.out.println("entra en while");
//                System.out.println(auxiliar.getId() + " while Mi siguiente es " + auxiliar.getSiguiente().getId());
//
//                Editar_Producto.tablaeditar.addRow(new Object[]{auxiliar.getId(),auxiliar.getNombre(),auxiliar.getDescrip(),auxiliar.getPrecio()
//           ,auxiliar.getExistencia(),auxiliar.getDirec()});
//               
//               auxiliar = auxiliar.getSiguiente();
//                  
            }
  
//// 
    public static Nodoap getCabeza() {
        return cabeza;
    }

    /**
     * @param aCabeza the cabeza to set
     */
    public static void setCabeza(Nodoap aCabeza) {
        cabeza = aCabeza;
    }

    /**
     * @return the tamano
     */
    public static int getTamano() {
        return tamano;
    }

    /**
     * @param aTamano the tamano to set
     */
    public static void setTamano(int aTamano) {
        tamano = aTamano;
    }
    
        
        
      }
      