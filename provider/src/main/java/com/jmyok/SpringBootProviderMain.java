package com.jmyok;

import com.jmyok.common.service.UserService;
import com.jmyok.rpc.registry.LocalRegistry;
import com.jmyok.rpc.server.HttpServer;
import com.jmyok.rpc.server.VertxHttpServer;

public class SpringBootProviderMain {

    public static void main(String[] args) {
        //注册服务
        LocalRegistry.register(UserService.class.getName(),UserServiceImpl.class);

        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
