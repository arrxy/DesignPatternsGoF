package com.example.designpatternsgof.Creational.Singleton;

public class ConnectionPool {
    private static ConnectionPool connectionPool = null;

    // STEP 1: Constructor Hiding
    private ConnectionPool() {

    }

    // Step 2: Global Access Point
    public static ConnectionPool getInstance() {
        if (connectionPool == null) {
            synchronized (ConnectionPool.class) {
                if (connectionPool == null) {
                    connectionPool = new ConnectionPool();
                }
            }
        }
        return connectionPool;
    }

}
