class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        int arraySize = array == null ? 0 : array.length;
        if (index >= arraySize || index < 0) {
            System.out.println("Exception!");
        } else System.out.println(array[index] * array[index]);
    }
}