package com.mapps.solid.dip;

public class CloudStorage implements Storage {

    @Override
    public void save(String data) {
        System.out.println("Salvando " + data + " na núvem.");
    }

}
