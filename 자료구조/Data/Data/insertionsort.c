#include <stdio.h>

void InserSort(int arr[], int n)
{
	int i, j, temp;
	for (i = 1; i < n; i++) {
		temp = arr[i];
		for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
			arr[j + 1] = arr[j];
		}
		arr[j + 1] = temp;
	}
}


int main(void)
{
	int arr[5] = { 5, 3, 2, 4, 1 };
	int i;

	printf("정렬 전 : ");
	for (i = 0; i < 5; i++)
		printf("%d ", arr[i]);
	printf("\n");

	InserSort(arr, sizeof(arr) / sizeof(int));

	printf("정렬 후 : ");
	for (i = 0; i < 5; i++)
		printf("%d ", arr[i]);

	printf("\n");
	return 0;
}