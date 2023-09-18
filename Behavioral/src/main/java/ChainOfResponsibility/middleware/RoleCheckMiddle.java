package ChainOfResponsibility.middleware;

public class RoleCheckMiddle extends Middleware{

    @Override
    public boolean check(String email, String password) {
        if(email.equals("admin.com")){
            System.out.println("hello admin!");
            return true;
        }
        System.out.println("hello user!");
        return checkNext(email,password);
    }
}
