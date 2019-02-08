public class Punto2{
//propiedades
	public int x;
	public int y;
	//metodo constructor
	public Punto2(){
		x=0;
		y=0;
	}
	public Punto2(int a){
		x=a;
		y=a;
	}
	public Punto2(int x,int y){
		this.x=x;
		this.y=y;
	}
	//metodos 
	public void mover(int x, int y){
		this.x=x;
		this.y=y;
	}
	public void imprimir (){
		System.out.println("x="+x+" y=" +y);
	}
	public static void main(String[]args){
		Punto2 p1= new Punto2();
		Punto2 p2= new Punto2(3);
		Punto2 p3= new Punto2(7,-4);
		p1.imprimir();
		p2.imprimir();
		p3.imprimir();
	}
}
