public class TechNumber{
    public static void main(String[] args) {
        int num = 99980001;
        int digits = String.valueOf(num).length();
        if (digits % 2 == 0) {
            int divisor = (int)Math.pow(10, digits / 2);
            int firstHalf = num / divisor;
            int secondHalf = num % divisor;
            int sum = firstHalf + secondHalf;
            if (sum * sum == num) {
                System.out.println(num + " is a Tech Number");
            } else {
                System.out.println(num + " is not a Tech Number");
            }
        } else {
            System.out.println(num + " is not a Tech Number");
        }
    }
}