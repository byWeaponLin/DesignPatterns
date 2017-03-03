package com.weaponlin.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Weapon Lin on 2017/1/15.
 */
public class TestConnectingURL implements Runnable {

    public static final int COUNT = 1000000;
    private static int i = 1;

    @Override
    public void run() {
        try {
            long t1 = System.currentTimeMillis();
            URL url = new URL("http://www.baidu.com");
            URLConnection urlCon = url.openConnection();
            InputStream is = urlCon.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            StringBuffer sb = new StringBuffer();
            String line = null;
            while ((line=br.readLine()) != null){
                sb.append(line);
            }
            System.out.println(System.currentTimeMillis() - t1);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < COUNT;i++){
            TestConnectingURL tcURL = new TestConnectingURL();
            Thread t = new Thread(tcURL);
            t.start();
        }
    }
}
