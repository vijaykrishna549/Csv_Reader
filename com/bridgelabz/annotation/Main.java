package com.bridgelabz.annotation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        String file = "src\\DemoCsv.csv";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = "";
        try{
         //   reader =
            while ((line = reader.readLine()) != null)
            {
                String[] row = line.split(",");
                for (String index : row){
                    System.out.println(index);
                }
                System.out.println();
            }

        }
        catch (Exception e){
            e.printStackTrace();

        }


        System.out.println("Hello World");
    }
}
