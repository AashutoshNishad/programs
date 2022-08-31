public class variablesteps {
    public static void main(String[] args) {

        int n = 6;
        int problem[] = {1 , 5 , 2 , 3 ,0 , 4};
        System.out.println(totalsteps(n , problem , 5 , new int[n+1] ));
    }

    public static int totalsteps(int d, int problem[], int s, int qb[]) {
        if (d < 1) {
            return d == 0 ? 1 : 0;
        }
        if(qb[d]>0){
            return qb[d];
        }
        int sum = 0;
        for (int i = 1; i <= s && i <= problem[d - 1]; i++) {
            sum = sum + totalsteps(d - i, problem, s, qb);
        }
        qb[d] = sum; 
        return sum;

    }
}
