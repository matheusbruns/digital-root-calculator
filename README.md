# Digital Root Calculator

Este é um projeto simples que implementa uma função para calcular a raiz digital de um número não negativo. A raiz digital é a soma recursiva de todos os dígitos de um número até que reste apenas um dígito.

## Funcionamento

A função `DigitalRootCalculator.digitalRoot(int n)` aceita um número inteiro não negativo como entrada e retorna o dígito único resultante após a aplicação do processo de soma recursiva. Ela lida corretamente com números negativos e valores nulos, retornando -1 nessas situações.

## Exemplos

Aqui estão alguns exemplos de uso da função `digitalRoot`:

```java
int result1 = DigitalRootCalculator.digitalRoot(16);      // Resultado: 7
int result2 = DigitalRootCalculator.digitalRoot(942);     // Resultado: 6
int result3 = DigitalRootCalculator.digitalRoot(132189);  // Resultado: 6
int result4 = DigitalRootCalculator.digitalRoot(493193);  // Resultado: 2
