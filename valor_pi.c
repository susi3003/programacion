#include<stdio.h>
int main(){
	double i,n,signo,suma,a;
	printf("ingrese valor de n ");
	scanf("%lf",&n);
	suma=0;
	signo=1;
	for(i=1;i<=n;i+=2){
		a=4/i;
		suma+=signo*a;
		signo*=-1;
	}
	printf("el valor aproximado de pi es %lf\n", suma);
}
