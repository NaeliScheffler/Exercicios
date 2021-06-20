#include <stdlib.h>

#include <stdio.h>

#include <locale.h>


int main() {
  setlocale(LC_ALL, "Portuguese");

  int V[15], i, j = 15;
  float auxmaior, auxmenor;
  for (i = 0; i < j; i++) {
    printf("\n Insira o valor %d para V: \n", i + 1);
    scanf("%d", & V[i]);
}

  for (i = 0; i < j; i++) {
    for (j = i + 1; j < 15; j++) {
      if (V[i] < V[j]) {
        auxmaior = V[j];
        auxmenor = V[i];
        V[i] = auxmaior;
        V[j] = auxmenor;
}       else
      if (V[i] > V[j]) {
        auxmaior = V[i];
        auxmenor = V[j];
        V[i] = auxmaior;
        V[j] = auxmenor;
}       else {
        auxmaior = V[i];
        auxmenor = V[j];
}

}
}
  printf("\n O vetor V em ordem decrescente é: \n");
  for (i = 0; i < 15; i++) {
    printf("\n %d \n", V[i]);
}

  return 0;
}
