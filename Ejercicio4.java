import static java.sql.DriverManager.println;
import java.util.Scanner;
public class Ejercicio4 {    
    public static void main(String[] args){
        int estadoCivil,impuesto = 0;
        double salario;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el estado Civil:"); 
        estadoCivil=entrada.nextInt();
        System.out.println("Ingrese el salario:"); 
        salario=entrada.nextInt();
        switch(estadoCivil){
            case 0:{
                //SOLTERO
                if(salario>0&&salario<=8350)
                    impuesto=10;
                else if(salario>8350&&salario<=33950)
                    impuesto=15;
                else if (salario>33950&&salario<=82250)
                    impuesto=25;
                else if(salario>82250&&salario<=171550)
                    impuesto=28;
                else if(salario>171550&&salario<=372950)
                    impuesto=33;
                else if(salario>372950)
                    impuesto=35;
                break;}
            case 1:{
                //RECIEN CASADO O VIUDO
                if(salario>0&&salario<=16700)
                    impuesto=10;
                else if(salario>16700&&salario<=67900)
                    impuesto=15;
                else if (salario>67900&&salario<=137050)
                    impuesto=25;
                else if(salario>137050&&salario<=208850)
                    impuesto=28;
                else if(salario>208850&&salario<=372950)
                    impuesto=33;
                else if(salario>372950)
                    impuesto=35;
                break;}
            case 2:{
                //CASADO Y SEPARADOS
                if(salario>0&&salario<=8350)
                    impuesto=10;
                else if(salario>8350&&salario<=33950)
                    impuesto=15;
                else if (salario>33950&&salario<=68525)
                    impuesto=25;
                else if(salario>68525&&salario<=104425)
                    impuesto=28;
                else if(salario>104425&&salario<=186475)
                    impuesto=33;
                else if(salario>186475)
                    impuesto=35;
                break;}
            case 3:{
                //CABEZA DE FAMILIA
                if(salario>0&&salario<=11950)
                    impuesto=10;
                else if(salario>11950&&salario<=45500)
                    impuesto=15;
                else if (salario>45500&&salario<=117450)
                    impuesto=25;
                else if(salario>117450&&salario<=190200)
                    impuesto=28;
                else if(salario>190200&&salario<=372950)
                    impuesto=33;
                else if(salario>372950)
                    impuesto=35;
                break;}
        }
        println("El salario es:"+salario+"por lo que debe pagar un impuesto del "+impuesto+"%");  
        
        }   
}
