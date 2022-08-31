 class steps {

    public static int totalsteps(int d, int[] st , int qb[]) {

        if(d < 1){
            return d==0?1:0;
        }

        if (qb[d] > 0 ) {
            return qb[d];
        }

        int sum = 0;
        System.out.print(d + " ( ");
        for (int i = 0; i < st.length; i++) {
            sum = totalsteps(d - st[i], st , qb) + sum;
            System.out.print(d-st[i]>0?",":"");
        }
        qb[d] = sum;
        System.out.print(" )");
        
        return sum;
    }

    public static void main(String[] args) {

        int steps[] = { 1 , 2 , 3};
        System.out.println(totalsteps(5 , steps , new int[6]));
    }


}

// 0 1 2 3 4
// 
// 4(3 (2 (1 (0) , 0 ) , 1(0) , 0 ) , 2 )
// 5 ( 4 ( 3 ( 2 ( 1 (  ), ),1 (  ), ),2 ( 1 (  ), ),1 (  ), ),3 ( 2 ( 1 (  ), ),1 (  ), ),2 ( 1 (  ), ), )13
