#include<stdio.h>
#include<stdbool.h>
#include<malloc.h>

long long dimdomValue(int* A, int l, int r) {
    long long temp = 0;
    for(int i = l+1; i < r; i++) {
        temp += abs(A[i] - A[i-1]);
    }
    return temp;
}

long long solve (int* A, int K, int N) {
   // Write your code here
   long long value = 0;
   long long temp = 0;
   for(int i = 0; i < N - K + 1; i++) {
       temp = dimdomValue(A, i, i + K);
       value = (temp > value) ? temp : value;
   }
   return value;
}

int main() {
    int N;
    scanf("%d", &N);
    int i_A;
    int *A = (int *)malloc(sizeof(int)*N);
    for(i_A=0; i_A<N; i_A++)
    	scanf("%d", &A[i_A]);
    int K;
    scanf("%d", &K);

    long long out_ = solve(A, K, N);
    printf("%lld", out_);
}
