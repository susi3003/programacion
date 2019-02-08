	class Triangulo{
		double lado1;
		double lado2;
		double lado3;
// metodos
		double perimetro(){
			double p;
			p=lado1+lado2+lado3;
			return p;
		}
		double area(){
			double a,s;
			s=perimetro()/2;
			a=Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
			return a;
		}
	}
