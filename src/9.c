#include <stdlib.h>

#include <stdio.h>

#include <locale.h>


int main() {
  setlocale(LC_ALL, "Portuguese");

  int F, dep, p = 1, i = 0, aux, aux3, j = 0;
  float hrs = 0, salB = 0, salL = 0, desc = 0, Tgasto = 0, Tdesc = 0, aux2;

  printf("\n Entre com o n�mero total de funcion�rios: \n");
  scanf("%d", & aux);

  char nome[30];

  for (; i < aux; i++) {
    printf("\n Insira o nome do %d funcion�rio : \n", i + 1);
    scanf("%s", & nome);
    printf("\n Insira o n�mero de dependentes para o funcion�rio %d: \n", i + 1);
    scanf("%d", & dep);
    printf("\n Insira o n�mero de horas trabalhadas para o funcion�rio %d :\n", i + 1);
    scanf("%f", & hrs);

    printf("\n O nome do %d funcion�rio �: %s \n", i + 1, nome);
    salB = (hrs * 100.00 + dep * 125.55);

    printf("\n O sal�rio bruto do %d funcion�rio �: %.2f \n", i + 1, salB);
    aux2 = salB * 0.12;
    salL = salB - aux2;
    printf("\n O sal�rio l�quido do %d funcion�rio �: %.2f \n", i + 1, salL);
    printf("\n O valor descontado do %d funcion�rio �: %.2f \n", i + 1, aux2);
    Tgasto = Tgasto + salB;
    Tdesc = Tdesc + aux2;
    hrs = 0;
    dep = 0;
    for (; j < 30; j++) {
      nome[j] = NULL;
    }
  }

  printf("\n O total gasto com sal�rios �:%.2f \n", Tgasto);
  printf("\n O total de funcion�rios da empresa �: %d \n", aux);
  printf("\n O total de descontos �: %.2f \n", Tdesc);

  return 0;
}
