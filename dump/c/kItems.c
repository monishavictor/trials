#include <stdio.h>
#include<stdlib.h>
int main()
{
    int N, k;
    int *A;
    scanf("%d %d",&N,&k);
    A = (int*)malloc(sizeof(int)*N);
    int evenCount = 0;
    for(int i = 0; i < A; i++) {
        scanf("%d", &A[i]);
        if(A[i]%2 == 0) {
            evenCount++;
        }
    }
    printf("%d\n", evenCount);
}

