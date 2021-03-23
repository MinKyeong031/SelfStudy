#include <stdio.h>
#include <stdlib.h>
#include <time.h>

typedef struct treeNode
{
	char key;			// 데이터 필드
	struct treeNode* left;	// 왼쪽 서브 트리 링크 필드
	struct treeNode* right;	// 오른쪽 서브 트리 링크 필드
} treeNode;

treeNode* root = NULL;

// 이진 탐색 트리에서 키값이 x인 노드의 위치를 탐색하는 연산
treeNode* search(char x)
{
	treeNode* cur = root;
	treeNode* parent = NULL;
	while (cur != NULL) {
		parent = cur;
		if (x < cur->key) {
			cur = cur->left;
		}
		else if (x == cur->key) {
			return cur;
		}
		else {
			cur = cur->right;
		}
	}
	printf("찾는 키 없음\n");
	return cur;
}

// 포인터 p가 가리키는 노드와 비교하여 노드 x를 삽입하는 연산
void insertNode(char x)
{
	treeNode* cur = root;
	treeNode* parent = NULL;
	while (cur != NULL) {
		parent = cur;
		if (x < cur->key) {
			cur = cur->left;
		}
		else if (x == cur->key) {
			printf("이미 존재하는 값\n");
			return;
		}
		else {
			cur = cur->right;
		}
	}
	treeNode* new = malloc(sizeof(treeNode));
	if (new == NULL) {
		printf("저장 공간 없음\n");
		exit(1);
	}
	new->key = x;
	new->left = NULL;
	new->right = NULL;

	if (parent == NULL)	{//비어있을 때
		root = new;
	} else {
		if (x < parent->key) {
			parent->left = new;
		} else {
			parent->right = new;
		}
	}
}

// 루트 노드부터 탐색하여 키값과 같은 노드를 찾아 삭제하는 연산
void deleteNode(char key)
{
	treeNode* cur = root;
	treeNode* parent = NULL;
	treeNode* child = NULL;
	treeNode* s = NULL;
	treeNode* sp = NULL;
	if (search(key) == NULL) {
		return;
	}
	if (cur == NULL) {
		printf("비어있는 노드\n");
		return;
	}
	while (cur->key != key) {
		parent = cur;
		if (key < cur->key) {
			cur = cur->left;
		} else {
			cur = cur->right;
		}
	}

	//삭제노드의 자식 노드가 없는경우
	if (cur->left == NULL && cur->right == NULL) {
		if (parent != NULL) {
			if (parent->key > cur->key) {
				parent->left = NULL;
			}
			else {
				parent->right = NULL;
			}
		} else {
			root = NULL;
		}
		free(cur);
	} else if (cur->left == NULL || cur->right == NULL) {//삭제노드의 자식 노드가 1개 인경우
		if (cur->left != NULL) {
			child = cur->left;
		} else {
			child = cur->right;
		}
		if (parent != NULL) {
			if (parent->left == cur) {
				parent->left = child;
			} else {
				parent->right = child;
			}
		} else {
			root = child;
		}
		free(cur);
	} else {//삭제노드의 자식 노드가 2개 인경우
		sp = cur;
		s = cur->left;
		while (s->right != NULL) {
			sp = s;
			s = s->right;
		}
		if (sp->left == s) {//right로 이동 없을 시
			sp->left = s->left;
		} else {
			sp->right = s->left;
		}
		cur->key = s->key;
		free(s);
	}
}

// 이진 탐색 트리를 중위 순회하면서 출력하는 연산
void displayInorder(treeNode* cur) {
	if (cur) {
		displayInorder(cur->left);
		printf("%c_", cur->key);
		displayInorder(cur->right);
	}
}

void menu() {
	printf("\n*---------------------------*");
	printf("\n\t1 : 트리 출력");
	printf("\n\t2 : 문자 삽입");
	printf("\n\t3 : 문자 삭제");
	printf("\n\t4 : 문자 검색");
	printf("\n\t5 : 종료");
	printf("\n*---------------------------*");
	printf("\n메뉴입력 >> ");
}

int main() {
	treeNode* foundedNode = NULL;
	char choice, key;

	// [그림 7-38]과 같은 초기 이진 탐색 트리를 구성하고
	// 노드 G를 루트 노드 포인터 root로 지정
	insertNode('G');
	insertNode('I');
	insertNode('H');
	insertNode('C');
	insertNode('B');
	insertNode('M');
	insertNode('N');
	insertNode('A');
	insertNode('J');
	insertNode('E');
	insertNode('D');
	insertNode('Q');

	while (1) {
		menu();
		fflush(stdout);
		scanf_s(" %c", &choice, sizeof(choice));

		switch (choice - '0') {
		case 1:
			//			printf("\t[이진 트리 출력]  ");
			displayInorder(root);  printf("\n");
			break;

		case 2:
			printf("삽입할 문자를 입력하세요 : ");
			fflush(stdout);
			scanf_s(" %c", &key, sizeof(key));
			insertNode(key);
			displayInorder(root);  printf("\n");
			break;

		case 3:
			printf("삭제할 문자를 입력하세요 : ");
			fflush(stdout);
			scanf_s(" %c", &key, sizeof(key));
			deleteNode(key);
			displayInorder(root);  printf("\n");
			break;

		case 4:
			printf("찾을 문자를 입력하세요 : ");
			fflush(stdout);
			scanf_s(" %c", &key, sizeof(key));
			foundedNode = search(key);
			if (foundedNode != NULL)
				printf("\n %c를 찾았습니다! \n", foundedNode->key);
			else
				printf("\n 문자를 찾지 못했습니다. \n");
			break;

		case 5:
			return 0;

		default:
			printf("없는 메뉴입니다. 메뉴를 다시 선택하세요! \n");
			break;
		}
	}
	return 0;
}