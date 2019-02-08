public class ProbarMetodo12{
	public void metodo5(int[]a){
	int n= a.length;
	for (int i=0;i<n;++i)
		a[i]=(i+1)*2;
	}
public void metodo6(){
	int[] b={7,8,1,4,5,3,2,9};
	int i,n;
	metodo5(b);
	n=b.length;
	for(i=0; i<n ;++i)
		System.out.println(" "+b[i]);
	}
	public static void main(String[] args){
		ProbarMetodo12 obj= new ProbarMetodo12();
		obj.metodo6();
	}
}
