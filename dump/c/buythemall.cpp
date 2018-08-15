#include <iostream>
using namespace std;
long int count = 0;
long int*A;

void getAllCombinations(long int n, long int k) {
    long int i = 0, j = 0;
    long int price = 0;
    bool flag;
    for (i = 0; i < n; i++) {
        price = A[i];
        flag = true;
        if (price <= k) {
            count++;
        }
        for (j = i+1;  j < n; j++) {
            if (flag) {
                price = price - A[j-1] + (A[j-1]*A[j]);
            }
            else {
                price += A[j];
            }
            flag = !flag;
            if (price <= k) {
                count++;
            }
        }
    }
}

int main() {
    long int n, k;
    cin >> n;
    cin >> k;
    A = (long int*)malloc(sizeof(long int)*n);
    
    long int i = 0;
    for (i = 0; i < n; i++) {
        cin >> A[i];
    }
    getAllCombinations(n, k);
    
    cout << count << endl;
}