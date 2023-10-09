import javax.swing.JOptionPane;

public class Edad {
       int anio, dia, mes;
       int anioActual, mesActual, diaActual;
       int anioNacimiento, mesNacimiento, diaNacimiento;
       
       
       public void pedirDatos() {
    	   anioActual = 2023;
    	   mesActual = 10;
    	   diaActual = 8;
    	   
    	  anioNacimiento=validarNegativos("ingrese el año de nacimiento");
    	  mesNacimiento = validarMeses();
    	  diaNacimiento = validarDias();
    	  
    	  calcularFecha();
    	  
 
    	   
       }
       
       
       public void calcularFecha() {
   		 anio = anioActual - anioNacimiento;
   		 mes = mesActual - mesNacimiento;
   		 dia = diaActual - diaNacimiento;

   	}


	public int validarDias() {
		int dia = 0;
		
		do {
		dia = validarNegativos("Ingrese el Dia de nacimiento");
		if (dia == 0 || dia > 31) {
		System.out.println("Dia Incorrecto");
		}
		} while (dia == 0 || dia > 31);
		return dia;
	}


	public int validarMeses() {
		int mes = 0;
		do {
		mes = validarNegativos("Ingrese el Mes de nacimiento");
		if (mes == 0 || mes > 12) {
		System.out.println("Mes Incorrecto");
		}
		} while (mes == 0 || mes > 12);
		return mes;
	}


	public int validarNegativos(String mensaje) {
		int dato;
		do {
			dato=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
			if(dato<0) {
				System.out.println("no puede ser datos negativo");
			}
		} while (dato<0);
		return dato;
	}
}
