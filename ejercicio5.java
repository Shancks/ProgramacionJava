/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumnot
 */
public class ejercicio5 {
    public static void main(String[] args){
        double income=2000,tax;
       /* if(income<=10000)
            tax=income*0.1;
        else if(income<=20000)
            tax=1000+(income-10000)*0.15;
        */
      if(income<=10000)
          tax=income*0.1;
      else if(income>10000&&income<=20000)
          tax=1000+(income-10000)*0.15;
    }   
}
