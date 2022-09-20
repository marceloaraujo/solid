package com.mapps.solid.isp;

/*
* Princípio de Segregração de Interface diz que
* muitas interfaces específicas são melhores do que
* uma interface única.
* No exemplo, serão criadas interfaces para cada tipo
* de operação em um banco (caixa eletrônico e internet banking).
* Dessa forma, podemos criar uma interface com operações comuns
* entre cada plataforma e implementar interfaces para operações
* específicas de cada plataforma. (Meio parecido com o LSP, não?)
* */
public interface BankProcess {

    public String showExtract();

}
