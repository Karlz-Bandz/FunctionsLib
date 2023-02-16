package Interfaces;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;

public interface MyHandlerInterface {



    //First test -> localhost:8080/api/1
    void handleFirstEndpoint(HttpExchange exchange) throws IOException;
    //Second test -> localhost:8080/api/2
    void handleSecondEndpoint(HttpExchange exchange) throws IOException;
    //Display the sorted numbers
    void handleQuickSort(HttpExchange exchange) throws IOException;
}
