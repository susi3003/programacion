public class Triangulo3{
	private double lado1;
	private  double lado2;
	private   double lado3;
//metodos
	public double leer_lado1(){
		return lado1;
	}
	public void cambia_lado1(double nuevo_lado1){
		if(nuevo_lado1>0)
			lado1=nuevo_lado1;
		else
			lado1=0;
	}
	public double leer_lado2(){
		return lado2;
	}
	public void cambia_lado2(double nuevo_lado2){
		if(nuevo_lado2>0)
			lado2=nuevo_lado2;
		else
			lado2=0;
	}
	public double leer_lado3(){
		return lado3;
	}
	public void cambia_lado3(double nuevo_lado3){
		if(nuevo_lado3>0)
			lado3=nuevo_lado3;
		else
			lado3=0;
	}
}

