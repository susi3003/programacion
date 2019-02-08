#include<stdio.h>
#define MAX 10
int main(){
	int num[MAX],i;	
	double suma=0,p;
	printf("escribe %d numeros: \n", MAX);
	for(i=0;i<MAX;++i){
		scanf("%d",&num[i]);
	}
	printf("los numeros que escribiste son: \n");
	for(i=0;i<MAX;++i){
		printf("%d\n", num[i]);
	}
	for(i=0;i<MAX;++i){
		suma+=num[i];
	}
	p=suma/MAX;
	printf("%lf %lf\n", suma,p);
}
