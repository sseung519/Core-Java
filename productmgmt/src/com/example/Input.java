package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;


public class Input {
    private List<Product> list;
    private Scanner sc;
    private File file;

    public Input(List<Product> list) {
        this.list = list;
        this.file = new File("src/productdata.txt");
        try {
            this.sc = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 업습니다.");
            System.exit(0);
        }
    }

    public void fileInput() {
        while(this.sc.hasNextLine()){
            String line = this.sc.nextLine();
            /*
                1. String's split()
                2. Scanner's useDelemeter();
                3. StringTokenizer
             */
            Scanner scLine = new Scanner(line).useDelimiter("\\s+");
            Product p = new Product(scLine.next(), scLine.nextInt(),
                    scLine.nextInt(), scLine.nextInt(), scLine.nextInt());
            this.list.add(p); //stack = push, list = add, map = put
        }
    }
}
