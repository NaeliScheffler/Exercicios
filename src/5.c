#include <stdlib.h>

#include <stdio.h>

#include <locale.h>

int main() {
  setlocale(LC_ALL, "Portuguese");
  int result[6], ap1[6], ap2[6], ap3[6], ap4[6], ap5[6], i, c = 1, ac1 = 0, ac2 = 0, ac3 = 0, ac4 = 0, ac5 = 0;

  for (i = 0; i < 6; i++) {
    printf("\n Insira o %d número sorteado na loteria \n", c++);
    scanf("%d", & result[i]);
}
  c = 1;

  for (i = 0; i < 6; i++) {
    printf("\n Insira o %d número do apostador 1: \n", c);
    scanf("%d", & ap1[i]);
    printf("\n Insira o %d número do apostador 2: \n", c);
    scanf("%d", & ap2[i]);
    printf(" \nInsira o %d número do apostador 3: \n", c);
    scanf("%d", & ap3[i]);
    printf("\n Insira o %d número do apostador 4: \n", c);
    scanf("%d", & ap4[i]);
    printf("\n Insira o %d número do apostador 5: \n", c);
    scanf("%d", & ap5[i]);
    c++;
}
  for (i = 0; i < 6; i++) {
    if (result[i] == ap1[i]) {
      ac1 = ac1 + 1;
}
    if (result[i] == ap2[i]) {
      ac2 = ac2 + 1;
}
    if (result[i] == ap3[i]) {
      ac3 = ac3 + 1;
}
    if (result[i] == ap4[i]) {
      ac4 = ac4 + 1;
}
    if (result[i] == ap5[i]) {
      ac5 = ac5 + 1;
}
}

  printf("\n O total de acertos do apostador 1 é:%d \n", ac1);
  printf("\n O total de acertos do apostador 2 é:%d \n", ac2);
  printf("\n O total de acertos do apostador 3 é:%d \n", ac3);
  printf("\n O total de acertos do apostador 4 é:%d \n", ac4);
  printf("\n O total de acertos do apostador 5 é:%d \n", ac5);

  if (ac1 > ac2 && ac1 > ac3 && ac1 > ac4 && ac1 > ac5) {
    printf("\n O apostador 1 é o ganhador \n");
  } else
  if (ac2 > ac1 && ac2 > ac3 && ac2 > ac4 && ac2 > ac5) {
    printf("\n O apostador 2 é o ganhador \n");
  } else
  if (ac3 > ac1 && ac3 > ac2 && ac3 > ac4 && ac3 > ac5) {
    printf("\n O apostador 3 é o ganhador \n");
  }
  if (ac4 > ac1 && ac4 > ac2 && ac4 > ac3 && ac4 > ac5) {
    printf("\n O apostador 4 é o ganhador \n");
  }
  if (ac5 > ac1 && ac5 > ac2 && ac5 > ac3 && ac5 > ac4) {
    printf("\n O apostador 5 é o ganhador \n");
  }
  return 0;
}
