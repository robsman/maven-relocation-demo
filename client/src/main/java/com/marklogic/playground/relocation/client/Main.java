package com.marklogic.playground.relocation.client;

import com.marklogic.playground.relocation.library.shinynew.HelloService;

public class Main {

    public static void main(String[] args) {
        HelloService helloService = new HelloService();

        System.out.println(helloService.getHelloMessage());
    }

}
