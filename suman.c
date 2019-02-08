#include<stdio.h>
int main(){
	int n,i,suma;
	printf("ingrese el numero n= ");
	scanf("%d", &n);
	suma=0;
	for(i=1;i<=n;i=i+1){		
		suma+=i;
		printf("%d\n", i);
		printf("%d\n", suma);
	}
}
