package me.imnotconsider.virtualpet.test1;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

@Log4j2
public class ConnectionPool {
    private static final String URL = "url";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final int POOL_SIZE = 10;
    private final BlockingQueue<Connection> connections = new ArrayBlockingQueue<>(POOL_SIZE);

    public ConnectionPool() {
        initializePool();
    }

    private void initializePool() {
        for (int i = 0; i < POOL_SIZE; i++) {
            try {
                connections.add(DriverManager.getConnection(URL, USERNAME, PASSWORD));
                log.info("pool initialized ");
            } catch (SQLException e) {
                log.error("initialization error: {}", e.getMessage());
            }
        }
    }

    public Connection getConnection() throws InterruptedException {
        if (connections.isEmpty()) {
            log.warn("connection pool is empty");
            return null;
        }
        return connections.take();
    }

    public void releaseConnection(Connection connection) {
        try{
            connections.put(connection);
            log.info("1 connection received. total connections: {}", connections.size());
        } catch (InterruptedException e) {
            log.warn("log put error: {}", e.getMessage());
        }
    }
}