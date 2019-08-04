package com.nicholas.runner;

import com.nicholas.util.ValidareLogin;

public class Main {
    public static void main(String[] args) {

        ValidareLogin test = new ValidareLogin();
        test.displayAll();

        test.validateUser("Nicholas", "123456");


    }

}
