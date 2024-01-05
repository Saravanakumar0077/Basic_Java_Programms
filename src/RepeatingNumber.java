public class RepeatingNumber {
    public static void main(String[] args) {
        int n = 122222;
        int count =0;
        while (n>0){
            int rem = (n%10);
            if (rem ==2){
                count++;
            }
            n = n/10; //Last digit is divide by 10
        }
        System.out.println(count);
    }
}
