#include <stdio.h>
#include <string.h>

/** 마지막 길이 반환 함수 ***/
int Endlen(int* arr)
{
	int len = 0, i = 0;
	while (arr[i] != '\0')
		i++;
	return i;
}
/**  데이터 출력 함수 ***/
void Output(int* arr)
{
	int len = Endlen(arr);
	for (int i = 0; i < len; i++)
		printf("%d ", arr[i]);
	printf("\n");

}

/**  데이터 삽입 함수 ***/
void Insert(int* arr, int data)
{
	int len = Endlen(arr);
	if (len > 99) {
		printf("저장 가능한 공간이 없습니다.\n");
		return;
	}
	arr[len] = data;
}


/**  데이터 조회 함수 ***/
int Search(int* arr, int target)
{
	int len = Endlen(arr);
	int i = 0;
	while (i < len) {
		if (arr[i] == target) {
			printf("%d에서 %d 발견\n", i, target);
			return;
		} else {
			i++;
		}
	}
	printf("조회 결과가 없습니다.\n");
	return;
}

/**  데이터 중복 조회 함수 ***/
void DSearch(int* arr, int target)
{
	int len = Endlen(arr);
	int i = 0;
	while (i < len) {
		if (arr[i] == target) {
			printf("%d에서 %d 발견\n", i, target);
			i++;
		} else {
			i++;
		}
	}
}

/**  데이터 삭제 함수 ***/
int Remove(int* arr, int target)
{
	int len = Endlen(arr);
	int i = 0;
	while (i < len) {
		if (arr[i] == target) {
			printf("%d 삭제\n", target);
			arr[i] = 0;
			for (i; i < len-1; i++) {
				arr[i] = arr[i + 1];
			}
			return;
		} else {
			i++;
		}
	}
	printf("찾는 값 없음 \n");
	return;

}

void main() {
	/*** 데이터 저장 배열 정의***/
	int Array[100] = { 0 };
	int n1 = 0;
	int rm = 0;

	/*** 5개의 데이터 저장 ***/
	Insert(Array, 11); 	Insert(Array, 11);
	Insert(Array, 22); 	Insert(Array, 22);
	Insert(Array, 33);

	/*** 저장된 데이터  출력 ***/
	Output(Array);

	/*** 저장된 데이터  조회 ***/
	printf("조회값 입력 : ");
	scanf_s("%d", &n1);
	Search(Array, n1);

	/*** 중복 데이터  조회 ***/
	DSearch(Array, n1);
	printf("\n");

	/*** 데이터  삭제 ***/
	printf("삭제값 입력 : ");
	scanf_s("%d", &rm);
	Remove(Array, rm);
	Output(Array);
}