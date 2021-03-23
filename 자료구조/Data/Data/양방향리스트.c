#include <stdio.h>
#include <stdlib.h>

//구조체 노드

typedef struct _node
{
	int data;
	struct _node* next;		// 다음 노드를 가리키는 구조체 포인터
	struct _node* prev;     // 이전 노드를 가리키는 구조체 포인터	
} Node;

//포인터 노드

typedef struct _dbLinkedList
{
	Node* head;				// 처음 노드를 가리키는 구조체 포인터
	Node* tail;				// 마지막 노드를 가리키는 구조체 포인터
	int numOfData;			// 현재 데이터의 개수 카운트 변수
} DBLinkedList;

typedef DBLinkedList List;

//초기화 함수

void ListInit(List* plist)
{
	plist->head = NULL;
	plist->tail = NULL;
	plist->numOfData = 0;
}

//처음에 삽입 함수

void LInsertFirst(List* plist, int data)
{
	//동적할당 + NULL 체크 + 데이터 삽입
	Node* new = malloc(sizeof(Node));
	if (new == NULL) {
		printf("저장 공간 없음.\n");
		exit(1);
	}
	new->data = data;
	new->next = NULL;
	new->prev = NULL;
	//노드가 하나도 없을때	
	if (plist->head == NULL) {
		plist->head = new;
	} else {//노드가 하나이상 있을때
		new->next = plist->head;
		plist->head->prev = new;
		plist->head = new;
	}
	printf("처음에 %d 삽입\n", plist->head->data);
	Node* cur = plist->head;
	while (cur->next != NULL) {
		cur = cur->next;
	}
	plist->tail = cur;
	//노드 카운트 증가
	plist->numOfData++;
}


//마지막에 삽입 함수
void LInsertLast(List* plist, int data)
{
	Node* new = malloc(sizeof(Node));
	if (new == NULL) {
		printf("저장 공간 없음.\n");
		exit(1);
	}
	new->data = data;
	new->next = NULL;
	new->prev = NULL;
	if (plist->head == NULL) {
		plist->head = new;
	}
	else {
		new->prev = plist->tail;
		plist->tail->next = new;
		plist->tail = new;
	}
	printf("마지막에 %d 삽입\n", plist->tail->data);
	Node* cur = plist->head;
	while (cur->next != NULL) {
		cur = cur->next;
	}
	plist->tail = cur;
	plist->numOfData++;
}


// 처음부터 조회 
int FindFirst(List* plist, int data)
{
	Node* cur = plist->head;
	if (plist->head == NULL) {
		return NULL;
	}
	for (int i = 0; i < plist->numOfData; i++) {
		if (cur->data == data) {
			return cur;
		} else {
			cur = cur->next;
		}
	}
	return NULL;
}

// 끝에서부터 조회
int FindLast(List* plist, int data)
{
	Node* cur = plist->tail;
	if (plist->head == NULL) {
		return NULL;
	}
	for (int i = 0; i < plist->numOfData; i++) {
		if (cur->data == data) {
			return cur;
		}
		else {
			cur = cur->prev;
		}
	}
	return NULL;
}


// 중간 노드 삽입
void LInsertMiddle(List* plist, Node* cur, int data)
{
	//동적할당 + 값초기화
	Node* new = malloc(sizeof(Node));
	if (new == NULL) {
		printf("저장 공간 없음.\n");
		exit(1);
	}
	new->data = data;
	new->next = NULL;
	new->prev = NULL;
	//중간노드인 경우+처음노드인경우
	if (cur->next != NULL && cur->prev != NULL) {
		cur->next->prev = new;
		new->next = cur->next;
		cur->next = new;
		new->prev = cur;
		plist->tail = new;
	} else if (cur->next == NULL) {//마지막노드인경우
		cur->next = new;
		new->prev = cur;
	}

	plist->numOfData++;

}


//삭제함수
int LRemove(List* plist, int data)
{
	Node* del = FindFirst(plist, data);
	if (del == NULL) {
		printf("데이터가 없습니다\n");
	} else if (del->prev == NULL) {//제일 앞에 있는경우
		del->next->prev = NULL;
		plist->head = del->next;
	} else if (del->next == NULL) {//끝에 있는경우
		del->prev->next = NULL;
		plist->tail = del->prev;
	} else {//중간인 경우
		del->prev->next = del->next;
		del->next->prev = del->prev;
	}
	free(del);
	plist->numOfData--;
}

// 데이터 개수 확인 
int LCount(List* plist)
{
	return plist->numOfData;
}

int main(void)
{
	// 양방향 연결 리스트의 생성 및 초기화  ///////
	List list;
	int data;
	ListInit(&list);

	// 8개의 데이터 저장  ///////
	printf("==========데이터 삽입============\n");
	LInsertFirst(&list, 4);  LInsertFirst(&list, 3);
	LInsertFirst(&list, 2);  LInsertFirst(&list, 1);
	LInsertLast(&list, 5);  LInsertLast(&list, 6);
	LInsertLast(&list, 7);  LInsertLast(&list, 8);
	printf("==========데이터 삽입(완료)============\n");

	// 저장된 전체 데이터의 조회  ///////
	printf("==========전체 데이터 조회============\n");
	Node* cur = list.head;
	printf("처음부터 출력 : ");
	for (int i = 0; i < list.numOfData; i++)
	{
		printf("%d ", cur->data);
		cur = cur->next;
	}
	printf("\n");
	cur = list.tail;
	printf("끝에서 부터 출력 : ");
	for (int i = 0; i < list.numOfData; i++)
	{
		printf("%d ", cur->data);
		cur = cur->prev;
	}
	printf("\n");

	// 노드 데이터 조회(정방향) //////
	printf("==========데이터 조회 (정방향)============\n");
	int num;
	printf("찾을 값 입력(정방향조회) : ");
	scanf_s("%d", &num);
	Node* search = FindFirst(&list, num);
	if (search)
	{
		printf("%d를 찾았습니다\n", search->data);
	}
	else
	{
		printf("데이터가 없습니다\n");
	}

	// 노드 데이터 조회(역방향) //////
	printf("==========데이터 조회 (역방향)============\n");
	printf("찾을 값 입력(역방향조회) : ");
	scanf_s("%d", &num);
	search = FindLast(&list, num);
	if (search)
	{
		printf("%d를 찾았습니다\n", search->data);
	}
	else
	{
		printf("데이터가 없습니다\n");
	}

	//중간노드 삽입

	printf("==========중간 노드 삽입============\n");
	printf("찾을 노드 값:");
	scanf_s("%d", &num);
	search = FindFirst(&list, num);
	if (search == NULL)
	{
		printf("해당 값이 노드에 존재하지 않습니다\n");
	}
	else
	{
		printf("삽입할 값 입력 :");
		scanf_s("%d", &num);
		LInsertMiddle(&list, search, num);
		printf("%d 뒤에 삽입 \n", search->data);
	}

	printf("");

	// 삭제 후 전체 데이터의 조회  ///////
	printf("==========중간 삽입 후 전체 조회============\n");
	cur = list.head;
	printf("처음부터 출력 : ");
	for (int i = 0; i < list.numOfData; i++)
	{
		printf("%d ", cur->data);
		cur = cur->next;
	}
	printf("\n");


	// 노드 삭제 ////
	printf("==========데이터 삭제============\n");
	printf("삭제할 값 입력 : ");
	scanf_s("%d", &num);
	LRemove(&list, num);


	// 삭제 후 전체 데이터의 조회  ///////
	printf("==========삭제 후 조회============\n");
	cur = list.head;
	printf("처음부터 출력 : ");
	for (int i = 0; i < list.numOfData; i++)
	{
		printf("%d ", cur->data);
		cur = cur->next;
	}
	printf("\n");

	return 0;
}