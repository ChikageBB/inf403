package ru.itis.inf403.lab12.model.func_int;

public class ArrayUtils {
    public static void sort(Object[] array, ICompareObject coparator){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (coparator.compare(array[i], array[j]) > 0){
                    Object temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
