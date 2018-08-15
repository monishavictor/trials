#include <stdio.h>
#include <stdlib.h>

struct node {
  //911215011 LOVEPREET THAKUR 28/07/2000 BOY 1 I 3 SRL No 123340
//ENG - 3 - 74 HIN - 2 - 87 HCG - 6 - 50 DC MAT - 5 - 58 SCI - 6 - 44 DDD CTA - 2 - 82 SUPW:C PCA
//1173387/ 001 Son of AMANDEEP KAUR and MANJEET THAKUR
  int id;
  char* firstName;
  char* lastName;
  int m1, m2, m3, m4, m5, m6;
  int total;

}


char* parsePersonalInfo() {
  //911215011 LOVEPREET THAKUR 28/07/2000 BOY 1 I 3 SRL No 123340
  printf("parsePersonalInfo\n");
  char* input;
  input = (char*)malloc(sizeof(char)*1000);
  char
  scanf("%[^\n]%*c", input);
  return input;
}

char* parseMarks() {
  //ENG - 3 - 74 HIN - 2 - 87 HCG - 6 - 50 DC MAT - 5 - 58 SCI - 6 - 44 DDD CTA - 2 - 82 SUPW:C PCA
  printf("parseMarks\n");
  char* input;
  input = (char*)malloc(sizeof(char)*1000);
  // scanf("%[^\n]%*c", input);
  int i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12;
  char c1, c2, c3, c4, c5;
  char* s1, *s2;
  s1 = (char*)malloc(sizeof(char)*3);
  s2 = (char*)malloc(sizeof(char)*3);
  scanf("ENG - %d - %d HIN - %d - %d HCG - %d - %d %c%c MAT - %d - %d SCI - %d - %d %c%c%c %s - %d - %d SUPW:C %s", &i1, &i2, &i3, &i4, &i5, &i6, &c1, &c2, &i7, &i8, &i9, &i10, &c3, &c4, &c5, s1, &i11, &i12, s2);
  printf("%d%d%d%d%d%d%d%d%d%d%d%d%c%c%c%c%c%s%s\n", i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, c1, c2, c3, c4, c5, s1, s2);
  return input;
}

char* parseAddress() {
  //1173387/ 001 Son of AMANDEEP KAUR and MANJEET THAKUR
  printf("parseAddress\n");
  char* input;
  input = (char*)malloc(sizeof(char)*1000);
  scanf("%[^\n]%*c", input);
  return input;
}

int main()
{
    printf("Hello World!\n");
    char* input;
    input = (char*)malloc(sizeof(char)*1000);
    scanf("%[^\n]%*c", input);
    int line = 0;
    int i = 0;
    int recordNum = 0;
    while(i < 8){
      switch(line) {
        case 0:
          printf("%s\n", parsePersonalInfo());
          break;
        case 1:
          printf("%s\n", parseMarks());
          break;
        case 2:
          printf("%s\n", parseAddress());
          break;
        case 3:
          scanf("%[\n]", input);
          break;
      }
      line = (line + 1) % 4;
      recordNum++;
      i++;
    }
    return 0;
}
