public class Punto{
	//PROPIEDADES
	public int x;
	public int y;
	//METODOS
	public void mover(int x, int y){
	this.x=x;
	this.y=y;
	}
	public void imprimir(){
		System.out.println("x= "+x+" y= "+y);
	}
	public static void main(String[]args){
	Punto p1=new Punto();
	p1.mover(5,-2);
	p1.imprimir();
	}
}

