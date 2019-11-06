/*
crea un programa que verifique si un numero es divisible
por 2 y por 3 a lavez
por 2 o por 3 
por 2 o por 3 pero no por ambos
 */
public class ejercicio6 {
    public static void main(String[] args){
     int x=5;
     if((x%6==0))
     System.out.println(x+ " es divisible por 2 y 3");
     else{
     System.out.println(x+ " no es divisible por 2 y 3");
     }
     if(((x%2)==0)||((x%3)==0))
     System.out.println(x+ " es divisible por 2 o 3");
     else{
     System.out.println(x+ " no es divisible por 2 o 3");
     }
     if(((x%2)==0)^((x%3)==0))
     System.out.println(x+ " es divisible por 2 y 3 pero no ambos");
     else{
     System.out.println(x+ " no es divisible por 2 y 3 pero no ambos ");
     }
         
        
    }    
}
