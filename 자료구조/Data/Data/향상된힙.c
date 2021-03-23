#include <stdio.h>

#define TRUE	1
#define FALSE	0

/*** Heap의 정의 ****/
#define HEAP_LEN	100

typedef char HData;

// d1의 우선순위가 높다면 0보다 큰 값
// d2의 우선순위가 높다면 0보다 작은 값
// d1과 d2의 우선순위가 같다면 0을 반환
typedef int PriorityComp(HData d1, HData d2);

typedef struct _heap
{
	PriorityComp* comp;
	int numOfData;
	HData heapArr[HEAP_LEN];
} Heap;

void HeapInit(Heap* ph, PriorityComp pc)
{
	ph->numOfData = 0;
	ph->comp = pc;
}

int HIsEmpty(Heap* ph)
{
	if (ph->numOfData == 0)
		return TRUE;
	else
		return FALSE;
}

int GetParentIDX(int idx)
{
	return idx / 2;
}

int GetLChildIDX(int idx)
{
	return idx * 2;
}

int GetRChildIDX(int idx)
{
	return GetLChildIDX(idx) + 1;
}


void HInsert(Heap* ph, HData data)
{
	int idx = ph->numOfData + 1;

	while (idx != 1)
	{
		//	if(pr < (ph->heapArr[GetParentIDX(idx)].pr))
		if (ph->comp(data, ph->heapArr[GetParentIDX(idx)]) > 0)
		{
			ph->heapArr[idx] = ph->heapArr[GetParentIDX(idx)];
			idx = GetParentIDX(idx);
		}
		else
		{
			break;
		}
	}

	ph->heapArr[idx] = data;
	ph->numOfData += 1;
}

int GetHiPriChildIDX(Heap* ph, int idx)
{
	if (GetLChildIDX(idx) > ph->numOfData)
		return 0;

	else if (GetLChildIDX(idx) == ph->numOfData)
		return GetLChildIDX(idx);

	else
	{
		//	if(ph->heapArr[GetLChildIDX(idx)].pr > ph->heapArr[GetRChildIDX(idx)].pr)
		if (ph->comp(ph->heapArr[GetLChildIDX(idx)], ph->heapArr[GetRChildIDX(idx)]) < 0)
			return GetRChildIDX(idx);
		else
			return GetLChildIDX(idx);
	}
}



HData HDelete(Heap* ph)
{
	HData retData = ph->heapArr[1];
	HData lastElem = ph->heapArr[ph->numOfData];

	int parentIdx = 1;
	int childIdx;

	while (childIdx = GetHiPriChildIDX(ph, parentIdx))
	{
		//	if(lastElem.pr <= ph->heapArr[childIdx].pr)
		if (ph->comp(lastElem, ph->heapArr[childIdx]) >= 0)
			break;

		ph->heapArr[parentIdx] = ph->heapArr[childIdx];
		parentIdx = childIdx;
	}

	ph->heapArr[parentIdx] = lastElem;
	ph->numOfData -= 1;
	return retData;
}

int DataPriorityComp(char ch1, char ch2)
{
	return ch2 - ch1;
	//	return ch1-ch2;
}

int main(void)
{
	Heap heap;
	HeapInit(&heap, DataPriorityComp);

	//삽입
	HInsert(&heap, 'F');
	HInsert(&heap, 'G');
	HInsert(&heap, 'H');
	HInsert(&heap, 'A');
	HInsert(&heap, 'B');
	HInsert(&heap, 'C');

	//전체 조회
	Heap* total = &heap;
	printf("전체 데이터 출력:");
	for (int i = 1; i <= heap.numOfData; i++)
	{
		printf("%c ", total->heapArr[i]);
	}
	printf("\n");

	//삭제
	printf("삭제되는 데이터 순서 출력 : ");
	while (!HIsEmpty(&heap))
		printf("%c ", HDelete(&heap));

	printf("\n");
	return 0;
}
