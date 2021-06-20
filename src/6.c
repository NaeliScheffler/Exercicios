#include <stdlib.h>

#include <stdio.h>

#include <locale.h>


int main() {
  setlocale(LC_ALL, "Portuguese");

  int X[10], Y[10], P[20], c = 1, i, d, aux[20];

  for (i = 0; i < 10; i++) {
    printf("\n insira o %d valor para X: \n", c);
    scanf("%d", & X[i]);
    printf("\n insira o %d valor para Y: \n", c);
    scanf("%d", & Y[i]);
    c++;
  }
  printf(" \n Os valores inseridos para X foram: \n");
  for (i = 0; i < 10; i++) {
    printf("\n %d \n", X[i]);
  }

  printf(" \n Os valores inseridos para Y foram: \n");
  for (i = 0; i < 10; i++) {
    printf("\n %d \n", Y[i]);
  }
  for (i = 0; i < 10; i++) {
    aux[i] = X[i];
    aux[i + 10] = Y[i];
  }
  for (i = 0; i < 10; i++) {
    P[i] = X[i];
    P[i + 10] = Y[i];
  }
  c = 0;
  for (i = 0; i < 20; i++) {
    for (d = i + 1; d < 20; d++) {
      if (P[i] == P[d]) {
        aux[c] = P[i];
        P[d] = 0;
        c++;

      } else {}

    }
  }

  printf("\n A união de X e Y é:\n");

  for (i = 0; i < 20; i++) {
    if (P[i] != 0) {
      printf("\n %d \n", P[i]);
    } else {}
  }

  printf("\n A intersecção de X e Y é:\n");

  for (i = 0; i < 20; i++) {
    P[i] = aux[i];

  }
  for (i = 0; i < 10; i++) {
    if (P[i] != 0) {
      printf("\n %d \n", P[i]);
    } else {}
  }

  for (i = 0; i < 10; i++) {
    P[i] = X[i] - Y[i];
  }

  printf("\n A diferença de X e Y é:\n");

  for (i = 0; i < 10; i++) {
    printf("\n %d \n", P[i]);
  }

  for (i = 0; i < 10; i++) {
    P[i] = X[i] + Y[i];
  }

  printf("\n A soma de X e Y é:\n");

  for (i = 0; i < 10; i++) {
    printf("\n %d \n", P[i]);
  }

  for (i = 0; i < 10; i++) {
    P[i] = X[i] * Y[i];
  }

  printf("\n O produto de X e Y é:\n");

  for (i = 0; i < 10; i++) {
    printf("\n %d \n", P[i]);
  }

  return 0;
}
