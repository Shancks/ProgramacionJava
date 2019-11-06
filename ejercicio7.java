/*la ley de morgan simplica las expresiones condicionales de la sigueinte forma
!(condicion1 && condicion2) es equivalente a !condicion1||!condicion 2
!(condicion||condicion2)es equivalente !condicion1 && !condicion2
 */
public class ejercicio7 {
    public static void main(String[] args){
        int number=6;
        boolean x,x2,y,y2;
       x=!(number%2==0&&number%3==0);
       y=(number%2!=0||number%3!=0);
       System.out.println("el valor "+x+" es igual que "+y);
       x2=!(number==2||number==3);
       y2=number!=2&&number!=3;
       System.out.println("el valor "+x2+" es igual que "+y2);       
       System.out.println("Demostrando asi la ley de Morgan ");
        }
    
}
