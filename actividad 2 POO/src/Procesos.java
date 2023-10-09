import javax.swing.JOptionPane;

public class Procesos {
        Edad miE;
	
	public Procesos() {
		miE=new Edad();
		int cant=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de veces"));
		
		for (int i = 0; i < cant; i++) {
			miE.pedirDatos();
			calcularEdad();
		}
	}
	
	
	
	public void calcularEdad() {
		miE=new Edad();
		if (miE.anio > 18) {
		System.out.println("Usted es mayor de edad");
		} else if (miE.anio == 18 && miE.mes > 0) {
		System.out.println("Usted es mayor de edad");
		} else if (miE.anio == 18 && miE.mes == 0 && miE.dia >= 0) {
		System.out.println("Usted es mayor de edad");
		} else {
		System.out.println("Usted es menor de edad");
		}
		}

}
