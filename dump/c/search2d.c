#include<stdio.h>
char a[3][14] = {"GEEKSFORGEEKS",
                  "GEEKSQUIZGEEK",
                  "IDEQAPRACTICE"
                };
char word[4] = "GEEK";

int x[] = {-1, -1, -1, 0, 0, 1, 1, 1};
int y[] = {-1, 0, 1, -1, 1, -1, 0, 1};

int search (int r, int c) {
  int i, j;
  if (a[r][c] != word[0]) {
    return 0;
  }

  int k = 0, ind;
  int xind = r, yind = c;
  for (k = 0; k < 8; k++) {
    xind = r + x[k];
    yind = c + y[k];
    for(ind = 1; ind < 4; ind++) {
      if (xind > 3 || xind < 0 || yind > 13 || yind < 0) {
        break;
      }
      if (a[xind][yind] != word[ind]) {
        break;
      }
      xind += x[k];
      yind += y[k];
    }
    if(k == 4) {
      return 1;
    }
  }
  return 0;
}

int main() {

  int i, j = 0;

  for (i = 0; i < 3; i++) {
    for (j = 0; j < 14; j++) {
      int res = search(i, j);
      if (res == 1) {
        printf("%d:%d\n", i, j);  
      }
    }
  }

  printf("%s\n%s\n%s\n",a[0],a[1],a[2]);
  return 1;
}