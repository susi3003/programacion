//mejora del programa suma
class Suma2{
	public static void main(String[] args){
		int n=args.length;
		int sum=0;
		int a,i ;
		for(i=0; i<n; ++i){
			try{
			a=Integer.parseInt(args[i]);
			}catch(Exception error){
				System.out.println(args[i] + "    no es un numero entero ");
				a=0;
			}
			sum +=a;
		}
			System.out.println("Suma = " +sum);
	}
}

