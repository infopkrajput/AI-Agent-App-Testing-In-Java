package org.example;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

import java.util.Scanner;

// Create a file keys.java in the same directory with the following content:
/*
package org.example;
import com.google.genai.Client;
public class Keys {
    public static final String GOOGLE_API_KEY = "API KEY";
}
*/

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your query (or type 'exit' to quit): ");
            String query = input.nextLine();
            if (query.equals("exit")) {
                break;
            }
            try {
                Client client = new Client.Builder().apiKey(Keys.GOOGLE_API_KEY).build();
                GenerateContentResponse response = client.models.generateContent("gemini-2.5-flash", query, null);
                System.out.println(response.text());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}