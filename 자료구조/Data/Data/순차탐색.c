#include <stdio.h>

int LSearch(int ar[], int len, int target)
{

	for (int i = 0; i <= len; i++) {
		if (ar[i] == target) {
			return i;
		}
	}
	return -1;
	// Å¸°ÙÀÌ ÀÖ´Ù¸é ÇØ´ç Å¸°Ù ÀÎµ¦½º¸¦ ¹ÝÈ¯
	// Å¸°ÙÀÌ ¾ø´Ù¸é ¾øÀ½(-1)À» ¹ÝÈ¯

}

int main(void)
{
	int arr[] = { 3, 5, 2, 4, 9 };
	int idx;

	idx = LSearch(arr, sizeof(arr) / sizeof(int), 4);
	if (idx == -1)
		printf("Å½»ö ½ÇÆÐ \n");
	else
		printf("Å¸°Ù ÀúÀå ÀÎµ¦½º: %d \n", idx);

	idx = LSearch(arr, sizeof(arr) / sizeof(int), 7);
	if (idx == -1)
		printf("Å½»ö ½ÇÆÐ \n");
	else
		printf("Å¸°Ù ÀúÀå ÀÎµ¦½º: %d \n", idx);

	return 0;
}