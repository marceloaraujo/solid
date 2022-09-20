package com.mapps.solid.lsp;

/*
* Princípio de Substituição de Liskov diz que as classes
* base devem ser substituídas por suas classes derivadas..
* Essa interface representa um pássaro que possui suas
* principais características. Porém se um pinguim extender essa classe,
* uma exceção será lançada, pois pinguim não voa.
* Dessa forma, será criada uma interface para aves que voam e que não
* voam (uma extendendo da outra), e podemos implementar as interfaces
* corretas em seus respectivos objetos.
* */
public interface Bird {

    public void walk();

}
