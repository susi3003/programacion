//Suma los numeros de un arreglo
class SumaArreglo{
	public static void main(String[]args){
		int[] num={7,8,3,11,5,6,2};
		int n=num.length;
		int sum=0;
		for(int i=0;i<n;++i){
			System.out.println(""+num[i]);
			sum +=num[i];
		}
	System.out.println("Suma= "+sum);
	}
}
