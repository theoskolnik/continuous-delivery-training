package com.thoughtworks;

import static spark.Spark.*;

public class SampleApplication {
    public static void main(String[] args) {
        port(8080);
        get("/hello", (req, res) -> "Hello World");
    }
}

