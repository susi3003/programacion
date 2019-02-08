public class Recta{
	//propiedades
	public int x0,y0;
	public int x1,y1;
	
	public Recta(int x0, int y0, int x1, int y1){
		this.x0=x0;
		this.y0=y0;
		this.x1=x1;
		this.y1=y1;
	}
	public Recta(){
		this(0,0,1,1);
	}
	public Recta (int x, int y){
		this(x,y,x+1,y+1);
	}
	
	public void mover(int x0, int y0, int x1, int y1){
		this.x0=x0;
		this.y0=y0;
		this.x1=x1;
		this.y1=y1;
	}
	public void imprimir(){
	System.out.println("Punto inicial: "+x0+","+y0);
	System.out.println("Punto final: "+x1+","+y1);
	}
	public static void main(String[]args){
		Recta r1= new Recta();
		Recta r2= new Recta(5,3);
		Recta r4= new Recta(1,2,9,8);
		r1.imprimir();
		r2.imprimir();
		r4.imprimir();
	}
}

