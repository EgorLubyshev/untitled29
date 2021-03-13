public class S2 {

    static void sort( int[] a,  int l , int r){


        if(a.length<=1) return;
        if (r==l) return;
        int mid = (r+1) /2;
        int midVal = a[mid];
        int R=r , L=l;


        while (R>L){
            while (a[L] > a[mid] ) L++;
            while (a[R] < a[mid] ) R--;


            if(R>=L) {


                int o = a[L];

                a[L] = a[R];

                a[R] = o;
                R--;
                L++;

            }

        }
        if(l<R){
            sort(a,l,R);

        }
        if(r>R+1){
            sort(a,R+1, r);
        }

    }

    public  static  void main(String[] kk){
        int[] a= new int[]{12,34,41,23,1,2};

        sort(a, 0 , a.length-1);


        for(int i =0 ; i<a.length; i++) System.out.println(a[i]+" ");
    }
}
