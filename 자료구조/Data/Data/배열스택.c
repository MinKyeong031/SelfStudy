#include <stdio.h>
#include <stdlib.h>
#define TRUE	1
#define FALSE	0

//구조체 정의
typedef struct _arrayStack
{
	int stackArr[100];
	int topIndex;
} ArrayStack;
typedef ArrayStack Stack;

//초기화 함수 
void StackInit(Stack* pstack)
{
	pstack->topIndex = -1;
}

//스택 공백 여부 확인 함수 
int SIsEmpty(Stack* pstack)
{
	if (pstack->topIndex == -1)
		return TRUE;
	else
		return FALSE;
}

//스택에 값저장 PUSH 함수
void SPush(Stack* pstack, int data)
{
	if (pstack->topIndex == 100) {
		printf("오버플로우, 저장 공간 없음\n");
		exit(1);
	}
	// topIndex 카운트 
	pstack->topIndex++;
	// stackArr 에 데이터 추가
	pstack->stackArr[pstack->topIndex] = data;
}

//스택에 마지막 Data제거 POP 함수 
int SPop(Stack* pstack)
{
	if (pstack->topIndex == -1) {
		printf("언더플로우, 삭제 가능한 값 없음\n");
		return;
	}
	pstack->topIndex--;
	return pstack->stackArr[pstack->topIndex+1];
}
//스택의 마지막 Data조회 PEEK 함수 
int SPeek(Stack* pstack)
{
	if (pstack->topIndex == 0)
	{
		printf("stack Memory Error!");
		exit(-1);
	}

	return pstack->stackArr[pstack->topIndex];
}

int main(void)
{
	// Stack의 생성 및 초기화 ///////
	Stack stack;
	StackInit(&stack);

	// 데이터 넣기 ///////
	int n1 = 0;

	for (int i = 1; i < 6; i++)
	{
		printf("입력 값 : ");
		scanf_s("%d", &n1);
		SPush(&stack, n1);
	}
	printf("\n");

	//마지막 데이터 확인//////
	printf("TOP Data : %d\n", SPeek(&stack));
	printf("\n");

	//데이터 POP 확인//////
	printf("삭제 값 확인 : %d\n", SPop(&stack));
	printf("삭제 값 확인 : %d\n", SPop(&stack));
	printf("\n");

	//마지막 데이터 확인//////
	printf("TOP Data : %d\n", SPeek(&stack));

	return 0;
}
