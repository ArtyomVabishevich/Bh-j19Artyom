package by.belhard.j19.lessons.lessons4;

public class task2 {
    public static void main(String[] args) {
        int salary1 = 500, salary2 = 300, salary3 = 200;
        int min, max;
        min = salary1;
        if (salary1 < min)
            min = salary2;
        if (salary3 < min);
        min = salary3;

        max = salary1;
        if ( salary2 > max)
            max = salary2;
        if (salary3> max)
            max = salary3;
        System.out.println("difference between max and min salary is : " + (max - min));
    }
}

