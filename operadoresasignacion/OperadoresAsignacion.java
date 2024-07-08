/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareas.operadoresasignacion;


/**
 *
 * @author angelaruiz
 */
public
        class OperadoresAsignacion {

 
  public static
          void main(String[] args) {
    
            //Declaración de variables
            double saldo;
            
            //Ejecucion
            //Se crea una variable con el nombre saldo, con un saldo inicial de 100,50 euros. Muestra por pantalla este valor
            saldo=100.50;
            System.out.println("Su saldo inicial es "+saldo +" euros");
            //Se recibe un abono en el saldo de 27,50
            saldo=saldo+27.50; 
            //Hay una promoción en la entidad bancaria, se duplican tus ingresos
            saldo=saldo*2;
            //Tienes una avería en casa, tu saldo se divide entre 2.
            saldo=saldo/2;
            //Recibes un ingreso en tu cuenta, de 250,38
            saldo=saldo+250.38;
            //Te acaban de cargar en la cuenta la compra del sábado, - 55,37.
            saldo=saldo-55.37;
            //Recibes el abono de la nómina, 1200,96
            saldo=saldo+1200.96;
            //Muestra el valor de la variable Saldo
            System.out.printf("Su saldo actual es %.2f euros \n",saldo);
            // Finalmente hay un cargo de la cena de ayer, -85,23.
            saldo=saldo-85.23;
            //11. Muestra el valor del saldo
            System.out.printf("Su saldo final es %.2f euros",saldo);
            
            
            
  }
  
}
