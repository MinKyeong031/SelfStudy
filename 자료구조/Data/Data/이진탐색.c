#include <stdio.h>

int BSearch(int ar[], int len, int target)
{
	int first = 0;
	int last = len - 1;
	int mid;

	while (first <= last) {
		mid = (first + last) / 2;

		if (ar[mid]  == target) {
			return mid;
		} else {
			if (ar[mid] < target) {
				first = mid + 1;
				//first += 1;
			}
			else if (ar[mid] > target) {
				last = mid - 1;
				//last -= 1;
			}
		}
	}
	return -1;
}

int main(void)
{
	int arr[] = { 1, 3, 5, 7, 9 };
	int idx;

	idx = BSearch(arr, sizeof(arr) / sizeof(int), 7);
	if (idx == -1)
		printf("Å½»ö ½ÇÆĞ \n");
	else
		printf("Å¸°Ù ÀúÀå ÀÎµ¦½º: %d \n", idx);

	idx = BSearch(arr, sizeof(arr) / sizeof(int), 11);
	if (idx == -1)
		printf("Å½»ö ½ÇÆĞ \n");
	else
		printf("Å¸°Ù ÀúÀå ÀÎµ¦½º: %d \n", idx);

	return 0;
}