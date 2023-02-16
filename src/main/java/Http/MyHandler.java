package Http;

import Interfaces.MyHandlerInterface;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import functions.BasicFunctions;
import functions.HardFunctions;
import functions.MediumFunctions;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;


public class MyHandler implements HttpHandler, MyHandlerInterface {

    int[] myArray = {2,56,1,9,4,6,3,2,55,64,23,44,11,22,87,56,4,5,6,7};


    HardFunctions hardFunctions = new HardFunctions(myArray);
    BasicFunctions medium = new MediumFunctions(myArray);




    @Override
    public void handle(HttpExchange exchange) throws IOException {

        String requestURI = exchange.getRequestURI().getPath();

        switch (requestURI){
            case "/api/1":
                handleFirstEndpoint(exchange);
                break;
            case "/api/2":
                handleSecondEndpoint(exchange);
                break;
            case "/api/quicksort":
                handleQuickSort(exchange);
                break;
            default:
                exchange.sendResponseHeaders(404, -1);
                exchange.close();
        }


    }

    @Override
    public void handleFirstEndpoint(HttpExchange exchange) throws IOException {

        String response = medium.polymorphismMethod();
        JSONObject responseJson = new JSONObject();
        responseJson.put("message", response);
        responseJson.put("age", 4);


        Headers responseHeaders = exchange.getResponseHeaders();

        responseHeaders.set("Content-Type", "application/json");

        exchange.sendResponseHeaders(200, responseJson.toString().length());
        OutputStream os = exchange.getResponseBody();
        os.write(responseJson.toString().getBytes(StandardCharsets.UTF_8));
        os.close();

    }
    public void handleSecondEndpoint(HttpExchange exchange) throws IOException {



        String response = hardFunctions.polymorphismMethod();
        JSONObject responseJson = new JSONObject();
        responseJson.put("message", response);
        responseJson.put("age", 2);


        Headers responseHeaders = exchange.getResponseHeaders();

        responseHeaders.set("Content-Type", "application/json");

        exchange.sendResponseHeaders(200, responseJson.toString().length());
        OutputStream os = exchange.getResponseBody();
        os.write(responseJson.toString().getBytes(StandardCharsets.UTF_8));
        os.close();

    }

    @Override
    public void handleQuickSort(HttpExchange exchange) throws IOException {

        int[] sortedArray = hardFunctions.quickSort(myArray);
        String separator = "\n";

        JSONArray jsonArrayBefore = new JSONArray(myArray);
        JSONObject jsonBefore = new JSONObject();
        jsonBefore.put("before", jsonArrayBefore);

        JSONArray jsonArray = new JSONArray(sortedArray);
        JSONObject json = new JSONObject();
        json.put("after", jsonArray);

        exchange.getResponseHeaders().set("Content-Type", "application/json");
        exchange.sendResponseHeaders(200, json.toString().length()
                + jsonBefore.toString().length() + 1);

        OutputStream outputStream = exchange.getResponseBody();
        outputStream.write(jsonBefore.toString().getBytes());
        outputStream.write(separator.getBytes());
        outputStream.write(json.toString().getBytes());
        outputStream.close();

    }
}

