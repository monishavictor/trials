#include<stdio.h>

int main() {

  int arr[15] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
  int swaps = 0,
      b = 1;
  int temp[15] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
  for(int i = 0; i < 15; i++) {
    if(arr[i] == temp[i]) {
      b = b + 1;
    }
    else {
      swaps++;
    }
  }
  printf("%d\t%d\n", swaps,b);
}


// swaps = 0
// b = 1
// for a = 1 to len(A)
//   if A[a] == B[b]
//     b = b + 1
//   else
//     swaps = swaps + 1