package com.mapps.solid.dip;

/*
* Princípio da Inversão de Dependência diz
* "dependa de uma abstração e não de uma implementação".
* Também com o uso de uma interface, é possível que uma classe
* possa executar o método implementado da interface para fins
* diferentes. Exemplo: no código desse pacote, será implementado
* o método save para salvar dados locais e também para salvar dados
* na núvem. Cada classe terá a sua implementação de save, porém a classe
* Handler conhecerá apenas a interface. Desde que outros objetos implementem
* essa interface, o Handler conseguirá executar sem problemas.
* */
public interface Storage {

    public void save(String data);

}
