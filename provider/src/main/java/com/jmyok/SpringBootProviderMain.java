package com.jmyok;

import com.jmyok.rpc.server.HttpServer;
import com.jmyok.rpc.server.VertxHttpServer;

public class SpringBootProviderMain {

    public static void main(String[] args) {
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);

    }
}
