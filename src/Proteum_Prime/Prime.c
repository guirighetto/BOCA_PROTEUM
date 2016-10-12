#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int long isPrimeNovaNova(long int N)
{
	int long Prime = 0;
	long int i;

	for (i=1;i <= N;i++)
		if (N % i == 0) 
			Prime++;

	return Prime; 
}



int main()
{
	long int N;
	int size_num = 0;			
	long int i = 0;

	
	scanf("%d",&size_num);

	while(i < size_num)
	{
		scanf("%ld",&N);

		if (isPrimeNovaNova(N) == 2)
			printf("Prime\n");
		else
			printf("Not Prime\n");
		i++;
	}
	
	return 0;
}


