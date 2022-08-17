public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        sumMethod(1,2,3);
    }


    int a = 3;
    int b = 4;
    int c = 5;

    public static int sumMethod(int a, int b, int c) {
        int result = 0;
        result = a + b + c;
        System.out.println(result);
        return result;
    }
}