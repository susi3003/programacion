/*Barnsley Fern*/
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define N 1000000
int main(){
	double x0,y0,x,y;
	int a,i;
	srand (time(NULL));
	x0=0;
	y0=0;
	for(i=0;i<N;++i){
		a=rand()%100+1;
		if(a==1){
			x=0;
			y=0.16*y0;
		}
		if (a>=2 && a<=86){
			x=0.85*x0+0.04*y0;
			y=-0.04*x0+0.85*y0+1.6;
		}
		if(a>=87 && a<=93){
			x=0.2*x0-0.26*y0;
			y=0.23*x0+0.22*y0+1.6;
		}
		if(a>=94){
			x=-0.15*x0+0.28*y0;
			y=0.26*x0+0.24*y0+0.44;
		}
		printf("%lf \t %lf \t %d\n" ,x,y,i);
		y0=y;
		x0=x;
	}
}
