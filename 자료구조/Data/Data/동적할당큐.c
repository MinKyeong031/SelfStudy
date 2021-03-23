#include <stdio.h>

typedef struct _node
{
	int data;
	struct _node* next;
}Node;

typedef struct _lQueue
{
	Node* front;
	Node* rear;
} Queue;

void Init(Queue* pq)
{
	pq->front = NULL;
	pq->rear = NULL;
}

int Empty(Queue* pq)
{
	if (pq->front == NULL)
		return 1;
	else
		return 0;
}

void Enq(Queue* pq, int data)
{
	Node* new = malloc(sizeof(Node));
	if (new == NULL) {
		printf("저장 공간 없음\n");
		return;
	}
	new->data = data;
	new->next = NULL;
	if (Empty(pq)) {
		pq->front = new;
		pq->rear = new;
	} else {
		pq->rear->next = new;
		pq->rear = new;
	}
}

int Deq(Queue* pq)
{
	if (Empty(pq)) {
		printf("삭제할 값 없음\n");
		exit(1);
	}
	int rdata = pq->front->data;
	pq->front = pq->front->next;
	return rdata;
}

int QPeek(Queue* pq)
{
	if (Empty(pq))
	{
		printf("Queue Memory Error!");
		exit(1);
	}

	return pq->front->data;
}


int main(void)
{
	// Queue의 생성 및 초기화 ///////
	Queue q;
	Init(&q);

	// 데이터 넣기 ///////
	Enq(&q, 1);  Enq(&q, 2);
	Enq(&q, 3);  Enq(&q, 4);
	Enq(&q, 5);

	// 데이터 꺼내기 ///////
	while (!Empty(&q))
		printf("%d ", Deq(&q));

	return 0;
}