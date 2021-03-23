#include <stdio.h>

void Hanoi(int num, char from, char by, char to)
{
	if (num > 0) {
		Hanoi(num - 1, from, to, by);
		printf("원판 %d을 %c에서 %c로 옮긴다.\n", num, from, to);
		Hanoi(num - 1, by, from, to);
   }
}


int main(void)
{
	// 막대A의 원반 3개를 막대B를 경유하여 막대C로 옮기기
	Hanoi(2, 'A', 'B', 'C');
	return 0;
}