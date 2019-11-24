package com.biao.springboot.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BiaoCommandLineRunner implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        System.out.println("******BiaoCommandLineRunner.run()执行了******"+Arrays.asList(args));

    }
}
