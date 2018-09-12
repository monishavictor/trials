#include<stdio.h>

int main() {
  int x = 2437;
  int y = 875;

  while (x != y) {
    if (x > y) {
      x = x - y;
    }
    else if (x < y) {
      y = y - x;
    }
  }

  printf("%d\n", x);
}