public class FizzBuzzWoof {

    public static void main(String args[]) {

        int n = 100;

        for (int i = 0; i <= n; i++) {

            if (i % 3 == 0 && (String.valueOf(i).contains("33"))) {
                System.out.println("Fizz Fizz Fizz" + " " + i);
            } else if (i % 3 == 0 && (String.valueOf(i).contains("3"))) {
                System.out.println("Fizz Fizz" + " " + i);
            } else if (i % 3 == 0 || (String.valueOf(i).contains("3"))) {
                System.out.println("Fizz" + " " + i);
            } else if (i % 5 == 0 && (String.valueOf(i).contains("55"))) {
                System.out.println("Buzz Buzz Buzz" + " " + i);
            } else if (i % 5 == 0 && (String.valueOf(i).contains("5"))) {
                System.out.println("Buzz Buzz" + " " + i);
            } else if (i % 5 == 0 || (String.valueOf(i).contains("5"))) {
                System.out.println("Buzz" + " " + i);
            } else if (i % 7 == 0 && (String.valueOf(i).contains("77"))) {
                System.out.println("Woof Woof Woof" + " " + i);
            } else if (i % 7 == 0 && (String.valueOf(i).contains("7"))) {
                System.out.println("Woof Woof" + " " + i);
            } else if (i % 7 == 0 || (String.valueOf(i).contains("7"))) {
                System.out.println("Woof" + " " + i);
            } else {
                System.out.println(i);
            }
        }

    }
}
