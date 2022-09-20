package com.mapps.solid.ocp;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    /*
    * Sem a implementação da interface, toda vez que
    * existir um novo animal, seria necessário alterar
    * esse método, e isso quebra o princípio.
    * Dessa forma, pode-se adicionar animais (que extendem da interface)
    * sem problemas no array, e o printInfo vai funcionar corretamente.
    * */
    public void printData() {
        List<Log> animais = new ArrayList<>();
        animais.add(new Dog());
        animais.add(new Cat());
        animais.add(new Bird());

        for(Log animal : animais) {
            System.out.println(animal.printInfo());
        }
    }

}
