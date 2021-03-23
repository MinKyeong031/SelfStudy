#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(void)
{
    while (1) {

        int choice;
        printf("1. 출력 2. 종료 --> 선택 : ");
        scanf_s("%d", &choice);
        printf("===============================================================================\n");

        if (choice == 1) {
            int i, j = 0;
            int com[3] = { 0 };
            int mine[3] = { 0 };
            int strike = 0;
            int ball = 0;
            int game = 0;
            int end = 0;


            while (com[0] == com[1] || com[0] == com[2] || com[1] == com[2])
            {
                srand((int)time(NULL));

                for (i = 0; i < 3; i++)
                {
                    com[i] = (rand() % 9) + 1;
                }
            }

            while (end == 0)
            {
                printf("서로다른 숫자 0~9까지 세개를 입력해주세요.\n");
                for (i = 0; i < 3; i++)
                {
                    scanf_s("%d", &mine[i]);
                }

                if (mine[0] == mine[1] || mine[0] == mine[2] || mine[1] == mine[2])
                {
                    printf("입력한 숫자가 중복되었습니다.게임을 다시시작해주세요.\n");
                    break;
                }

                for (i = 0; i < 3; i++)
                {
                    if (com[i] == mine[i])
                    {
                        strike = strike + 1;
                    }
                }

                for (i = 0; i < 3; i++)
                {
                    for (j = 0; j < 3; j++)
                    {
                        if (com[i] == mine[j])
                        {
                            ball = ball + 1;
                            break;
                        }
                    }

                }

                game++;
                printf("%d번째 게임 : %d strike %d ball\n", game, strike, ball - strike);

                if (strike == 3)
                {
                    end = 1;
                }
                strike = 0;
                ball = 0;
            }
            printf("===============================================================================\n");
        } else if (choice == 2) {
            exit(0);
        } else {
            printf("잘못입력\n");
        }

        
    }
    return 0;
}