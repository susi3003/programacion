	class UsarRectangulo{
		public static void main(String[]args){
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		Rectangulo r3=new Rectangulo();
		
		r1.lado1=r1.lado3=10;
		r1.lado2=r1.lado4=5;
		
		System.out.println("el area de el rectangulo 1 es " +r1.area ());
		System.out.println("el perimetro de el rectangulo 1 es " +r1.perimetro());
		
		r2.lado1=r2.lado3=6;
		r2.lado2=r2.lado4=3;
		
		System.out.println("el area de el rectangulo 2 es " +r2.area ());
		System.out.println("el perimetro de el rectangulo 2 es " +r2.perimetro());
		
		r3.lado1=r3.lado3=8;
		r3.lado2=r3.lado4=4;
		
		System.out.println("el area de el rectangulo 3 es " +r3.area ());
		System.out.println("el perimetro de el rectangulo 3 es " +r3.perimetro());
		
		}
	}
	
		
		
		
