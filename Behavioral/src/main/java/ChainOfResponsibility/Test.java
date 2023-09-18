package ChainOfResponsibility;

import ChainOfResponsibility.middleware.Middleware;
import ChainOfResponsibility.middleware.RoleCheckMiddle;
import ChainOfResponsibility.middleware.ThrottlingMiddleware;
import ChainOfResponsibility.middleware.UserExistsMiddleware;
import ChainOfResponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;


    private static void init() {
        server = new Server();
        server.register("admin.com", "admin");
        server.register("user.com", "user");

        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server)).linkWith(new RoleCheckMiddle());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();
        boolean success;
        do {
            System.out.println("Email   enter:");
            String email = reader.readLine();
            System.out.println("Password  enter:");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
