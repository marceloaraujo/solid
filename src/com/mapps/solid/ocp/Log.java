package com.mapps.solid.ocp;

/*
* Princípio Aberto-Fechado diz que uma classe
* está aberta para extensão mas fechada para modificação.
* Nesse exemplo, várias classes vão implementar essa interface
* para que não seja necessário implementar esse método toda
* vez que um objeto novo existir.
* */
public interface Log {

    public String printInfo();

}
