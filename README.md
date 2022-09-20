# SOLID Java

Projeto simples para aplicar os conceitos de SOLID e para consultas futuras.

## SOLID

SOLID são 5 princípios de orientação a objetos. Esses princípios podem ser aplicados em qualquer linguagem orientada à objetos.

## Vantagens

- Fácil de se manter, adaptar e se ajustar as alterações de escopo;
- Testável e de fácil entendimento;
- Extensível para alterações com o menor esforço necessário;
- Fornecer o máximo de reaproveitamento;
- Permaneça o máximo possível em utilização.

## O que evita?

- Dificuldade na testabilidade/criação de testes unitários;
- Código sem estrutura ou padrão;
- Dificuldade de isolar funcionalidades;
- Duplicação de código (uma alteração precisa ser feita em N pontos);
- Fragilidade (o código quebrar em vários pontos após alguma mudança).

## S - Single Responsibility Principle (SRP)

Uma classe deve ter um, e somente um, motivo para existir. (Veja o pacote `com.mapps.solid.srp`).

## O - Open-Closed Principle (OCP)

Uma classe pode ser aberta para extensão e fechada para modificação. (Veja o pacote `com.mapps.solid.ocp`).

## L - Liskov Substitution Principle (LSP)

As classes base devem ser substituíveis por suas classes derivadas. (Veja o pacote `com.mapps.solid.lsp`).

## I - Interface Segregation Principle (ISP)

Muitas interfaces específicas são melhores do que uma interface única. (Veja o pacote `com.mapps.solid.isp`).

## D - Dependency Inversion Principle (DIP)

Dependa de uma abstração e não de uma implementação. (Veja o pacote `com.mapps.solid.dip`).
