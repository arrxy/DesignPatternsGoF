package com.example.designpatternsgof.Creational.Singleton.SingletonHW;

import java.util.Map;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {
    public static FileBasedConfigurationManager instance;
    private static Map<String, Object> configurations;

    private FileBasedConfigurationManagerImpl() {

    }

    public static FileBasedConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (FileBasedConfigurationManagerImpl.class) {
                if (instance == null) {
                    instance = new FileBasedConfigurationManagerImpl();
                }
            }
        }
        return instance;
    }

    public void resetInstance() {
        instance = null;
    }
}
