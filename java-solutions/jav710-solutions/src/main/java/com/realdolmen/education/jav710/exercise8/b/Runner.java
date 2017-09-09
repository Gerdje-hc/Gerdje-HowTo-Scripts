package com.realdolmen.education.jav710.exercise8.b;

public class Runner {
    public static void main(String[] args) {
        LottoPredictor predictor = new LottoPredictor();
        for(int i=0; i<10; i++) {
            predictor.predict();
            predictor.print();
        }
    }
}
