#include<stdio.h>

struct node {
  int value;
  struct node* next;
};

typedef struct node node;

void printMenu() {
  printf("\n1. Insert at start\n");
  printf("2. Insert at end\n");
  printf("3. Insert at position\n");
  printf("4. Delete node\n");
  printf("5. Reverse List Recursively\n");
  printf("6. Reverse List iteratively\n");
  printf("99. Print List\n");
  printf("100. Exit\n");
}

node* insert(node* root, int position, int value) {
  return root;
}

int main() {

  node* root;
  int option;
  int input, position;

  while(1) {
    printMenu();
    scanf("%d", &option);
    switch(option) {
      case 1:
        scanf("%d", &input);
        insert(root, 0, input);
        break;
      case 2:
        break;
      case 99:
        break;
      case 100:
        return 0;
      default:
        printf("Invalid Option\n");
    }
  }

}