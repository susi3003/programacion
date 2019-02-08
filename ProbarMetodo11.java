public class ProbarMetodo11{
	public void metodo3(Arco a1){
		System.out.println("Arco a1: ");
		System.out.println("radio= "+a1.leer_radio());
		System.out.println("alfa= "+a1.leer_alpha());
		System.out.println("beta= "+a1.leer_beta());
		a1.cambia_radio(3);
		a1.cambia_alpha(50);
		a1.cambia_beta(100);
}

public void metodo4(){
	Arco b1 = new Arco();
	b1.cambia_radio(10);
	b1.cambia_alpha(200);
	b1.cambia_beta(270);
	metodo3(b1);
	System.out.println("Arco b1:");
	System.out.println("radio= "+b1.leer_radio());
	System.out.println("alfa= "+b1.leer_alpha());
	System.out.println("beta= "+b1.leer_beta());
}
public static void main (String[]args){
	ProbarMetodo11 obj = new ProbarMetodo11();
	obj.metodo4();
}
}
