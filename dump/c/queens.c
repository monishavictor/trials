#include<stdio.h>
int main() {
  char arr[100][100];
  int n, k;
  scanf("%d",&n);
  scanf("%d",&k);
  int i, r, c, j;
  scanf("%d%d",&r,&c);
  arr[r-1][c-1] = 'Q';
  for(i = 0; i < k; i++) {
    scanf("%d%d",&r,&c);
    arr[r-1][c-1] = 'x';
  }

  for(i = 0; i < 100; i++) {
    for(j = 0; j < 100; j++) {
      if (arr[i][j] == 'x' || arr[i][j] == 'Q') {
        printf("%c",arr[i][j]);
      }
      else {
        printf(".");
      }
    }
    printf("\n");
  }
  printf("\n");
}