#include <stdio.h>

void SelSort(int arr[], int n)
{
    int min, temp;
    for (int i = 0; i < n - 1; i++) {
        min = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[min]) {  
                min = j;
            }
        }
        temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}


int main(void)
{
	int arr[4] = { 3, 4, 2, 1 };
	int i;

    printf("정렬 전 : ");
    for (i = 0; i < 4; i++)
        printf("%d ", arr[i]);
    printf("\n");

    SelSort(arr, sizeof(arr) / sizeof(int));

    printf("정렬 후 : ");
	for (i = 0; i < 4; i++)
		printf("%d ", arr[i]);

	printf("\n");
	return 0;
}