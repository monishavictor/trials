#include <iostream>
using namespace std;
unsigned long int tripletsSum = 0;
void getTriplets(long int* A, long int* data, int L, int R, int index, int size) {
    int i = 0;
    if (index == size) {
        int xorValue = -1;
        for (i = 0; i < size; i++) {
            xorValue = xorValue == -1 ? data[i] : xorValue ^ data[i];
        }
        tripletsSum += xorValue;
        return;
    }
    for (i = L; i <= R && R-i+1 >= size-index; i++) {
        data[index] = A[i];
        getTriplets(A, data, i+1, R, index + 1, 3);
    }
    
}

void getTripletsSum(long int* A, int N, int L, int R) {
    long int triplets[3];
    getTriplets(A, triplets, L, R, 0, 3);
}

int main() {
    int N, Q, L, R;
    long int *A;
    cin >> N;
    A = (long int*)malloc(sizeof(long int)*N);
    
    int i = 0;
    for (i = 0; i < N; i++) {
        cin >> A[i];
    }

    cin >> Q;
    cin >> i;

    for (i = 0; i < Q; i++) {
        cin >> L;
        cin >> R;
        tripletsSum = 0;
        getTripletsSum(A, N, L - 1, R - 1);
        tripletsSum %= (1000000007);
        cout << tripletsSum << endl;
    }

}