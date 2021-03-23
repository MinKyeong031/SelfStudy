#include <stdio.h>
#include <stdlib.h>

#define TRUE	1
#define FALSE	0

//데이터 구조체 노드 설정
struct node
{
	int data;
	struct Node* next;
};
typedef struct node Node;

// TopPointer 구조체 지정
struct TopPointer
{
	Node* head;
};
typedef struct TopPointer TP;

// 링크 초기화 함수
void StackInit(TP* pstack)
{
	pstack->head = NULL;
}

// 링크 Null 확인 함수
int SIsEmpty(TP* pstack)
{
	if (pstack->head == NULL)
		return TRUE;
	else
		return FALSE;
}

// 마지막(Top) 데이터 확인 함수
int SPeek(TP* pstack)
{
	if (SIsEmpty(pstack)) {
		printf("Stack Memory Error!");
		exit(-1);
	}

	return pstack->head->data;
}


void SPush(TP* pstack, int data)
{
	Node* new = malloc(sizeof(Node));
	if (new == NULL) {
		printf("오버플로우, 저장 공간 없음\n");
		exit(1);
	}
	new->data = data;
	new->next = NULL;
	if (pstack->head != NULL) {
		new->next = pstack->head;
	}
	pstack->head = new;
}

int SPop(TP* pstack)
{
	int data;
	Node* temp = pstack->head;
	if (pstack->head == NULL) {
		printf("언더플로우, 삭제 가능한 값 없음\n");
		exit(1);
	} 
	data = temp->data; 
	pstack->head = temp->next;
	free(temp);
	return data;
}



int main(void)
{
	// Stack의 생성 및 초기화 ///////
	Node stack;
	StackInit(&stack);

	// 데이터 넣기 ///////
	SPush(&stack, 1);  SPush(&stack, 2);
	SPush(&stack, 3);  SPush(&stack, 4);
	SPush(&stack, 5);

	// 마지막 데이터 확인 ///////
	printf("TOP Data : %d\n", SPeek(&stack));
	printf("\n");

	// 데이터 꺼내기 ///////
	while (!SIsEmpty(&stack))
		printf("Pop Data : %d\n", SPop(&stack));

	return 0;
}