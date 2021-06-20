#include <stdlib.h>

#include <stdio.h>

#include <locale.h>

int main() {
  setlocale(LC_ALL, "Portuguese");
  int vetor[10], i, menor, menorPosicao;

    for (i = 0; i < 10; i++) {
    printf(" Entre com um numero: ");
    scanf("%d", & vetor[i]);

    if (vetor[i] < menor) {
    menor = vetor[i];
    menorPosicao = i;
}
}

  printf("\n Menor valor: %d  Posicao %d", menor, menorPosicao);

  return 0;
}
