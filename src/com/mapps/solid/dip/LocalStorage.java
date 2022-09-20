package com.mapps.solid.dip;

public class LocalStorage implements Storage {

    @Override
    public void save(String data) {
        System.out.println("Salvando " + data + " localmente.");
    }
}
