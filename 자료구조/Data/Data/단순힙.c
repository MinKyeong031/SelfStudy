#include <stdio.h>

#define TRUE	1
#define FALSE	0

#define HEAP_LEN	100

typedef char HData;
typedef int Priority;

//데이터 구조체(우선순위 포함) 
typedef struct _heapElem
{
	Priority pr;	// 값이 작을수록 높은 우선순위
	HData data;
} HeapElem;

//데이터 저장 구조체(배열)
typedef struct _heap
{
	int numOfData;
	HeapElem heapArr[HEAP_LEN];
} Heap;

//힙 초기화 
void HeapInit(Heap* ph)
{
	ph->numOfData = 0;
}

//텅빈상태 확인
int HIsEmpty(Heap* ph)
{
	if (ph->numOfData == 0)
		return TRUE;
	else
		return FALSE;
}

//부모노드 Idx 리턴
int GetParentIDX(int idx)
{
	return idx / 2;
}

//왼쪽 자식 노드 Idx리턴
int GetLChildIDX(int idx)
{
	return idx * 2;
}

//오른쪽 자식 노드 Idx 리턴
int GetRChildIDX(int idx)
{
	return GetLChildIDX(idx) + 1;
}

//힙에 데이터 삽입
void HInsert(Heap* ph, HData data, Priority pr)
{
	//마지막 idx 지정
	int idx = ph->numOfData + 1;
	//데이터 ,우선순위값 삽입
	HeapElem new = { pr, data };
	//삽입 위치 탐색
	while (idx != 1) {
		if (pr < (ph->heapArr[GetParentIDX(idx)].pr)) {
			ph->heapArr[idx] = ph->heapArr[GetParentIDX(idx)];
			idx = GetParentIDX(idx);
		} else {
			break;
		}
	}
	//삽입 위치에 데이터넣기
	ph->heapArr[idx] = new;
	//데이터 카운터 증가
	ph->numOfData++;
}

//두개의 자식 노드 중 높은 우선순위의 자식 노드 인덱스 값 반환
//삭제시 사용됨 
int GetHiPriChildIDX(Heap* ph, int idx)
{
	if (GetLChildIDX(idx) > ph->numOfData) {
		return 0;
	} else if (GetLChildIDX(idx) == ph->numOfData) {
		return GetLChildIDX(idx);
	} else {
		if (ph->heapArr[GetLChildIDX(idx)].pr > ph->heapArr[GetRChildIDX(idx)].pr) {
			return GetRChildIDX(idx);
		} else { 
			return GetLChildIDX(idx);
		}
	}
}


//힙에 데이터 삭제
HData HDelete(Heap* ph)
{
	HData retData = (ph->heapArr[1]).data;
	HeapElem lastElem = ph->heapArr[ph->numOfData];

	int parentIdx = 1;
	int childIdx;

	while (childIdx = GetHiPriChildIDX(ph, parentIdx)) {
		if (lastElem.pr <= ph->heapArr[childIdx].pr) {
			break;
		}
		ph->heapArr[parentIdx] = ph->heapArr[childIdx];
		parentIdx = childIdx;
	}
	ph->heapArr[parentIdx] = lastElem;
	ph->numOfData -= 1;
	return retData;
}

int main(void)
{
	Heap heap;
	HeapInit(&heap);

	//값 삽입 
	HInsert(&heap, 'A', 1);
	HInsert(&heap, 'B', 3);
	HInsert(&heap, 'C', 2);
	HInsert(&heap, 'D', 4);
	HInsert(&heap, 'E', 5);
	HInsert(&heap, 'F', 6);
	//전체 데이터 출력
	Heap* total = &heap;
	printf("전체 데이터 출력:");
	for (int i = 1; i <= heap.numOfData; i++)
	{
		printf("%c ", total->heapArr[i].data);
	}
	printf("\n");

	//값 삭제(우선순위별)
	printf("삭제 순서 : ");
	while (!HIsEmpty(&heap))
		printf("%c ", HDelete(&heap));

	return 0;
}

