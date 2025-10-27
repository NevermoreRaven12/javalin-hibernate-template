package com.jaime;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import io.javalin.json.JavalinJackson;

public class Main {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.jsonMapper(new JavalinJackson());
            config.staticFiles.add("/public", Location.CLASSPATH);
        }).start(7000);

        app.get("/ping", ctx -> {
            ctx.result("pong");
        });
    }
}