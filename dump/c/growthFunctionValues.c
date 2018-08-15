#include <stdio.h>
#include <stdlib.h>

int baseConditions[4] = {1, 2, 5, 12};


long long int** multiply(long long int**A, long long int **B) {
    long long int **value;
    value = (long long int**)malloc(sizeof(long long int*)*4);
    for(int i = 0; i < 4; i++) {
        value[i] = (long long int*)malloc(sizeof(long long int)*4);
    }
    for(int i = 0; i < 4; i++) {
        for(int j = 0; j < 4; j++) {
            for(int k = 0; k < 4; k++) {
                value[i][j] += A[i][k] * B[k][j];
            }
        }
    }
    return value;
}

long long int** exponential(long long int** matrix, long long int N) {
    if(N == 1) {
        return matrix;
    }
    if( N%2) {
        return multiply(matrix, exponential(matrix, N-1));
    }
    long long int** by2 = exponential(matrix, N/2);
    return multiply(by2, by2);
}

long long int ** initializeT(long long int** T) {
    T[0][0] = 0; T[0][1] = 1; T[0][2] = 0; T[0][3] = 0;
    T[1][0] = 0; T[1][1] = 0; T[1][2] = 1; T[1][3] = 0;
    T[2][0] = 0; T[2][1] = 0; T[2][2] = 0; T[2][3] = 1;
    T[3][0] = 1; T[3][1] = 3; T[3][2] = 2; T[3][3] = 1;
    return T;

}

void printArray(long long int** T) {
        for(int i = 0; i < 4; i++) {
        for(int j = 0; j < 4; j++) {
            printf("%lld\t", T[i][j]);
        }
        printf("\n");
    }
}

long long int response(long long int N) {
    if(N >=1 && N <= 4) {
        return baseConditions[N-1];
    }
    long long int **finalMatrix, **T;
    finalMatrix = (long long int**)malloc(sizeof(long long int*)*4);
    T = (long long int**)malloc(sizeof(long long int*)*4);
    for(int i = 0; i < 4; i++) {
        finalMatrix[i] = (long long int*)malloc(sizeof(long long int)*4);
        T[i] = (long long int*)malloc(sizeof(long long int)*4);
    }
    T = initializeT(T);
    finalMatrix = exponential(T, N-1);
    

    for(int i = 0; i < 4; i++) {
        for(int j = 0; j < 4; j++) {
            printf("%lld\t", finalMatrix[i][j]);
        }
        printf("\n");
    }
    long long int** solArray;
    solArray = (long long int**)malloc(sizeof(long long int*)*4);
    for(int i = 0; i < 4; i++) {
        solArray[i] = (long long int*)malloc(sizeof(long long int));
    }

long long int** F;
F = (long long int**) malloc(sizeof(long long int*)*4);
for(int i =0; i < 4;i++) {
    F[i] = (long long int*)malloc(sizeof(long long int));
}
F[0][0] = 1; F[1][0] = 2; F[2][0] = 5; F[3][0] = 12;


    solArray = multiply(F, finalMatrix);
        for(int i = 0; i < 4; i++) {
            printf("%lld\n", solArray[i][0]);
    }
    return N;
}


int main()
{
    int T;
    long long int N;
    scanf("%d", &T);
    for(int i = 0; i < T; i++) {
        scanf("%lld", &N);
        response(N);
    }
}
