#include <stdio.h>
#include <stdlib.h>

void print(int N, int* policeStation, int safeHouse, int MGM, int M, int **routes) {
    printf("N::%d\nsafehouse::%d\nMGM::%d\n#Routes::%d\n", N, safeHouse, MGM, M);
    int i = 0, j = 0;
    for(i = 0; i < N; i++) {
        printf("%d\t", policeStation[i]);
    }
    printf("\n");
    for(i = 0; i < M; i++) {
        for(j = 0; j < 3; j++) {
            printf("%d\t", routes[i][j]);
        }
        printf("\n");
    }
}

int main()
{
    int T;
    scanf("%d",&T);
    int N, M, MGM, safeHouse, three;
    int *policeStation;
    int ** routes;
    while(T--) {
        scanf("%d",&N);
        policeStation = (int*)malloc(sizeof(int)*N);
        int i = 0;
        while(i < N) {
            scanf("%d", &policeStation[i]);
            i++;
        }
        scanf("%d",&MGM);
        scanf("%d",&safeHouse);
        scanf("%d", &M);
        scanf("%d", &three);
        i = 0;
        routes = (int**)malloc(sizeof(int*)*M);
        while(i < M) {
            routes[i++] = (int*)malloc(sizeof(int)*3);
        }
        i = 0;
        int j = 0;
        while(i < M) {
            j = 0;
            while(j < 3) {
                scanf("%d", &routes[i][j++]);
            }
            i++;
        }
        print(N, policeStation, safeHouse, MGM, M, routes);
    }
    return 0;
}


