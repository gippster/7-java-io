package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {

        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));

    }

    public static String readAsString(InputStream inputStream, Charset charset)
    {
        if(inputStream == null || charset == null)
            throw new IllegalArgumentException();

        StringBuilder encodedString = new StringBuilder();

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, charset))){
            String line;

            while((line = reader.readLine()) != null){
                encodedString.append(line);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }

        return encodedString.toString();
    }
}
