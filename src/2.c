#include <stdlib.h>

#include <stdio.h>

#include <locale.h>

int main() {
  setlocale(LC_ALL, "Portuguese");
  int vetor1[10], vetor2[10], mult[10], i;

  for (i = 0; i < 10; i++) {
    printf("Insira um n�mero:\n");
    scanf("%d", & vetor1[i]);
    printf("Insira um segundo n�mero:\n");
    scanf("%d", & vetor2[i]);
    mult[i] = vetor1[i] * vetor2[i];
    printf("A multiplica��o dos dois n�meros resulta em:%d\n", mult[i]);
  }

  return 0;
  }
