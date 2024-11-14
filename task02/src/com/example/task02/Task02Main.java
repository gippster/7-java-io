package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        Replace();
    }
    private static void Replace(){
        byte[] buf = new byte[] {-1, -1};
        int bytesRead;

        try {
            while ((bytesRead = System.in.read(buf, 1, 1)) != -1) {
                if(buf[0] != -1 && !(buf[0] == 13 && buf[1] == 10))
                    System.out.write(buf[0]);

                buf[0] = buf[1];
            }

            if(buf[0] != -1)
                System.out.write(buf[0]);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
