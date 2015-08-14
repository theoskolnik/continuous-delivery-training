package com.thoughtworks;

import static spark.Spark.*;

public class SampleApplication {
    public static void main(String[] args) {
        port(Integer.valueOf(System.getenv("PORT")));
        get("/hello", (req, res) -> "Hello World");
    }
}

