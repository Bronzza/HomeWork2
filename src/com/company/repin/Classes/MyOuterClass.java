package com.company.repin.Classes;

import java.util.Random;

public class MyOuterClass {
    private static int counter = 0;
    private String outerName;

    public MyOuterClass(String outerName) {
        this.outerName = outerName;
    }

    public String getOuterName() {
        return outerName;
    }

    public static int getCounter() {
        return counter;
    }

    public static class myNestedClass {
        public static void IterateCounter(int iterationNumb) {
            for (int i = 0; i < iterationNumb; i++) {
                counter++;
            }
        }
    }

    public static interface doJob {
    }

    public class MyInner {
        public MyInner() {
        }

        public void changeOuterName(String newName) {
            outerName = newName;
        }
    }

    public void addRandomSymbol() {
        class myLocaLClass {
            public char randomSymbol() {
                Random rnd = new Random();
                return (char) (rnd.nextInt(25) + 97);
            }
        }
        char result = new myLocaLClass().randomSymbol();
        outerName += result;
        System.out.println(result);
    }


}

