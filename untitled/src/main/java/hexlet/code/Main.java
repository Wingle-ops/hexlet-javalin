package hexlet.code;

import io.javalin.Javalin;

public final class Main {

    public static Javalin getApp() {
        Javalin app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();});
        app.get("/welcome", ctx -> ctx.result("Welcome to Hexlet!"));
        return app;
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}

