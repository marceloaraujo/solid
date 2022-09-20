package com.mapps.solid.isp;

public class OnlineBanking implements BankProcess {

    @Override
    public String showExtract() {
        return "R$ 1.000.000,00";
    }

}
