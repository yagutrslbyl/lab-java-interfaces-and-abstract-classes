package org.example;


public class IntArrayList implements IntList {
    int size=0;
    public int[] numbers = new int[10];

    @Override
    public void add(int number) {
        if (size >= numbers.length) {
            int newLength = numbers.length + numbers.length / 2;
            int[] newArr = new int[newLength];
            System.arraycopy(numbers, 0, newArr, 0, numbers.length);
            numbers = newArr;

        }
        numbers[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        return numbers[i];
    }
}

