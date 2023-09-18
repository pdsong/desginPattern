package ChainOfResponsibility.middleware;

public class ThrottlingMiddleware extends Middleware {

    private int requestPerMinute;
    private int request;
    private long curreentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.curreentTime = System.currentTimeMillis();
    }

    @Override
    public boolean check(String emial, String password) {
        if (System.currentTimeMillis() > curreentTime + 60_000) {
            request = 0;
            curreentTime = System.currentTimeMillis();
        }
        request++;
        if (request > requestPerMinute) {
            System.out.println("Request limit exceed!");
            Thread.currentThread().stop();
        }
        return checkNext(emial, password);
    }
}
