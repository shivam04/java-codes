
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;


public class LightWeight {
    public static void main(String a[])throws Exception{
        InetSocketAddress addr = new InetSocketAddress(8080);
        HttpServer server = HttpServer.create(addr, 0);
        server.createContext("/", new MyHandler());
        server.setExecutor(Executors.newCachedThreadPool());
        server.start();
        System.out.println("Server is listening on port 8080");
    }
}
class MyHandler implements HttpHandler{
   @Override
    public void handle(HttpExchange he) throws IOException {
        String requestMethod = he.getRequestMethod();
        if(requestMethod.equals("GET")){
            Headers responseHeaders = he.getResponseHeaders();
            responseHeaders.set("Content-Type", "text/palin");
            he.sendResponseHeaders(200, 0);
            OutputStream responseBody = he.getResponseBody();
            Headers requestHeaders = he.getRequestHeaders();
            Set<String> keySet = requestHeaders.keySet();
            Iterator<String> iter = keySet.iterator();
            while(iter.hasNext()){
                String key = iter.next();
                List values = requestHeaders.get(key);
                String s = key+"="+values.toString();
                responseBody.write(s.getBytes());
            }
            responseBody.close();
        }
    }
}
