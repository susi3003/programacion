//Suma los numeros que recibe
//como parametros
class Suma{
	public static void main(String[]args){
		int n=args.length;
		int sum=0;
		for(int i=0;i<n;++i){
			int a=Integer.parseInt(args[i]);
			sum+=a;
		}
	System.out.println("Suma = "+sum);
	}
}
