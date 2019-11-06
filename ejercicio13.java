/*
 */

import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args){        
      Scanner entrada =new Scanner(System.in);       
      int exit=0;
       do{
             System.out.println("Ingrese el numero de la suerte");
             int num = entrada.nextInt();
             int num1 = num%10, num2 = (num/10)%10,num1Lot = (int)(Math.random()*9), 
                     num2Lot= (int)(Math.random()*9);
             if(num1 == num1Lot && num2 == num2Lot)
                 System.out.println("te ganaste el gordo 10000 €");
             else if(num1 == num2Lot && num2 == num1Lot){
            //acertar los dos pero en diferente orden 3000
                 System.out.println("te ganaste  3000 € ACERTASTE LOS DOS NUMEROS");       
             }
              //acertar alguno de los dos en cualquier orden 1000
             else if(num1 == num1Lot || num1 == num2Lot || num2 == num1Lot || num2 == num2Lot){            
                 System.out.println("te ganaste 1000 €  por acertar uno de los numeros");
             }
             else{            
                 System.out.println("sigue intentando ... :) ");       
            }
             System.out.println(num1Lot+""+num2Lot+"Desea volver a intentar ? 0si 1 no");
             exit=entrada.nextInt();            
       }while(exit==0);              
    }  
}
