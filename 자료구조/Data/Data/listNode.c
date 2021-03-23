#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// 단순 연결 리스트의 노드 구조를 구조체로 정의
typedef struct ListNode {
	char data[10];
	struct ListNode* link;
} listNode;

// 리스트의 시작
listNode* L;	//전역변수

// 연결 리스트의 전체 메모리를 해제하는 연산
void freeLinkedList() {
	listNode* p;
	listNode* cur = L;

	while (cur != NULL) {
		p = cur;
		cur = cur->link;
		free(p);
	}

	L = NULL;
}

// 연결 리스트를 순서대로 출력하는 연산
void printList() {
	listNode* cur = L;

	printf("L = (");
	while (cur != NULL) {
		printf("%s", cur->data);
		cur = cur->link;
		if (cur != NULL)
			printf(", ");
	}
	printf(") \n");
}

// 첫 번째 노드로 삽입하는 연산
void insertFirstNode(char* x) {
	struct ListNode* new = malloc(sizeof(struct ListNode));
	if (new == NULL) {
			printf("저장 공간 없습니다.\n");
			exit(1);
	}
	strncpy_s(new->data, sizeof(new->data), x, sizeof(new->data));
	new->link = NULL;
	if (L== NULL) {
		L = new;
	} else {
		new->link = L;
		L = new;
	}
}

// 마지막 노드로 삽입하는 연산
void insertLastNode(char* x) {
	struct ListNode* cur;
	struct ListNode* new = malloc(sizeof(struct ListNode));
	if (new == NULL) {
		printf("저장 공간 없습니다.\n");
		exit(1);
	}
	strncpy_s(new->data, sizeof(new->data), x, sizeof(new->data));
	new->link = NULL;
	if (L == NULL) {
		L = new;
	} else {
		cur = L;
		while (cur->link != NULL) {
			cur = cur->link;
		}
		cur->link = new;
	}
}

// 리스트에서 x 노드를 탐색하는 연산
listNode* searchNode(char* x) {
	struct ListNode* cur;
	cur = L;
	while (cur != NULL)
	{
		if (strcmp(cur->data, x) == 0) {
			return cur;
		} else {
			cur = cur->link;
		}
	}
	return cur;
}

// 노드를 pre 뒤에 삽입하는 연산
void insertMiddleNode(listNode* pre, char* x) {
	struct ListNode* new = malloc(sizeof(struct ListNode));
	if (new == NULL) {
		printf("저장 공간 없습니다.\n");
		exit(1);
	}
	strncpy_s(new->data, sizeof(new->data), x, sizeof(new->data));
	new->link = NULL;
	if (L == NULL) {
		L = new;
	} else if (pre == NULL) {
		new->link = L;
		L = new;
	} else {
		new->link = pre->link;
		pre->link = new;
	}
}

// 리스트에서 노드 p를 삭제하는 연산
void deleteNode(listNode* p) {
	listNode* pre;
	pre = L;
	if (p == NULL)
		return;
	if (p == pre)
	{
		L = L->link;
		return;
	}
	while (pre->link != p)
	{
		pre = pre->link;
	}
	pre->link = p->link;
	free(p);
}	

int main() {
	listNode* p;
	L = NULL;               //공백 리스트 생성
	printf("(1) 리스트에 [월],[수],[일] 노드 삽입하기! \n");
	insertLastNode("월");
	insertLastNode("수");
	insertLastNode("일");
	printList();

	printf("(2) 리스트에서 [목] 노드 탐색하기! \n");
	p = searchNode("목");
	if (p == NULL)
		printf("찾는 데이터가 없습니다.\n");
	else
		printf("[%s]를 찾았습니다.\n", p->data);
	printf("(3) 리스트에서 [수] 노드 탐색하기!\n");
	p = searchNode("수");
	if (p == NULL)
		printf("찾는 데이터가 없습니다.\n");
	else
		printf("[%s]를 찾았습니다.\n", p->data);

	printf("(4) 리스트의 [수] 뒤에 [금] 노드 삽입하기!\n");
	insertMiddleNode(p, "금");
	printList();

	printf("(5) 리스트에서 [일]노드 삭제하기!\n");
	p = searchNode("일");		// 삭제할 노드 위치 p를 찾음
	deleteNode(p);			// 포인터 p 노드 삭제
	printList();

	printf("(6) 리스트에서 [월]노드 삭제하기!\n");
	p = searchNode("월");
	deleteNode(p);
	printList();

	freeLinkedList();               //리스트 메모리 해제
	return 0;
}
