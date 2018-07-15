package com.christos.shared;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class JSON_methods {

	public static JSONObject httpGet(String urlStr) throws IOException, JSONException, org.json.JSONException {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        
        if (conn.getResponseCode() != 200) {
            throw new IOException(conn.getResponseMessage());
        }

        StringBuilder sb;
        try ( // Buffer the result into a string
                BufferedReader rd = new BufferedReader(
                        new InputStreamReader(conn.getInputStream()))) {
            sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            
        }
        conn.disconnect();
        
        return new JSONObject(sb.toString());
    }
	
}
