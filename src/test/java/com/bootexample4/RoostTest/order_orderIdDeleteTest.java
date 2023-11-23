// Test generated by RoostGPT for test basicTest using AI Type Open AI and AI Model gpt-4

// RoostTestHash=6e4c4bbafe

package com.bootexample4.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class order_orderIdDeleteTest {
  
    @Test  
    public void order_orderIdDeleteTest() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("order_orderId_delete.csv"))) {  
            String headerLine = reader.readLine();  
            String[] headers = headerLine.split(",");  
  
            String line;  
            while ((line = reader.readLine()) != null) {  
                String[] data = line.split(",");  
  
                // Create a map of header to data  
                Map<String, String> map = new HashMap<>();  
                for (int i = 0; i < headers.length; i++) {  
                    map.put(headers[i], data[i]);  
                }  
  
                // Create payload based on swagger keys  
                String payload = "{";  
                for (String key : keys) {  
                    payload += "\"" + key + "\": " + "\"" + map.get(key) + "\""; // assumes all values are strings, adjust as needed  
                    if (!key.equals(keys[keys.length - 1])) {  
                        payload += ", ";  
                    }  
                }  
                payload += "}";  
  
                given().  
                  //here will come the body 
                when().  
                    delete("/store/order/{orderId}").  
                then().  
                    assertThat().statusCode(response -> {  
                        //here will come the assertion code
                    });
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
}
