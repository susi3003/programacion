//clase para usar triangulo
	class UsarTriangulo{
		public static void main(String[]args){
			Triangulo t1=new Triangulo();
			Triangulo t2= new Triangulo();
			
			t1.lado1=7;
			t1.lado2=3;
			t1.lado3=5;
			
			System.out.println("el perimetro del triangulo 1 es " +t1.perimetro());
			System.out.println("el area del triangulo 1 es " +t1.area());
			
			t2.lado1=5;
			t2.lado2=3;
			t2.lado3=1;
			
			System.out.println("el perimetro del triangulo 2 es " + t2.perimetro());
			System.out.println("el area del triangulo 2 es " + t2.area());
		}
	}
