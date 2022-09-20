package com.mapps.solid.srp;

public class TwitterManager {
    private final Manager manager;
    private final ParseManager parseManager;
    private final DataManager dataManager;

    public TwitterManager(Manager manager, ParseManager parseManager, DataManager dataManager) {
        this.manager = manager;
        this.parseManager = parseManager;
        this.dataManager = dataManager;
    }

    public void create() {
        String data = manager.request();
        Object obj = parseManager.convertJsonToModel(data);
        dataManager.save(obj);
    }
}
