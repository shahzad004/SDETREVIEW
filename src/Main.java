//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



    public class Main {


        public static int Sum(int a, int b) {
            int sum = a + b;
            System.out.println("sum of A + B is : " + sum);
            return sum;
        }

        public static void main(String[] args) {
            Sum(20, 50);
            Sum(20, 90);
            Sum(20, 30);
        }
}