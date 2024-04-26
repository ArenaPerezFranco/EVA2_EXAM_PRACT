
package isc_exa_prac_2da_24550019;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class ISC_EXA_PRAC_2DA_24550019 {

    
    public static void main(String[] args) {
        int op, com2; //Opcion usuario y compu
        double com;//Opcion de la computadora
        int par = 0 ; //Partidas
        int pu =0; //Partidas usuario
        int pc = 0; //Partidas compu
                
        System.out.println("Te presentamos un juego de piedra papel o tijera");
        Scanner captu = new Scanner(System.in);
        
        
      
         
              
            
                while (par <=1) {
           
            System.out.println("¿Que opción eliges? 1.-Piedra , 2.- Papel, 3.-Tijera");
            op = captu.nextInt();
            par += 1;
            //OPCIÓN DE LA COMPU
            com = Math.random();
            
            if (com >= 0.3) {
               System.out.println("Opcion de compu = Piedra");
               com2 = 1;
                if(com2 == 1 && op ==2 ){
                System.out.println("Ganaste");
                  pu =+ 1;
                  
                }else{ 
                    if(com >=0.6) {
              System.out.println("Opcion de compu = Papel");
              com2 = 2;
              if(com2 == 2 && op==3){
                  System.out.println("Ganaste!!");
                  pu =+ 1;
              }else{ 
                  if (com <= 0.9) {
                  System.out.println("Opcion de compu = Tijera");
                  com2 = 3;
               if(com2 == 3 && op== 1){
                System.out.println("Ganaste");
                 pu =+ 1;
            
                }
               }else{
                   System.out.println("Perdiste");
                   pc += 1;
                   
             }
             }
             }
            
                
}
      
}
                
}
                //IMPRIMIR RESULTADOS
         System.out.println("Partidas perdidas" + pc);
         System.out.println("Partidas Ganadas:" + pu); 
}
}


             
          
    
  

