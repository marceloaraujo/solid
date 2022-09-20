package com.mapps.solid.lsp;

/*
 * Princípio de Substituição de Liskov diz que as classes
 * base devem ser substituídas por suas classes derivadas..
 * Essa interface representa um pássaro que possui suas
 * principais características (voar). Porém se um pinguim extender essa classe,
 * uma exceção será lançada, pois pinguim não voa.
 * Dessa forma, será criada uma interface Animal (com algumas características semelhantes
 * as do pinguim), e Pinguim implementará de Animal, assim ele não terá uma característica
 * que não possuim (voar).
 * E essa interface extende de Animal, pois animais que voam também tem características
 * em comum com outros animais.
 * */
public interface FlyingBird extends Animal {
    public void fly();

}
