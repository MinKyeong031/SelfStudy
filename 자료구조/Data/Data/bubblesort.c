#include <stdio.h>

void BubbleSort(int arr[], int n)
{
    int temp;
    for (int i = 0; i < n; i++)  {
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}


int main(void)
{
	int arr[4] = { 3, 2, 4, 1 };
	int i;

    printf("정렬 전 : ");
    for (i = 0; i < 4; i++)
        printf("%d ", arr[i]);

    printf("\n");

	BubbleSort(arr, sizeof(arr) / sizeof(int));

    printf("정렬 후 : ");
	for (i = 0; i < 4; i++)
		printf("%d ", arr[i]);

	printf("\n");
	return 0;
}