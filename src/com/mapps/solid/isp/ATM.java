package com.mapps.solid.isp;

public class ATM implements BankProcess, ATMProcess {
    @Override
    public void withDraw(double value) {

    }

    @Override
    public void makeDeposit(double value) {

    }

    @Override
    public String showExtract() {
        return "R$ 1.000.000,00";
    }
}
