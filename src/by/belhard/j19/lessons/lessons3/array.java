package by.belhard.j19.lessons.lessons3;

public class array {
    public static void main(String[] args) {
        int[]intsArray = {0, 11, -2, 21, 5};
        for (int i = 0; i < intsArray.length; i++) {
            if (i % 2 != 0)
                intsArray[i] += intsArray[i];
            System.out.println(intsArray[i]);
        }
        for (int i : intsArray){
            System.out.println();
        }
    }
}
