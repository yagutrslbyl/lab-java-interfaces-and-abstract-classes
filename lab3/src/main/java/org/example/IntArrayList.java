package org.example;


public class IntArrayList implements IntList {
    int size;
    public int[] numbers = new int[10];

    @Override
    public void add(int number) {
        if (size >= numbers.length) {
            int newCapacity = numbers.length + numbers.length / 2;
            int[] newArr = new int[newCapacity];
            System.arraycopy(numbers, 0, newArr, 0, numbers.length);
            newArr[size] = number;

        }
        size++;
    }

    @Override
    public int get(int id) {
        for (int i = 0; i < numbers.length; i++) {
            if (id == i) {
                int result = numbers[id];
                return result;
            }
        }
    }
}

