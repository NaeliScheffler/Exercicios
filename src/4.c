#include <stdlib.h>

#include <stdio.h>

#include <locale.h>

int main() {
  setlocale(LC_ALL, "Portuguese");
  int vetor[20], i, a = 0, b = 19;

  for (i = 0; i < 20; i++) {
    printf("\n Entre com um numero: \n");
    scanf("%d", & vetor[i]);
  }
  for (i = 0; i < 20; i++) {
    printf("\n O n�mero de posi��o %d digitado foi:%d\ n", i, vetor[i]);
  }
  for (i = 0; i < 10; i++) {
    vetor[a] = vetor[b];
    a++;
    b--;
  }
  for (i = 0; i < 20; i++) {
    printf("\n O n�mero de posi��o %d ap�s a troca �:%d \n", i, vetor[i]);
  }
  return 0;
}
