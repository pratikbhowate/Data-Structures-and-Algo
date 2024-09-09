public class Differences {

    public static void main (String[] args) {
        double now = System.currentTimeMillis();

        Differences diff = new Differences();
        System.out.println(diff.findSum(99999999));
        
        System.out.println("Time taken -" + (System.currentTimeMillis()- now) + "ms");
    }

    // public int findSum(int n) {
    //     return n * (n + 1) / 2;
    // }

    public int findSum(int n) {
        int sum =0;
        for(int i=1;i<=n; i++) {
            sum = sum +i;
        }
        return sum;
    }
    
}