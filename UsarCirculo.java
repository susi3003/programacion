class UsarCirculo{
	public static void main(String[]args){
			Triangulo t1=new Triangulo();
			t1.lado1=3;
			t1.lado2=3;
			t1.lado3=4;
			System.out.println("el perimetro del triangulo 1 es " +t1.perimetro());
			System.out.println("el area del triangulo 1 es " +t1.area());
			Rectangulo r1=new Rectangulo();
			r1.lado1=r1.lado3=10;
			r1.lado2=r1.lado4=5;
			System.out.println("el area de el rectangulo 1 es " +r1.area ());
			System.out.println("el perimetro de el rectangulo 1 es " +r1.perimetro());
			Circulo c1=new Circulo();
			c1.radio=2;
			System.out.println("el area de el circulo 1 es " +c1.area ());
			System.out.println("el perimetro de el circulo 1 es " +c1.perimetro());
	}
}
