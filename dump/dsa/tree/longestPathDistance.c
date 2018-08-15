#include<stdio.h>
#include<stdlib.h>

typedef struct node {
  int data;
  struct node *left;
  struct node *right;
} node;

node* insert(node* root, int data) {

  if(root == NULL) {
    node* cur = (node*)malloc(sizeof(node));
    cur->data = data;
    cur->left = NULL;
    cur->right = NULL;
    return cur;
  }

  if (root->data < data) {
    root->right = insert(root->right, data);
  }
  else {
    root->left = insert(root->left, data);
  }
  return root;
}

int depthFromNode(node* root) {
  if(root == NULL) {
    return 0;
  }
  int leftDepth = depthFromNode(root->left);
  int rightDepth = depthFromNode(root->right);
  return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
}

void inorder(node* root) {
  if(root->left) {
    inorder(root->left);
  }
  if(root) {
    printf("%d at depth %d\n", root->data, depthFromNode(root));  
  }
  if(root->right) {
    inorder(root->right);
  }
}

int main() {
  int count = 10;
  int arr[] = {6, 4, 5, 9, 3, 20, 1, 7, 2, 10};
  node* root = NULL;
  for (int i = 0; i < sizeof(arr)/sizeof(arr[0]); i++) {
    root = insert(root, arr[i]);
  }
  inorder(root);
}