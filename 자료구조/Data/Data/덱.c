#include <stdio.h>
#include <stdlib.h>

//데이터 구조체
typedef struct _node
{
	int data;
	struct _node* next;
	struct _node* prev;
} Node;

//데이터 구조체를 가리키는 포인터 구조체 
typedef struct _dlDeque
{
	Node* head;
	Node* tail;
} DLDeque;
typedef DLDeque Deque;

//포인터 구조체 초기화
void DequeInit(Deque* pdeq)
{
	pdeq->head = NULL;
	pdeq->tail = NULL;
}

//텅빈상태 확인 함수
int DQIsEmpty(Deque* pdeq)
{
	if (pdeq->head == NULL)
		return 1;
	else
		return 0;
}

// 첫노드에 삽입
void DQAddFirst(Deque* pdeq, int data)
{
	//동적할당 + 데이터삽입 + 링크주소 NULL초기화
	Node* new = malloc(sizeof(Node));
	if (new == NULL) {
		printf("저장 공간 없음.\n");
		exit(1);
	}
	new->data = data;
	new->next = NULL;
	new->prev = NULL;

	//노드 하나도 없을 경우
	if (pdeq->head == NULL) {
		pdeq->head = new;
		pdeq->tail = new;
	} else {//노드가 하나이상 있을때
		new->next = pdeq->head;
		pdeq->head->prev = new;
		pdeq->head = new;
	}
	Node* cur = pdeq->head;
	while (cur->next != NULL) {
		cur = cur->next;
	}
	pdeq->tail = cur;
}

//마지막 노드에 삽입
void DQAddLast(Deque* pdeq, int data)
{
	//동적할당 + 데이터삽입 + 링크주소 NULL초기화
	Node* new = malloc(sizeof(Node));
	if (new == NULL) {
		printf("저장 공간 없음.\n");
		exit(1);
	}
	new->data = data;
	new->next = NULL;
	new->prev = NULL;
	//노드 하나도 없을 경우
	if (pdeq->tail == NULL) {
		pdeq->head = new;
		pdeq->tail = new;
	} else {//노드 하나이상 있을 경우
		pdeq->tail->next = new;
		new->prev = pdeq->tail;
		pdeq->tail = new;
	}
	Node* cur = pdeq->head;
	while (cur->next != NULL) {
		cur = cur->next;
	}
	pdeq->tail = cur;
}


//첫번째 노드 삭제
int DQRemoveFirst(Deque* pdeq)
{
	if (DQIsEmpty(pdeq)) {
		printf("삭제할 값 없음\n");
		exit(1);
	}
	Node* temp = pdeq->head;
	int rdata = temp->data;
	if (pdeq->head->next == NULL) {
		pdeq->head = NULL;
		pdeq->tail = NULL;
	} else {
		pdeq->head = pdeq->head->next;
		pdeq->head->prev= NULL;
	}
	free(temp);
	return rdata;
}


//마지막 노드 삭제
int DQRemoveLast(Deque* pdeq)
{
	if (DQIsEmpty(pdeq)) {
		printf("삭제할 값 없음\n");
		exit(1);
	}
	Node* temp = pdeq->tail;
	int rdata = pdeq->tail->data;
	if (pdeq->tail->prev == NULL) {
		pdeq->head = NULL;
		pdeq->tail = NULL;
	} else {
		pdeq->tail = pdeq->tail->prev;
		pdeq->tail->next = NULL;
	}
	free(temp);
	return rdata;
}


//첫번째 노드 값 리턴
int DQGetFirst(Deque* pdeq)
{
	if (DQIsEmpty(pdeq))
	{
		printf("Deque Memory Error!");
		exit(-1);
	}

	return pdeq->head->data;
}

//마지막 노드 값 리턴
int DQGetLast(Deque* pdeq)
{
	if (DQIsEmpty(pdeq))
	{
		printf("Deque Memory Error!");
		exit(-1);
	}

	return pdeq->tail->data;
}

int main(void)
{
	// Deque의 생성 및 초기화 ///////
	Deque deq;
	DequeInit(&deq);

	// 데이터 넣기 1차 ///////
	DQAddFirst(&deq, 3);
	DQAddFirst(&deq, 2);
	DQAddFirst(&deq, 1);

	DQAddLast(&deq, 4);
	DQAddLast(&deq, 5);
	DQAddLast(&deq, 6);


	// 전체 데이터 확인 //
	Node* Front = deq.head;
	Node* End = deq.tail;
	printf("전체 저장 데이터 출력 : ");
	while (Front!=NULL)
	{
		printf("%d ", Front->data);
		if (Front != End)
			Front = Front->next;
		else
			break;
	}
	printf("\n");


	// 앞에서 데이터 꺼내기 ///////
	printf("앞에서부터 데이터 꺼내기 : ");
	while (!DQIsEmpty(&deq))
		printf("%d ", DQRemoveFirst(&deq));

	printf("\n");


	// 데이터 넣기 2차 ///////
	DQAddFirst(&deq, 3);
	DQAddFirst(&deq, 2);
	DQAddFirst(&deq, 1);

	DQAddLast(&deq, 4);
	DQAddLast(&deq, 5);
	DQAddLast(&deq, 6);

	// 전체 데이터 확인 //
	Front = deq.head;
	End = deq.tail;
	printf("전체 저장 데이터 출력 : ");
	while (Front != End)
	{
		printf("%d ", Front->data);
		Front = Front->next;
	}

	printf("\n");



	// 끝에서 데이터 꺼내기 ///////
	printf("끝에서부터 데이터 꺼내기 : ");
	while (!DQIsEmpty(&deq))
		printf("%d ", DQRemoveLast(&deq));

	return 0;
}