#include <stdio.h>
#include <stdlib.h>

typedef struct _node
{
	int data;
	struct _node* next;
}Node;

typedef struct CList
{
	Node* tail;		// 꼬리 위치 포인터
	int NodeCnt;		// 데이터 개수 확인
}List;


//초기화함수
void ListInit(List* plist)
{
	plist->tail = NULL;		// 꼬리포인터 초기화
	plist->NodeCnt = 0;	// 데이터 개수 초기화
}

//처음에 삽입
void LInsertFront(List* plist, int data)
{
	//동적할당  + 값삽입 
	Node* new = malloc(sizeof(Node));
	if (new == NULL) {
		printf("저장 공간 없음.\n");
		return;
	}
	new->data = data;	
	//노드가 하나도 없을때
	if (plist->tail == NULL) {
		plist->tail = new;
		new->next = new;
	} else {//노드가 하나이상 있을때
		new->next = plist->tail->next;
		plist->tail->next = new;
	}
	//데이터 개수 증가
	plist->NodeCnt++;
}

//마지막에 삽입
void LInsert(List* plist, int data)
{
	Node* new = malloc(sizeof(Node));
	if (new == NULL) {
		printf("저장 공간 없음.\n");
		return;
	}
	new->data = data;
	if (plist->tail == NULL) {
		plist->tail = new;
		new->next = new;
	} else {
		new->next = plist->tail->next;
		plist->tail->next = new;
		plist->tail = new;
	}
	plist->NodeCnt++;
}


//조회 함수
Node* SearchNode(List* plist, int target)
{
	if (plist->tail == NULL) {
		return NULL;
	}
	Node* cur = plist->tail->next;
	for (int i = 0; i <= plist->NodeCnt; i++) {
		if (cur->data == target) {
			return cur;
		} else {
			cur = cur->next;
		}
	}
	return NULL;
}

//삭제 함수
int LRemove(List* plist, int target)
{
	if (plist->tail == NULL) {
		return NULL;
	}
	Node* cur = SearchNode(plist, target);
	Node* pre = plist->tail->next;

	while (pre->next != cur)
	{
		pre = pre->next;
	}
	pre->next = cur->next;
	if (cur == plist->tail) {
		plist->tail = pre;
	}
	free(cur);
}

int main(void)
{
	// 원형 연결 리스트의 생성 및 초기화 ///////
	List list;
	int data, i, nodeNum;
	ListInit(&list);
	int num;

	// 리스트에 5개의 데이터를 저장 /////// 
	LInsert(&list, 3);
	LInsert(&list, 4);
	LInsert(&list, 5);
	LInsertFront(&list, 2);
	LInsertFront(&list, 1);

	// 저장된 리스트 확인///////
	Node* head = list.tail->next;
	Node* tail = list.tail;
	for (int i = 0; head != tail; head = head->next)
		printf("%d ", head->data);
	printf("%d", head->data);

	//저장된 데이터 조회///////

	printf("\n값 입력 : ");
	scanf_s("%d", &num);
	Node* cur = SearchNode(&list, num);
	if (cur == NULL)
		printf("입력한 값과 일치하는 데이터는 없습니다\n");
	else
		printf("입력한 값 %d 가 존재합니다\n", cur->data);


	//데이터 삭제///////
	printf("\n삭제 값 입력:");
	scanf_s("%d", &num);
	LRemove(&list, num);


	// 저장된 리스트 확인///////
	head = list.tail->next;
	tail = list.tail;
	for (int i = 0; head != tail; head = head->next)
		printf("%d ", head->data);
	printf("%d", head->data);
}