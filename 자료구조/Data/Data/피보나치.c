#include <stdio.h>

int Fibo(int n)
{
	if (n < 2) {
		return n;
	} else {
		return Fibo(n - 2) + Fibo(n - 1);
	}
}

int main(void)
{
	int i;
	for (i = 0; i < 15; i++)
		printf("%d\n", Fibo(i));

	return 0;
}