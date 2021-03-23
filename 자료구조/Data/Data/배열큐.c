#include <stdio.h>

// Queue 구조체 정의
struct Queue {
	int front;
	int rear;
	int Arr[100];
};
typedef struct Queue Que;

// 초기화 함수 
void Init(Que* pq)
{
	pq->front = 0;
	pq->rear = 0;

}

//Empty 확인 함수
int Empty(Que* pq)
{
	if (pq->front == pq->rear)
		return 1;
	else
		return 0;
}


// NextIndex 함수
int NextIdx(int idx)
{
	if (idx == 99)
		return 0;
	else
		return idx + 1;
}

// Queue Peek 함수 
void QPeek(Que* pq)
{
	if (pq->rear == pq->front)
	{
		printf("Queue Empty");
		exit(1);
	}
	return pq->Arr[NextIdx(pq->front)];

}

void Enq(Que* pq, int data)
{
	if (NextIdx(pq->rear) == pq->front) {
		printf("저장 공간 없음\n");
		exit(1);
	}
	pq->Arr[pq->rear] = data;
	pq->rear = NextIdx(pq->rear);
	
}

int Deq(Que* pq)
{
	if (Empty(pq)) {
		printf("삭제할 값 없음\n");
		exit(1);
	}
	int rdata= pq->Arr[pq->front];
	pq->front = NextIdx(pq->front);
	return rdata;
}


void main()
{
	// Queue의 생성 및 초기화 ///////
	Que q;
	Init(&q);

	// 데이터 넣기 ///////
	Enq(&q, 1);
	Enq(&q, 2);
	Enq(&q, 3);
	Enq(&q, 4);
	Enq(&q, 5);

	// 데이터 꺼내기 ///////
	while (!Empty(&q))
		printf("%d ", Deq(&q));

	return 0;

}