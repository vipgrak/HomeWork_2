package com.company;
public class Main {
    public static void main(String[] args) throws MyArrayDataException , MyArraySizeException {
        String[][] array = {
                {"1 ","2 ","3 ","4 "},
                {"1 ","2 ","3 ","4 "},
                {"1 ","2 ","3 ","4 "},
                {"1 ","2 ","3 ","4"}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                try {
                    int a = Integer.parseInt(array[i][j].trim());
                    sum += a;
                }catch (NumberFormatException e){
                    throw new MyArrayDataException();
                }
            }
            System.out.println();
            System.out.println("Сумма равна " + sum);
        }
        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array.length != 4 | array[i].length != 4){
                        throw new MyArraySizeException();
                    }
                }
            }
        }catch (IndexOutOfBoundsException e){
        }
    }
    public static class MyArrayDataException extends Throwable {}
    public static class MyArraySizeException extends Throwable {}
        }

