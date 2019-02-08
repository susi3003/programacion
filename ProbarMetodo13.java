public class ProbarMetodo13{
	public int[] metodo7(int n){
	int[] a=new int [n];
	int i;
	for(i=0;i<n;++i)
		a[i]=(i*i);
		return a;
	}
	public void metodo8(){
		int[] b;           
		int i,n;
		b=metodo7(20);
		n=b.length;
		for(i=0; i<n;++i)
			System.out.println(" " +b[i]);
	}
	public static void main (String[] args){
	ProbarMetodo13 obj =new ProbarMetodo13();
	obj.metodo8();
	}
}


