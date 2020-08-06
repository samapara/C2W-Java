#include<stdio.h>

int main() {

	printf("size of int is %ld byte(s)\n",sizeof(int));
	printf("size of short is %ld byte(s)\n",sizeof(short));
	printf("size of float is %ld byte(s)\n",sizeof(float));
	printf("size of double is %ld byte(s)\n",sizeof(double));
	printf("size of char is %ld byte(s)\n",sizeof(char));
	printf("size of bool is %ld byte(s)\n",sizeof(_Bool));

	return 0;
}
