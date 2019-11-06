/*
x e y son int que sentencias son legales
*/
public class ejercicio8 {
    public static void main(String[] args){
        int x=5 ,y=10;
        boolean resultado;
        //resultado=(x>y>0); no funcionara ya que x>y es un booleano y true no opera con 0
        //resultado=y&&y; no funciona con valores enteros
        x/=y;//x entre y y lo guarda en x
        //resultado=(x or y); el or no funciona con valores enteros y el correcto or es  ||
        //resultado=(x and y); el and no funciona con valores enteros y el correcto and es &&
        //resultado=(x!=0)||(x=0);el operador = no existe ,solo existe ==
    }
}
