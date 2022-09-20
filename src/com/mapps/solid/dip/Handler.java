package com.mapps.solid.dip;

public class Handler {

    private final Storage storage;

    /*
    * Aqui o Handler recebe um Storage.
    * Então tudo que implementar a interface Storage
    * pode ser chamado aqui pelo método handle.
    * (Será que não é parecido com o padrão Strategy?).
    * Se caso o Handler precisar salvar em um arquivo,
    * é necessário somente criar outra classe estendendo Storage,
    * implementar o código para salvar em um arquivo, e passar
    * essa classe nova aqui para o Handler.
    * */
    public Handler(Storage storage) {
        this.storage = storage;
    }

    public void handle(String data) {
        storage.save(data);
    }

}
