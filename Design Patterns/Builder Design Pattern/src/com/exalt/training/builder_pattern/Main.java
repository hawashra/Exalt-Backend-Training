package com.exalt.training.builder_pattern;

import com.exalt.training.builder_pattern.builder.ComputerBuilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        ComputerBuilder b = new ComputerBuilder();
        director.buildGamingPC(b);
        System.out.println(b.build());

    }
}