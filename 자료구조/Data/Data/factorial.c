#include <stdio.h>

int fact(int num);

void main(void)
{
	int num;
	printf("정수를 입력하세요 : ");
	scanf_s("%d", &num);
	fact(num);
	printf("%d의 팩토리얼 값은 %d입니다. \n", num, factorial(num));
}

int fact(int num)
{
	if (num >= 1) {
		printf("fact(%d) 함수 호출\n", num);
		fact(num - 1);
		printf("fact(%d) 값 %d 반환\n", num, factorial(num));
	}
}

int factorial(int num) {
	if (num <= 1) {
		return 1;
	} else {
		return num * factorial(num - 1);
	}
}